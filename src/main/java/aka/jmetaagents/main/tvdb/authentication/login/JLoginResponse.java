package aka.jmetaagents.main.tvdb.authentication.login;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JLoginResponse {

	@Nullable
    private String token;

	/**
     * Empty Constructor.
     */
    public JLoginResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param tokenParam String
     */
    public JLoginResponse(@Nullable final String tokenParam) {
        this.token = tokenParam;
    }
    
    /**
     * Get value of token.
     *
     * @return String value of token
     */
    @Nullable
    public final String getToken() {
        return this.token;
    }

    
    /**
     * Set value of token.
     *
     * @param tokenParam
     */
    public final void setToken(@Nullable final String tokenParam) {
        this.token = tokenParam;
    }
}
