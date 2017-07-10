package aka.jmetaagents.main.jtvdb.pojo.jtvshowseason;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowseason.deserializers.DateYearMonthDayDashDeserializer;

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
    private Integer dvdSeason;
	@Nullable
    private String overview;
	@Nullable
    private Integer airedSeasonID;
	@Nullable
    private String absoluteNumber;
	@Nullable
    private String episodeName;
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date firstAired;
	@Nullable
    private Integer airedSeason;
	@Nullable
    private Language language;
	@Nullable
    private Integer dvdEpisodeNumber;
	@Nullable
    private Integer id;
	@Nullable
    private Integer airedEpisodeNumber;

	/**
     * Empty Constructor.
     */
    public Data() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dvdSeasonParam Integer
     * @param overviewParam String
     * @param airedSeasonIDParam Integer
     * @param absoluteNumberParam String
     * @param episodeNameParam String
     * @param firstAiredParam Date
     * @param airedSeasonParam Integer
     * @param languageParam Language
     * @param dvdEpisodeNumberParam Integer
     * @param idParam Integer
     * @param airedEpisodeNumberParam Integer
     */
    public Data(@Nullable final Integer dvdSeasonParam, @Nullable final String overviewParam, @Nullable final Integer airedSeasonIDParam, @Nullable final String absoluteNumberParam, @Nullable final String episodeNameParam, @Nullable final Date firstAiredParam, @Nullable final Integer airedSeasonParam, @Nullable final Language languageParam, @Nullable final Integer dvdEpisodeNumberParam, @Nullable final Integer idParam, @Nullable final Integer airedEpisodeNumberParam) {
        this.dvdSeason = dvdSeasonParam;
        this.overview = overviewParam;
        this.airedSeasonID = airedSeasonIDParam;
        this.absoluteNumber = absoluteNumberParam;
        this.episodeName = episodeNameParam;
        this.firstAired = firstAiredParam;
        this.airedSeason = airedSeasonParam;
        this.language = languageParam;
        this.dvdEpisodeNumber = dvdEpisodeNumberParam;
        this.id = idParam;
        this.airedEpisodeNumber = airedEpisodeNumberParam;
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
     * Get value of overview.
     *
     * @return String value of overview
     */
    @Nullable
    public final String getOverview() {
        return this.overview;
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
     * Get value of absoluteNumber.
     *
     * @return String value of absoluteNumber
     */
    @Nullable
    public final String getAbsoluteNumber() {
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
     * Get value of dvdEpisodeNumber.
     *
     * @return Integer value of dvdEpisodeNumber
     */
    @Nullable
    public final Integer getDvdEpisodeNumber() {
        return this.dvdEpisodeNumber;
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
     * Get value of airedEpisodeNumber.
     *
     * @return Integer value of airedEpisodeNumber
     */
    @Nullable
    public final Integer getAiredEpisodeNumber() {
        return this.airedEpisodeNumber;
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
     * Set value of overview.
     *
     * @param overviewParam
     */
    public final void setOverview(@Nullable final String overviewParam) {
        this.overview = overviewParam;
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
     * Set value of absoluteNumber.
     *
     * @param absoluteNumberParam
     */
    public final void setAbsoluteNumber(@Nullable final String absoluteNumberParam) {
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
     * Set value of dvdEpisodeNumber.
     *
     * @param dvdEpisodeNumberParam
     */
    public final void setDvdEpisodeNumber(@Nullable final Integer dvdEpisodeNumberParam) {
        this.dvdEpisodeNumber = dvdEpisodeNumberParam;
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
     * Set value of airedEpisodeNumber.
     *
     * @param airedEpisodeNumberParam
     */
    public final void setAiredEpisodeNumber(@Nullable final Integer airedEpisodeNumberParam) {
        this.airedEpisodeNumber = airedEpisodeNumberParam;
    }
}
