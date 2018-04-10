package aka.jmetaagents.main.tvdb.series.seriesidepisodesquery;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JSeriesidepisodesqueryQuestion {

	@Nullable
    private String dvdSeason;
	@Nullable
    private String dvdEpisode;
	@Nullable
    private String airedEpisode;
	@Nullable
    private String absoluteNumber;
	@Nullable
    private String imdbId;
	@Nullable
    private String airedSeason;
	@Nullable
    private Integer id;
    @JsonProperty("Accept-Language")
	@Nullable
    private String acceptLanguage;
	@Nullable
    private String page;

	/**
     * Empty Constructor.
     */
    public JSeriesidepisodesqueryQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dvdSeasonParam String
     * @param dvdEpisodeParam String
     * @param airedEpisodeParam String
     * @param absoluteNumberParam String
     * @param imdbIdParam String
     * @param airedSeasonParam String
     * @param idParam Integer
     * @param acceptLanguageParam String
     * @param pageParam String
     */
    public JSeriesidepisodesqueryQuestion(@Nullable final String dvdSeasonParam, @Nullable final String dvdEpisodeParam, @Nullable final String airedEpisodeParam, @Nullable final String absoluteNumberParam, @Nullable final String imdbIdParam, @Nullable final String airedSeasonParam, @Nullable final Integer idParam, @Nullable final String acceptLanguageParam, @Nullable final String pageParam) {
        this.dvdSeason = dvdSeasonParam;
        this.dvdEpisode = dvdEpisodeParam;
        this.airedEpisode = airedEpisodeParam;
        this.absoluteNumber = absoluteNumberParam;
        this.imdbId = imdbIdParam;
        this.airedSeason = airedSeasonParam;
        this.id = idParam;
        this.acceptLanguage = acceptLanguageParam;
        this.page = pageParam;
    }
    
    /**
     * Get value of dvdSeason.
     *
     * @return String value of dvdSeason
     */
    @Nullable
    public final String getDvdSeason() {
        return this.dvdSeason;
    }
    
    /**
     * Get value of dvdEpisode.
     *
     * @return String value of dvdEpisode
     */
    @Nullable
    public final String getDvdEpisode() {
        return this.dvdEpisode;
    }
    
    /**
     * Get value of airedEpisode.
     *
     * @return String value of airedEpisode
     */
    @Nullable
    public final String getAiredEpisode() {
        return this.airedEpisode;
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
     * Get value of imdbId.
     *
     * @return String value of imdbId
     */
    @Nullable
    public final String getImdbId() {
        return this.imdbId;
    }
    
    /**
     * Get value of airedSeason.
     *
     * @return String value of airedSeason
     */
    @Nullable
    public final String getAiredSeason() {
        return this.airedSeason;
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
     * Get value of acceptLanguage.
     *
     * @return String value of acceptLanguage
     */
    @Nullable
    public final String getAcceptLanguage() {
        return this.acceptLanguage;
    }
    
    /**
     * Get value of page.
     *
     * @return String value of page
     */
    @Nullable
    public final String getPage() {
        return this.page;
    }

    
    /**
     * Set value of dvdSeason.
     *
     * @param dvdSeasonParam
     */
    public final void setDvdSeason(@Nullable final String dvdSeasonParam) {
        this.dvdSeason = dvdSeasonParam;
    }
    
    /**
     * Set value of dvdEpisode.
     *
     * @param dvdEpisodeParam
     */
    public final void setDvdEpisode(@Nullable final String dvdEpisodeParam) {
        this.dvdEpisode = dvdEpisodeParam;
    }
    
    /**
     * Set value of airedEpisode.
     *
     * @param airedEpisodeParam
     */
    public final void setAiredEpisode(@Nullable final String airedEpisodeParam) {
        this.airedEpisode = airedEpisodeParam;
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
     * Set value of imdbId.
     *
     * @param imdbIdParam
     */
    public final void setImdbId(@Nullable final String imdbIdParam) {
        this.imdbId = imdbIdParam;
    }
    
    /**
     * Set value of airedSeason.
     *
     * @param airedSeasonParam
     */
    public final void setAiredSeason(@Nullable final String airedSeasonParam) {
        this.airedSeason = airedSeasonParam;
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
     * Set value of acceptLanguage.
     *
     * @param acceptLanguageParam
     */
    public final void setAcceptLanguage(@Nullable final String acceptLanguageParam) {
        this.acceptLanguage = acceptLanguageParam;
    }
    
    /**
     * Set value of page.
     *
     * @param pageParam
     */
    public final void setPage(@Nullable final String pageParam) {
        this.page = pageParam;
    }
}
