package aka.jmetaagents.main.tvdb.series.seriesidepisodesquery;

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
    private Integer dvdSeason;
	@Nullable
    private Integer lastUpdated;
	@Nullable
    private String overview;
	@Nullable
    private Integer absoluteNumber;
	@Nullable
    private String episodeName;
	@Nullable
    private String firstAired;
	@Nullable
    private Integer airedSeason;
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
     * @param lastUpdatedParam Integer
     * @param overviewParam String
     * @param absoluteNumberParam Integer
     * @param episodeNameParam String
     * @param firstAiredParam String
     * @param airedSeasonParam Integer
     * @param dvdEpisodeNumberParam Integer
     * @param idParam Integer
     * @param airedEpisodeNumberParam Integer
     */
    public Data(@Nullable final Integer dvdSeasonParam, @Nullable final Integer lastUpdatedParam, @Nullable final String overviewParam, @Nullable final Integer absoluteNumberParam, @Nullable final String episodeNameParam, @Nullable final String firstAiredParam, @Nullable final Integer airedSeasonParam, @Nullable final Integer dvdEpisodeNumberParam, @Nullable final Integer idParam, @Nullable final Integer airedEpisodeNumberParam) {
        this.dvdSeason = dvdSeasonParam;
        this.lastUpdated = lastUpdatedParam;
        this.overview = overviewParam;
        this.absoluteNumber = absoluteNumberParam;
        this.episodeName = episodeNameParam;
        this.firstAired = firstAiredParam;
        this.airedSeason = airedSeasonParam;
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
     * Get value of lastUpdated.
     *
     * @return Integer value of lastUpdated
     */
    @Nullable
    public final Integer getLastUpdated() {
        return this.lastUpdated;
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
     * @return String value of firstAired
     */
    @Nullable
    public final String getFirstAired() {
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
     * Set value of lastUpdated.
     *
     * @param lastUpdatedParam
     */
    public final void setLastUpdated(@Nullable final Integer lastUpdatedParam) {
        this.lastUpdated = lastUpdatedParam;
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
    public final void setFirstAired(@Nullable final String firstAiredParam) {
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
