package aka.jmetaagents.main.tmdb.credits.creditsdetails;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JCreditsdetailsQuestion {

    @JsonProperty("credit_id")
	@Nullable
    private Integer creditId;

	/**
     * Empty Constructor.
     */
    public JCreditsdetailsQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param creditIdParam Integer
     */
    public JCreditsdetailsQuestion(@Nullable final Integer creditIdParam) {
        this.creditId = creditIdParam;
    }
    
    /**
     * Get value of creditId.
     *
     * @return Integer value of creditId
     */
    @Nullable
    public final Integer getCreditId() {
        return this.creditId;
    }

    
    /**
     * Set value of creditId.
     *
     * @param creditIdParam
     */
    public final void setCreditId(@Nullable final Integer creditIdParam) {
        this.creditId = creditIdParam;
    }
}
