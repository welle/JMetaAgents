package aka.jmetaagents.main.jallocine.pojo.jtvshowepisode;

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
    private Integer firstAiringViewerCount;
	@Nullable
    private Integer userRatingCount;
	@Nullable
    private Integer userReviewCount;

	/**
     * Empty Constructor.
     */
    public Statistics() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param firstAiringViewerCountParam Integer
     * @param userRatingCountParam Integer
     * @param userReviewCountParam Integer
     */
    public Statistics(@Nullable final Integer firstAiringViewerCountParam, @Nullable final Integer userRatingCountParam, @Nullable final Integer userReviewCountParam) {
        this.firstAiringViewerCount = firstAiringViewerCountParam;
        this.userRatingCount = userRatingCountParam;
        this.userReviewCount = userReviewCountParam;
    }
    
    /**
     * Get value of firstAiringViewerCount.
     *
     * @return Integer value of firstAiringViewerCount
     */
    @Nullable
    public final Integer getFirstAiringViewerCount() {
        return this.firstAiringViewerCount;
    }
    
    /**
     * Get value of userRatingCount.
     *
     * @return Integer value of userRatingCount
     */
    @Nullable
    public final Integer getUserRatingCount() {
        return this.userRatingCount;
    }
    
    /**
     * Get value of userReviewCount.
     *
     * @return Integer value of userReviewCount
     */
    @Nullable
    public final Integer getUserReviewCount() {
        return this.userReviewCount;
    }

    
    /**
     * Set value of firstAiringViewerCount.
     *
     * @param firstAiringViewerCountParam
     */
    public final void setFirstAiringViewerCount(@Nullable final Integer firstAiringViewerCountParam) {
        this.firstAiringViewerCount = firstAiringViewerCountParam;
    }
    
    /**
     * Set value of userRatingCount.
     *
     * @param userRatingCountParam
     */
    public final void setUserRatingCount(@Nullable final Integer userRatingCountParam) {
        this.userRatingCount = userRatingCountParam;
    }
    
    /**
     * Set value of userReviewCount.
     *
     * @param userReviewCountParam
     */
    public final void setUserReviewCount(@Nullable final Integer userReviewCountParam) {
        this.userReviewCount = userReviewCountParam;
    }
}
