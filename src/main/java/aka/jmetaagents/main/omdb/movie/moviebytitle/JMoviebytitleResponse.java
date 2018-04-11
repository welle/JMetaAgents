package aka.jmetaagents.main.omdb.movie.moviebytitle;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.omdb.movie.moviebytitle.deserializers.URLDeserializer;
import aka.jmetaagents.main.omdb.movie.moviebytitle.deserializers.DateYearDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMoviebytitleResponse {

    @JsonProperty("Metascore")
	@Nullable
    private String metascore;
    @JsonProperty("BoxOffice")
	@Nullable
    private String boxOffice;
    @JsonProperty("Website")
    @JsonDeserialize(using = URLDeserializer.class)
    private URI website;
	@Nullable
    private String imdbRating;
	@Nullable
    private String imdbVotes;
    @JsonProperty("Ratings")
	@NonNull
    private List<Ratings> ratings = new ArrayList<>();
    @JsonProperty("Runtime")
	@Nullable
    private String runtime;
    @JsonProperty("Language")
	@Nullable
    private String language;
    @JsonProperty("Rated")
	@Nullable
    private String rated;
    @JsonProperty("Production")
	@Nullable
    private String production;
    @JsonProperty("Released")
	@Nullable
    private String released;
	@Nullable
    private String imdbID;
    @JsonProperty("Plot")
	@Nullable
    private String plot;
    @JsonProperty("Director")
	@Nullable
    private String director;
    @JsonProperty("Title")
	@Nullable
    private String title;
    @JsonProperty("Actors")
	@Nullable
    private String actors;
    @JsonProperty("Response")
	@Nullable
    private String response;
    @JsonProperty("Type")
	@Nullable
    private String type;
    @JsonProperty("Awards")
	@Nullable
    private String awards;
    @JsonProperty("DVD")
	@Nullable
    private String dVD;
    @JsonProperty("Year")
    @JsonDeserialize(using = DateYearDeserializer.class)
    private Date year;
    @JsonProperty("Poster")
    @JsonDeserialize(using = URLDeserializer.class)
    private URI poster;
    @JsonProperty("Country")
	@Nullable
    private String country;
    @JsonProperty("Genre")
	@Nullable
    private String genre;
    @JsonProperty("Writer")
	@Nullable
    private String writer;

	/**
     * Empty Constructor.
     */
    public JMoviebytitleResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param metascoreParam String
     * @param boxOfficeParam String
     * @param websiteParam URI
     * @param imdbRatingParam String
     * @param imdbVotesParam String
     * @param ratingsParam List<Ratings>
     * @param runtimeParam String
     * @param languageParam String
     * @param ratedParam String
     * @param productionParam String
     * @param releasedParam String
     * @param imdbIDParam String
     * @param plotParam String
     * @param directorParam String
     * @param titleParam String
     * @param actorsParam String
     * @param responseParam String
     * @param typeParam String
     * @param awardsParam String
     * @param dVDParam String
     * @param yearParam Date
     * @param posterParam URI
     * @param countryParam String
     * @param genreParam String
     * @param writerParam String
     */
    public JMoviebytitleResponse(@Nullable final String metascoreParam, @Nullable final String boxOfficeParam, @Nullable final URI websiteParam, @Nullable final String imdbRatingParam, @Nullable final String imdbVotesParam, @NonNull final List<Ratings> ratingsParam, @Nullable final String runtimeParam, @Nullable final String languageParam, @Nullable final String ratedParam, @Nullable final String productionParam, @Nullable final String releasedParam, @Nullable final String imdbIDParam, @Nullable final String plotParam, @Nullable final String directorParam, @Nullable final String titleParam, @Nullable final String actorsParam, @Nullable final String responseParam, @Nullable final String typeParam, @Nullable final String awardsParam, @Nullable final String dVDParam, @Nullable final Date yearParam, @Nullable final URI posterParam, @Nullable final String countryParam, @Nullable final String genreParam, @Nullable final String writerParam) {
        this.metascore = metascoreParam;
        this.boxOffice = boxOfficeParam;
        this.website = websiteParam;
        this.imdbRating = imdbRatingParam;
        this.imdbVotes = imdbVotesParam;
        this.ratings = ratingsParam;
        this.runtime = runtimeParam;
        this.language = languageParam;
        this.rated = ratedParam;
        this.production = productionParam;
        this.released = releasedParam;
        this.imdbID = imdbIDParam;
        this.plot = plotParam;
        this.director = directorParam;
        this.title = titleParam;
        this.actors = actorsParam;
        this.response = responseParam;
        this.type = typeParam;
        this.awards = awardsParam;
        this.dVD = dVDParam;
        this.year = yearParam;
        this.poster = posterParam;
        this.country = countryParam;
        this.genre = genreParam;
        this.writer = writerParam;
    }
    
    /**
     * Get value of metascore.
     *
     * @return String value of metascore
     */
    @Nullable
    public final String getMetascore() {
        return this.metascore;
    }
    
    /**
     * Get value of boxOffice.
     *
     * @return String value of boxOffice
     */
    @Nullable
    public final String getBoxOffice() {
        return this.boxOffice;
    }
    
    /**
     * Get value of website.
     *
     * @return URI value of website
     */
    @Nullable
    public final URI getWebsite() {
        return this.website;
    }
    
    /**
     * Get value of imdbRating.
     *
     * @return String value of imdbRating
     */
    @Nullable
    public final String getImdbRating() {
        return this.imdbRating;
    }
    
    /**
     * Get value of imdbVotes.
     *
     * @return String value of imdbVotes
     */
    @Nullable
    public final String getImdbVotes() {
        return this.imdbVotes;
    }
    
    /**
     * Get value of ratings.
     *
     * @return List<Ratings> value of ratings
     */
    @NonNull
    public final List<Ratings> getRatings() {
        return this.ratings;
    }
    
    /**
     * Get value of runtime.
     *
     * @return String value of runtime
     */
    @Nullable
    public final String getRuntime() {
        return this.runtime;
    }
    
    /**
     * Get value of language.
     *
     * @return String value of language
     */
    @Nullable
    public final String getLanguage() {
        return this.language;
    }
    
    /**
     * Get value of rated.
     *
     * @return String value of rated
     */
    @Nullable
    public final String getRated() {
        return this.rated;
    }
    
    /**
     * Get value of production.
     *
     * @return String value of production
     */
    @Nullable
    public final String getProduction() {
        return this.production;
    }
    
    /**
     * Get value of released.
     *
     * @return String value of released
     */
    @Nullable
    public final String getReleased() {
        return this.released;
    }
    
    /**
     * Get value of imdbID.
     *
     * @return String value of imdbID
     */
    @Nullable
    public final String getImdbID() {
        return this.imdbID;
    }
    
    /**
     * Get value of plot.
     *
     * @return String value of plot
     */
    @Nullable
    public final String getPlot() {
        return this.plot;
    }
    
    /**
     * Get value of director.
     *
     * @return String value of director
     */
    @Nullable
    public final String getDirector() {
        return this.director;
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
     * Get value of actors.
     *
     * @return String value of actors
     */
    @Nullable
    public final String getActors() {
        return this.actors;
    }
    
    /**
     * Get value of response.
     *
     * @return String value of response
     */
    @Nullable
    public final String getResponse() {
        return this.response;
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
     * Get value of awards.
     *
     * @return String value of awards
     */
    @Nullable
    public final String getAwards() {
        return this.awards;
    }
    
    /**
     * Get value of dVD.
     *
     * @return String value of dVD
     */
    @Nullable
    public final String getDVD() {
        return this.dVD;
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
     * Get value of poster.
     *
     * @return URI value of poster
     */
    @Nullable
    public final URI getPoster() {
        return this.poster;
    }
    
    /**
     * Get value of country.
     *
     * @return String value of country
     */
    @Nullable
    public final String getCountry() {
        return this.country;
    }
    
    /**
     * Get value of genre.
     *
     * @return String value of genre
     */
    @Nullable
    public final String getGenre() {
        return this.genre;
    }
    
    /**
     * Get value of writer.
     *
     * @return String value of writer
     */
    @Nullable
    public final String getWriter() {
        return this.writer;
    }

    
    /**
     * Set value of metascore.
     *
     * @param metascoreParam
     */
    public final void setMetascore(@Nullable final String metascoreParam) {
        this.metascore = metascoreParam;
    }
    
    /**
     * Set value of boxOffice.
     *
     * @param boxOfficeParam
     */
    public final void setBoxOffice(@Nullable final String boxOfficeParam) {
        this.boxOffice = boxOfficeParam;
    }
    
    /**
     * Set value of website.
     *
     * @param websiteParam
     */
    public final void setWebsite(@Nullable final URI websiteParam) {
        this.website = websiteParam;
    }
    
    /**
     * Set value of imdbRating.
     *
     * @param imdbRatingParam
     */
    public final void setImdbRating(@Nullable final String imdbRatingParam) {
        this.imdbRating = imdbRatingParam;
    }
    
    /**
     * Set value of imdbVotes.
     *
     * @param imdbVotesParam
     */
    public final void setImdbVotes(@Nullable final String imdbVotesParam) {
        this.imdbVotes = imdbVotesParam;
    }
    
    /**
     * Set value of ratings.
     *
     * @param ratingsParam
     */
    public final void setRatings(@NonNull final List<Ratings> ratingsParam) {
        this.ratings = ratingsParam;
    }
    
    /**
     * Set value of runtime.
     *
     * @param runtimeParam
     */
    public final void setRuntime(@Nullable final String runtimeParam) {
        this.runtime = runtimeParam;
    }
    
    /**
     * Set value of language.
     *
     * @param languageParam
     */
    public final void setLanguage(@Nullable final String languageParam) {
        this.language = languageParam;
    }
    
    /**
     * Set value of rated.
     *
     * @param ratedParam
     */
    public final void setRated(@Nullable final String ratedParam) {
        this.rated = ratedParam;
    }
    
    /**
     * Set value of production.
     *
     * @param productionParam
     */
    public final void setProduction(@Nullable final String productionParam) {
        this.production = productionParam;
    }
    
    /**
     * Set value of released.
     *
     * @param releasedParam
     */
    public final void setReleased(@Nullable final String releasedParam) {
        this.released = releasedParam;
    }
    
    /**
     * Set value of imdbID.
     *
     * @param imdbIDParam
     */
    public final void setImdbID(@Nullable final String imdbIDParam) {
        this.imdbID = imdbIDParam;
    }
    
    /**
     * Set value of plot.
     *
     * @param plotParam
     */
    public final void setPlot(@Nullable final String plotParam) {
        this.plot = plotParam;
    }
    
    /**
     * Set value of director.
     *
     * @param directorParam
     */
    public final void setDirector(@Nullable final String directorParam) {
        this.director = directorParam;
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
     * Set value of actors.
     *
     * @param actorsParam
     */
    public final void setActors(@Nullable final String actorsParam) {
        this.actors = actorsParam;
    }
    
    /**
     * Set value of response.
     *
     * @param responseParam
     */
    public final void setResponse(@Nullable final String responseParam) {
        this.response = responseParam;
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
     * Set value of awards.
     *
     * @param awardsParam
     */
    public final void setAwards(@Nullable final String awardsParam) {
        this.awards = awardsParam;
    }
    
    /**
     * Set value of dVD.
     *
     * @param dVDParam
     */
    public final void setDVD(@Nullable final String dVDParam) {
        this.dVD = dVDParam;
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
     * Set value of poster.
     *
     * @param posterParam
     */
    public final void setPoster(@Nullable final URI posterParam) {
        this.poster = posterParam;
    }
    
    /**
     * Set value of country.
     *
     * @param countryParam
     */
    public final void setCountry(@Nullable final String countryParam) {
        this.country = countryParam;
    }
    
    /**
     * Set value of genre.
     *
     * @param genreParam
     */
    public final void setGenre(@Nullable final String genreParam) {
        this.genre = genreParam;
    }
    
    /**
     * Set value of writer.
     *
     * @param writerParam
     */
    public final void setWriter(@Nullable final String writerParam) {
        this.writer = writerParam;
    }
}
