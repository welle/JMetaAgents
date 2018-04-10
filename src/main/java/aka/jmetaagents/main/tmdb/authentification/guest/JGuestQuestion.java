package aka.jmetaagents.main.tmdb.authentification.guest;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JGuestQuestion {

	@Nullable
    private String apikey;

	/**
     * Empty Constructor.
     */
    public JGuestQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param apikeyParam String
     */
    public JGuestQuestion(@Nullable final String apikeyParam) {
        this.apikey = apikeyParam;
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
     * Set value of apikey.
     *
     * @param apikeyParam
     */
    public final void setApikey(@Nullable final String apikeyParam) {
        this.apikey = apikeyParam;
    }
}
