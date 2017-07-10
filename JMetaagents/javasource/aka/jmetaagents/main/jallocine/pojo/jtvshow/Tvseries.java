package aka.jmetaagents.main.jallocine.pojo.jtvshow;

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
public final class Tvseries {

	@Nullable
    private Integer code;
	@NonNull
    private List<WorstPressReview> worstPressReview = new ArrayList<>();
	@Nullable
    private String keywords;
	@Nullable
    private Integer episodeCount;
	@NonNull
    private List<HelpfulNegativeReview> helpfulNegativeReview = new ArrayList<>();
	@NonNull
    private List<Link> link = new ArrayList<>();
	@NonNull
    private List<Media> media = new ArrayList<>();
	@Nullable
    private String title;
	@NonNull
    private List<CastMember> castMember = new ArrayList<>();
	@Nullable
    private CastingShort castingShort;
	@Nullable
    private Trailer trailer;
	@Nullable
    private Integer seasonCount;
	@NonNull
    private List<Feature> feature = new ArrayList<>();
	@Nullable
    private Integer hasVOD;
	@Nullable
    private SeriesType seriesType;
    @JsonProperty("statistics")
	@Nullable
    private Statistics2 statistics2;
	@Nullable
    private ProductionStatus productionStatus;
	@NonNull
    private List<Genre> genre = new ArrayList<>();
	@Nullable
    private OriginalChannel originalChannel;
	@NonNull
    private List<Season> season = new ArrayList<>();
	@NonNull
    private List<Tag> tag = new ArrayList<>();
	@Nullable
    private Integer hasDVD;
	@Nullable
    private Integer lastSeasonNumber;
	@Nullable
    private Integer yearStart;
	@NonNull
    private List<News> news = new ArrayList<>();
	@Nullable
    private Integer formatTime;
	@Nullable
    private TopBanner topBanner;
	@NonNull
    private List<Trivia> trivia = new ArrayList<>();
	@Nullable
    private Integer hasBluRay;
	@Nullable
    private String synopsis;
	@NonNull
    private List<HelpfulPositiveReview> helpfulPositiveReview = new ArrayList<>();
	@Nullable
    private OriginalBroadcast originalBroadcast;
	@NonNull
    private List<Nationality> nationality = new ArrayList<>();
	@Nullable
    private String originalTitle;
	@NonNull
    private List<FestivalAward> festivalAward = new ArrayList<>();
	@NonNull
    private List<BestPressReview> bestPressReview = new ArrayList<>();
	@Nullable
    private String synopsisShort;
	@Nullable
    private Poster poster;
	@Nullable
    private String trailerEmbed;

	/**
     * Empty Constructor.
     */
    public Tvseries() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param worstPressReviewParam List<WorstPressReview>
     * @param keywordsParam String
     * @param episodeCountParam Integer
     * @param helpfulNegativeReviewParam List<HelpfulNegativeReview>
     * @param linkParam List<Link>
     * @param mediaParam List<Media>
     * @param titleParam String
     * @param castMemberParam List<CastMember>
     * @param castingShortParam CastingShort
     * @param trailerParam Trailer
     * @param seasonCountParam Integer
     * @param featureParam List<Feature>
     * @param hasVODParam Integer
     * @param seriesTypeParam SeriesType
     * @param statistics2Param Statistics2
     * @param productionStatusParam ProductionStatus
     * @param genreParam List<Genre>
     * @param originalChannelParam OriginalChannel
     * @param seasonParam List<Season>
     * @param tagParam List<Tag>
     * @param hasDVDParam Integer
     * @param lastSeasonNumberParam Integer
     * @param yearStartParam Integer
     * @param newsParam List<News>
     * @param formatTimeParam Integer
     * @param topBannerParam TopBanner
     * @param triviaParam List<Trivia>
     * @param hasBluRayParam Integer
     * @param synopsisParam String
     * @param helpfulPositiveReviewParam List<HelpfulPositiveReview>
     * @param originalBroadcastParam OriginalBroadcast
     * @param nationalityParam List<Nationality>
     * @param originalTitleParam String
     * @param festivalAwardParam List<FestivalAward>
     * @param bestPressReviewParam List<BestPressReview>
     * @param synopsisShortParam String
     * @param posterParam Poster
     * @param trailerEmbedParam String
     */
    public Tvseries(@Nullable final Integer codeParam, @NonNull final List<WorstPressReview> worstPressReviewParam, @Nullable final String keywordsParam, @Nullable final Integer episodeCountParam, @NonNull final List<HelpfulNegativeReview> helpfulNegativeReviewParam, @NonNull final List<Link> linkParam, @NonNull final List<Media> mediaParam, @Nullable final String titleParam, @NonNull final List<CastMember> castMemberParam, @Nullable final CastingShort castingShortParam, @Nullable final Trailer trailerParam, @Nullable final Integer seasonCountParam, @NonNull final List<Feature> featureParam, @Nullable final Integer hasVODParam, @Nullable final SeriesType seriesTypeParam, @Nullable final Statistics2 statistics2Param, @Nullable final ProductionStatus productionStatusParam, @NonNull final List<Genre> genreParam, @Nullable final OriginalChannel originalChannelParam, @NonNull final List<Season> seasonParam, @NonNull final List<Tag> tagParam, @Nullable final Integer hasDVDParam, @Nullable final Integer lastSeasonNumberParam, @Nullable final Integer yearStartParam, @NonNull final List<News> newsParam, @Nullable final Integer formatTimeParam, @Nullable final TopBanner topBannerParam, @NonNull final List<Trivia> triviaParam, @Nullable final Integer hasBluRayParam, @Nullable final String synopsisParam, @NonNull final List<HelpfulPositiveReview> helpfulPositiveReviewParam, @Nullable final OriginalBroadcast originalBroadcastParam, @NonNull final List<Nationality> nationalityParam, @Nullable final String originalTitleParam, @NonNull final List<FestivalAward> festivalAwardParam, @NonNull final List<BestPressReview> bestPressReviewParam, @Nullable final String synopsisShortParam, @Nullable final Poster posterParam, @Nullable final String trailerEmbedParam) {
        this.code = codeParam;
        this.worstPressReview = worstPressReviewParam;
        this.keywords = keywordsParam;
        this.episodeCount = episodeCountParam;
        this.helpfulNegativeReview = helpfulNegativeReviewParam;
        this.link = linkParam;
        this.media = mediaParam;
        this.title = titleParam;
        this.castMember = castMemberParam;
        this.castingShort = castingShortParam;
        this.trailer = trailerParam;
        this.seasonCount = seasonCountParam;
        this.feature = featureParam;
        this.hasVOD = hasVODParam;
        this.seriesType = seriesTypeParam;
        this.statistics2 = statistics2Param;
        this.productionStatus = productionStatusParam;
        this.genre = genreParam;
        this.originalChannel = originalChannelParam;
        this.season = seasonParam;
        this.tag = tagParam;
        this.hasDVD = hasDVDParam;
        this.lastSeasonNumber = lastSeasonNumberParam;
        this.yearStart = yearStartParam;
        this.news = newsParam;
        this.formatTime = formatTimeParam;
        this.topBanner = topBannerParam;
        this.trivia = triviaParam;
        this.hasBluRay = hasBluRayParam;
        this.synopsis = synopsisParam;
        this.helpfulPositiveReview = helpfulPositiveReviewParam;
        this.originalBroadcast = originalBroadcastParam;
        this.nationality = nationalityParam;
        this.originalTitle = originalTitleParam;
        this.festivalAward = festivalAwardParam;
        this.bestPressReview = bestPressReviewParam;
        this.synopsisShort = synopsisShortParam;
        this.poster = posterParam;
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
     * Get value of worstPressReview.
     *
     * @return List<WorstPressReview> value of worstPressReview
     */
    @NonNull
    public final List<WorstPressReview> getWorstPressReview() {
        return this.worstPressReview;
    }
    
    /**
     * Get value of keywords.
     *
     * @return String value of keywords
     */
    @Nullable
    public final String getKeywords() {
        return this.keywords;
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
     * Get value of helpfulNegativeReview.
     *
     * @return List<HelpfulNegativeReview> value of helpfulNegativeReview
     */
    @NonNull
    public final List<HelpfulNegativeReview> getHelpfulNegativeReview() {
        return this.helpfulNegativeReview;
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
     * Get value of castMember.
     *
     * @return List<CastMember> value of castMember
     */
    @NonNull
    public final List<CastMember> getCastMember() {
        return this.castMember;
    }
    
    /**
     * Get value of castingShort.
     *
     * @return CastingShort value of castingShort
     */
    @Nullable
    public final CastingShort getCastingShort() {
        return this.castingShort;
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
     * Get value of seasonCount.
     *
     * @return Integer value of seasonCount
     */
    @Nullable
    public final Integer getSeasonCount() {
        return this.seasonCount;
    }
    
    /**
     * Get value of feature.
     *
     * @return List<Feature> value of feature
     */
    @NonNull
    public final List<Feature> getFeature() {
        return this.feature;
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
     * Get value of seriesType.
     *
     * @return SeriesType value of seriesType
     */
    @Nullable
    public final SeriesType getSeriesType() {
        return this.seriesType;
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
     * Get value of genre.
     *
     * @return List<Genre> value of genre
     */
    @NonNull
    public final List<Genre> getGenre() {
        return this.genre;
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
     * Get value of season.
     *
     * @return List<Season> value of season
     */
    @NonNull
    public final List<Season> getSeason() {
        return this.season;
    }
    
    /**
     * Get value of tag.
     *
     * @return List<Tag> value of tag
     */
    @NonNull
    public final List<Tag> getTag() {
        return this.tag;
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
     * Get value of lastSeasonNumber.
     *
     * @return Integer value of lastSeasonNumber
     */
    @Nullable
    public final Integer getLastSeasonNumber() {
        return this.lastSeasonNumber;
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
     * Get value of news.
     *
     * @return List<News> value of news
     */
    @NonNull
    public final List<News> getNews() {
        return this.news;
    }
    
    /**
     * Get value of formatTime.
     *
     * @return Integer value of formatTime
     */
    @Nullable
    public final Integer getFormatTime() {
        return this.formatTime;
    }
    
    /**
     * Get value of topBanner.
     *
     * @return TopBanner value of topBanner
     */
    @Nullable
    public final TopBanner getTopBanner() {
        return this.topBanner;
    }
    
    /**
     * Get value of trivia.
     *
     * @return List<Trivia> value of trivia
     */
    @NonNull
    public final List<Trivia> getTrivia() {
        return this.trivia;
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
     * Get value of synopsis.
     *
     * @return String value of synopsis
     */
    @Nullable
    public final String getSynopsis() {
        return this.synopsis;
    }
    
    /**
     * Get value of helpfulPositiveReview.
     *
     * @return List<HelpfulPositiveReview> value of helpfulPositiveReview
     */
    @NonNull
    public final List<HelpfulPositiveReview> getHelpfulPositiveReview() {
        return this.helpfulPositiveReview;
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
     * Get value of nationality.
     *
     * @return List<Nationality> value of nationality
     */
    @NonNull
    public final List<Nationality> getNationality() {
        return this.nationality;
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
     * Get value of festivalAward.
     *
     * @return List<FestivalAward> value of festivalAward
     */
    @NonNull
    public final List<FestivalAward> getFestivalAward() {
        return this.festivalAward;
    }
    
    /**
     * Get value of bestPressReview.
     *
     * @return List<BestPressReview> value of bestPressReview
     */
    @NonNull
    public final List<BestPressReview> getBestPressReview() {
        return this.bestPressReview;
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
     * Get value of poster.
     *
     * @return Poster value of poster
     */
    @Nullable
    public final Poster getPoster() {
        return this.poster;
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
     * Set value of worstPressReview.
     *
     * @param worstPressReviewParam
     */
    public final void getWorstPressReview(@NonNull final List<WorstPressReview> worstPressReviewParam) {
        this.worstPressReview = worstPressReviewParam;
    }
    
    /**
     * Set value of keywords.
     *
     * @param keywordsParam
     */
    public final void setKeywords(@Nullable final String keywordsParam) {
        this.keywords = keywordsParam;
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
     * Set value of helpfulNegativeReview.
     *
     * @param helpfulNegativeReviewParam
     */
    public final void getHelpfulNegativeReview(@NonNull final List<HelpfulNegativeReview> helpfulNegativeReviewParam) {
        this.helpfulNegativeReview = helpfulNegativeReviewParam;
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
     * Set value of castMember.
     *
     * @param castMemberParam
     */
    public final void getCastMember(@NonNull final List<CastMember> castMemberParam) {
        this.castMember = castMemberParam;
    }
    
    /**
     * Set value of castingShort.
     *
     * @param castingShortParam
     */
    public final void setCastingShort(@Nullable final CastingShort castingShortParam) {
        this.castingShort = castingShortParam;
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
     * Set value of seasonCount.
     *
     * @param seasonCountParam
     */
    public final void setSeasonCount(@Nullable final Integer seasonCountParam) {
        this.seasonCount = seasonCountParam;
    }
    
    /**
     * Set value of feature.
     *
     * @param featureParam
     */
    public final void getFeature(@NonNull final List<Feature> featureParam) {
        this.feature = featureParam;
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
     * Set value of seriesType.
     *
     * @param seriesTypeParam
     */
    public final void setSeriesType(@Nullable final SeriesType seriesTypeParam) {
        this.seriesType = seriesTypeParam;
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
     * Set value of genre.
     *
     * @param genreParam
     */
    public final void getGenre(@NonNull final List<Genre> genreParam) {
        this.genre = genreParam;
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
     * Set value of season.
     *
     * @param seasonParam
     */
    public final void getSeason(@NonNull final List<Season> seasonParam) {
        this.season = seasonParam;
    }
    
    /**
     * Set value of tag.
     *
     * @param tagParam
     */
    public final void getTag(@NonNull final List<Tag> tagParam) {
        this.tag = tagParam;
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
     * Set value of lastSeasonNumber.
     *
     * @param lastSeasonNumberParam
     */
    public final void setLastSeasonNumber(@Nullable final Integer lastSeasonNumberParam) {
        this.lastSeasonNumber = lastSeasonNumberParam;
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
     * Set value of news.
     *
     * @param newsParam
     */
    public final void getNews(@NonNull final List<News> newsParam) {
        this.news = newsParam;
    }
    
    /**
     * Set value of formatTime.
     *
     * @param formatTimeParam
     */
    public final void setFormatTime(@Nullable final Integer formatTimeParam) {
        this.formatTime = formatTimeParam;
    }
    
    /**
     * Set value of topBanner.
     *
     * @param topBannerParam
     */
    public final void setTopBanner(@Nullable final TopBanner topBannerParam) {
        this.topBanner = topBannerParam;
    }
    
    /**
     * Set value of trivia.
     *
     * @param triviaParam
     */
    public final void getTrivia(@NonNull final List<Trivia> triviaParam) {
        this.trivia = triviaParam;
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
     * Set value of synopsis.
     *
     * @param synopsisParam
     */
    public final void setSynopsis(@Nullable final String synopsisParam) {
        this.synopsis = synopsisParam;
    }
    
    /**
     * Set value of helpfulPositiveReview.
     *
     * @param helpfulPositiveReviewParam
     */
    public final void getHelpfulPositiveReview(@NonNull final List<HelpfulPositiveReview> helpfulPositiveReviewParam) {
        this.helpfulPositiveReview = helpfulPositiveReviewParam;
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
     * Set value of nationality.
     *
     * @param nationalityParam
     */
    public final void getNationality(@NonNull final List<Nationality> nationalityParam) {
        this.nationality = nationalityParam;
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
     * Set value of festivalAward.
     *
     * @param festivalAwardParam
     */
    public final void getFestivalAward(@NonNull final List<FestivalAward> festivalAwardParam) {
        this.festivalAward = festivalAwardParam;
    }
    
    /**
     * Set value of bestPressReview.
     *
     * @param bestPressReviewParam
     */
    public final void getBestPressReview(@NonNull final List<BestPressReview> bestPressReviewParam) {
        this.bestPressReview = bestPressReviewParam;
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
     * Set value of poster.
     *
     * @param posterParam
     */
    public final void setPoster(@Nullable final Poster posterParam) {
        this.poster = posterParam;
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
