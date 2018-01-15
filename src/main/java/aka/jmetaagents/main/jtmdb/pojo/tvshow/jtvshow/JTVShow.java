package aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshow;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshow.deserializers.DateYearMonthDayDashDeserializer;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshow.deserializers.URLDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTVShow {

    @JsonProperty("original_language")
	@Nullable
    private String originalLanguage;
    @JsonProperty("number_of_episodes")
	@Nullable
    private Integer numberOfEpisodes;
	@NonNull
    private List<Networks> networks = new ArrayList<>();
	@Nullable
    private String type;
    @JsonProperty("backdrop_path")
	@Nullable
    private String backdropPath;
	@NonNull
    private List<Genres> genres = new ArrayList<>();
	@Nullable
    private Double popularity;
	@Nullable
    private Integer id;
    @JsonProperty("number_of_seasons")
	@Nullable
    private Integer numberOfSeasons;
    @JsonProperty("vote_count")
	@Nullable
    private Integer voteCount;
    @JsonProperty("first_air_date")
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date firstAirDate;
	@Nullable
    private String overview;
	@NonNull
    private List<Seasons> seasons = new ArrayList<>();
	@NonNull
    private List<String> languages = new ArrayList<>();
    @JsonProperty("created_by")
	@NonNull
    private List<CreatedBy> createdBy = new ArrayList<>();
    @JsonProperty("poster_path")
	@Nullable
    private String posterPath;
    @JsonProperty("origin_country")
	@NonNull
    private List<String> originCountry = new ArrayList<>();
    @JsonProperty("production_companies")
	@NonNull
    private List<ProductionCompanies> productionCompanies = new ArrayList<>();
    @JsonProperty("original_name")
	@Nullable
    private String originalName;
    @JsonProperty("vote_average")
	@Nullable
    private Double voteAverage;
	@Nullable
    private String name;
    @JsonProperty("episode_run_time")
	@NonNull
    private List<String> episodeRunTime = new ArrayList<>();
    @JsonProperty("in_production")
	@Nullable
    private Boolean inProduction;
    @JsonProperty("last_air_date")
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date lastAirDate;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI homepage;
	@Nullable
    private String status;

	/**
     * Empty Constructor.
     */
    public JTVShow() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param originalLanguageParam String
     * @param numberOfEpisodesParam Integer
     * @param networksParam List<Networks>
     * @param typeParam String
     * @param backdropPathParam String
     * @param genresParam List<Genres>
     * @param popularityParam Double
     * @param idParam Integer
     * @param numberOfSeasonsParam Integer
     * @param voteCountParam Integer
     * @param firstAirDateParam Date
     * @param overviewParam String
     * @param seasonsParam List<Seasons>
     * @param languagesParam List<String>
     * @param createdByParam List<CreatedBy>
     * @param posterPathParam String
     * @param originCountryParam List<String>
     * @param productionCompaniesParam List<ProductionCompanies>
     * @param originalNameParam String
     * @param voteAverageParam Double
     * @param nameParam String
     * @param episodeRunTimeParam List<String>
     * @param inProductionParam Boolean
     * @param lastAirDateParam Date
     * @param homepageParam URI
     * @param statusParam String
     */
    public JTVShow(@Nullable final String originalLanguageParam, @Nullable final Integer numberOfEpisodesParam, @NonNull final List<Networks> networksParam, @Nullable final String typeParam, @Nullable final String backdropPathParam, @NonNull final List<Genres> genresParam, @Nullable final Double popularityParam, @Nullable final Integer idParam, @Nullable final Integer numberOfSeasonsParam, @Nullable final Integer voteCountParam, @Nullable final Date firstAirDateParam, @Nullable final String overviewParam, @NonNull final List<Seasons> seasonsParam, @NonNull final List<String> languagesParam, @NonNull final List<CreatedBy> createdByParam, @Nullable final String posterPathParam, @NonNull final List<String> originCountryParam, @NonNull final List<ProductionCompanies> productionCompaniesParam, @Nullable final String originalNameParam, @Nullable final Double voteAverageParam, @Nullable final String nameParam, @NonNull final List<String> episodeRunTimeParam, @Nullable final Boolean inProductionParam, @Nullable final Date lastAirDateParam, @Nullable final URI homepageParam, @Nullable final String statusParam) {
        this.originalLanguage = originalLanguageParam;
        this.numberOfEpisodes = numberOfEpisodesParam;
        this.networks = networksParam;
        this.type = typeParam;
        this.backdropPath = backdropPathParam;
        this.genres = genresParam;
        this.popularity = popularityParam;
        this.id = idParam;
        this.numberOfSeasons = numberOfSeasonsParam;
        this.voteCount = voteCountParam;
        this.firstAirDate = firstAirDateParam;
        this.overview = overviewParam;
        this.seasons = seasonsParam;
        this.languages = languagesParam;
        this.createdBy = createdByParam;
        this.posterPath = posterPathParam;
        this.originCountry = originCountryParam;
        this.productionCompanies = productionCompaniesParam;
        this.originalName = originalNameParam;
        this.voteAverage = voteAverageParam;
        this.name = nameParam;
        this.episodeRunTime = episodeRunTimeParam;
        this.inProduction = inProductionParam;
        this.lastAirDate = lastAirDateParam;
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
     * Get value of numberOfEpisodes.
     *
     * @return Integer value of numberOfEpisodes
     */
    @Nullable
    public final Integer getNumberOfEpisodes() {
        return this.numberOfEpisodes;
    }
    
    /**
     * Get value of networks.
     *
     * @return List<Networks> value of networks
     */
    @NonNull
    public final List<Networks> getNetworks() {
        return this.networks;
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
     * Get value of backdropPath.
     *
     * @return String value of backdropPath
     */
    @Nullable
    public final String getBackdropPath() {
        return this.backdropPath;
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
     * Get value of id.
     *
     * @return Integer value of id
     */
    @Nullable
    public final Integer getId() {
        return this.id;
    }
    
    /**
     * Get value of numberOfSeasons.
     *
     * @return Integer value of numberOfSeasons
     */
    @Nullable
    public final Integer getNumberOfSeasons() {
        return this.numberOfSeasons;
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
     * Get value of firstAirDate.
     *
     * @return Date value of firstAirDate
     */
    @Nullable
    public final Date getFirstAirDate() {
        return this.firstAirDate;
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
     * Get value of seasons.
     *
     * @return List<Seasons> value of seasons
     */
    @NonNull
    public final List<Seasons> getSeasons() {
        return this.seasons;
    }
    
    /**
     * Get value of languages.
     *
     * @return List<String> value of languages
     */
    @NonNull
    public final List<String> getLanguages() {
        return this.languages;
    }
    
    /**
     * Get value of createdBy.
     *
     * @return List<CreatedBy> value of createdBy
     */
    @NonNull
    public final List<CreatedBy> getCreatedBy() {
        return this.createdBy;
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
     * Get value of originCountry.
     *
     * @return List<String> value of originCountry
     */
    @NonNull
    public final List<String> getOriginCountry() {
        return this.originCountry;
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
     * Get value of originalName.
     *
     * @return String value of originalName
     */
    @Nullable
    public final String getOriginalName() {
        return this.originalName;
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
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
    }
    
    /**
     * Get value of episodeRunTime.
     *
     * @return List<String> value of episodeRunTime
     */
    @NonNull
    public final List<String> getEpisodeRunTime() {
        return this.episodeRunTime;
    }
    
    /**
     * Get value of inProduction.
     *
     * @return Boolean value of inProduction
     */
    @Nullable
    public final Boolean getInProduction() {
        return this.inProduction;
    }
    
    /**
     * Get value of lastAirDate.
     *
     * @return Date value of lastAirDate
     */
    @Nullable
    public final Date getLastAirDate() {
        return this.lastAirDate;
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
     * Set value of numberOfEpisodes.
     *
     * @param numberOfEpisodesParam
     */
    public final void setNumberOfEpisodes(@Nullable final Integer numberOfEpisodesParam) {
        this.numberOfEpisodes = numberOfEpisodesParam;
    }
    
    /**
     * Set value of networks.
     *
     * @param networksParam
     */
    public final void getNetworks(@NonNull final List<Networks> networksParam) {
        this.networks = networksParam;
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
     * Set value of backdropPath.
     *
     * @param backdropPathParam
     */
    public final void setBackdropPath(@Nullable final String backdropPathParam) {
        this.backdropPath = backdropPathParam;
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
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of numberOfSeasons.
     *
     * @param numberOfSeasonsParam
     */
    public final void setNumberOfSeasons(@Nullable final Integer numberOfSeasonsParam) {
        this.numberOfSeasons = numberOfSeasonsParam;
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
     * Set value of firstAirDate.
     *
     * @param firstAirDateParam
     */
    public final void setFirstAirDate(@Nullable final Date firstAirDateParam) {
        this.firstAirDate = firstAirDateParam;
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
     * Set value of seasons.
     *
     * @param seasonsParam
     */
    public final void getSeasons(@NonNull final List<Seasons> seasonsParam) {
        this.seasons = seasonsParam;
    }
    
    /**
     * Set value of languages.
     *
     * @param languagesParam
     */
    public final void getLanguages(@NonNull final List<String> languagesParam) {
        this.languages = languagesParam;
    }
    
    /**
     * Set value of createdBy.
     *
     * @param createdByParam
     */
    public final void getCreatedBy(@NonNull final List<CreatedBy> createdByParam) {
        this.createdBy = createdByParam;
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
     * Set value of originCountry.
     *
     * @param originCountryParam
     */
    public final void getOriginCountry(@NonNull final List<String> originCountryParam) {
        this.originCountry = originCountryParam;
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
     * Set value of originalName.
     *
     * @param originalNameParam
     */
    public final void setOriginalName(@Nullable final String originalNameParam) {
        this.originalName = originalNameParam;
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
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
    }
    
    /**
     * Set value of episodeRunTime.
     *
     * @param episodeRunTimeParam
     */
    public final void getEpisodeRunTime(@NonNull final List<String> episodeRunTimeParam) {
        this.episodeRunTime = episodeRunTimeParam;
    }
    
    /**
     * Set value of inProduction.
     *
     * @param inProductionParam
     */
    public final void setInProduction(@Nullable final Boolean inProductionParam) {
        this.inProduction = inProductionParam;
    }
    
    /**
     * Set value of lastAirDate.
     *
     * @param lastAirDateParam
     */
    public final void setLastAirDate(@Nullable final Date lastAirDateParam) {
        this.lastAirDate = lastAirDateParam;
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
