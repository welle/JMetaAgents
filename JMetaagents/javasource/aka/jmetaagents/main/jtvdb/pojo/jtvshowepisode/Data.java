package aka.jmetaagents.main.jtvdb.pojo.jtvshowepisode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowepisode.deserializers.DateYearMonthDayHourDashDeserializer;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowepisode.deserializers.DateYearMonthDayDashDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Data {

	@Nullable
    private String thumbHeight;
	@Nullable
    private Integer dvdSeason;
	@Nullable
    private String airsBeforeEpisode;
	@Nullable
    private String imdbId;
	@NonNull
    private List<String> directors = new ArrayList<>();
    @JsonDeserialize(using = DateYearMonthDayHourDashDeserializer.class)
    private Date thumbAdded;
	@Nullable
    private Integer airedSeason;
	@Nullable
    private Language language;
	@Nullable
    private String showUrl;
	@Nullable
    private Integer seriesId;
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
    private String airsBeforeSeason;
	@Nullable
    private String overview;
	@Nullable
    private Integer lastUpdatedBy;
	@Nullable
    private String airsAfterSeason;
	@Nullable
    private Integer siteRating;
	@Nullable
    private String director;
	@Nullable
    private Integer absoluteNumber;
	@Nullable
    private String episodeName;
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date firstAired;
	@NonNull
    private List<String> writers = new ArrayList<>();
	@Nullable
    private String thumbWidth;
	@Nullable
    private String dvdChapter;
	@Nullable
    private Integer siteRatingCount;
	@Nullable
    private Integer airedSeasonID;
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
     * @param airsBeforeEpisodeParam String
     * @param imdbIdParam String
     * @param directorsParam List<String>
     * @param thumbAddedParam Date
     * @param airedSeasonParam Integer
     * @param languageParam Language
     * @param showUrlParam String
     * @param seriesIdParam Integer
     * @param lastUpdatedParam Integer
     * @param productionCodeParam String
     * @param thumbAuthorParam Integer
     * @param idParam Integer
     * @param dvdDiscidParam String
     * @param airedEpisodeNumberParam Integer
     * @param airsBeforeSeasonParam String
     * @param overviewParam String
     * @param lastUpdatedByParam Integer
     * @param airsAfterSeasonParam String
     * @param siteRatingParam Integer
     * @param directorParam String
     * @param absoluteNumberParam Integer
     * @param episodeNameParam String
     * @param firstAiredParam Date
     * @param writersParam List<String>
     * @param thumbWidthParam String
     * @param dvdChapterParam String
     * @param siteRatingCountParam Integer
     * @param airedSeasonIDParam Integer
     * @param filenameParam String
     * @param guestStarsParam List<String>
     * @param dvdEpisodeNumberParam Integer
     */
    public Data(@Nullable final String thumbHeightParam, @Nullable final Integer dvdSeasonParam, @Nullable final String airsBeforeEpisodeParam, @Nullable final String imdbIdParam, @NonNull final List<String> directorsParam, @Nullable final Date thumbAddedParam, @Nullable final Integer airedSeasonParam, @Nullable final Language languageParam, @Nullable final String showUrlParam, @Nullable final Integer seriesIdParam, @Nullable final Integer lastUpdatedParam, @Nullable final String productionCodeParam, @Nullable final Integer thumbAuthorParam, @Nullable final Integer idParam, @Nullable final String dvdDiscidParam, @Nullable final Integer airedEpisodeNumberParam, @Nullable final String airsBeforeSeasonParam, @Nullable final String overviewParam, @Nullable final Integer lastUpdatedByParam, @Nullable final String airsAfterSeasonParam, @Nullable final Integer siteRatingParam, @Nullable final String directorParam, @Nullable final Integer absoluteNumberParam, @Nullable final String episodeNameParam, @Nullable final Date firstAiredParam, @NonNull final List<String> writersParam, @Nullable final String thumbWidthParam, @Nullable final String dvdChapterParam, @Nullable final Integer siteRatingCountParam, @Nullable final Integer airedSeasonIDParam, @Nullable final String filenameParam, @NonNull final List<String> guestStarsParam, @Nullable final Integer dvdEpisodeNumberParam) {
        this.thumbHeight = thumbHeightParam;
        this.dvdSeason = dvdSeasonParam;
        this.airsBeforeEpisode = airsBeforeEpisodeParam;
        this.imdbId = imdbIdParam;
        this.directors = directorsParam;
        this.thumbAdded = thumbAddedParam;
        this.airedSeason = airedSeasonParam;
        this.language = languageParam;
        this.showUrl = showUrlParam;
        this.seriesId = seriesIdParam;
        this.lastUpdated = lastUpdatedParam;
        this.productionCode = productionCodeParam;
        this.thumbAuthor = thumbAuthorParam;
        this.id = idParam;
        this.dvdDiscid = dvdDiscidParam;
        this.airedEpisodeNumber = airedEpisodeNumberParam;
        this.airsBeforeSeason = airsBeforeSeasonParam;
        this.overview = overviewParam;
        this.lastUpdatedBy = lastUpdatedByParam;
        this.airsAfterSeason = airsAfterSeasonParam;
        this.siteRating = siteRatingParam;
        this.director = directorParam;
        this.absoluteNumber = absoluteNumberParam;
        this.episodeName = episodeNameParam;
        this.firstAired = firstAiredParam;
        this.writers = writersParam;
        this.thumbWidth = thumbWidthParam;
        this.dvdChapter = dvdChapterParam;
        this.siteRatingCount = siteRatingCountParam;
        this.airedSeasonID = airedSeasonIDParam;
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
     * @return String value of airsBeforeEpisode
     */
    @Nullable
    public final String getAirsBeforeEpisode() {
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
     * @return Date value of thumbAdded
     */
    @Nullable
    public final Date getThumbAdded() {
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
     * Get value of language.
     *
     * @return Language value of language
     */
    @Nullable
    public final Language getLanguage() {
        return this.language;
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
     * @return Integer value of seriesId
     */
    @Nullable
    public final Integer getSeriesId() {
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
     * @return String value of airsBeforeSeason
     */
    @Nullable
    public final String getAirsBeforeSeason() {
        return this.airsBeforeSeason;
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
     * Get value of lastUpdatedBy.
     *
     * @return Integer value of lastUpdatedBy
     */
    @Nullable
    public final Integer getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }
    
    /**
     * Get value of airsAfterSeason.
     *
     * @return String value of airsAfterSeason
     */
    @Nullable
    public final String getAirsAfterSeason() {
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
     * Get value of director.
     *
     * @return String value of director
     */
    @Nullable
    public final String getDirector() {
        return this.director;
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
     * @return Date value of firstAired
     */
    @Nullable
    public final Date getFirstAired() {
        return this.firstAired;
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
     * Get value of thumbWidth.
     *
     * @return String value of thumbWidth
     */
    @Nullable
    public final String getThumbWidth() {
        return this.thumbWidth;
    }
    
    /**
     * Get value of dvdChapter.
     *
     * @return String value of dvdChapter
     */
    @Nullable
    public final String getDvdChapter() {
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
     * Get value of airedSeasonID.
     *
     * @return Integer value of airedSeasonID
     */
    @Nullable
    public final Integer getAiredSeasonID() {
        return this.airedSeasonID;
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
    public final void setAirsBeforeEpisode(@Nullable final String airsBeforeEpisodeParam) {
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
    public final void getDirectors(@NonNull final List<String> directorsParam) {
        this.directors = directorsParam;
    }
    
    /**
     * Set value of thumbAdded.
     *
     * @param thumbAddedParam
     */
    public final void setThumbAdded(@Nullable final Date thumbAddedParam) {
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
     * Set value of language.
     *
     * @param languageParam
     */
    public final void setLanguage(@Nullable final Language languageParam) {
        this.language = languageParam;
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
    public final void setSeriesId(@Nullable final Integer seriesIdParam) {
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
    public final void setAirsBeforeSeason(@Nullable final String airsBeforeSeasonParam) {
        this.airsBeforeSeason = airsBeforeSeasonParam;
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
     * Set value of lastUpdatedBy.
     *
     * @param lastUpdatedByParam
     */
    public final void setLastUpdatedBy(@Nullable final Integer lastUpdatedByParam) {
        this.lastUpdatedBy = lastUpdatedByParam;
    }
    
    /**
     * Set value of airsAfterSeason.
     *
     * @param airsAfterSeasonParam
     */
    public final void setAirsAfterSeason(@Nullable final String airsAfterSeasonParam) {
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
     * Set value of director.
     *
     * @param directorParam
     */
    public final void setDirector(@Nullable final String directorParam) {
        this.director = directorParam;
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
    public final void setFirstAired(@Nullable final Date firstAiredParam) {
        this.firstAired = firstAiredParam;
    }
    
    /**
     * Set value of writers.
     *
     * @param writersParam
     */
    public final void getWriters(@NonNull final List<String> writersParam) {
        this.writers = writersParam;
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
     * Set value of dvdChapter.
     *
     * @param dvdChapterParam
     */
    public final void setDvdChapter(@Nullable final String dvdChapterParam) {
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
     * Set value of airedSeasonID.
     *
     * @param airedSeasonIDParam
     */
    public final void setAiredSeasonID(@Nullable final Integer airedSeasonIDParam) {
        this.airedSeasonID = airedSeasonIDParam;
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
    public final void getGuestStars(@NonNull final List<String> guestStarsParam) {
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
