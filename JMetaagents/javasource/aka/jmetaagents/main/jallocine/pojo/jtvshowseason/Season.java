package aka.jmetaagents.main.jallocine.pojo.jtvshowseason;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Season {

	@Nullable
    private Integer code;
	@Nullable
    private Integer episodeCount;
	@NonNull
    private List<Link> link = new ArrayList<>();
	@Nullable
    private Integer yearEnd;
	@Nullable
    private Integer hasBluRay;
	@NonNull
    private List<Episode> episode = new ArrayList<>();
	@Nullable
    private Integer seasonNumber;
	@Nullable
    private ParentSeries parentSeries;
	@Nullable
    private Picture picture;
	@NonNull
    private List<CastMember> castMember = new ArrayList<>();
	@Nullable
    private Trailer trailer;
    @JsonProperty("media")
	@NonNull
    private List<Media1> media1 = new ArrayList<>();
	@Nullable
    private Integer hasVOD;
    @JsonProperty("statistics")
	@Nullable
    private Statistics2 statistics2;
	@Nullable
    private ProductionStatus productionStatus;
	@Nullable
    private OriginalChannel originalChannel;
	@Nullable
    private Integer hasDVD;
	@Nullable
    private Integer yearStart;
	@Nullable
    private String trailerEmbed;

	/**
     * Empty Constructor.
     */
    public Season() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param episodeCountParam Integer
     * @param linkParam List<Link>
     * @param yearEndParam Integer
     * @param hasBluRayParam Integer
     * @param episodeParam List<Episode>
     * @param seasonNumberParam Integer
     * @param parentSeriesParam ParentSeries
     * @param pictureParam Picture
     * @param castMemberParam List<CastMember>
     * @param trailerParam Trailer
     * @param media1Param List<Media1>
     * @param hasVODParam Integer
     * @param statistics2Param Statistics2
     * @param productionStatusParam ProductionStatus
     * @param originalChannelParam OriginalChannel
     * @param hasDVDParam Integer
     * @param yearStartParam Integer
     * @param trailerEmbedParam String
     */
    public Season(@Nullable final Integer codeParam, @Nullable final Integer episodeCountParam, @NonNull final List<Link> linkParam, @Nullable final Integer yearEndParam, @Nullable final Integer hasBluRayParam, @NonNull final List<Episode> episodeParam, @Nullable final Integer seasonNumberParam, @Nullable final ParentSeries parentSeriesParam, @Nullable final Picture pictureParam, @NonNull final List<CastMember> castMemberParam, @Nullable final Trailer trailerParam, @NonNull final List<Media1> media1Param, @Nullable final Integer hasVODParam, @Nullable final Statistics2 statistics2Param, @Nullable final ProductionStatus productionStatusParam, @Nullable final OriginalChannel originalChannelParam, @Nullable final Integer hasDVDParam, @Nullable final Integer yearStartParam, @Nullable final String trailerEmbedParam) {
        this.code = codeParam;
        this.episodeCount = episodeCountParam;
        this.link = linkParam;
        this.yearEnd = yearEndParam;
        this.hasBluRay = hasBluRayParam;
        this.episode = episodeParam;
        this.seasonNumber = seasonNumberParam;
        this.parentSeries = parentSeriesParam;
        this.picture = pictureParam;
        this.castMember = castMemberParam;
        this.trailer = trailerParam;
        this.media1 = media1Param;
        this.hasVOD = hasVODParam;
        this.statistics2 = statistics2Param;
        this.productionStatus = productionStatusParam;
        this.originalChannel = originalChannelParam;
        this.hasDVD = hasDVDParam;
        this.yearStart = yearStartParam;
        this.trailerEmbed = trailerEmbedParam;
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
     * Get value of episodeCount.
     *
     * @return Integer value of episodeCount
     */
    @Nullable
    public final Integer getEpisodeCount() {
        return this.episodeCount;
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
     * Get value of yearEnd.
     *
     * @return Integer value of yearEnd
     */
    @Nullable
    public final Integer getYearEnd() {
        return this.yearEnd;
    }
    
    /**
     * Get value of hasBluRay.
     *
     * @return Integer value of hasBluRay
     */
    @Nullable
    public final Integer getHasBluRay() {
        return this.hasBluRay;
    }
    
    /**
     * Get value of episode.
     *
     * @return List<Episode> value of episode
     */
    @NonNull
    public final List<Episode> getEpisode() {
        return this.episode;
    }
    
    /**
     * Get value of seasonNumber.
     *
     * @return Integer value of seasonNumber
     */
    @Nullable
    public final Integer getSeasonNumber() {
        return this.seasonNumber;
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
     * Get value of trailer.
     *
     * @return Trailer value of trailer
     */
    @Nullable
    public final Trailer getTrailer() {
        return this.trailer;
    }
    
    /**
     * Get value of media1.
     *
     * @return List<Media1> value of media1
     */
    @NonNull
    public final List<Media1> getMedia1() {
        return this.media1;
    }
    
    /**
     * Get value of hasVOD.
     *
     * @return Integer value of hasVOD
     */
    @Nullable
    public final Integer getHasVOD() {
        return this.hasVOD;
    }
    
    /**
     * Get value of statistics2.
     *
     * @return Statistics2 value of statistics2
     */
    @Nullable
    public final Statistics2 getStatistics2() {
        return this.statistics2;
    }
    
    /**
     * Get value of productionStatus.
     *
     * @return ProductionStatus value of productionStatus
     */
    @Nullable
    public final ProductionStatus getProductionStatus() {
        return this.productionStatus;
    }
    
    /**
     * Get value of originalChannel.
     *
     * @return OriginalChannel value of originalChannel
     */
    @Nullable
    public final OriginalChannel getOriginalChannel() {
        return this.originalChannel;
    }
    
    /**
     * Get value of hasDVD.
     *
     * @return Integer value of hasDVD
     */
    @Nullable
    public final Integer getHasDVD() {
        return this.hasDVD;
    }
    
    /**
     * Get value of yearStart.
     *
     * @return Integer value of yearStart
     */
    @Nullable
    public final Integer getYearStart() {
        return this.yearStart;
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
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final Integer codeParam) {
        this.code = codeParam;
    }
    
    /**
     * Set value of episodeCount.
     *
     * @param episodeCountParam
     */
    public final void setEpisodeCount(@Nullable final Integer episodeCountParam) {
        this.episodeCount = episodeCountParam;
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
     * Set value of yearEnd.
     *
     * @param yearEndParam
     */
    public final void setYearEnd(@Nullable final Integer yearEndParam) {
        this.yearEnd = yearEndParam;
    }
    
    /**
     * Set value of hasBluRay.
     *
     * @param hasBluRayParam
     */
    public final void setHasBluRay(@Nullable final Integer hasBluRayParam) {
        this.hasBluRay = hasBluRayParam;
    }
    
    /**
     * Set value of episode.
     *
     * @param episodeParam
     */
    public final void getEpisode(@NonNull final List<Episode> episodeParam) {
        this.episode = episodeParam;
    }
    
    /**
     * Set value of seasonNumber.
     *
     * @param seasonNumberParam
     */
    public final void setSeasonNumber(@Nullable final Integer seasonNumberParam) {
        this.seasonNumber = seasonNumberParam;
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
     * Set value of trailer.
     *
     * @param trailerParam
     */
    public final void setTrailer(@Nullable final Trailer trailerParam) {
        this.trailer = trailerParam;
    }
    
    /**
     * Set value of media1.
     *
     * @param media1Param
     */
    public final void getMedia1(@NonNull final List<Media1> media1Param) {
        this.media1 = media1Param;
    }
    
    /**
     * Set value of hasVOD.
     *
     * @param hasVODParam
     */
    public final void setHasVOD(@Nullable final Integer hasVODParam) {
        this.hasVOD = hasVODParam;
    }
    
    /**
     * Set value of statistics2.
     *
     * @param statistics2Param
     */
    public final void setStatistics2(@Nullable final Statistics2 statistics2Param) {
        this.statistics2 = statistics2Param;
    }
    
    /**
     * Set value of productionStatus.
     *
     * @param productionStatusParam
     */
    public final void setProductionStatus(@Nullable final ProductionStatus productionStatusParam) {
        this.productionStatus = productionStatusParam;
    }
    
    /**
     * Set value of originalChannel.
     *
     * @param originalChannelParam
     */
    public final void setOriginalChannel(@Nullable final OriginalChannel originalChannelParam) {
        this.originalChannel = originalChannelParam;
    }
    
    /**
     * Set value of hasDVD.
     *
     * @param hasDVDParam
     */
    public final void setHasDVD(@Nullable final Integer hasDVDParam) {
        this.hasDVD = hasDVDParam;
    }
    
    /**
     * Set value of yearStart.
     *
     * @param yearStartParam
     */
    public final void setYearStart(@Nullable final Integer yearStartParam) {
        this.yearStart = yearStartParam;
    }
    
    /**
     * Set value of trailerEmbed.
     *
     * @param trailerEmbedParam
     */
    public final void setTrailerEmbed(@Nullable final String trailerEmbedParam) {
        this.trailerEmbed = trailerEmbedParam;
    }
}
