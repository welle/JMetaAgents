package aka.jmetaagents.main.jallocine.pojo.jperson;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Statistics {

	@Nullable
    private Double userRating;

	/**
     * Empty Constructor.
     */
    public Statistics() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param userRatingParam Double
     */
    public Statistics(@Nullable final Double userRatingParam) {
        this.userRating = userRatingParam;
    }
    
    /**
     * Get value of userRating.
     *
     * @return Double value of userRating
     */
    @Nullable
    public final Double getUserRating() {
        return this.userRating;
    }

    
    /**
     * Set value of userRating.
     *
     * @param userRatingParam
     */
    public final void setUserRating(@Nullable final Double userRatingParam) {
        this.userRating = userRatingParam;
    }
}
