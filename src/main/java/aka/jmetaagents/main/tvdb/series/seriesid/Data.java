package aka.jmetaagents.main.tvdb.series.seriesid;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Data {

	@Nullable
    private String airsDayOfWeek;
	@Nullable
    private String overview;
	@NonNull
    private List<String> aliases = new ArrayList<>();
	@Nullable
    private Integer siteRating;
	@Nullable
    private String added;
	@Nullable
    private String imdbId;
	@Nullable
    private String seriesName;
	@Nullable
    private String firstAired;
	@Nullable
    private String rating;
	@Nullable
    private String banner;
	@Nullable
    private String runtime;
	@Nullable
    private Integer seriesId;
	@Nullable
    private Integer siteRatingCount;
	@Nullable
    private String network;
	@Nullable
    private Integer lastUpdated;
	@Nullable
    private String airsTime;
	@Nullable
    private String zap2itId;
	@NonNull
    private List<String> genre = new ArrayList<>();
	@Nullable
    private String networkId;
	@Nullable
    private Integer id;
	@Nullable
    private String status;

	/**
     * Empty Constructor.
     */
    public Data() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param airsDayOfWeekParam String
     * @param overviewParam String
     * @param aliasesParam List<String>
     * @param siteRatingParam Integer
     * @param addedParam String
     * @param imdbIdParam String
     * @param seriesNameParam String
     * @param firstAiredParam String
     * @param ratingParam String
     * @param bannerParam String
     * @param runtimeParam String
     * @param seriesIdParam Integer
     * @param siteRatingCountParam Integer
     * @param networkParam String
     * @param lastUpdatedParam Integer
     * @param airsTimeParam String
     * @param zap2itIdParam String
     * @param genreParam List<String>
     * @param networkIdParam String
     * @param idParam Integer
     * @param statusParam String
     */
    public Data(@Nullable final String airsDayOfWeekParam, @Nullable final String overviewParam, @NonNull final List<String> aliasesParam, @Nullable final Integer siteRatingParam, @Nullable final String addedParam, @Nullable final String imdbIdParam, @Nullable final String seriesNameParam, @Nullable final String firstAiredParam, @Nullable final String ratingParam, @Nullable final String bannerParam, @Nullable final String runtimeParam, @Nullable final Integer seriesIdParam, @Nullable final Integer siteRatingCountParam, @Nullable final String networkParam, @Nullable final Integer lastUpdatedParam, @Nullable final String airsTimeParam, @Nullable final String zap2itIdParam, @NonNull final List<String> genreParam, @Nullable final String networkIdParam, @Nullable final Integer idParam, @Nullable final String statusParam) {
        this.airsDayOfWeek = airsDayOfWeekParam;
        this.overview = overviewParam;
        this.aliases = aliasesParam;
        this.siteRating = siteRatingParam;
        this.added = addedParam;
        this.imdbId = imdbIdParam;
        this.seriesName = seriesNameParam;
        this.firstAired = firstAiredParam;
        this.rating = ratingParam;
        this.banner = bannerParam;
        this.runtime = runtimeParam;
        this.seriesId = seriesIdParam;
        this.siteRatingCount = siteRatingCountParam;
        this.network = networkParam;
        this.lastUpdated = lastUpdatedParam;
        this.airsTime = airsTimeParam;
        this.zap2itId = zap2itIdParam;
        this.genre = genreParam;
        this.networkId = networkIdParam;
        this.id = idParam;
        this.status = statusParam;
    }
    
    /**
     * Get value of airsDayOfWeek.
     *
     * @return String value of airsDayOfWeek
     */
    @Nullable
    public final String getAirsDayOfWeek() {
        return this.airsDayOfWeek;
    }
    
    /**
     * Get value of overview.
     *
     * @return String value of overview
     */
    @Nullable
    public final String getOverview() {
        return this.overview;
    }
    
    /**
     * Get value of aliases.
     *
     * @return List<String> value of aliases
     */
    @NonNull
    public final List<String> getAliases() {
        return this.aliases;
    }
    
    /**
     * Get value of siteRating.
     *
     * @return Integer value of siteRating
     */
    @Nullable
    public final Integer getSiteRating() {
        return this.siteRating;
    }
    
    /**
     * Get value of added.
     *
     * @return String value of added
     */
    @Nullable
    public final String getAdded() {
        return this.added;
    }
    
    /**
     * Get value of imdbId.
     *
     * @return String value of imdbId
     */
    @Nullable
    public final String getImdbId() {
        return this.imdbId;
    }
    
    /**
     * Get value of seriesName.
     *
     * @return String value of seriesName
     */
    @Nullable
    public final String getSeriesName() {
        return this.seriesName;
    }
    
    /**
     * Get value of firstAired.
     *
     * @return String value of firstAired
     */
    @Nullable
    public final String getFirstAired() {
        return this.firstAired;
    }
    
    /**
     * Get value of rating.
     *
     * @return String value of rating
     */
    @Nullable
    public final String getRating() {
        return this.rating;
    }
    
    /**
     * Get value of banner.
     *
     * @return String value of banner
     */
    @Nullable
    public final String getBanner() {
        return this.banner;
    }
    
    /**
     * Get value of runtime.
     *
     * @return String value of runtime
     */
    @Nullable
    public final String getRuntime() {
        return this.runtime;
    }
    
    /**
     * Get value of seriesId.
     *
     * @return Integer value of seriesId
     */
    @Nullable
    public final Integer getSeriesId() {
        return this.seriesId;
    }
    
    /**
     * Get value of siteRatingCount.
     *
     * @return Integer value of siteRatingCount
     */
    @Nullable
    public final Integer getSiteRatingCount() {
        return this.siteRatingCount;
    }
    
    /**
     * Get value of network.
     *
     * @return String value of network
     */
    @Nullable
    public final String getNetwork() {
        return this.network;
    }
    
    /**
     * Get value of lastUpdated.
     *
     * @return Integer value of lastUpdated
     */
    @Nullable
    public final Integer getLastUpdated() {
        return this.lastUpdated;
    }
    
    /**
     * Get value of airsTime.
     *
     * @return String value of airsTime
     */
    @Nullable
    public final String getAirsTime() {
        return this.airsTime;
    }
    
    /**
     * Get value of zap2itId.
     *
     * @return String value of zap2itId
     */
    @Nullable
    public final String getZap2itId() {
        return this.zap2itId;
    }
    
    /**
     * Get value of genre.
     *
     * @return List<String> value of genre
     */
    @NonNull
    public final List<String> getGenre() {
        return this.genre;
    }
    
    /**
     * Get value of networkId.
     *
     * @return String value of networkId
     */
    @Nullable
    public final String getNetworkId() {
        return this.networkId;
    }
    
    /**
     * Get value of id.
     *
     * @return Integer value of id
     */
    @Nullable
    public final Integer getId() {
        return this.id;
    }
    
    /**
     * Get value of status.
     *
     * @return String value of status
     */
    @Nullable
    public final String getStatus() {
        return this.status;
    }

    
    /**
     * Set value of airsDayOfWeek.
     *
     * @param airsDayOfWeekParam
     */
    public final void setAirsDayOfWeek(@Nullable final String airsDayOfWeekParam) {
        this.airsDayOfWeek = airsDayOfWeekParam;
    }
    
    /**
     * Set value of overview.
     *
     * @param overviewParam
     */
    public final void setOverview(@Nullable final String overviewParam) {
        this.overview = overviewParam;
    }
    
    /**
     * Set value of aliases.
     *
     * @param aliasesParam
     */
    public final void setAliases(@NonNull final List<String> aliasesParam) {
        this.aliases = aliasesParam;
    }
    
    /**
     * Set value of siteRating.
     *
     * @param siteRatingParam
     */
    public final void setSiteRating(@Nullable final Integer siteRatingParam) {
        this.siteRating = siteRatingParam;
    }
    
    /**
     * Set value of added.
     *
     * @param addedParam
     */
    public final void setAdded(@Nullable final String addedParam) {
        this.added = addedParam;
    }
    
    /**
     * Set value of imdbId.
     *
     * @param imdbIdParam
     */
    public final void setImdbId(@Nullable final String imdbIdParam) {
        this.imdbId = imdbIdParam;
    }
    
    /**
     * Set value of seriesName.
     *
     * @param seriesNameParam
     */
    public final void setSeriesName(@Nullable final String seriesNameParam) {
        this.seriesName = seriesNameParam;
    }
    
    /**
     * Set value of firstAired.
     *
     * @param firstAiredParam
     */
    public final void setFirstAired(@Nullable final String firstAiredParam) {
        this.firstAired = firstAiredParam;
    }
    
    /**
     * Set value of rating.
     *
     * @param ratingParam
     */
    public final void setRating(@Nullable final String ratingParam) {
        this.rating = ratingParam;
    }
    
    /**
     * Set value of banner.
     *
     * @param bannerParam
     */
    public final void setBanner(@Nullable final String bannerParam) {
        this.banner = bannerParam;
    }
    
    /**
     * Set value of runtime.
     *
     * @param runtimeParam
     */
    public final void setRuntime(@Nullable final String runtimeParam) {
        this.runtime = runtimeParam;
    }
    
    /**
     * Set value of seriesId.
     *
     * @param seriesIdParam
     */
    public final void setSeriesId(@Nullable final Integer seriesIdParam) {
        this.seriesId = seriesIdParam;
    }
    
    /**
     * Set value of siteRatingCount.
     *
     * @param siteRatingCountParam
     */
    public final void setSiteRatingCount(@Nullable final Integer siteRatingCountParam) {
        this.siteRatingCount = siteRatingCountParam;
    }
    
    /**
     * Set value of network.
     *
     * @param networkParam
     */
    public final void setNetwork(@Nullable final String networkParam) {
        this.network = networkParam;
    }
    
    /**
     * Set value of lastUpdated.
     *
     * @param lastUpdatedParam
     */
    public final void setLastUpdated(@Nullable final Integer lastUpdatedParam) {
        this.lastUpdated = lastUpdatedParam;
    }
    
    /**
     * Set value of airsTime.
     *
     * @param airsTimeParam
     */
    public final void setAirsTime(@Nullable final String airsTimeParam) {
        this.airsTime = airsTimeParam;
    }
    
    /**
     * Set value of zap2itId.
     *
     * @param zap2itIdParam
     */
    public final void setZap2itId(@Nullable final String zap2itIdParam) {
        this.zap2itId = zap2itIdParam;
    }
    
    /**
     * Set value of genre.
     *
     * @param genreParam
     */
    public final void setGenre(@NonNull final List<String> genreParam) {
        this.genre = genreParam;
    }
    
    /**
     * Set value of networkId.
     *
     * @param networkIdParam
     */
    public final void setNetworkId(@Nullable final String networkIdParam) {
        this.networkId = networkIdParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of status.
     *
     * @param statusParam
     */
    public final void setStatus(@Nullable final String statusParam) {
        this.status = statusParam;
    }
}
