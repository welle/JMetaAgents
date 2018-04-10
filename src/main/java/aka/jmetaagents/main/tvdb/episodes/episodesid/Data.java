package aka.jmetaagents.main.tvdb.episodes.episodesid;

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
    private String thumbHeight;
	@Nullable
    private Integer dvdSeason;
	@Nullable
    private Integer airsBeforeEpisode;
	@Nullable
    private String imdbId;
	@NonNull
    private List<String> directors = new ArrayList<>();
	@Nullable
    private String thumbAdded;
	@Nullable
    private Integer airedSeason;
	@Nullable
    private String showUrl;
	@Nullable
    private String seriesId;
	@Nullable
    private Integer lastUpdated;
	@Nullable
    private String productionCode;
	@Nullable
    private Integer thumbAuthor;
	@Nullable
    private Integer id;
	@Nullable
    private String dvdDiscid;
	@Nullable
    private Integer airedEpisodeNumber;
	@Nullable
    private Integer airsBeforeSeason;
	@Nullable
    private String lastUpdatedBy;
	@Nullable
    private String overview;
	@Nullable
    private Integer airsAfterSeason;
	@Nullable
    private Integer siteRating;
	@Nullable
    private Integer absoluteNumber;
	@Nullable
    private String director;
	@Nullable
    private String episodeName;
	@Nullable
    private String firstAired;
	@Nullable
    private String thumbWidth;
	@NonNull
    private List<String> writers = new ArrayList<>();
	@Nullable
    private Integer dvdChapter;
	@Nullable
    private Integer siteRatingCount;
	@Nullable
    private String filename;
	@NonNull
    private List<String> guestStars = new ArrayList<>();
	@Nullable
    private Integer dvdEpisodeNumber;

	/**
     * Empty Constructor.
     */
    public Data() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param thumbHeightParam String
     * @param dvdSeasonParam Integer
     * @param airsBeforeEpisodeParam Integer
     * @param imdbIdParam String
     * @param directorsParam List<String>
     * @param thumbAddedParam String
     * @param airedSeasonParam Integer
     * @param showUrlParam String
     * @param seriesIdParam String
     * @param lastUpdatedParam Integer
     * @param productionCodeParam String
     * @param thumbAuthorParam Integer
     * @param idParam Integer
     * @param dvdDiscidParam String
     * @param airedEpisodeNumberParam Integer
     * @param airsBeforeSeasonParam Integer
     * @param lastUpdatedByParam String
     * @param overviewParam String
     * @param airsAfterSeasonParam Integer
     * @param siteRatingParam Integer
     * @param absoluteNumberParam Integer
     * @param directorParam String
     * @param episodeNameParam String
     * @param firstAiredParam String
     * @param thumbWidthParam String
     * @param writersParam List<String>
     * @param dvdChapterParam Integer
     * @param siteRatingCountParam Integer
     * @param filenameParam String
     * @param guestStarsParam List<String>
     * @param dvdEpisodeNumberParam Integer
     */
    public Data(@Nullable final String thumbHeightParam, @Nullable final Integer dvdSeasonParam, @Nullable final Integer airsBeforeEpisodeParam, @Nullable final String imdbIdParam, @NonNull final List<String> directorsParam, @Nullable final String thumbAddedParam, @Nullable final Integer airedSeasonParam, @Nullable final String showUrlParam, @Nullable final String seriesIdParam, @Nullable final Integer lastUpdatedParam, @Nullable final String productionCodeParam, @Nullable final Integer thumbAuthorParam, @Nullable final Integer idParam, @Nullable final String dvdDiscidParam, @Nullable final Integer airedEpisodeNumberParam, @Nullable final Integer airsBeforeSeasonParam, @Nullable final String lastUpdatedByParam, @Nullable final String overviewParam, @Nullable final Integer airsAfterSeasonParam, @Nullable final Integer siteRatingParam, @Nullable final Integer absoluteNumberParam, @Nullable final String directorParam, @Nullable final String episodeNameParam, @Nullable final String firstAiredParam, @Nullable final String thumbWidthParam, @NonNull final List<String> writersParam, @Nullable final Integer dvdChapterParam, @Nullable final Integer siteRatingCountParam, @Nullable final String filenameParam, @NonNull final List<String> guestStarsParam, @Nullable final Integer dvdEpisodeNumberParam) {
        this.thumbHeight = thumbHeightParam;
        this.dvdSeason = dvdSeasonParam;
        this.airsBeforeEpisode = airsBeforeEpisodeParam;
        this.imdbId = imdbIdParam;
        this.directors = directorsParam;
        this.thumbAdded = thumbAddedParam;
        this.airedSeason = airedSeasonParam;
        this.showUrl = showUrlParam;
        this.seriesId = seriesIdParam;
        this.lastUpdated = lastUpdatedParam;
        this.productionCode = productionCodeParam;
        this.thumbAuthor = thumbAuthorParam;
        this.id = idParam;
        this.dvdDiscid = dvdDiscidParam;
        this.airedEpisodeNumber = airedEpisodeNumberParam;
        this.airsBeforeSeason = airsBeforeSeasonParam;
        this.lastUpdatedBy = lastUpdatedByParam;
        this.overview = overviewParam;
        this.airsAfterSeason = airsAfterSeasonParam;
        this.siteRating = siteRatingParam;
        this.absoluteNumber = absoluteNumberParam;
        this.director = directorParam;
        this.episodeName = episodeNameParam;
        this.firstAired = firstAiredParam;
        this.thumbWidth = thumbWidthParam;
        this.writers = writersParam;
        this.dvdChapter = dvdChapterParam;
        this.siteRatingCount = siteRatingCountParam;
        this.filename = filenameParam;
        this.guestStars = guestStarsParam;
        this.dvdEpisodeNumber = dvdEpisodeNumberParam;
    }
    
    /**
     * Get value of thumbHeight.
     *
     * @return String value of thumbHeight
     */
    @Nullable
    public final String getThumbHeight() {
        return this.thumbHeight;
    }
    
    /**
     * Get value of dvdSeason.
     *
     * @return Integer value of dvdSeason
     */
    @Nullable
    public final Integer getDvdSeason() {
        return this.dvdSeason;
    }
    
    /**
     * Get value of airsBeforeEpisode.
     *
     * @return Integer value of airsBeforeEpisode
     */
    @Nullable
    public final Integer getAirsBeforeEpisode() {
        return this.airsBeforeEpisode;
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
     * Get value of directors.
     *
     * @return List<String> value of directors
     */
    @NonNull
    public final List<String> getDirectors() {
        return this.directors;
    }
    
    /**
     * Get value of thumbAdded.
     *
     * @return String value of thumbAdded
     */
    @Nullable
    public final String getThumbAdded() {
        return this.thumbAdded;
    }
    
    /**
     * Get value of airedSeason.
     *
     * @return Integer value of airedSeason
     */
    @Nullable
    public final Integer getAiredSeason() {
        return this.airedSeason;
    }
    
    /**
     * Get value of showUrl.
     *
     * @return String value of showUrl
     */
    @Nullable
    public final String getShowUrl() {
        return this.showUrl;
    }
    
    /**
     * Get value of seriesId.
     *
     * @return String value of seriesId
     */
    @Nullable
    public final String getSeriesId() {
        return this.seriesId;
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
     * Get value of productionCode.
     *
     * @return String value of productionCode
     */
    @Nullable
    public final String getProductionCode() {
        return this.productionCode;
    }
    
    /**
     * Get value of thumbAuthor.
     *
     * @return Integer value of thumbAuthor
     */
    @Nullable
    public final Integer getThumbAuthor() {
        return this.thumbAuthor;
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
     * Get value of dvdDiscid.
     *
     * @return String value of dvdDiscid
     */
    @Nullable
    public final String getDvdDiscid() {
        return this.dvdDiscid;
    }
    
    /**
     * Get value of airedEpisodeNumber.
     *
     * @return Integer value of airedEpisodeNumber
     */
    @Nullable
    public final Integer getAiredEpisodeNumber() {
        return this.airedEpisodeNumber;
    }
    
    /**
     * Get value of airsBeforeSeason.
     *
     * @return Integer value of airsBeforeSeason
     */
    @Nullable
    public final Integer getAirsBeforeSeason() {
        return this.airsBeforeSeason;
    }
    
    /**
     * Get value of lastUpdatedBy.
     *
     * @return String value of lastUpdatedBy
     */
    @Nullable
    public final String getLastUpdatedBy() {
        return this.lastUpdatedBy;
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
     * Get value of airsAfterSeason.
     *
     * @return Integer value of airsAfterSeason
     */
    @Nullable
    public final Integer getAirsAfterSeason() {
        return this.airsAfterSeason;
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
     * Get value of absoluteNumber.
     *
     * @return Integer value of absoluteNumber
     */
    @Nullable
    public final Integer getAbsoluteNumber() {
        return this.absoluteNumber;
    }
    
    /**
     * Get value of director.
     *
     * @return String value of director
     */
    @Nullable
    public final String getDirector() {
        return this.director;
    }
    
    /**
     * Get value of episodeName.
     *
     * @return String value of episodeName
     */
    @Nullable
    public final String getEpisodeName() {
        return this.episodeName;
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
     * Get value of thumbWidth.
     *
     * @return String value of thumbWidth
     */
    @Nullable
    public final String getThumbWidth() {
        return this.thumbWidth;
    }
    
    /**
     * Get value of writers.
     *
     * @return List<String> value of writers
     */
    @NonNull
    public final List<String> getWriters() {
        return this.writers;
    }
    
    /**
     * Get value of dvdChapter.
     *
     * @return Integer value of dvdChapter
     */
    @Nullable
    public final Integer getDvdChapter() {
        return this.dvdChapter;
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
     * Get value of filename.
     *
     * @return String value of filename
     */
    @Nullable
    public final String getFilename() {
        return this.filename;
    }
    
    /**
     * Get value of guestStars.
     *
     * @return List<String> value of guestStars
     */
    @NonNull
    public final List<String> getGuestStars() {
        return this.guestStars;
    }
    
    /**
     * Get value of dvdEpisodeNumber.
     *
     * @return Integer value of dvdEpisodeNumber
     */
    @Nullable
    public final Integer getDvdEpisodeNumber() {
        return this.dvdEpisodeNumber;
    }

    
    /**
     * Set value of thumbHeight.
     *
     * @param thumbHeightParam
     */
    public final void setThumbHeight(@Nullable final String thumbHeightParam) {
        this.thumbHeight = thumbHeightParam;
    }
    
    /**
     * Set value of dvdSeason.
     *
     * @param dvdSeasonParam
     */
    public final void setDvdSeason(@Nullable final Integer dvdSeasonParam) {
        this.dvdSeason = dvdSeasonParam;
    }
    
    /**
     * Set value of airsBeforeEpisode.
     *
     * @param airsBeforeEpisodeParam
     */
    public final void setAirsBeforeEpisode(@Nullable final Integer airsBeforeEpisodeParam) {
        this.airsBeforeEpisode = airsBeforeEpisodeParam;
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
     * Set value of directors.
     *
     * @param directorsParam
     */
    public final void setDirectors(@NonNull final List<String> directorsParam) {
        this.directors = directorsParam;
    }
    
    /**
     * Set value of thumbAdded.
     *
     * @param thumbAddedParam
     */
    public final void setThumbAdded(@Nullable final String thumbAddedParam) {
        this.thumbAdded = thumbAddedParam;
    }
    
    /**
     * Set value of airedSeason.
     *
     * @param airedSeasonParam
     */
    public final void setAiredSeason(@Nullable final Integer airedSeasonParam) {
        this.airedSeason = airedSeasonParam;
    }
    
    /**
     * Set value of showUrl.
     *
     * @param showUrlParam
     */
    public final void setShowUrl(@Nullable final String showUrlParam) {
        this.showUrl = showUrlParam;
    }
    
    /**
     * Set value of seriesId.
     *
     * @param seriesIdParam
     */
    public final void setSeriesId(@Nullable final String seriesIdParam) {
        this.seriesId = seriesIdParam;
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
     * Set value of productionCode.
     *
     * @param productionCodeParam
     */
    public final void setProductionCode(@Nullable final String productionCodeParam) {
        this.productionCode = productionCodeParam;
    }
    
    /**
     * Set value of thumbAuthor.
     *
     * @param thumbAuthorParam
     */
    public final void setThumbAuthor(@Nullable final Integer thumbAuthorParam) {
        this.thumbAuthor = thumbAuthorParam;
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
     * Set value of dvdDiscid.
     *
     * @param dvdDiscidParam
     */
    public final void setDvdDiscid(@Nullable final String dvdDiscidParam) {
        this.dvdDiscid = dvdDiscidParam;
    }
    
    /**
     * Set value of airedEpisodeNumber.
     *
     * @param airedEpisodeNumberParam
     */
    public final void setAiredEpisodeNumber(@Nullable final Integer airedEpisodeNumberParam) {
        this.airedEpisodeNumber = airedEpisodeNumberParam;
    }
    
    /**
     * Set value of airsBeforeSeason.
     *
     * @param airsBeforeSeasonParam
     */
    public final void setAirsBeforeSeason(@Nullable final Integer airsBeforeSeasonParam) {
        this.airsBeforeSeason = airsBeforeSeasonParam;
    }
    
    /**
     * Set value of lastUpdatedBy.
     *
     * @param lastUpdatedByParam
     */
    public final void setLastUpdatedBy(@Nullable final String lastUpdatedByParam) {
        this.lastUpdatedBy = lastUpdatedByParam;
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
     * Set value of airsAfterSeason.
     *
     * @param airsAfterSeasonParam
     */
    public final void setAirsAfterSeason(@Nullable final Integer airsAfterSeasonParam) {
        this.airsAfterSeason = airsAfterSeasonParam;
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
     * Set value of absoluteNumber.
     *
     * @param absoluteNumberParam
     */
    public final void setAbsoluteNumber(@Nullable final Integer absoluteNumberParam) {
        this.absoluteNumber = absoluteNumberParam;
    }
    
    /**
     * Set value of director.
     *
     * @param directorParam
     */
    public final void setDirector(@Nullable final String directorParam) {
        this.director = directorParam;
    }
    
    /**
     * Set value of episodeName.
     *
     * @param episodeNameParam
     */
    public final void setEpisodeName(@Nullable final String episodeNameParam) {
        this.episodeName = episodeNameParam;
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
     * Set value of thumbWidth.
     *
     * @param thumbWidthParam
     */
    public final void setThumbWidth(@Nullable final String thumbWidthParam) {
        this.thumbWidth = thumbWidthParam;
    }
    
    /**
     * Set value of writers.
     *
     * @param writersParam
     */
    public final void setWriters(@NonNull final List<String> writersParam) {
        this.writers = writersParam;
    }
    
    /**
     * Set value of dvdChapter.
     *
     * @param dvdChapterParam
     */
    public final void setDvdChapter(@Nullable final Integer dvdChapterParam) {
        this.dvdChapter = dvdChapterParam;
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
     * Set value of filename.
     *
     * @param filenameParam
     */
    public final void setFilename(@Nullable final String filenameParam) {
        this.filename = filenameParam;
    }
    
    /**
     * Set value of guestStars.
     *
     * @param guestStarsParam
     */
    public final void setGuestStars(@NonNull final List<String> guestStarsParam) {
        this.guestStars = guestStarsParam;
    }
    
    /**
     * Set value of dvdEpisodeNumber.
     *
     * @param dvdEpisodeNumberParam
     */
    public final void setDvdEpisodeNumber(@Nullable final Integer dvdEpisodeNumberParam) {
        this.dvdEpisodeNumber = dvdEpisodeNumberParam;
    }
}
