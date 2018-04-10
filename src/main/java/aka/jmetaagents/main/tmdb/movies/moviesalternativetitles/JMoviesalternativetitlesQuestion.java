package aka.jmetaagents.main.tmdb.movies.moviesalternativetitles;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMoviesalternativetitlesQuestion {

	@Nullable
    private String country;
    @JsonProperty("movie_id")
	@Nullable
    private Integer movieId;

	/**
     * Empty Constructor.
     */
    public JMoviesalternativetitlesQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param countryParam String
     * @param movieIdParam Integer
     */
    public JMoviesalternativetitlesQuestion(@Nullable final String countryParam, @Nullable final Integer movieIdParam) {
        this.country = countryParam;
        this.movieId = movieIdParam;
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
     * Get value of movieId.
     *
     * @return Integer value of movieId
     */
    @Nullable
    public final Integer getMovieId() {
        return this.movieId;
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
     * Set value of movieId.
     *
     * @param movieIdParam
     */
    public final void setMovieId(@Nullable final Integer movieIdParam) {
        this.movieId = movieIdParam;
    }
}
