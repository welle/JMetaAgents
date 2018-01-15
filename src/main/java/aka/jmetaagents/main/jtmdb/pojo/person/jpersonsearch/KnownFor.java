package aka.jmetaagents.main.jtmdb.pojo.person.jpersonsearch;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jtmdb.pojo.person.jpersonsearch.deserializers.DateYearMonthDayDashDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class KnownFor {

	@Nullable
    private String overview;
    @JsonProperty("original_language")
	@Nullable
    private String originalLanguage;
    @JsonProperty("original_title")
	@Nullable
    private String originalTitle;
	@Nullable
    private Boolean video;
	@Nullable
    private String title;
    @JsonProperty("genre_ids")
	@NonNull
    private List<String> genreIds = new ArrayList<>();
    @JsonProperty("poster_path")
	@Nullable
    private String posterPath;
    @JsonProperty("backdrop_path")
	@Nullable
    private String backdropPath;
    @JsonProperty("release_date")
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date releaseDate;
    @JsonProperty("media_type")
	@Nullable
    private String mediaType;
	@Nullable
    private Double popularity;
    @JsonProperty("vote_average")
	@Nullable
    private Double voteAverage;
	@Nullable
    private Integer id;
	@Nullable
    private Boolean adult;
    @JsonProperty("vote_count")
	@Nullable
    private Integer voteCount;

	/**
     * Empty Constructor.
     */
    public KnownFor() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param overviewParam String
     * @param originalLanguageParam String
     * @param originalTitleParam String
     * @param videoParam Boolean
     * @param titleParam String
     * @param genreIdsParam List<String>
     * @param posterPathParam String
     * @param backdropPathParam String
     * @param releaseDateParam Date
     * @param mediaTypeParam String
     * @param popularityParam Double
     * @param voteAverageParam Double
     * @param idParam Integer
     * @param adultParam Boolean
     * @param voteCountParam Integer
     */
    public KnownFor(@Nullable final String overviewParam, @Nullable final String originalLanguageParam, @Nullable final String originalTitleParam, @Nullable final Boolean videoParam, @Nullable final String titleParam, @NonNull final List<String> genreIdsParam, @Nullable final String posterPathParam, @Nullable final String backdropPathParam, @Nullable final Date releaseDateParam, @Nullable final String mediaTypeParam, @Nullable final Double popularityParam, @Nullable final Double voteAverageParam, @Nullable final Integer idParam, @Nullable final Boolean adultParam, @Nullable final Integer voteCountParam) {
        this.overview = overviewParam;
        this.originalLanguage = originalLanguageParam;
        this.originalTitle = originalTitleParam;
        this.video = videoParam;
        this.title = titleParam;
        this.genreIds = genreIdsParam;
        this.posterPath = posterPathParam;
        this.backdropPath = backdropPathParam;
        this.releaseDate = releaseDateParam;
        this.mediaType = mediaTypeParam;
        this.popularity = popularityParam;
        this.voteAverage = voteAverageParam;
        this.id = idParam;
        this.adult = adultParam;
        this.voteCount = voteCountParam;
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
     * Get value of originalTitle.
     *
     * @return String value of originalTitle
     */
    @Nullable
    public final String getOriginalTitle() {
        return this.originalTitle;
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
     * Get value of backdropPath.
     *
     * @return String value of backdropPath
     */
    @Nullable
    public final String getBackdropPath() {
        return this.backdropPath;
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
     * Get value of mediaType.
     *
     * @return String value of mediaType
     */
    @Nullable
    public final String getMediaType() {
        return this.mediaType;
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
     * Get value of id.
     *
     * @return Integer value of id
     */
    @Nullable
    public final Integer getId() {
        return this.id;
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
     * Get value of voteCount.
     *
     * @return Integer value of voteCount
     */
    @Nullable
    public final Integer getVoteCount() {
        return this.voteCount;
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
     * Set value of originalTitle.
     *
     * @param originalTitleParam
     */
    public final void setOriginalTitle(@Nullable final String originalTitleParam) {
        this.originalTitle = originalTitleParam;
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
     * Set value of backdropPath.
     *
     * @param backdropPathParam
     */
    public final void setBackdropPath(@Nullable final String backdropPathParam) {
        this.backdropPath = backdropPathParam;
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
     * Set value of mediaType.
     *
     * @param mediaTypeParam
     */
    public final void setMediaType(@Nullable final String mediaTypeParam) {
        this.mediaType = mediaTypeParam;
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
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
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
     * Set value of voteCount.
     *
     * @param voteCountParam
     */
    public final void setVoteCount(@Nullable final Integer voteCountParam) {
        this.voteCount = voteCountParam;
    }
}
