package aka.jmetaagents.main.tmdb.authentification.guest;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JGuestResponse {

    @JsonProperty("expires_at")
	@Nullable
    private String expiresAt;
    @JsonProperty("guest_session_id")
	@Nullable
    private String guestSessionId;
	@Nullable
    private Boolean success;

	/**
     * Empty Constructor.
     */
    public JGuestResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param expiresAtParam String
     * @param guestSessionIdParam String
     * @param successParam Boolean
     */
    public JGuestResponse(@Nullable final String expiresAtParam, @Nullable final String guestSessionIdParam, @Nullable final Boolean successParam) {
        this.expiresAt = expiresAtParam;
        this.guestSessionId = guestSessionIdParam;
        this.success = successParam;
    }
    
    /**
     * Get value of expiresAt.
     *
     * @return String value of expiresAt
     */
    @Nullable
    public final String getExpiresAt() {
        return this.expiresAt;
    }
    
    /**
     * Get value of guestSessionId.
     *
     * @return String value of guestSessionId
     */
    @Nullable
    public final String getGuestSessionId() {
        return this.guestSessionId;
    }
    
    /**
     * Get value of success.
     *
     * @return Boolean value of success
     */
    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    
    /**
     * Set value of expiresAt.
     *
     * @param expiresAtParam
     */
    public final void setExpiresAt(@Nullable final String expiresAtParam) {
        this.expiresAt = expiresAtParam;
    }
    
    /**
     * Set value of guestSessionId.
     *
     * @param guestSessionIdParam
     */
    public final void setGuestSessionId(@Nullable final String guestSessionIdParam) {
        this.guestSessionId = guestSessionIdParam;
    }
    
    /**
     * Set value of success.
     *
     * @param successParam
     */
    public final void setSuccess(@Nullable final Boolean successParam) {
        this.success = successParam;
    }
}
