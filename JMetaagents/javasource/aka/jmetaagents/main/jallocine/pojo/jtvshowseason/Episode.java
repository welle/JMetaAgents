package aka.jmetaagents.main.jallocine.pojo.jtvshowseason;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jallocine.pojo.jtvshowseason.deserializers.DateYearMonthDayDashDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Episode {

	@Nullable
    private Integer code;
	@Nullable
    private String originalTitleArticle;
	@Nullable
    private Integer episodeNumberSeason;
	@Nullable
    private String synopsis;
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date originalBroadcastDate;
	@Nullable
    private String title;
	@Nullable
    private Integer episodeNumberSeries;
    @JsonProperty("link")
	@NonNull
    private List<Link1> link1 = new ArrayList<>();
	@Nullable
    private String originalTitle;
	@Nullable
    private DefaultMedia defaultMedia;
	@Nullable
    private String synopsisShort;
	@Nullable
    private String trailerEmbed;
	@Nullable
    private Statistics statistics;

	/**
     * Empty Constructor.
     */
    public Episode() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param originalTitleArticleParam String
     * @param episodeNumberSeasonParam Integer
     * @param synopsisParam String
     * @param originalBroadcastDateParam Date
     * @param titleParam String
     * @param episodeNumberSeriesParam Integer
     * @param link1Param List<Link1>
     * @param originalTitleParam String
     * @param defaultMediaParam DefaultMedia
     * @param synopsisShortParam String
     * @param trailerEmbedParam String
     * @param statisticsParam Statistics
     */
    public Episode(@Nullable final Integer codeParam, @Nullable final String originalTitleArticleParam, @Nullable final Integer episodeNumberSeasonParam, @Nullable final String synopsisParam, @Nullable final Date originalBroadcastDateParam, @Nullable final String titleParam, @Nullable final Integer episodeNumberSeriesParam, @NonNull final List<Link1> link1Param, @Nullable final String originalTitleParam, @Nullable final DefaultMedia defaultMediaParam, @Nullable final String synopsisShortParam, @Nullable final String trailerEmbedParam, @Nullable final Statistics statisticsParam) {
        this.code = codeParam;
        this.originalTitleArticle = originalTitleArticleParam;
        this.episodeNumberSeason = episodeNumberSeasonParam;
        this.synopsis = synopsisParam;
        this.originalBroadcastDate = originalBroadcastDateParam;
        this.title = titleParam;
        this.episodeNumberSeries = episodeNumberSeriesParam;
        this.link1 = link1Param;
        this.originalTitle = originalTitleParam;
        this.defaultMedia = defaultMediaParam;
        this.synopsisShort = synopsisShortParam;
        this.trailerEmbed = trailerEmbedParam;
        this.statistics = statisticsParam;
    }
    
    /**
     * Get value of code.
     *
     * @return Integer value of code
     */
    @Nullable
    public final Integer getCode() {
        return this.code;
    }
    
    /**
     * Get value of originalTitleArticle.
     *
     * @return String value of originalTitleArticle
     */
    @Nullable
    public final String getOriginalTitleArticle() {
        return this.originalTitleArticle;
    }
    
    /**
     * Get value of episodeNumberSeason.
     *
     * @return Integer value of episodeNumberSeason
     */
    @Nullable
    public final Integer getEpisodeNumberSeason() {
        return this.episodeNumberSeason;
    }
    
    /**
     * Get value of synopsis.
     *
     * @return String value of synopsis
     */
    @Nullable
    public final String getSynopsis() {
        return this.synopsis;
    }
    
    /**
     * Get value of originalBroadcastDate.
     *
     * @return Date value of originalBroadcastDate
     */
    @Nullable
    public final Date getOriginalBroadcastDate() {
        return this.originalBroadcastDate;
    }
    
    /**
     * Get value of title.
     *
     * @return String value of title
     */
    @Nullable
    public final String getTitle() {
        return this.title;
    }
    
    /**
     * Get value of episodeNumberSeries.
     *
     * @return Integer value of episodeNumberSeries
     */
    @Nullable
    public final Integer getEpisodeNumberSeries() {
        return this.episodeNumberSeries;
    }
    
    /**
     * Get value of link1.
     *
     * @return List<Link1> value of link1
     */
    @NonNull
    public final List<Link1> getLink1() {
        return this.link1;
    }
    
    /**
     * Get value of originalTitle.
     *
     * @return String value of originalTitle
     */
    @Nullable
    public final String getOriginalTitle() {
        return this.originalTitle;
    }
    
    /**
     * Get value of defaultMedia.
     *
     * @return DefaultMedia value of defaultMedia
     */
    @Nullable
    public final DefaultMedia getDefaultMedia() {
        return this.defaultMedia;
    }
    
    /**
     * Get value of synopsisShort.
     *
     * @return String value of synopsisShort
     */
    @Nullable
    public final String getSynopsisShort() {
        return this.synopsisShort;
    }
    
    /**
     * Get value of trailerEmbed.
     *
     * @return String value of trailerEmbed
     */
    @Nullable
    public final String getTrailerEmbed() {
        return this.trailerEmbed;
    }
    
    /**
     * Get value of statistics.
     *
     * @return Statistics value of statistics
     */
    @Nullable
    public final Statistics getStatistics() {
        return this.statistics;
    }

    
    /**
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final Integer codeParam) {
        this.code = codeParam;
    }
    
    /**
     * Set value of originalTitleArticle.
     *
     * @param originalTitleArticleParam
     */
    public final void setOriginalTitleArticle(@Nullable final String originalTitleArticleParam) {
        this.originalTitleArticle = originalTitleArticleParam;
    }
    
    /**
     * Set value of episodeNumberSeason.
     *
     * @param episodeNumberSeasonParam
     */
    public final void setEpisodeNumberSeason(@Nullable final Integer episodeNumberSeasonParam) {
        this.episodeNumberSeason = episodeNumberSeasonParam;
    }
    
    /**
     * Set value of synopsis.
     *
     * @param synopsisParam
     */
    public final void setSynopsis(@Nullable final String synopsisParam) {
        this.synopsis = synopsisParam;
    }
    
    /**
     * Set value of originalBroadcastDate.
     *
     * @param originalBroadcastDateParam
     */
    public final void setOriginalBroadcastDate(@Nullable final Date originalBroadcastDateParam) {
        this.originalBroadcastDate = originalBroadcastDateParam;
    }
    
    /**
     * Set value of title.
     *
     * @param titleParam
     */
    public final void setTitle(@Nullable final String titleParam) {
        this.title = titleParam;
    }
    
    /**
     * Set value of episodeNumberSeries.
     *
     * @param episodeNumberSeriesParam
     */
    public final void setEpisodeNumberSeries(@Nullable final Integer episodeNumberSeriesParam) {
        this.episodeNumberSeries = episodeNumberSeriesParam;
    }
    
    /**
     * Set value of link1.
     *
     * @param link1Param
     */
    public final void getLink1(@NonNull final List<Link1> link1Param) {
        this.link1 = link1Param;
    }
    
    /**
     * Set value of originalTitle.
     *
     * @param originalTitleParam
     */
    public final void setOriginalTitle(@Nullable final String originalTitleParam) {
        this.originalTitle = originalTitleParam;
    }
    
    /**
     * Set value of defaultMedia.
     *
     * @param defaultMediaParam
     */
    public final void setDefaultMedia(@Nullable final DefaultMedia defaultMediaParam) {
        this.defaultMedia = defaultMediaParam;
    }
    
    /**
     * Set value of synopsisShort.
     *
     * @param synopsisShortParam
     */
    public final void setSynopsisShort(@Nullable final String synopsisShortParam) {
        this.synopsisShort = synopsisShortParam;
    }
    
    /**
     * Set value of trailerEmbed.
     *
     * @param trailerEmbedParam
     */
    public final void setTrailerEmbed(@Nullable final String trailerEmbedParam) {
        this.trailerEmbed = trailerEmbedParam;
    }
    
    /**
     * Set value of statistics.
     *
     * @param statisticsParam
     */
    public final void setStatistics(@Nullable final Statistics statisticsParam) {
        this.statistics = statisticsParam;
    }
}
