package aka.jmetaagents.main.jallocine.pojo.jperson;

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
    private Integer seriesActorCount;
	@Nullable
    private Integer careerDuration;
	@Nullable
    private Integer rankTopStar;
	@Nullable
    private Integer movieDirectorCount;
	@NonNull
    private List<Rating> rating = new ArrayList<>();
	@Nullable
    private Integer movieProducerCount;
	@Nullable
    private Integer seriesProducerCount;
	@Nullable
    private Integer fanCount;
	@Nullable
    private Integer variationTopStar;
	@Nullable
    private Integer movieActorCount;
	@Nullable
    private Integer seriesDirectorCount;
	@Nullable
    private Integer awardCount;
	@Nullable
    private Integer movieCount;
	@Nullable
    private Integer nominationCount;
	@Nullable
    private Integer seriesCount;
	@Nullable
    private Integer newsCount;

	/**
     * Empty Constructor.
     */
    public Statistics2() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param seriesActorCountParam Integer
     * @param careerDurationParam Integer
     * @param rankTopStarParam Integer
     * @param movieDirectorCountParam Integer
     * @param ratingParam List<Rating>
     * @param movieProducerCountParam Integer
     * @param seriesProducerCountParam Integer
     * @param fanCountParam Integer
     * @param variationTopStarParam Integer
     * @param movieActorCountParam Integer
     * @param seriesDirectorCountParam Integer
     * @param awardCountParam Integer
     * @param movieCountParam Integer
     * @param nominationCountParam Integer
     * @param seriesCountParam Integer
     * @param newsCountParam Integer
     */
    public Statistics2(@Nullable final Integer seriesActorCountParam, @Nullable final Integer careerDurationParam, @Nullable final Integer rankTopStarParam, @Nullable final Integer movieDirectorCountParam, @NonNull final List<Rating> ratingParam, @Nullable final Integer movieProducerCountParam, @Nullable final Integer seriesProducerCountParam, @Nullable final Integer fanCountParam, @Nullable final Integer variationTopStarParam, @Nullable final Integer movieActorCountParam, @Nullable final Integer seriesDirectorCountParam, @Nullable final Integer awardCountParam, @Nullable final Integer movieCountParam, @Nullable final Integer nominationCountParam, @Nullable final Integer seriesCountParam, @Nullable final Integer newsCountParam) {
        this.seriesActorCount = seriesActorCountParam;
        this.careerDuration = careerDurationParam;
        this.rankTopStar = rankTopStarParam;
        this.movieDirectorCount = movieDirectorCountParam;
        this.rating = ratingParam;
        this.movieProducerCount = movieProducerCountParam;
        this.seriesProducerCount = seriesProducerCountParam;
        this.fanCount = fanCountParam;
        this.variationTopStar = variationTopStarParam;
        this.movieActorCount = movieActorCountParam;
        this.seriesDirectorCount = seriesDirectorCountParam;
        this.awardCount = awardCountParam;
        this.movieCount = movieCountParam;
        this.nominationCount = nominationCountParam;
        this.seriesCount = seriesCountParam;
        this.newsCount = newsCountParam;
    }
    
    /**
     * Get value of seriesActorCount.
     *
     * @return Integer value of seriesActorCount
     */
    @Nullable
    public final Integer getSeriesActorCount() {
        return this.seriesActorCount;
    }
    
    /**
     * Get value of careerDuration.
     *
     * @return Integer value of careerDuration
     */
    @Nullable
    public final Integer getCareerDuration() {
        return this.careerDuration;
    }
    
    /**
     * Get value of rankTopStar.
     *
     * @return Integer value of rankTopStar
     */
    @Nullable
    public final Integer getRankTopStar() {
        return this.rankTopStar;
    }
    
    /**
     * Get value of movieDirectorCount.
     *
     * @return Integer value of movieDirectorCount
     */
    @Nullable
    public final Integer getMovieDirectorCount() {
        return this.movieDirectorCount;
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
     * Get value of movieProducerCount.
     *
     * @return Integer value of movieProducerCount
     */
    @Nullable
    public final Integer getMovieProducerCount() {
        return this.movieProducerCount;
    }
    
    /**
     * Get value of seriesProducerCount.
     *
     * @return Integer value of seriesProducerCount
     */
    @Nullable
    public final Integer getSeriesProducerCount() {
        return this.seriesProducerCount;
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
     * Get value of variationTopStar.
     *
     * @return Integer value of variationTopStar
     */
    @Nullable
    public final Integer getVariationTopStar() {
        return this.variationTopStar;
    }
    
    /**
     * Get value of movieActorCount.
     *
     * @return Integer value of movieActorCount
     */
    @Nullable
    public final Integer getMovieActorCount() {
        return this.movieActorCount;
    }
    
    /**
     * Get value of seriesDirectorCount.
     *
     * @return Integer value of seriesDirectorCount
     */
    @Nullable
    public final Integer getSeriesDirectorCount() {
        return this.seriesDirectorCount;
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
     * Get value of movieCount.
     *
     * @return Integer value of movieCount
     */
    @Nullable
    public final Integer getMovieCount() {
        return this.movieCount;
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
     * Get value of seriesCount.
     *
     * @return Integer value of seriesCount
     */
    @Nullable
    public final Integer getSeriesCount() {
        return this.seriesCount;
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
     * Set value of seriesActorCount.
     *
     * @param seriesActorCountParam
     */
    public final void setSeriesActorCount(@Nullable final Integer seriesActorCountParam) {
        this.seriesActorCount = seriesActorCountParam;
    }
    
    /**
     * Set value of careerDuration.
     *
     * @param careerDurationParam
     */
    public final void setCareerDuration(@Nullable final Integer careerDurationParam) {
        this.careerDuration = careerDurationParam;
    }
    
    /**
     * Set value of rankTopStar.
     *
     * @param rankTopStarParam
     */
    public final void setRankTopStar(@Nullable final Integer rankTopStarParam) {
        this.rankTopStar = rankTopStarParam;
    }
    
    /**
     * Set value of movieDirectorCount.
     *
     * @param movieDirectorCountParam
     */
    public final void setMovieDirectorCount(@Nullable final Integer movieDirectorCountParam) {
        this.movieDirectorCount = movieDirectorCountParam;
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
     * Set value of movieProducerCount.
     *
     * @param movieProducerCountParam
     */
    public final void setMovieProducerCount(@Nullable final Integer movieProducerCountParam) {
        this.movieProducerCount = movieProducerCountParam;
    }
    
    /**
     * Set value of seriesProducerCount.
     *
     * @param seriesProducerCountParam
     */
    public final void setSeriesProducerCount(@Nullable final Integer seriesProducerCountParam) {
        this.seriesProducerCount = seriesProducerCountParam;
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
     * Set value of variationTopStar.
     *
     * @param variationTopStarParam
     */
    public final void setVariationTopStar(@Nullable final Integer variationTopStarParam) {
        this.variationTopStar = variationTopStarParam;
    }
    
    /**
     * Set value of movieActorCount.
     *
     * @param movieActorCountParam
     */
    public final void setMovieActorCount(@Nullable final Integer movieActorCountParam) {
        this.movieActorCount = movieActorCountParam;
    }
    
    /**
     * Set value of seriesDirectorCount.
     *
     * @param seriesDirectorCountParam
     */
    public final void setSeriesDirectorCount(@Nullable final Integer seriesDirectorCountParam) {
        this.seriesDirectorCount = seriesDirectorCountParam;
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
     * Set value of movieCount.
     *
     * @param movieCountParam
     */
    public final void setMovieCount(@Nullable final Integer movieCountParam) {
        this.movieCount = movieCountParam;
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
     * Set value of seriesCount.
     *
     * @param seriesCountParam
     */
    public final void setSeriesCount(@Nullable final Integer seriesCountParam) {
        this.seriesCount = seriesCountParam;
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
