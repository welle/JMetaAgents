package aka.jmetaagents.main.tvdb.authentication.login;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JLoginQuestion {

	@Nullable
    private String apikey;
	@Nullable
    private String userkey;
	@Nullable
    private String username;

	/**
     * Empty Constructor.
     */
    public JLoginQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param apikeyParam String
     * @param userkeyParam String
     * @param usernameParam String
     */
    public JLoginQuestion(@Nullable final String apikeyParam, @Nullable final String userkeyParam, @Nullable final String usernameParam) {
        this.apikey = apikeyParam;
        this.userkey = userkeyParam;
        this.username = usernameParam;
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
     * Get value of userkey.
     *
     * @return String value of userkey
     */
    @Nullable
    public final String getUserkey() {
        return this.userkey;
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
     * Set value of apikey.
     *
     * @param apikeyParam
     */
    public final void setApikey(@Nullable final String apikeyParam) {
        this.apikey = apikeyParam;
    }
    
    /**
     * Set value of userkey.
     *
     * @param userkeyParam
     */
    public final void setUserkey(@Nullable final String userkeyParam) {
        this.userkey = userkeyParam;
    }
    
    /**
     * Set value of username.
     *
     * @param usernameParam
     */
    public final void setUsername(@Nullable final String usernameParam) {
        this.username = usernameParam;
    }
}
