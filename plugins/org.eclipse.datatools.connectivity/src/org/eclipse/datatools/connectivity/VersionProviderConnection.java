/*******************************************************************************
 * Copyright (c) 2005 Sybase, Inc.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: rcernich - initial API and implementation
 ******************************************************************************/
package org.eclipse.datatools.connectivity;

import java.util.Properties;

import org.eclipse.datatools.connectivity.internal.ConnectionProfile;

/**
 * Use this class a a base class for your versioned connection implementation.
 * 
 * You _must_ invoke updateVersionCache() after successfully connecting to the
 * target server. If a connection fails, you _should_ invoke
 * clearConnectionCache() to remove version information from the profile (this
 * will prevent possible bogus data from being displayed in the property page).
 * 
 * Version information is stored in the base properties of the profile (i.e.
 * IConnectionProfile.getBaseProperties()). The server version information can
 * be accessed using the keys ConnectionProfileConstants.PROP_SERVER_VERSION and
 * PROP_SERVER_NAME. The technology version can be accessed using property keys
 * created using the createTechnologyNameKey() and createTechnologyVersionKey()
 * methods. (These methods return strings of the form
 * org.eclipse.datatools.connectivity.technology. &lt;tech_name&gt;.name and
 * org.eclipse.datatools.connectivity.technology. &lt;tech_name&gt;.version.
 * 
 * Server version information is collected from the connection created by the
 * connection factory that is registered as the ping connection factory for the
 * profile. Because of this, it is important that you use the most relevant
 * connection factory as the ping factory (e.g. the EAServer profile uses the
 * J2EE repository connection factory as its ping factory).
 * 
 * @author rcernich
 * 
 * Created on Jun 1, 2005
 */
public abstract class VersionProviderConnection implements IConnection,
		IServerVersionProvider {

	private ConnectionProfile mProfile;
	private Class mFactoryClass;

	/**
	 * 
	 */
	public VersionProviderConnection(IConnectionProfile profile,
										Class factoryClass) {
		super();
		mProfile = (ConnectionProfile) profile;
		mFactoryClass = factoryClass;
	}

	public IConnectionProfile getConnectionProfile() {
		return mProfile;
	}

	public Class getConnectionFactoryClass() {
		return mFactoryClass;
	}

	/**
	 * Adds server and technology related version properties to the associated
	 * profile. This method must be called after successfully connecting to
	 * ensure version information is stored in the profile's properties. Failure
	 * to call this method will prevent version information from being accessed
	 * by the profile's property page. Furthermore, if this connection was
	 * created by the ping factory registered with the profile, server related
	 * version information will not be displayed in the enterprise explorer.
	 */
	protected void updateVersionCache() {
		Properties props = mProfile.getBaseProperties();
		boolean saveProps = updateTechnologyVersion(props);
		IConnectionFactoryProvider icfp = mProfile.getProvider()
				.getConnectionFactory(
						ConnectionProfileConstants.PING_FACTORY_ID);
		if (icfp != null
				&& icfp.getConnectionFactoryClass().equals(mFactoryClass)) {
			saveProps = updateServerVersion(props) || saveProps;
		}
		if (saveProps) {
			mProfile.internalSetProperties(mProfile.getProviderId(), props);
		}
	}

	/**
	 * Removes the server and technology related version properties from the
	 * associated profile. This method should be called when a connect attempt
	 * fails.
	 */
	protected void clearVersionCache() {
		boolean saveProps = false;
		Properties props = mProfile.getBaseProperties();
		IConnectionFactoryProvider icfp = mProfile.getProvider()
				.getConnectionFactory(
						ConnectionProfileConstants.PING_FACTORY_ID);
		String techRootKey = getTechnologyRootKey();
		if (techRootKey != null && techRootKey.length() > 0) {
			String techVersionKey = ConnectionProfileConstants
					.createTechnologyVersionKey(techRootKey);
			String techNameKey = ConnectionProfileConstants
					.createTechnologyNameKey(techRootKey);
			if (props.getProperty(techVersionKey, new String()).length() > 0) {
				props.remove(techVersionKey);
				saveProps = true;
			}
			if (props.getProperty(techNameKey, new String()).length() > 0) {
				props.remove(techNameKey);
				saveProps = true;
			}
		}
		if (icfp != null
				&& icfp.getConnectionFactoryClass().equals(mFactoryClass)) {
			if (props.getProperty(
					ConnectionProfileConstants.PROP_SERVER_VERSION,
					new String()).length() > 0) {
				props.remove(ConnectionProfileConstants.PROP_SERVER_VERSION);
				saveProps = true;
			}
			if (props.getProperty(ConnectionProfileConstants.PROP_SERVER_NAME,
					new String()).length() > 0) {
				props.remove(ConnectionProfileConstants.PROP_SERVER_NAME);
				saveProps = true;
			}
		}
		if (saveProps) {
			mProfile.internalSetProperties(mProfile.getProviderId(), props);
		}
	}

	private boolean updateTechnologyVersion(Properties props) {
		boolean saveProps = false;
		String techRootKey = getTechnologyRootKey();
		if (techRootKey != null && techRootKey.length() > 0) {
			String techVersionKey = ConnectionProfileConstants
					.createTechnologyVersionKey(techRootKey);
			String techNameKey = ConnectionProfileConstants
					.createTechnologyNameKey(techRootKey);
			String oldTechName = props.getProperty(techNameKey);
			String techName = getTechnologyName();
			Version oldTechVersion = Version.valueOf(props.getProperty(
					techVersionKey, new String()));
			Version techVersion = getTechnologyVersion();
			if (!oldTechVersion.equals(techVersion)) {
				props.setProperty(techVersionKey, techVersion.toString());
				saveProps = true;
			}
			if ((techName == null && oldTechName != null)
					|| (techName != null && !techName.equals(oldTechName))) {
				if (techName == null) {
					props.remove(techNameKey);
				}
				else {
					props.setProperty(techNameKey, techName);
				}
				saveProps = true;
			}
		}
		return saveProps;
	}

	private boolean updateServerVersion(Properties props) {
		boolean saveProps = false;
		String oldServerName = props
				.getProperty(ConnectionProfileConstants.PROP_SERVER_NAME);
		String serverName = getProviderName();
		Version oldServerVersion = Version.valueOf(props.getProperty(
				ConnectionProfileConstants.PROP_SERVER_VERSION, new String()));
		Version serverVersion = getProviderVersion();
		if (!oldServerVersion.equals(serverVersion)) {
			props.setProperty(ConnectionProfileConstants.PROP_SERVER_VERSION,
					serverVersion.toString());
			saveProps = true;
		}
		if ((serverName == null && oldServerName != null)
				|| (serverName != null && !serverName.equals(oldServerName))) {
			if (serverName == null) {
				props.remove(ConnectionProfileConstants.PROP_SERVER_NAME);
			}
			else {
				props.setProperty(ConnectionProfileConstants.PROP_SERVER_NAME,
						serverName);
			}
			saveProps = true;
		}
		return saveProps;
	}

	/**
	 * @return the string to be used when constructing the technology related
	 *         keys in the profile's properties; null to prevent technology
	 *         related information from being persisted in the profile's
	 *         properties.
	 */
	protected abstract String getTechnologyRootKey();

}