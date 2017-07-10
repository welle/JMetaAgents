package aka.jmetaagents.main.jrottentomatoes.pojo.jmoviesimilar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmoviesimilar.deserializers.DateYearDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Movies {

    @JsonProperty("abridged_cast")
	@NonNull
    private List<AbridgedCast> abridgedCast = new ArrayList<>();
	@Nullable
    private Integer year;
	@Nullable
    private Ratings ratings;
    @JsonProperty("release_dates")
	@Nullable
    private ReleaseDates releaseDates;
	@Nullable
    private Posters posters;
	@Nullable
    private Integer runtime;
	@Nullable
    private Links links;
    @JsonDeserialize(using = DateYearDeserializer.class)
    private Date id;
	@Nullable
    private String synopsis;
	@Nullable
    private String title;
    @JsonProperty("mpaa_rating")
	@Nullable
    private String mpaaRating;
    @JsonProperty("critics_consensus")
	@Nullable
    private String criticsConsensus;

	/**
     * Empty Constructor.
     */
    public Movies() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param abridgedCastParam List<AbridgedCast>
     * @param yearParam Integer
     * @param ratingsParam Ratings
     * @param releaseDatesParam ReleaseDates
     * @param postersParam Posters
     * @param runtimeParam Integer
     * @param linksParam Links
     * @param idParam Date
     * @param synopsisParam String
     * @param titleParam String
     * @param mpaaRatingParam String
     * @param criticsConsensusParam String
     */
    public Movies(@NonNull final List<AbridgedCast> abridgedCastParam, @Nullable final Integer yearParam, @Nullable final Ratings ratingsParam, @Nullable final ReleaseDates releaseDatesParam, @Nullable final Posters postersParam, @Nullable final Integer runtimeParam, @Nullable final Links linksParam, @Nullable final Date idParam, @Nullable final String synopsisParam, @Nullable final String titleParam, @Nullable final String mpaaRatingParam, @Nullable final String criticsConsensusParam) {
        this.abridgedCast = abridgedCastParam;
        this.year = yearParam;
        this.ratings = ratingsParam;
        this.releaseDates = releaseDatesParam;
        this.posters = postersParam;
        this.runtime = runtimeParam;
        this.links = linksParam;
        this.id = idParam;
        this.synopsis = synopsisParam;
        this.title = titleParam;
        this.mpaaRating = mpaaRatingParam;
        this.criticsConsensus = criticsConsensusParam;
    }
    
    /**
     * Get value of abridgedCast.
     *
     * @return List<AbridgedCast> value of abridgedCast
     */
    @NonNull
    public final List<AbridgedCast> getAbridgedCast() {
        return this.abridgedCast;
    }
    
    /**
     * Get value of year.
     *
     * @return Integer value of year
     */
    @Nullable
    public final Integer getYear() {
        return this.year;
    }
    
    /**
     * Get value of ratings.
     *
     * @return Ratings value of ratings
     */
    @Nullable
    public final Ratings getRatings() {
        return this.ratings;
    }
    
    /**
     * Get value of releaseDates.
     *
     * @return ReleaseDates value of releaseDates
     */
    @Nullable
    public final ReleaseDates getReleaseDates() {
        return this.releaseDates;
    }
    
    /**
     * Get value of posters.
     *
     * @return Posters value of posters
     */
    @Nullable
    public final Posters getPosters() {
        return this.posters;
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
     * Get value of links.
     *
     * @return Links value of links
     */
    @Nullable
    public final Links getLinks() {
        return this.links;
    }
    
    /**
     * Get value of id.
     *
     * @return Date value of id
     */
    @Nullable
    public final Date getId() {
        return this.id;
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
     * Get value of title.
     *
     * @return String value of title
     */
    @Nullable
    public final String getTitle() {
        return this.title;
    }
    
    /**
     * Get value of mpaaRating.
     *
     * @return String value of mpaaRating
     */
    @Nullable
    public final String getMpaaRating() {
        return this.mpaaRating;
    }
    
    /**
     * Get value of criticsConsensus.
     *
     * @return String value of criticsConsensus
     */
    @Nullable
    public final String getCriticsConsensus() {
        return this.criticsConsensus;
    }

    
    /**
     * Set value of abridgedCast.
     *
     * @param abridgedCastParam
     */
    public final void getAbridgedCast(@NonNull final List<AbridgedCast> abridgedCastParam) {
        this.abridgedCast = abridgedCastParam;
    }
    
    /**
     * Set value of year.
     *
     * @param yearParam
     */
    public final void setYear(@Nullable final Integer yearParam) {
        this.year = yearParam;
    }
    
    /**
     * Set value of ratings.
     *
     * @param ratingsParam
     */
    public final void setRatings(@Nullable final Ratings ratingsParam) {
        this.ratings = ratingsParam;
    }
    
    /**
     * Set value of releaseDates.
     *
     * @param releaseDatesParam
     */
    public final void setReleaseDates(@Nullable final ReleaseDates releaseDatesParam) {
        this.releaseDates = releaseDatesParam;
    }
    
    /**
     * Set value of posters.
     *
     * @param postersParam
     */
    public final void setPosters(@Nullable final Posters postersParam) {
        this.posters = postersParam;
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
     * Set value of links.
     *
     * @param linksParam
     */
    public final void setLinks(@Nullable final Links linksParam) {
        this.links = linksParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Date idParam) {
        this.id = idParam;
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
     * Set value of title.
     *
     * @param titleParam
     */
    public final void setTitle(@Nullable final String titleParam) {
        this.title = titleParam;
    }
    
    /**
     * Set value of mpaaRating.
     *
     * @param mpaaRatingParam
     */
    public final void setMpaaRating(@Nullable final String mpaaRatingParam) {
        this.mpaaRating = mpaaRatingParam;
    }
    
    /**
     * Set value of criticsConsensus.
     *
     * @param criticsConsensusParam
     */
    public final void setCriticsConsensus(@Nullable final String criticsConsensusParam) {
        this.criticsConsensus = criticsConsensusParam;
    }
}
