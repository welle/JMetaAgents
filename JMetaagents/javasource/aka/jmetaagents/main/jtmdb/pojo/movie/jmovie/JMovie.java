package aka.jmetaagents.main.jtmdb.pojo.movie.jmovie;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jtmdb.pojo.movie.jmovie.deserializers.DateYearMonthDayDashDeserializer;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovie.deserializers.URLDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMovie {

    @JsonProperty("original_language")
	@Nullable
    private String originalLanguage;
    @JsonProperty("imdb_id")
	@Nullable
    private String imdbId;
	@Nullable
    private Boolean video;
	@Nullable
    private String title;
    @JsonProperty("backdrop_path")
	@Nullable
    private String backdropPath;
	@Nullable
    private Integer revenue;
	@NonNull
    private List<Genres> genres = new ArrayList<>();
	@Nullable
    private Double popularity;
    @JsonProperty("production_countries")
	@NonNull
    private List<ProductionCountries> productionCountries = new ArrayList<>();
	@Nullable
    private Integer id;
    @JsonProperty("vote_count")
	@Nullable
    private Integer voteCount;
	@Nullable
    private Integer budget;
	@Nullable
    private String overview;
    @JsonProperty("original_title")
	@Nullable
    private String originalTitle;
	@Nullable
    private Integer runtime;
    @JsonProperty("poster_path")
	@Nullable
    private String posterPath;
    @JsonProperty("spoken_languages")
	@NonNull
    private List<SpokenLanguages> spokenLanguages = new ArrayList<>();
    @JsonProperty("production_companies")
	@NonNull
    private List<ProductionCompanies> productionCompanies = new ArrayList<>();
    @JsonProperty("release_date")
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date releaseDate;
    @JsonProperty("vote_average")
	@Nullable
    private Double voteAverage;
    @JsonProperty("belongs_to_collection")
	@Nullable
    private BelongsToCollection belongsToCollection;
	@Nullable
    private String tagline;
	@Nullable
    private Boolean adult;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI homepage;
	@Nullable
    private String status;

	/**
     * Empty Constructor.
     */
    public JMovie() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param originalLanguageParam String
     * @param imdbIdParam String
     * @param videoParam Boolean
     * @param titleParam String
     * @param backdropPathParam String
     * @param revenueParam Integer
     * @param genresParam List<Genres>
     * @param popularityParam Double
     * @param productionCountriesParam List<ProductionCountries>
     * @param idParam Integer
     * @param voteCountParam Integer
     * @param budgetParam Integer
     * @param overviewParam String
     * @param originalTitleParam String
     * @param runtimeParam Integer
     * @param posterPathParam String
     * @param spokenLanguagesParam List<SpokenLanguages>
     * @param productionCompaniesParam List<ProductionCompanies>
     * @param releaseDateParam Date
     * @param voteAverageParam Double
     * @param belongsToCollectionParam BelongsToCollection
     * @param taglineParam String
     * @param adultParam Boolean
     * @param homepageParam URI
     * @param statusParam String
     */
    public JMovie(@Nullable final String originalLanguageParam, @Nullable final String imdbIdParam, @Nullable final Boolean videoParam, @Nullable final String titleParam, @Nullable final String backdropPathParam, @Nullable final Integer revenueParam, @NonNull final List<Genres> genresParam, @Nullable final Double popularityParam, @NonNull final List<ProductionCountries> productionCountriesParam, @Nullable final Integer idParam, @Nullable final Integer voteCountParam, @Nullable final Integer budgetParam, @Nullable final String overviewParam, @Nullable final String originalTitleParam, @Nullable final Integer runtimeParam, @Nullable final String posterPathParam, @NonNull final List<SpokenLanguages> spokenLanguagesParam, @NonNull final List<ProductionCompanies> productionCompaniesParam, @Nullable final Date releaseDateParam, @Nullable final Double voteAverageParam, @Nullable final BelongsToCollection belongsToCollectionParam, @Nullable final String taglineParam, @Nullable final Boolean adultParam, @Nullable final URI homepageParam, @Nullable final String statusParam) {
        this.originalLanguage = originalLanguageParam;
        this.imdbId = imdbIdParam;
        this.video = videoParam;
        this.title = titleParam;
        this.backdropPath = backdropPathParam;
        this.revenue = revenueParam;
        this.genres = genresParam;
        this.popularity = popularityParam;
        this.productionCountries = productionCountriesParam;
        this.id = idParam;
        this.voteCount = voteCountParam;
        this.budget = budgetParam;
        this.overview = overviewParam;
        this.originalTitle = originalTitleParam;
        this.runtime = runtimeParam;
        this.posterPath = posterPathParam;
        this.spokenLanguages = spokenLanguagesParam;
        this.productionCompanies = productionCompaniesParam;
        this.releaseDate = releaseDateParam;
        this.voteAverage = voteAverageParam;
        this.belongsToCollection = belongsToCollectionParam;
        this.tagline = taglineParam;
        this.adult = adultParam;
        this.homepage = homepageParam;
        this.status = statusParam;
    }
    
    /**
     * Get value of originalLanguage.
     *
     * @return String value of originalLanguage
     */
    @Nullable
    public final String getOriginalLanguage() {
        return this.originalLanguage;
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
     * Get value of video.
     *
     * @return Boolean value of video
     */
    @Nullable
    public final Boolean getVideo() {
        return this.video;
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
     * Get value of backdropPath.
     *
     * @return String value of backdropPath
     */
    @Nullable
    public final String getBackdropPath() {
        return this.backdropPath;
    }
    
    /**
     * Get value of revenue.
     *
     * @return Integer value of revenue
     */
    @Nullable
    public final Integer getRevenue() {
        return this.revenue;
    }
    
    /**
     * Get value of genres.
     *
     * @return List<Genres> value of genres
     */
    @NonNull
    public final List<Genres> getGenres() {
        return this.genres;
    }
    
    /**
     * Get value of popularity.
     *
     * @return Double value of popularity
     */
    @Nullable
    public final Double getPopularity() {
        return this.popularity;
    }
    
    /**
     * Get value of productionCountries.
     *
     * @return List<ProductionCountries> value of productionCountries
     */
    @NonNull
    public final List<ProductionCountries> getProductionCountries() {
        return this.productionCountries;
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
     * Get value of voteCount.
     *
     * @return Integer value of voteCount
     */
    @Nullable
    public final Integer getVoteCount() {
        return this.voteCount;
    }
    
    /**
     * Get value of budget.
     *
     * @return Integer value of budget
     */
    @Nullable
    public final Integer getBudget() {
        return this.budget;
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
     * Get value of originalTitle.
     *
     * @return String value of originalTitle
     */
    @Nullable
    public final String getOriginalTitle() {
        return this.originalTitle;
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
     * Get value of posterPath.
     *
     * @return String value of posterPath
     */
    @Nullable
    public final String getPosterPath() {
        return this.posterPath;
    }
    
    /**
     * Get value of spokenLanguages.
     *
     * @return List<SpokenLanguages> value of spokenLanguages
     */
    @NonNull
    public final List<SpokenLanguages> getSpokenLanguages() {
        return this.spokenLanguages;
    }
    
    /**
     * Get value of productionCompanies.
     *
     * @return List<ProductionCompanies> value of productionCompanies
     */
    @NonNull
    public final List<ProductionCompanies> getProductionCompanies() {
        return this.productionCompanies;
    }
    
    /**
     * Get value of releaseDate.
     *
     * @return Date value of releaseDate
     */
    @Nullable
    public final Date getReleaseDate() {
        return this.releaseDate;
    }
    
    /**
     * Get value of voteAverage.
     *
     * @return Double value of voteAverage
     */
    @Nullable
    public final Double getVoteAverage() {
        return this.voteAverage;
    }
    
    /**
     * Get value of belongsToCollection.
     *
     * @return BelongsToCollection value of belongsToCollection
     */
    @Nullable
    public final BelongsToCollection getBelongsToCollection() {
        return this.belongsToCollection;
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
     * Get value of adult.
     *
     * @return Boolean value of adult
     */
    @Nullable
    public final Boolean getAdult() {
        return this.adult;
    }
    
    /**
     * Get value of homepage.
     *
     * @return URI value of homepage
     */
    @Nullable
    public final URI getHomepage() {
        return this.homepage;
    }
    
    /**
     * Get value of status.
     *
     * @return String value of status
     */
    @Nullable
    public final String getStatus() {
        return this.status;
    }

    
    /**
     * Set value of originalLanguage.
     *
     * @param originalLanguageParam
     */
    public final void setOriginalLanguage(@Nullable final String originalLanguageParam) {
        this.originalLanguage = originalLanguageParam;
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
     * Set value of video.
     *
     * @param videoParam
     */
    public final void setVideo(@Nullable final Boolean videoParam) {
        this.video = videoParam;
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
     * Set value of backdropPath.
     *
     * @param backdropPathParam
     */
    public final void setBackdropPath(@Nullable final String backdropPathParam) {
        this.backdropPath = backdropPathParam;
    }
    
    /**
     * Set value of revenue.
     *
     * @param revenueParam
     */
    public final void setRevenue(@Nullable final Integer revenueParam) {
        this.revenue = revenueParam;
    }
    
    /**
     * Set value of genres.
     *
     * @param genresParam
     */
    public final void getGenres(@NonNull final List<Genres> genresParam) {
        this.genres = genresParam;
    }
    
    /**
     * Set value of popularity.
     *
     * @param popularityParam
     */
    public final void setPopularity(@Nullable final Double popularityParam) {
        this.popularity = popularityParam;
    }
    
    /**
     * Set value of productionCountries.
     *
     * @param productionCountriesParam
     */
    public final void getProductionCountries(@NonNull final List<ProductionCountries> productionCountriesParam) {
        this.productionCountries = productionCountriesParam;
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
     * Set value of voteCount.
     *
     * @param voteCountParam
     */
    public final void setVoteCount(@Nullable final Integer voteCountParam) {
        this.voteCount = voteCountParam;
    }
    
    /**
     * Set value of budget.
     *
     * @param budgetParam
     */
    public final void setBudget(@Nullable final Integer budgetParam) {
        this.budget = budgetParam;
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
     * Set value of originalTitle.
     *
     * @param originalTitleParam
     */
    public final void setOriginalTitle(@Nullable final String originalTitleParam) {
        this.originalTitle = originalTitleParam;
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
     * Set value of posterPath.
     *
     * @param posterPathParam
     */
    public final void setPosterPath(@Nullable final String posterPathParam) {
        this.posterPath = posterPathParam;
    }
    
    /**
     * Set value of spokenLanguages.
     *
     * @param spokenLanguagesParam
     */
    public final void getSpokenLanguages(@NonNull final List<SpokenLanguages> spokenLanguagesParam) {
        this.spokenLanguages = spokenLanguagesParam;
    }
    
    /**
     * Set value of productionCompanies.
     *
     * @param productionCompaniesParam
     */
    public final void getProductionCompanies(@NonNull final List<ProductionCompanies> productionCompaniesParam) {
        this.productionCompanies = productionCompaniesParam;
    }
    
    /**
     * Set value of releaseDate.
     *
     * @param releaseDateParam
     */
    public final void setReleaseDate(@Nullable final Date releaseDateParam) {
        this.releaseDate = releaseDateParam;
    }
    
    /**
     * Set value of voteAverage.
     *
     * @param voteAverageParam
     */
    public final void setVoteAverage(@Nullable final Double voteAverageParam) {
        this.voteAverage = voteAverageParam;
    }
    
    /**
     * Set value of belongsToCollection.
     *
     * @param belongsToCollectionParam
     */
    public final void setBelongsToCollection(@Nullable final BelongsToCollection belongsToCollectionParam) {
        this.belongsToCollection = belongsToCollectionParam;
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
     * Set value of adult.
     *
     * @param adultParam
     */
    public final void setAdult(@Nullable final Boolean adultParam) {
        this.adult = adultParam;
    }
    
    /**
     * Set value of homepage.
     *
     * @param homepageParam
     */
    public final void setHomepage(@Nullable final URI homepageParam) {
        this.homepage = homepageParam;
    }
    
    /**
     * Set value of status.
     *
     * @param statusParam
     */
    public final void setStatus(@Nullable final String statusParam) {
        this.status = statusParam;
    }
}
