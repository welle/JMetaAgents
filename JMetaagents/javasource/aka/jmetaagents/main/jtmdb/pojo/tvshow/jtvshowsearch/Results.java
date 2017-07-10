package aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowsearch;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowsearch.deserializers.DateYearMonthDayDashDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Results {

    @JsonProperty("first_air_date")
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date firstAirDate;
	@Nullable
    private String overview;
    @JsonProperty("original_language")
	@Nullable
    private String originalLanguage;
    @JsonProperty("genre_ids")
	@NonNull
    private List<String> genreIds = new ArrayList<>();
    @JsonProperty("poster_path")
	@Nullable
    private String posterPath;
    @JsonProperty("origin_country")
	@NonNull
    private List<String> originCountry = new ArrayList<>();
    @JsonProperty("backdrop_path")
	@Nullable
    private String backdropPath;
	@Nullable
    private Double popularity;
    @JsonProperty("vote_average")
	@Nullable
    private Double voteAverage;
    @JsonProperty("original_name")
	@Nullable
    private String originalName;
	@Nullable
    private String name;
	@Nullable
    private Integer id;
    @JsonProperty("vote_count")
	@Nullable
    private Integer voteCount;

	/**
     * Empty Constructor.
     */
    public Results() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param firstAirDateParam Date
     * @param overviewParam String
     * @param originalLanguageParam String
     * @param genreIdsParam List<String>
     * @param posterPathParam String
     * @param originCountryParam List<String>
     * @param backdropPathParam String
     * @param popularityParam Double
     * @param voteAverageParam Double
     * @param originalNameParam String
     * @param nameParam String
     * @param idParam Integer
     * @param voteCountParam Integer
     */
    public Results(@Nullable final Date firstAirDateParam, @Nullable final String overviewParam, @Nullable final String originalLanguageParam, @NonNull final List<String> genreIdsParam, @Nullable final String posterPathParam, @NonNull final List<String> originCountryParam, @Nullable final String backdropPathParam, @Nullable final Double popularityParam, @Nullable final Double voteAverageParam, @Nullable final String originalNameParam, @Nullable final String nameParam, @Nullable final Integer idParam, @Nullable final Integer voteCountParam) {
        this.firstAirDate = firstAirDateParam;
        this.overview = overviewParam;
        this.originalLanguage = originalLanguageParam;
        this.genreIds = genreIdsParam;
        this.posterPath = posterPathParam;
        this.originCountry = originCountryParam;
        this.backdropPath = backdropPathParam;
        this.popularity = popularityParam;
        this.voteAverage = voteAverageParam;
        this.originalName = originalNameParam;
        this.name = nameParam;
        this.id = idParam;
        this.voteCount = voteCountParam;
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
     * Get value of originalLanguage.
     *
     * @return String value of originalLanguage
     */
    @Nullable
    public final String getOriginalLanguage() {
        return this.originalLanguage;
    }
    
    /**
     * Get value of genreIds.
     *
     * @return List<String> value of genreIds
     */
    @NonNull
    public final List<String> getGenreIds() {
        return this.genreIds;
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
     * Get value of backdropPath.
     *
     * @return String value of backdropPath
     */
    @Nullable
    public final String getBackdropPath() {
        return this.backdropPath;
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
     * Get value of voteAverage.
     *
     * @return Double value of voteAverage
     */
    @Nullable
    public final Double getVoteAverage() {
        return this.voteAverage;
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
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
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
     * Set value of originalLanguage.
     *
     * @param originalLanguageParam
     */
    public final void setOriginalLanguage(@Nullable final String originalLanguageParam) {
        this.originalLanguage = originalLanguageParam;
    }
    
    /**
     * Set value of genreIds.
     *
     * @param genreIdsParam
     */
    public final void getGenreIds(@NonNull final List<String> genreIdsParam) {
        this.genreIds = genreIdsParam;
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
     * Set value of backdropPath.
     *
     * @param backdropPathParam
     */
    public final void setBackdropPath(@Nullable final String backdropPathParam) {
        this.backdropPath = backdropPathParam;
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
     * Set value of voteAverage.
     *
     * @param voteAverageParam
     */
    public final void setVoteAverage(@Nullable final Double voteAverageParam) {
        this.voteAverage = voteAverageParam;
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
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
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
}
