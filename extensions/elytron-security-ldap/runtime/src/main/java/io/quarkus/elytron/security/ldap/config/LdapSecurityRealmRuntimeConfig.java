package io.quarkus.elytron.security.ldap.config;

import java.time.Duration;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

/**
 * Runtime configuration object for an LDAP based realm configuration,
 * {@linkplain org.wildfly.security.auth.realm.ldap.LdapSecurityRealm}
 */
@ConfigRoot(name = "security.ldap", phase = ConfigPhase.RUN_TIME)
public class LdapSecurityRealmRuntimeConfig {

    /**
     * Provided credentials are verified against ldap?
     */
    @ConfigItem(defaultValue = "true")
    public boolean directVerification;

    /**
     * Set whether security realm caching is enabled.
     */
    @ConfigItem(defaultValue = "true")
    public boolean cachingEnabled;

    /**
     * Set value for max age in caching the security realm. The default is {@code 30} minutes.
     */
    @ConfigItem(defaultValue = "30M")
    public Duration maxAge;

    /**
     * Set the max cache size.
     */
    @ConfigItem(defaultValue = "10000")
    public int maxCacheSize;

    /**
     * The ldap server configuration
     */
    @ConfigItem
    public DirContextConfig dirContext;

    /**
     * The config which we use to map an identity
     */
    @ConfigItem
    public IdentityMappingConfig identityMapping;

    @Override
    public String toString() {
        return "LdapSecurityRealmRuntimeConfig{" +
                "directVerification=" + directVerification +
                "cachingEnabled=" + cachingEnabled +
                "maxAge=" + maxAge +
                "maxCacheSize=" + maxCacheSize +
                ", dirContext=" + dirContext +
                ", identityMapping=" + identityMapping +
                '}';
    }
}
