package aka.jmetaagents.main.jrottentomatoes.pojo.jmoviesimilar;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Ratings {

    @JsonProperty("audience_rating")
	@Nullable
    private String audienceRating;
    @JsonProperty("audience_score")
	@Nullable
    private Integer audienceScore;
    @JsonProperty("critics_rating")
	@Nullable
    private String criticsRating;
    @JsonProperty("critics_score")
	@Nullable
    private Integer criticsScore;

	/**
     * Empty Constructor.
     */
    public Ratings() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param audienceRatingParam String
     * @param audienceScoreParam Integer
     * @param criticsRatingParam String
     * @param criticsScoreParam Integer
     */
    public Ratings(@Nullable final String audienceRatingParam, @Nullable final Integer audienceScoreParam, @Nullable final String criticsRatingParam, @Nullable final Integer criticsScoreParam) {
        this.audienceRating = audienceRatingParam;
        this.audienceScore = audienceScoreParam;
        this.criticsRating = criticsRatingParam;
        this.criticsScore = criticsScoreParam;
    }
    
    /**
     * Get value of audienceRating.
     *
     * @return String value of audienceRating
     */
    @Nullable
    public final String getAudienceRating() {
        return this.audienceRating;
    }
    
    /**
     * Get value of audienceScore.
     *
     * @return Integer value of audienceScore
     */
    @Nullable
    public final Integer getAudienceScore() {
        return this.audienceScore;
    }
    
    /**
     * Get value of criticsRating.
     *
     * @return String value of criticsRating
     */
    @Nullable
    public final String getCriticsRating() {
        return this.criticsRating;
    }
    
    /**
     * Get value of criticsScore.
     *
     * @return Integer value of criticsScore
     */
    @Nullable
    public final Integer getCriticsScore() {
        return this.criticsScore;
    }

    
    /**
     * Set value of audienceRating.
     *
     * @param audienceRatingParam
     */
    public final void setAudienceRating(@Nullable final String audienceRatingParam) {
        this.audienceRating = audienceRatingParam;
    }
    
    /**
     * Set value of audienceScore.
     *
     * @param audienceScoreParam
     */
    public final void setAudienceScore(@Nullable final Integer audienceScoreParam) {
        this.audienceScore = audienceScoreParam;
    }
    
    /**
     * Set value of criticsRating.
     *
     * @param criticsRatingParam
     */
    public final void setCriticsRating(@Nullable final String criticsRatingParam) {
        this.criticsRating = criticsRatingParam;
    }
    
    /**
     * Set value of criticsScore.
     *
     * @param criticsScoreParam
     */
    public final void setCriticsScore(@Nullable final Integer criticsScoreParam) {
        this.criticsScore = criticsScoreParam;
    }
}
