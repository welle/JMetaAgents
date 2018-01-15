package aka.jmetaagents.main.jtvdb.login;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTVDBLogin {

	@Nullable
    private String apikey;
	@Nullable
    private String username;
	@Nullable
    private String userkey;

	/**
     * Empty Constructor.
     */
    public JTVDBLogin() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param apikeyParam String
     * @param usernameParam String
     * @param userkeyParam String
     */
    public JTVDBLogin(@Nullable final String apikeyParam, @Nullable final String usernameParam, @Nullable final String userkeyParam) {
        this.apikey = apikeyParam;
        this.username = usernameParam;
        this.userkey = userkeyParam;
    }
    
    /**
     * Get value of apikey.
     *
     * @return String value of apikey
     */
    @Nullable
    public final String getApikey() {
        return this.apikey;
    }
    
    /**
     * Get value of username.
     *
     * @return String value of username
     */
    @Nullable
    public final String getUsername() {
        return this.username;
    }
    
    /**
     * Get value of userkey.
     *
     * @return String value of userkey
     */
    @Nullable
    public final String getUserkey() {
        return this.userkey;
    }

    
    /**
     * Set value of apikey.
     *
     * @param apikeyParam
     */
    public final void setApikey(@Nullable final String apikeyParam) {
        this.apikey = apikeyParam;
    }
    
    /**
     * Set value of username.
     *
     * @param usernameParam
     */
    public final void setUsername(@Nullable final String usernameParam) {
        this.username = usernameParam;
    }
    
    /**
     * Set value of userkey.
     *
     * @param userkeyParam
     */
    public final void setUserkey(@Nullable final String userkeyParam) {
        this.userkey = userkeyParam;
    }
}
