package aka.jmetaagents.main.jallocine.pojo.jtvshowseason;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Statistics2 {

	@Nullable
    private Integer maxViewerCount;
	@NonNull
    private List<Rating> rating = new ArrayList<>();
	@Nullable
    private Integer userRatingCount;
	@Nullable
    private Integer totalViewerCount;
	@Nullable
    private Integer averageViewerCount;
	@Nullable
    private Double userRating;
	@Nullable
    private Integer userReviewCount;

	/**
     * Empty Constructor.
     */
    public Statistics2() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param maxViewerCountParam Integer
     * @param ratingParam List<Rating>
     * @param userRatingCountParam Integer
     * @param totalViewerCountParam Integer
     * @param averageViewerCountParam Integer
     * @param userRatingParam Double
     * @param userReviewCountParam Integer
     */
    public Statistics2(@Nullable final Integer maxViewerCountParam, @NonNull final List<Rating> ratingParam, @Nullable final Integer userRatingCountParam, @Nullable final Integer totalViewerCountParam, @Nullable final Integer averageViewerCountParam, @Nullable final Double userRatingParam, @Nullable final Integer userReviewCountParam) {
        this.maxViewerCount = maxViewerCountParam;
        this.rating = ratingParam;
        this.userRatingCount = userRatingCountParam;
        this.totalViewerCount = totalViewerCountParam;
        this.averageViewerCount = averageViewerCountParam;
        this.userRating = userRatingParam;
        this.userReviewCount = userReviewCountParam;
    }
    
    /**
     * Get value of maxViewerCount.
     *
     * @return Integer value of maxViewerCount
     */
    @Nullable
    public final Integer getMaxViewerCount() {
        return this.maxViewerCount;
    }
    
    /**
     * Get value of rating.
     *
     * @return List<Rating> value of rating
     */
    @NonNull
    public final List<Rating> getRating() {
        return this.rating;
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
     * Get value of totalViewerCount.
     *
     * @return Integer value of totalViewerCount
     */
    @Nullable
    public final Integer getTotalViewerCount() {
        return this.totalViewerCount;
    }
    
    /**
     * Get value of averageViewerCount.
     *
     * @return Integer value of averageViewerCount
     */
    @Nullable
    public final Integer getAverageViewerCount() {
        return this.averageViewerCount;
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
     * Get value of userReviewCount.
     *
     * @return Integer value of userReviewCount
     */
    @Nullable
    public final Integer getUserReviewCount() {
        return this.userReviewCount;
    }

    
    /**
     * Set value of maxViewerCount.
     *
     * @param maxViewerCountParam
     */
    public final void setMaxViewerCount(@Nullable final Integer maxViewerCountParam) {
        this.maxViewerCount = maxViewerCountParam;
    }
    
    /**
     * Set value of rating.
     *
     * @param ratingParam
     */
    public final void getRating(@NonNull final List<Rating> ratingParam) {
        this.rating = ratingParam;
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
     * Set value of totalViewerCount.
     *
     * @param totalViewerCountParam
     */
    public final void setTotalViewerCount(@Nullable final Integer totalViewerCountParam) {
        this.totalViewerCount = totalViewerCountParam;
    }
    
    /**
     * Set value of averageViewerCount.
     *
     * @param averageViewerCountParam
     */
    public final void setAverageViewerCount(@Nullable final Integer averageViewerCountParam) {
        this.averageViewerCount = averageViewerCountParam;
    }
    
    /**
     * Set value of userRating.
     *
     * @param userRatingParam
     */
    public final void setUserRating(@Nullable final Double userRatingParam) {
        this.userRating = userRatingParam;
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
