package aka.jmetaagents.main.jallocine.pojo.jmovie;

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
public final class Statistics1 {

	@Nullable
    private Integer triviaCount;
	@Nullable
    private Integer theaterCount;
	@Nullable
    private Integer pressReviewCount;
	@NonNull
    private List<Rating> rating = new ArrayList<>();
	@Nullable
    private Integer wantToSeeCount;
	@Nullable
    private Integer editorialRatingCount;
	@Nullable
    private Integer admissionCount;
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
    private Integer releaseWeekPosition;
	@Nullable
    private Integer rankTopMovie;
	@Nullable
    private Integer awardCount;
	@Nullable
    private Integer nominationCount;
	@Nullable
    private Integer variationTopMovie;
	@Nullable
    private Integer userRatingCount;
	@Nullable
    private Integer newsCount;

	/**
     * Empty Constructor.
     */
    public Statistics1() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param triviaCountParam Integer
     * @param theaterCountParam Integer
     * @param pressReviewCountParam Integer
     * @param ratingParam List<Rating>
     * @param wantToSeeCountParam Integer
     * @param editorialRatingCountParam Integer
     * @param admissionCountParam Integer
     * @param userRatingParam Double
     * @param userReviewCountParam Integer
     * @param commentCountParam Integer
     * @param photoCountParam Integer
     * @param pressRatingParam Double
     * @param videoCountParam Integer
     * @param fanCountParam Integer
     * @param releaseWeekPositionParam Integer
     * @param rankTopMovieParam Integer
     * @param awardCountParam Integer
     * @param nominationCountParam Integer
     * @param variationTopMovieParam Integer
     * @param userRatingCountParam Integer
     * @param newsCountParam Integer
     */
    public Statistics1(@Nullable final Integer triviaCountParam, @Nullable final Integer theaterCountParam, @Nullable final Integer pressReviewCountParam, @NonNull final List<Rating> ratingParam, @Nullable final Integer wantToSeeCountParam, @Nullable final Integer editorialRatingCountParam, @Nullable final Integer admissionCountParam, @Nullable final Double userRatingParam, @Nullable final Integer userReviewCountParam, @Nullable final Integer commentCountParam, @Nullable final Integer photoCountParam, @Nullable final Double pressRatingParam, @Nullable final Integer videoCountParam, @Nullable final Integer fanCountParam, @Nullable final Integer releaseWeekPositionParam, @Nullable final Integer rankTopMovieParam, @Nullable final Integer awardCountParam, @Nullable final Integer nominationCountParam, @Nullable final Integer variationTopMovieParam, @Nullable final Integer userRatingCountParam, @Nullable final Integer newsCountParam) {
        this.triviaCount = triviaCountParam;
        this.theaterCount = theaterCountParam;
        this.pressReviewCount = pressReviewCountParam;
        this.rating = ratingParam;
        this.wantToSeeCount = wantToSeeCountParam;
        this.editorialRatingCount = editorialRatingCountParam;
        this.admissionCount = admissionCountParam;
        this.userRating = userRatingParam;
        this.userReviewCount = userReviewCountParam;
        this.commentCount = commentCountParam;
        this.photoCount = photoCountParam;
        this.pressRating = pressRatingParam;
        this.videoCount = videoCountParam;
        this.fanCount = fanCountParam;
        this.releaseWeekPosition = releaseWeekPositionParam;
        this.rankTopMovie = rankTopMovieParam;
        this.awardCount = awardCountParam;
        this.nominationCount = nominationCountParam;
        this.variationTopMovie = variationTopMovieParam;
        this.userRatingCount = userRatingCountParam;
        this.newsCount = newsCountParam;
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
     * Get value of theaterCount.
     *
     * @return Integer value of theaterCount
     */
    @Nullable
    public final Integer getTheaterCount() {
        return this.theaterCount;
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
     * Get value of editorialRatingCount.
     *
     * @return Integer value of editorialRatingCount
     */
    @Nullable
    public final Integer getEditorialRatingCount() {
        return this.editorialRatingCount;
    }
    
    /**
     * Get value of admissionCount.
     *
     * @return Integer value of admissionCount
     */
    @Nullable
    public final Integer getAdmissionCount() {
        return this.admissionCount;
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
     * Get value of releaseWeekPosition.
     *
     * @return Integer value of releaseWeekPosition
     */
    @Nullable
    public final Integer getReleaseWeekPosition() {
        return this.releaseWeekPosition;
    }
    
    /**
     * Get value of rankTopMovie.
     *
     * @return Integer value of rankTopMovie
     */
    @Nullable
    public final Integer getRankTopMovie() {
        return this.rankTopMovie;
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
     * Get value of nominationCount.
     *
     * @return Integer value of nominationCount
     */
    @Nullable
    public final Integer getNominationCount() {
        return this.nominationCount;
    }
    
    /**
     * Get value of variationTopMovie.
     *
     * @return Integer value of variationTopMovie
     */
    @Nullable
    public final Integer getVariationTopMovie() {
        return this.variationTopMovie;
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
     * Set value of triviaCount.
     *
     * @param triviaCountParam
     */
    public final void setTriviaCount(@Nullable final Integer triviaCountParam) {
        this.triviaCount = triviaCountParam;
    }
    
    /**
     * Set value of theaterCount.
     *
     * @param theaterCountParam
     */
    public final void setTheaterCount(@Nullable final Integer theaterCountParam) {
        this.theaterCount = theaterCountParam;
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
     * Set value of editorialRatingCount.
     *
     * @param editorialRatingCountParam
     */
    public final void setEditorialRatingCount(@Nullable final Integer editorialRatingCountParam) {
        this.editorialRatingCount = editorialRatingCountParam;
    }
    
    /**
     * Set value of admissionCount.
     *
     * @param admissionCountParam
     */
    public final void setAdmissionCount(@Nullable final Integer admissionCountParam) {
        this.admissionCount = admissionCountParam;
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
     * Set value of releaseWeekPosition.
     *
     * @param releaseWeekPositionParam
     */
    public final void setReleaseWeekPosition(@Nullable final Integer releaseWeekPositionParam) {
        this.releaseWeekPosition = releaseWeekPositionParam;
    }
    
    /**
     * Set value of rankTopMovie.
     *
     * @param rankTopMovieParam
     */
    public final void setRankTopMovie(@Nullable final Integer rankTopMovieParam) {
        this.rankTopMovie = rankTopMovieParam;
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
     * Set value of nominationCount.
     *
     * @param nominationCountParam
     */
    public final void setNominationCount(@Nullable final Integer nominationCountParam) {
        this.nominationCount = nominationCountParam;
    }
    
    /**
     * Set value of variationTopMovie.
     *
     * @param variationTopMovieParam
     */
    public final void setVariationTopMovie(@Nullable final Integer variationTopMovieParam) {
        this.variationTopMovie = variationTopMovieParam;
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
}
