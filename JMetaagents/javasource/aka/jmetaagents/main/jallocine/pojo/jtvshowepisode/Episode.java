package aka.jmetaagents.main.jallocine.pojo.jtvshowepisode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jallocine.pojo.jtvshowepisode.deserializers.DateYearMonthDayDashDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
	@NonNull
    private List<Link> link = new ArrayList<>();
	@Nullable
    private ParentSeason parentSeason;
	@Nullable
    private String synopsis;
	@NonNull
    private List<Media> media = new ArrayList<>();
	@Nullable
    private String title;
	@Nullable
    private Integer episodeNumberSeries;
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date originalBroadcastDate;
	@Nullable
    private ParentSeries parentSeries;
	@Nullable
    private Picture picture;
	@NonNull
    private List<CastMember> castMember = new ArrayList<>();
	@Nullable
    private OriginalBroadcast originalBroadcast;
	@Nullable
    private String originalTitle;
	@Nullable
    private String synopsisShort;
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
     * @param linkParam List<Link>
     * @param parentSeasonParam ParentSeason
     * @param synopsisParam String
     * @param mediaParam List<Media>
     * @param titleParam String
     * @param episodeNumberSeriesParam Integer
     * @param originalBroadcastDateParam Date
     * @param parentSeriesParam ParentSeries
     * @param pictureParam Picture
     * @param castMemberParam List<CastMember>
     * @param originalBroadcastParam OriginalBroadcast
     * @param originalTitleParam String
     * @param synopsisShortParam String
     * @param statisticsParam Statistics
     */
    public Episode(@Nullable final Integer codeParam, @Nullable final String originalTitleArticleParam, @Nullable final Integer episodeNumberSeasonParam, @NonNull final List<Link> linkParam, @Nullable final ParentSeason parentSeasonParam, @Nullable final String synopsisParam, @NonNull final List<Media> mediaParam, @Nullable final String titleParam, @Nullable final Integer episodeNumberSeriesParam, @Nullable final Date originalBroadcastDateParam, @Nullable final ParentSeries parentSeriesParam, @Nullable final Picture pictureParam, @NonNull final List<CastMember> castMemberParam, @Nullable final OriginalBroadcast originalBroadcastParam, @Nullable final String originalTitleParam, @Nullable final String synopsisShortParam, @Nullable final Statistics statisticsParam) {
        this.code = codeParam;
        this.originalTitleArticle = originalTitleArticleParam;
        this.episodeNumberSeason = episodeNumberSeasonParam;
        this.link = linkParam;
        this.parentSeason = parentSeasonParam;
        this.synopsis = synopsisParam;
        this.media = mediaParam;
        this.title = titleParam;
        this.episodeNumberSeries = episodeNumberSeriesParam;
        this.originalBroadcastDate = originalBroadcastDateParam;
        this.parentSeries = parentSeriesParam;
        this.picture = pictureParam;
        this.castMember = castMemberParam;
        this.originalBroadcast = originalBroadcastParam;
        this.originalTitle = originalTitleParam;
        this.synopsisShort = synopsisShortParam;
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
     * Get value of link.
     *
     * @return List<Link> value of link
     */
    @NonNull
    public final List<Link> getLink() {
        return this.link;
    }
    
    /**
     * Get value of parentSeason.
     *
     * @return ParentSeason value of parentSeason
     */
    @Nullable
    public final ParentSeason getParentSeason() {
        return this.parentSeason;
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
     * Get value of media.
     *
     * @return List<Media> value of media
     */
    @NonNull
    public final List<Media> getMedia() {
        return this.media;
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
     * Get value of originalBroadcastDate.
     *
     * @return Date value of originalBroadcastDate
     */
    @Nullable
    public final Date getOriginalBroadcastDate() {
        return this.originalBroadcastDate;
    }
    
    /**
     * Get value of parentSeries.
     *
     * @return ParentSeries value of parentSeries
     */
    @Nullable
    public final ParentSeries getParentSeries() {
        return this.parentSeries;
    }
    
    /**
     * Get value of picture.
     *
     * @return Picture value of picture
     */
    @Nullable
    public final Picture getPicture() {
        return this.picture;
    }
    
    /**
     * Get value of castMember.
     *
     * @return List<CastMember> value of castMember
     */
    @NonNull
    public final List<CastMember> getCastMember() {
        return this.castMember;
    }
    
    /**
     * Get value of originalBroadcast.
     *
     * @return OriginalBroadcast value of originalBroadcast
     */
    @Nullable
    public final OriginalBroadcast getOriginalBroadcast() {
        return this.originalBroadcast;
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
     * Get value of synopsisShort.
     *
     * @return String value of synopsisShort
     */
    @Nullable
    public final String getSynopsisShort() {
        return this.synopsisShort;
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
     * Set value of link.
     *
     * @param linkParam
     */
    public final void getLink(@NonNull final List<Link> linkParam) {
        this.link = linkParam;
    }
    
    /**
     * Set value of parentSeason.
     *
     * @param parentSeasonParam
     */
    public final void setParentSeason(@Nullable final ParentSeason parentSeasonParam) {
        this.parentSeason = parentSeasonParam;
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
     * Set value of media.
     *
     * @param mediaParam
     */
    public final void getMedia(@NonNull final List<Media> mediaParam) {
        this.media = mediaParam;
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
     * Set value of originalBroadcastDate.
     *
     * @param originalBroadcastDateParam
     */
    public final void setOriginalBroadcastDate(@Nullable final Date originalBroadcastDateParam) {
        this.originalBroadcastDate = originalBroadcastDateParam;
    }
    
    /**
     * Set value of parentSeries.
     *
     * @param parentSeriesParam
     */
    public final void setParentSeries(@Nullable final ParentSeries parentSeriesParam) {
        this.parentSeries = parentSeriesParam;
    }
    
    /**
     * Set value of picture.
     *
     * @param pictureParam
     */
    public final void setPicture(@Nullable final Picture pictureParam) {
        this.picture = pictureParam;
    }
    
    /**
     * Set value of castMember.
     *
     * @param castMemberParam
     */
    public final void getCastMember(@NonNull final List<CastMember> castMemberParam) {
        this.castMember = castMemberParam;
    }
    
    /**
     * Set value of originalBroadcast.
     *
     * @param originalBroadcastParam
     */
    public final void setOriginalBroadcast(@Nullable final OriginalBroadcast originalBroadcastParam) {
        this.originalBroadcast = originalBroadcastParam;
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
     * Set value of synopsisShort.
     *
     * @param synopsisShortParam
     */
    public final void setSynopsisShort(@Nullable final String synopsisShortParam) {
        this.synopsisShort = synopsisShortParam;
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
