package aka.jmetaagents.main.jallocine.pojo.jmovie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jallocine.pojo.jmovie.deserializers.DateYearMonthDayDashDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Movie {

	@Nullable
    private Integer code;
	@Nullable
    private MovieType movieType;
	@NonNull
    private List<WorstPressReview> worstPressReview = new ArrayList<>();
	@Nullable
    private String keywords;
	@Nullable
    private Color color;
	@Nullable
    private Release release;
	@NonNull
    private List<HelpfulNegativeReview> helpfulNegativeReview = new ArrayList<>();
	@NonNull
    private List<Link> link = new ArrayList<>();
	@NonNull
    private List<Language> language = new ArrayList<>();
	@Nullable
    private Integer productionYear;
	@NonNull
    private List<Media> media = new ArrayList<>();
	@Nullable
    private String title;
	@NonNull
    private List<CastMember> castMember = new ArrayList<>();
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date bluRayReleaseDate;
	@Nullable
    private CastingShort castingShort;
	@Nullable
    private Trailer trailer;
	@Nullable
    private MovieCertificate movieCertificate;
	@NonNull
    private List<Feature> feature = new ArrayList<>();
	@Nullable
    private Integer hasVOD;
    @JsonProperty("statistics")
	@Nullable
    private Statistics1 statistics1;
	@NonNull
    private List<Genre> genre = new ArrayList<>();
	@NonNull
    private List<Tag> tag = new ArrayList<>();
	@Nullable
    private Integer hasDVD;
	@Nullable
    private String budget;
	@NonNull
    private List<News> news = new ArrayList<>();
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date dvdReleaseDate;
	@Nullable
    private Integer runtime;
	@NonNull
    private List<Trivia> trivia = new ArrayList<>();
	@Nullable
    private Integer hasBluRay;
	@Nullable
    private String synopsis;
	@NonNull
    private List<HelpfulPositiveReview> helpfulPositiveReview = new ArrayList<>();
	@NonNull
    private List<Nationality> nationality = new ArrayList<>();
	@Nullable
    private Integer hasShowtime;
	@Nullable
    private String originalTitle;
	@NonNull
    private List<FestivalAward> festivalAward = new ArrayList<>();
	@NonNull
    private List<BestPressReview> bestPressReview = new ArrayList<>();
	@NonNull
    private List<BoxOffice> boxOffice = new ArrayList<>();
	@Nullable
    private String synopsisShort;
	@Nullable
    private Poster poster;
	@Nullable
    private String trailerEmbed;

	/**
     * Empty Constructor.
     */
    public Movie() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param movieTypeParam MovieType
     * @param worstPressReviewParam List<WorstPressReview>
     * @param keywordsParam String
     * @param colorParam Color
     * @param releaseParam Release
     * @param helpfulNegativeReviewParam List<HelpfulNegativeReview>
     * @param linkParam List<Link>
     * @param languageParam List<Language>
     * @param productionYearParam Integer
     * @param mediaParam List<Media>
     * @param titleParam String
     * @param castMemberParam List<CastMember>
     * @param bluRayReleaseDateParam Date
     * @param castingShortParam CastingShort
     * @param trailerParam Trailer
     * @param movieCertificateParam MovieCertificate
     * @param featureParam List<Feature>
     * @param hasVODParam Integer
     * @param statistics1Param Statistics1
     * @param genreParam List<Genre>
     * @param tagParam List<Tag>
     * @param hasDVDParam Integer
     * @param budgetParam String
     * @param newsParam List<News>
     * @param dvdReleaseDateParam Date
     * @param runtimeParam Integer
     * @param triviaParam List<Trivia>
     * @param hasBluRayParam Integer
     * @param synopsisParam String
     * @param helpfulPositiveReviewParam List<HelpfulPositiveReview>
     * @param nationalityParam List<Nationality>
     * @param hasShowtimeParam Integer
     * @param originalTitleParam String
     * @param festivalAwardParam List<FestivalAward>
     * @param bestPressReviewParam List<BestPressReview>
     * @param boxOfficeParam List<BoxOffice>
     * @param synopsisShortParam String
     * @param posterParam Poster
     * @param trailerEmbedParam String
     */
    public Movie(@Nullable final Integer codeParam, @Nullable final MovieType movieTypeParam, @NonNull final List<WorstPressReview> worstPressReviewParam, @Nullable final String keywordsParam, @Nullable final Color colorParam, @Nullable final Release releaseParam, @NonNull final List<HelpfulNegativeReview> helpfulNegativeReviewParam, @NonNull final List<Link> linkParam, @NonNull final List<Language> languageParam, @Nullable final Integer productionYearParam, @NonNull final List<Media> mediaParam, @Nullable final String titleParam, @NonNull final List<CastMember> castMemberParam, @Nullable final Date bluRayReleaseDateParam, @Nullable final CastingShort castingShortParam, @Nullable final Trailer trailerParam, @Nullable final MovieCertificate movieCertificateParam, @NonNull final List<Feature> featureParam, @Nullable final Integer hasVODParam, @Nullable final Statistics1 statistics1Param, @NonNull final List<Genre> genreParam, @NonNull final List<Tag> tagParam, @Nullable final Integer hasDVDParam, @Nullable final String budgetParam, @NonNull final List<News> newsParam, @Nullable final Date dvdReleaseDateParam, @Nullable final Integer runtimeParam, @NonNull final List<Trivia> triviaParam, @Nullable final Integer hasBluRayParam, @Nullable final String synopsisParam, @NonNull final List<HelpfulPositiveReview> helpfulPositiveReviewParam, @NonNull final List<Nationality> nationalityParam, @Nullable final Integer hasShowtimeParam, @Nullable final String originalTitleParam, @NonNull final List<FestivalAward> festivalAwardParam, @NonNull final List<BestPressReview> bestPressReviewParam, @NonNull final List<BoxOffice> boxOfficeParam, @Nullable final String synopsisShortParam, @Nullable final Poster posterParam, @Nullable final String trailerEmbedParam) {
        this.code = codeParam;
        this.movieType = movieTypeParam;
        this.worstPressReview = worstPressReviewParam;
        this.keywords = keywordsParam;
        this.color = colorParam;
        this.release = releaseParam;
        this.helpfulNegativeReview = helpfulNegativeReviewParam;
        this.link = linkParam;
        this.language = languageParam;
        this.productionYear = productionYearParam;
        this.media = mediaParam;
        this.title = titleParam;
        this.castMember = castMemberParam;
        this.bluRayReleaseDate = bluRayReleaseDateParam;
        this.castingShort = castingShortParam;
        this.trailer = trailerParam;
        this.movieCertificate = movieCertificateParam;
        this.feature = featureParam;
        this.hasVOD = hasVODParam;
        this.statistics1 = statistics1Param;
        this.genre = genreParam;
        this.tag = tagParam;
        this.hasDVD = hasDVDParam;
        this.budget = budgetParam;
        this.news = newsParam;
        this.dvdReleaseDate = dvdReleaseDateParam;
        this.runtime = runtimeParam;
        this.trivia = triviaParam;
        this.hasBluRay = hasBluRayParam;
        this.synopsis = synopsisParam;
        this.helpfulPositiveReview = helpfulPositiveReviewParam;
        this.nationality = nationalityParam;
        this.hasShowtime = hasShowtimeParam;
        this.originalTitle = originalTitleParam;
        this.festivalAward = festivalAwardParam;
        this.bestPressReview = bestPressReviewParam;
        this.boxOffice = boxOfficeParam;
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
     * Get value of movieType.
     *
     * @return MovieType value of movieType
     */
    @Nullable
    public final MovieType getMovieType() {
        return this.movieType;
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
     * Get value of color.
     *
     * @return Color value of color
     */
    @Nullable
    public final Color getColor() {
        return this.color;
    }
    
    /**
     * Get value of release.
     *
     * @return Release value of release
     */
    @Nullable
    public final Release getRelease() {
        return this.release;
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
     * Get value of language.
     *
     * @return List<Language> value of language
     */
    @NonNull
    public final List<Language> getLanguage() {
        return this.language;
    }
    
    /**
     * Get value of productionYear.
     *
     * @return Integer value of productionYear
     */
    @Nullable
    public final Integer getProductionYear() {
        return this.productionYear;
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
     * Get value of bluRayReleaseDate.
     *
     * @return Date value of bluRayReleaseDate
     */
    @Nullable
    public final Date getBluRayReleaseDate() {
        return this.bluRayReleaseDate;
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
     * Get value of movieCertificate.
     *
     * @return MovieCertificate value of movieCertificate
     */
    @Nullable
    public final MovieCertificate getMovieCertificate() {
        return this.movieCertificate;
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
     * Get value of statistics1.
     *
     * @return Statistics1 value of statistics1
     */
    @Nullable
    public final Statistics1 getStatistics1() {
        return this.statistics1;
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
     * Get value of budget.
     *
     * @return String value of budget
     */
    @Nullable
    public final String getBudget() {
        return this.budget;
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
     * Get value of dvdReleaseDate.
     *
     * @return Date value of dvdReleaseDate
     */
    @Nullable
    public final Date getDvdReleaseDate() {
        return this.dvdReleaseDate;
    }
    
    /**
     * Get value of runtime.
     *
     * @return Integer value of runtime
     */
    @Nullable
    public final Integer getRuntime() {
        return this.runtime;
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
     * Get value of nationality.
     *
     * @return List<Nationality> value of nationality
     */
    @NonNull
    public final List<Nationality> getNationality() {
        return this.nationality;
    }
    
    /**
     * Get value of hasShowtime.
     *
     * @return Integer value of hasShowtime
     */
    @Nullable
    public final Integer getHasShowtime() {
        return this.hasShowtime;
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
     * Get value of boxOffice.
     *
     * @return List<BoxOffice> value of boxOffice
     */
    @NonNull
    public final List<BoxOffice> getBoxOffice() {
        return this.boxOffice;
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
     * Set value of movieType.
     *
     * @param movieTypeParam
     */
    public final void setMovieType(@Nullable final MovieType movieTypeParam) {
        this.movieType = movieTypeParam;
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
     * Set value of color.
     *
     * @param colorParam
     */
    public final void setColor(@Nullable final Color colorParam) {
        this.color = colorParam;
    }
    
    /**
     * Set value of release.
     *
     * @param releaseParam
     */
    public final void setRelease(@Nullable final Release releaseParam) {
        this.release = releaseParam;
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
     * Set value of language.
     *
     * @param languageParam
     */
    public final void getLanguage(@NonNull final List<Language> languageParam) {
        this.language = languageParam;
    }
    
    /**
     * Set value of productionYear.
     *
     * @param productionYearParam
     */
    public final void setProductionYear(@Nullable final Integer productionYearParam) {
        this.productionYear = productionYearParam;
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
     * Set value of bluRayReleaseDate.
     *
     * @param bluRayReleaseDateParam
     */
    public final void setBluRayReleaseDate(@Nullable final Date bluRayReleaseDateParam) {
        this.bluRayReleaseDate = bluRayReleaseDateParam;
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
     * Set value of movieCertificate.
     *
     * @param movieCertificateParam
     */
    public final void setMovieCertificate(@Nullable final MovieCertificate movieCertificateParam) {
        this.movieCertificate = movieCertificateParam;
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
     * Set value of statistics1.
     *
     * @param statistics1Param
     */
    public final void setStatistics1(@Nullable final Statistics1 statistics1Param) {
        this.statistics1 = statistics1Param;
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
     * Set value of budget.
     *
     * @param budgetParam
     */
    public final void setBudget(@Nullable final String budgetParam) {
        this.budget = budgetParam;
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
     * Set value of dvdReleaseDate.
     *
     * @param dvdReleaseDateParam
     */
    public final void setDvdReleaseDate(@Nullable final Date dvdReleaseDateParam) {
        this.dvdReleaseDate = dvdReleaseDateParam;
    }
    
    /**
     * Set value of runtime.
     *
     * @param runtimeParam
     */
    public final void setRuntime(@Nullable final Integer runtimeParam) {
        this.runtime = runtimeParam;
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
     * Set value of nationality.
     *
     * @param nationalityParam
     */
    public final void getNationality(@NonNull final List<Nationality> nationalityParam) {
        this.nationality = nationalityParam;
    }
    
    /**
     * Set value of hasShowtime.
     *
     * @param hasShowtimeParam
     */
    public final void setHasShowtime(@Nullable final Integer hasShowtimeParam) {
        this.hasShowtime = hasShowtimeParam;
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
     * Set value of boxOffice.
     *
     * @param boxOfficeParam
     */
    public final void getBoxOffice(@NonNull final List<BoxOffice> boxOfficeParam) {
        this.boxOffice = boxOfficeParam;
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
