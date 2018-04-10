package aka.jmetaagents.main.tvdb.series.seriesidimages;

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
    private Integer series;
	@Nullable
    private Integer fanart;
	@Nullable
    private Integer season;
	@Nullable
    private Integer poster;
	@Nullable
    private Integer seasonwide;

	/**
     * Empty Constructor.
     */
    public Data() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param seriesParam Integer
     * @param fanartParam Integer
     * @param seasonParam Integer
     * @param posterParam Integer
     * @param seasonwideParam Integer
     */
    public Data(@Nullable final Integer seriesParam, @Nullable final Integer fanartParam, @Nullable final Integer seasonParam, @Nullable final Integer posterParam, @Nullable final Integer seasonwideParam) {
        this.series = seriesParam;
        this.fanart = fanartParam;
        this.season = seasonParam;
        this.poster = posterParam;
        this.seasonwide = seasonwideParam;
    }
    
    /**
     * Get value of series.
     *
     * @return Integer value of series
     */
    @Nullable
    public final Integer getSeries() {
        return this.series;
    }
    
    /**
     * Get value of fanart.
     *
     * @return Integer value of fanart
     */
    @Nullable
    public final Integer getFanart() {
        return this.fanart;
    }
    
    /**
     * Get value of season.
     *
     * @return Integer value of season
     */
    @Nullable
    public final Integer getSeason() {
        return this.season;
    }
    
    /**
     * Get value of poster.
     *
     * @return Integer value of poster
     */
    @Nullable
    public final Integer getPoster() {
        return this.poster;
    }
    
    /**
     * Get value of seasonwide.
     *
     * @return Integer value of seasonwide
     */
    @Nullable
    public final Integer getSeasonwide() {
        return this.seasonwide;
    }

    
    /**
     * Set value of series.
     *
     * @param seriesParam
     */
    public final void setSeries(@Nullable final Integer seriesParam) {
        this.series = seriesParam;
    }
    
    /**
     * Set value of fanart.
     *
     * @param fanartParam
     */
    public final void setFanart(@Nullable final Integer fanartParam) {
        this.fanart = fanartParam;
    }
    
    /**
     * Set value of season.
     *
     * @param seasonParam
     */
    public final void setSeason(@Nullable final Integer seasonParam) {
        this.season = seasonParam;
    }
    
    /**
     * Set value of poster.
     *
     * @param posterParam
     */
    public final void setPoster(@Nullable final Integer posterParam) {
        this.poster = posterParam;
    }
    
    /**
     * Set value of seasonwide.
     *
     * @param seasonwideParam
     */
    public final void setSeasonwide(@Nullable final Integer seasonwideParam) {
        this.seasonwide = seasonwideParam;
    }
}
