package aka.jmetaagents.main.jimdb.pojo.jmovie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jimdb.pojo.jmovie.deserializers.DateYearDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Data {

    @JsonDeserialize(using = DateYearDeserializer.class)
    private Date year;
    @JsonProperty("writers_summary")
	@NonNull
    private List<WritersSummary> writersSummary = new ArrayList<>();
	@Nullable
    private Certificate certificate;
	@Nullable
    private Double rating;
    @JsonProperty("best_plot")
	@Nullable
    private BestPlot bestPlot;
	@Nullable
    private String type;
	@Nullable
    private String title;
	@NonNull
    private List<Photos> photos = new ArrayList<>();
    @JsonProperty("directors_summary")
	@NonNull
    private List<DirectorsSummary> directorsSummary = new ArrayList<>();
	@Nullable
    private String goof;
	@Nullable
    private Trailer trailer;
	@Nullable
    private Quote quote;
	@Nullable
    private Plot plot;
	@NonNull
    private List<String> genres = new ArrayList<>();
    @JsonProperty("cast_summary")
	@NonNull
    private List<CastSummary> castSummary = new ArrayList<>();
    @JsonProperty("can_rate")
	@Nullable
    private Boolean canRate;
	@NonNull
    private List<String> has = new ArrayList<>();
	@Nullable
    private News news;
	@Nullable
    private Image image;
	@Nullable
    private Runtime runtime;
	@Nullable
    private String trivium;
    @JsonProperty("release_date")
	@Nullable
    private ReleaseDate releaseDate;
	@Nullable
    private String tconst;
    @JsonProperty("num_votes")
	@Nullable
    private Integer numVotes;
	@Nullable
    private String tagline;
    @JsonProperty("user_comment")
	@Nullable
    private UserComment userComment;

	/**
     * Empty Constructor.
     */
    public Data() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param yearParam Date
     * @param writersSummaryParam List<WritersSummary>
     * @param certificateParam Certificate
     * @param ratingParam Double
     * @param bestPlotParam BestPlot
     * @param typeParam String
     * @param titleParam String
     * @param photosParam List<Photos>
     * @param directorsSummaryParam List<DirectorsSummary>
     * @param goofParam String
     * @param trailerParam Trailer
     * @param quoteParam Quote
     * @param plotParam Plot
     * @param genresParam List<String>
     * @param castSummaryParam List<CastSummary>
     * @param canRateParam Boolean
     * @param hasParam List<String>
     * @param newsParam News
     * @param imageParam Image
     * @param runtimeParam Runtime
     * @param triviumParam String
     * @param releaseDateParam ReleaseDate
     * @param tconstParam String
     * @param numVotesParam Integer
     * @param taglineParam String
     * @param userCommentParam UserComment
     */
    public Data(@Nullable final Date yearParam, @NonNull final List<WritersSummary> writersSummaryParam, @Nullable final Certificate certificateParam, @Nullable final Double ratingParam, @Nullable final BestPlot bestPlotParam, @Nullable final String typeParam, @Nullable final String titleParam, @NonNull final List<Photos> photosParam, @NonNull final List<DirectorsSummary> directorsSummaryParam, @Nullable final String goofParam, @Nullable final Trailer trailerParam, @Nullable final Quote quoteParam, @Nullable final Plot plotParam, @NonNull final List<String> genresParam, @NonNull final List<CastSummary> castSummaryParam, @Nullable final Boolean canRateParam, @NonNull final List<String> hasParam, @Nullable final News newsParam, @Nullable final Image imageParam, @Nullable final Runtime runtimeParam, @Nullable final String triviumParam, @Nullable final ReleaseDate releaseDateParam, @Nullable final String tconstParam, @Nullable final Integer numVotesParam, @Nullable final String taglineParam, @Nullable final UserComment userCommentParam) {
        this.year = yearParam;
        this.writersSummary = writersSummaryParam;
        this.certificate = certificateParam;
        this.rating = ratingParam;
        this.bestPlot = bestPlotParam;
        this.type = typeParam;
        this.title = titleParam;
        this.photos = photosParam;
        this.directorsSummary = directorsSummaryParam;
        this.goof = goofParam;
        this.trailer = trailerParam;
        this.quote = quoteParam;
        this.plot = plotParam;
        this.genres = genresParam;
        this.castSummary = castSummaryParam;
        this.canRate = canRateParam;
        this.has = hasParam;
        this.news = newsParam;
        this.image = imageParam;
        this.runtime = runtimeParam;
        this.trivium = triviumParam;
        this.releaseDate = releaseDateParam;
        this.tconst = tconstParam;
        this.numVotes = numVotesParam;
        this.tagline = taglineParam;
        this.userComment = userCommentParam;
    }
    
    /**
     * Get value of year.
     *
     * @return Date value of year
     */
    @Nullable
    public final Date getYear() {
        return this.year;
    }
    
    /**
     * Get value of writersSummary.
     *
     * @return List<WritersSummary> value of writersSummary
     */
    @NonNull
    public final List<WritersSummary> getWritersSummary() {
        return this.writersSummary;
    }
    
    /**
     * Get value of certificate.
     *
     * @return Certificate value of certificate
     */
    @Nullable
    public final Certificate getCertificate() {
        return this.certificate;
    }
    
    /**
     * Get value of rating.
     *
     * @return Double value of rating
     */
    @Nullable
    public final Double getRating() {
        return this.rating;
    }
    
    /**
     * Get value of bestPlot.
     *
     * @return BestPlot value of bestPlot
     */
    @Nullable
    public final BestPlot getBestPlot() {
        return this.bestPlot;
    }
    
    /**
     * Get value of type.
     *
     * @return String value of type
     */
    @Nullable
    public final String getType() {
        return this.type;
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
     * Get value of photos.
     *
     * @return List<Photos> value of photos
     */
    @NonNull
    public final List<Photos> getPhotos() {
        return this.photos;
    }
    
    /**
     * Get value of directorsSummary.
     *
     * @return List<DirectorsSummary> value of directorsSummary
     */
    @NonNull
    public final List<DirectorsSummary> getDirectorsSummary() {
        return this.directorsSummary;
    }
    
    /**
     * Get value of goof.
     *
     * @return String value of goof
     */
    @Nullable
    public final String getGoof() {
        return this.goof;
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
     * Get value of quote.
     *
     * @return Quote value of quote
     */
    @Nullable
    public final Quote getQuote() {
        return this.quote;
    }
    
    /**
     * Get value of plot.
     *
     * @return Plot value of plot
     */
    @Nullable
    public final Plot getPlot() {
        return this.plot;
    }
    
    /**
     * Get value of genres.
     *
     * @return List<String> value of genres
     */
    @NonNull
    public final List<String> getGenres() {
        return this.genres;
    }
    
    /**
     * Get value of castSummary.
     *
     * @return List<CastSummary> value of castSummary
     */
    @NonNull
    public final List<CastSummary> getCastSummary() {
        return this.castSummary;
    }
    
    /**
     * Get value of canRate.
     *
     * @return Boolean value of canRate
     */
    @Nullable
    public final Boolean getCanRate() {
        return this.canRate;
    }
    
    /**
     * Get value of has.
     *
     * @return List<String> value of has
     */
    @NonNull
    public final List<String> getHas() {
        return this.has;
    }
    
    /**
     * Get value of news.
     *
     * @return News value of news
     */
    @Nullable
    public final News getNews() {
        return this.news;
    }
    
    /**
     * Get value of image.
     *
     * @return Image value of image
     */
    @Nullable
    public final Image getImage() {
        return this.image;
    }
    
    /**
     * Get value of runtime.
     *
     * @return Runtime value of runtime
     */
    @Nullable
    public final Runtime getRuntime() {
        return this.runtime;
    }
    
    /**
     * Get value of trivium.
     *
     * @return String value of trivium
     */
    @Nullable
    public final String getTrivium() {
        return this.trivium;
    }
    
    /**
     * Get value of releaseDate.
     *
     * @return ReleaseDate value of releaseDate
     */
    @Nullable
    public final ReleaseDate getReleaseDate() {
        return this.releaseDate;
    }
    
    /**
     * Get value of tconst.
     *
     * @return String value of tconst
     */
    @Nullable
    public final String getTconst() {
        return this.tconst;
    }
    
    /**
     * Get value of numVotes.
     *
     * @return Integer value of numVotes
     */
    @Nullable
    public final Integer getNumVotes() {
        return this.numVotes;
    }
    
    /**
     * Get value of tagline.
     *
     * @return String value of tagline
     */
    @Nullable
    public final String getTagline() {
        return this.tagline;
    }
    
    /**
     * Get value of userComment.
     *
     * @return UserComment value of userComment
     */
    @Nullable
    public final UserComment getUserComment() {
        return this.userComment;
    }

    
    /**
     * Set value of year.
     *
     * @param yearParam
     */
    public final void setYear(@Nullable final Date yearParam) {
        this.year = yearParam;
    }
    
    /**
     * Set value of writersSummary.
     *
     * @param writersSummaryParam
     */
    public final void getWritersSummary(@NonNull final List<WritersSummary> writersSummaryParam) {
        this.writersSummary = writersSummaryParam;
    }
    
    /**
     * Set value of certificate.
     *
     * @param certificateParam
     */
    public final void setCertificate(@Nullable final Certificate certificateParam) {
        this.certificate = certificateParam;
    }
    
    /**
     * Set value of rating.
     *
     * @param ratingParam
     */
    public final void setRating(@Nullable final Double ratingParam) {
        this.rating = ratingParam;
    }
    
    /**
     * Set value of bestPlot.
     *
     * @param bestPlotParam
     */
    public final void setBestPlot(@Nullable final BestPlot bestPlotParam) {
        this.bestPlot = bestPlotParam;
    }
    
    /**
     * Set value of type.
     *
     * @param typeParam
     */
    public final void setType(@Nullable final String typeParam) {
        this.type = typeParam;
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
     * Set value of photos.
     *
     * @param photosParam
     */
    public final void getPhotos(@NonNull final List<Photos> photosParam) {
        this.photos = photosParam;
    }
    
    /**
     * Set value of directorsSummary.
     *
     * @param directorsSummaryParam
     */
    public final void getDirectorsSummary(@NonNull final List<DirectorsSummary> directorsSummaryParam) {
        this.directorsSummary = directorsSummaryParam;
    }
    
    /**
     * Set value of goof.
     *
     * @param goofParam
     */
    public final void setGoof(@Nullable final String goofParam) {
        this.goof = goofParam;
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
     * Set value of quote.
     *
     * @param quoteParam
     */
    public final void setQuote(@Nullable final Quote quoteParam) {
        this.quote = quoteParam;
    }
    
    /**
     * Set value of plot.
     *
     * @param plotParam
     */
    public final void setPlot(@Nullable final Plot plotParam) {
        this.plot = plotParam;
    }
    
    /**
     * Set value of genres.
     *
     * @param genresParam
     */
    public final void getGenres(@NonNull final List<String> genresParam) {
        this.genres = genresParam;
    }
    
    /**
     * Set value of castSummary.
     *
     * @param castSummaryParam
     */
    public final void getCastSummary(@NonNull final List<CastSummary> castSummaryParam) {
        this.castSummary = castSummaryParam;
    }
    
    /**
     * Set value of canRate.
     *
     * @param canRateParam
     */
    public final void setCanRate(@Nullable final Boolean canRateParam) {
        this.canRate = canRateParam;
    }
    
    /**
     * Set value of has.
     *
     * @param hasParam
     */
    public final void getHas(@NonNull final List<String> hasParam) {
        this.has = hasParam;
    }
    
    /**
     * Set value of news.
     *
     * @param newsParam
     */
    public final void setNews(@Nullable final News newsParam) {
        this.news = newsParam;
    }
    
    /**
     * Set value of image.
     *
     * @param imageParam
     */
    public final void setImage(@Nullable final Image imageParam) {
        this.image = imageParam;
    }
    
    /**
     * Set value of runtime.
     *
     * @param runtimeParam
     */
    public final void setRuntime(@Nullable final Runtime runtimeParam) {
        this.runtime = runtimeParam;
    }
    
    /**
     * Set value of trivium.
     *
     * @param triviumParam
     */
    public final void setTrivium(@Nullable final String triviumParam) {
        this.trivium = triviumParam;
    }
    
    /**
     * Set value of releaseDate.
     *
     * @param releaseDateParam
     */
    public final void setReleaseDate(@Nullable final ReleaseDate releaseDateParam) {
        this.releaseDate = releaseDateParam;
    }
    
    /**
     * Set value of tconst.
     *
     * @param tconstParam
     */
    public final void setTconst(@Nullable final String tconstParam) {
        this.tconst = tconstParam;
    }
    
    /**
     * Set value of numVotes.
     *
     * @param numVotesParam
     */
    public final void setNumVotes(@Nullable final Integer numVotesParam) {
        this.numVotes = numVotesParam;
    }
    
    /**
     * Set value of tagline.
     *
     * @param taglineParam
     */
    public final void setTagline(@Nullable final String taglineParam) {
        this.tagline = taglineParam;
    }
    
    /**
     * Set value of userComment.
     *
     * @param userCommentParam
     */
    public final void setUserComment(@Nullable final UserComment userCommentParam) {
        this.userComment = userCommentParam;
    }
}
