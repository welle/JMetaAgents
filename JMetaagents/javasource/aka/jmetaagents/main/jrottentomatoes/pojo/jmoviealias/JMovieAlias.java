package aka.jmetaagents.main.jrottentomatoes.pojo.jmoviealias;

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
public final class JMovieAlias {

	@Nullable
    private String studio;
	@Nullable
    private Integer year;
    @JsonProperty("link_template")
	@Nullable
    private String linkTemplate;
	@Nullable
    private Posters posters;
	@Nullable
    private Integer runtime;
    @JsonProperty("abridged_directors")
	@NonNull
    private List<AbridgedDirectors> abridgedDirectors = new ArrayList<>();
	@Nullable
    private String synopsis;
	@Nullable
    private String title;
    @JsonProperty("critics_consensus")
	@Nullable
    private String criticsConsensus;
    @JsonProperty("abridged_cast")
	@NonNull
    private List<AbridgedCast> abridgedCast = new ArrayList<>();
	@NonNull
    private List<String> genres = new ArrayList<>();
	@Nullable
    private Ratings ratings;
    @JsonProperty("release_dates")
	@Nullable
    private ReleaseDates releaseDates;
	@Nullable
    private Links links;
	@Nullable
    private Integer id;
    @JsonProperty("mpaa_rating")
	@Nullable
    private String mpaaRating;

	/**
     * Empty Constructor.
     */
    public JMovieAlias() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param studioParam String
     * @param yearParam Integer
     * @param linkTemplateParam String
     * @param postersParam Posters
     * @param runtimeParam Integer
     * @param abridgedDirectorsParam List<AbridgedDirectors>
     * @param synopsisParam String
     * @param titleParam String
     * @param criticsConsensusParam String
     * @param abridgedCastParam List<AbridgedCast>
     * @param genresParam List<String>
     * @param ratingsParam Ratings
     * @param releaseDatesParam ReleaseDates
     * @param linksParam Links
     * @param idParam Integer
     * @param mpaaRatingParam String
     */
    public JMovieAlias(@Nullable final String studioParam, @Nullable final Integer yearParam, @Nullable final String linkTemplateParam, @Nullable final Posters postersParam, @Nullable final Integer runtimeParam, @NonNull final List<AbridgedDirectors> abridgedDirectorsParam, @Nullable final String synopsisParam, @Nullable final String titleParam, @Nullable final String criticsConsensusParam, @NonNull final List<AbridgedCast> abridgedCastParam, @NonNull final List<String> genresParam, @Nullable final Ratings ratingsParam, @Nullable final ReleaseDates releaseDatesParam, @Nullable final Links linksParam, @Nullable final Integer idParam, @Nullable final String mpaaRatingParam) {
        this.studio = studioParam;
        this.year = yearParam;
        this.linkTemplate = linkTemplateParam;
        this.posters = postersParam;
        this.runtime = runtimeParam;
        this.abridgedDirectors = abridgedDirectorsParam;
        this.synopsis = synopsisParam;
        this.title = titleParam;
        this.criticsConsensus = criticsConsensusParam;
        this.abridgedCast = abridgedCastParam;
        this.genres = genresParam;
        this.ratings = ratingsParam;
        this.releaseDates = releaseDatesParam;
        this.links = linksParam;
        this.id = idParam;
        this.mpaaRating = mpaaRatingParam;
    }
    
    /**
     * Get value of studio.
     *
     * @return String value of studio
     */
    @Nullable
    public final String getStudio() {
        return this.studio;
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
     * Get value of linkTemplate.
     *
     * @return String value of linkTemplate
     */
    @Nullable
    public final String getLinkTemplate() {
        return this.linkTemplate;
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
     * Get value of abridgedDirectors.
     *
     * @return List<AbridgedDirectors> value of abridgedDirectors
     */
    @NonNull
    public final List<AbridgedDirectors> getAbridgedDirectors() {
        return this.abridgedDirectors;
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
     * Get value of criticsConsensus.
     *
     * @return String value of criticsConsensus
     */
    @Nullable
    public final String getCriticsConsensus() {
        return this.criticsConsensus;
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
     * Get value of genres.
     *
     * @return List<String> value of genres
     */
    @NonNull
    public final List<String> getGenres() {
        return this.genres;
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
     * @return Integer value of id
     */
    @Nullable
    public final Integer getId() {
        return this.id;
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
     * Set value of studio.
     *
     * @param studioParam
     */
    public final void setStudio(@Nullable final String studioParam) {
        this.studio = studioParam;
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
     * Set value of linkTemplate.
     *
     * @param linkTemplateParam
     */
    public final void setLinkTemplate(@Nullable final String linkTemplateParam) {
        this.linkTemplate = linkTemplateParam;
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
     * Set value of abridgedDirectors.
     *
     * @param abridgedDirectorsParam
     */
    public final void getAbridgedDirectors(@NonNull final List<AbridgedDirectors> abridgedDirectorsParam) {
        this.abridgedDirectors = abridgedDirectorsParam;
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
     * Set value of criticsConsensus.
     *
     * @param criticsConsensusParam
     */
    public final void setCriticsConsensus(@Nullable final String criticsConsensusParam) {
        this.criticsConsensus = criticsConsensusParam;
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
     * Set value of genres.
     *
     * @param genresParam
     */
    public final void getGenres(@NonNull final List<String> genresParam) {
        this.genres = genresParam;
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
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of mpaaRating.
     *
     * @param mpaaRatingParam
     */
    public final void setMpaaRating(@Nullable final String mpaaRatingParam) {
        this.mpaaRating = mpaaRatingParam;
    }
}
