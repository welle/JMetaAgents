package aka.jmetaagents.main.jallocine.pojo.jtvshowssearch;

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
    private Double pressRating;
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
     * @param pressRatingParam Double
     * @param userRatingParam Double
     */
    public Statistics(@Nullable final Double pressRatingParam, @Nullable final Double userRatingParam) {
        this.pressRating = pressRatingParam;
        this.userRating = userRatingParam;
    }
    
    /**
     * Get value of pressRating.
     *
     * @return Double value of pressRating
     */
    @Nullable
    public final Double getPressRating() {
        return this.pressRating;
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
     * Set value of pressRating.
     *
     * @param pressRatingParam
     */
    public final void setPressRating(@Nullable final Double pressRatingParam) {
        this.pressRating = pressRatingParam;
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
