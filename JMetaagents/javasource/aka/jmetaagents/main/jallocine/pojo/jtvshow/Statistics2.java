package aka.jmetaagents.main.jallocine.pojo.jtvshow;

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
    private Integer triviaCount;
	@Nullable
    private Integer pressReviewCount;
	@NonNull
    private List<Rating> rating = new ArrayList<>();
	@Nullable
    private Integer wantToSeeCount;
	@Nullable
    private Double userRating;
	@Nullable
    private Integer userReviewCount;
	@Nullable
    private Integer commentCount;
	@Nullable
    private Integer photoCount;
	@Nullable
    private Double pressRating;
	@Nullable
    private Integer videoCount;
	@Nullable
    private Integer fanCount;
	@Nullable
    private Integer awardCount;
	@Nullable
    private Integer rankTopSeries;
	@Nullable
    private Integer nominationCount;
	@Nullable
    private Integer userRatingCount;
	@Nullable
    private Integer newsCount;
	@Nullable
    private Integer variationTopSeries;

	/**
     * Empty Constructor.
     */
    public Statistics2() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param triviaCountParam Integer
     * @param pressReviewCountParam Integer
     * @param ratingParam List<Rating>
     * @param wantToSeeCountParam Integer
     * @param userRatingParam Double
     * @param userReviewCountParam Integer
     * @param commentCountParam Integer
     * @param photoCountParam Integer
     * @param pressRatingParam Double
     * @param videoCountParam Integer
     * @param fanCountParam Integer
     * @param awardCountParam Integer
     * @param rankTopSeriesParam Integer
     * @param nominationCountParam Integer
     * @param userRatingCountParam Integer
     * @param newsCountParam Integer
     * @param variationTopSeriesParam Integer
     */
    public Statistics2(@Nullable final Integer triviaCountParam, @Nullable final Integer pressReviewCountParam, @NonNull final List<Rating> ratingParam, @Nullable final Integer wantToSeeCountParam, @Nullable final Double userRatingParam, @Nullable final Integer userReviewCountParam, @Nullable final Integer commentCountParam, @Nullable final Integer photoCountParam, @Nullable final Double pressRatingParam, @Nullable final Integer videoCountParam, @Nullable final Integer fanCountParam, @Nullable final Integer awardCountParam, @Nullable final Integer rankTopSeriesParam, @Nullable final Integer nominationCountParam, @Nullable final Integer userRatingCountParam, @Nullable final Integer newsCountParam, @Nullable final Integer variationTopSeriesParam) {
        this.triviaCount = triviaCountParam;
        this.pressReviewCount = pressReviewCountParam;
        this.rating = ratingParam;
        this.wantToSeeCount = wantToSeeCountParam;
        this.userRating = userRatingParam;
        this.userReviewCount = userReviewCountParam;
        this.commentCount = commentCountParam;
        this.photoCount = photoCountParam;
        this.pressRating = pressRatingParam;
        this.videoCount = videoCountParam;
        this.fanCount = fanCountParam;
        this.awardCount = awardCountParam;
        this.rankTopSeries = rankTopSeriesParam;
        this.nominationCount = nominationCountParam;
        this.userRatingCount = userRatingCountParam;
        this.newsCount = newsCountParam;
        this.variationTopSeries = variationTopSeriesParam;
    }
    
    /**
     * Get value of triviaCount.
     *
     * @return Integer value of triviaCount
     */
    @Nullable
    public final Integer getTriviaCount() {
        return this.triviaCount;
    }
    
    /**
     * Get value of pressReviewCount.
     *
     * @return Integer value of pressReviewCount
     */
    @Nullable
    public final Integer getPressReviewCount() {
        return this.pressReviewCount;
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
     * Get value of wantToSeeCount.
     *
     * @return Integer value of wantToSeeCount
     */
    @Nullable
    public final Integer getWantToSeeCount() {
        return this.wantToSeeCount;
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
     * Get value of commentCount.
     *
     * @return Integer value of commentCount
     */
    @Nullable
    public final Integer getCommentCount() {
        return this.commentCount;
    }
    
    /**
     * Get value of photoCount.
     *
     * @return Integer value of photoCount
     */
    @Nullable
    public final Integer getPhotoCount() {
        return this.photoCount;
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
     * Get value of videoCount.
     *
     * @return Integer value of videoCount
     */
    @Nullable
    public final Integer getVideoCount() {
        return this.videoCount;
    }
    
    /**
     * Get value of fanCount.
     *
     * @return Integer value of fanCount
     */
    @Nullable
    public final Integer getFanCount() {
        return this.fanCount;
    }
    
    /**
     * Get value of awardCount.
     *
     * @return Integer value of awardCount
     */
    @Nullable
    public final Integer getAwardCount() {
        return this.awardCount;
    }
    
    /**
     * Get value of rankTopSeries.
     *
     * @return Integer value of rankTopSeries
     */
    @Nullable
    public final Integer getRankTopSeries() {
        return this.rankTopSeries;
    }
    
    /**
     * Get value of nominationCount.
     *
     * @return Integer value of nominationCount
     */
    @Nullable
    public final Integer getNominationCount() {
        return this.nominationCount;
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
     * Get value of newsCount.
     *
     * @return Integer value of newsCount
     */
    @Nullable
    public final Integer getNewsCount() {
        return this.newsCount;
    }
    
    /**
     * Get value of variationTopSeries.
     *
     * @return Integer value of variationTopSeries
     */
    @Nullable
    public final Integer getVariationTopSeries() {
        return this.variationTopSeries;
    }

    
    /**
     * Set value of triviaCount.
     *
     * @param triviaCountParam
     */
    public final void setTriviaCount(@Nullable final Integer triviaCountParam) {
        this.triviaCount = triviaCountParam;
    }
    
    /**
     * Set value of pressReviewCount.
     *
     * @param pressReviewCountParam
     */
    public final void setPressReviewCount(@Nullable final Integer pressReviewCountParam) {
        this.pressReviewCount = pressReviewCountParam;
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
     * Set value of wantToSeeCount.
     *
     * @param wantToSeeCountParam
     */
    public final void setWantToSeeCount(@Nullable final Integer wantToSeeCountParam) {
        this.wantToSeeCount = wantToSeeCountParam;
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
    
    /**
     * Set value of commentCount.
     *
     * @param commentCountParam
     */
    public final void setCommentCount(@Nullable final Integer commentCountParam) {
        this.commentCount = commentCountParam;
    }
    
    /**
     * Set value of photoCount.
     *
     * @param photoCountParam
     */
    public final void setPhotoCount(@Nullable final Integer photoCountParam) {
        this.photoCount = photoCountParam;
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
     * Set value of videoCount.
     *
     * @param videoCountParam
     */
    public final void setVideoCount(@Nullable final Integer videoCountParam) {
        this.videoCount = videoCountParam;
    }
    
    /**
     * Set value of fanCount.
     *
     * @param fanCountParam
     */
    public final void setFanCount(@Nullable final Integer fanCountParam) {
        this.fanCount = fanCountParam;
    }
    
    /**
     * Set value of awardCount.
     *
     * @param awardCountParam
     */
    public final void setAwardCount(@Nullable final Integer awardCountParam) {
        this.awardCount = awardCountParam;
    }
    
    /**
     * Set value of rankTopSeries.
     *
     * @param rankTopSeriesParam
     */
    public final void setRankTopSeries(@Nullable final Integer rankTopSeriesParam) {
        this.rankTopSeries = rankTopSeriesParam;
    }
    
    /**
     * Set value of nominationCount.
     *
     * @param nominationCountParam
     */
    public final void setNominationCount(@Nullable final Integer nominationCountParam) {
        this.nominationCount = nominationCountParam;
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
     * Set value of newsCount.
     *
     * @param newsCountParam
     */
    public final void setNewsCount(@Nullable final Integer newsCountParam) {
        this.newsCount = newsCountParam;
    }
    
    /**
     * Set value of variationTopSeries.
     *
     * @param variationTopSeriesParam
     */
    public final void setVariationTopSeries(@Nullable final Integer variationTopSeriesParam) {
        this.variationTopSeries = variationTopSeriesParam;
    }
}
