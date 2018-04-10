package aka.jmetaagents.main.tmdb.movies.moviesvideos;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMoviesvideosQuestion {

	@Nullable
    private String language;
    @JsonProperty("movie_id")
	@Nullable
    private Integer movieId;

	/**
     * Empty Constructor.
     */
    public JMoviesvideosQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param languageParam String
     * @param movieIdParam Integer
     */
    public JMoviesvideosQuestion(@Nullable final String languageParam, @Nullable final Integer movieIdParam) {
        this.language = languageParam;
        this.movieId = movieIdParam;
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
     * Get value of movieId.
     *
     * @return Integer value of movieId
     */
    @Nullable
    public final Integer getMovieId() {
        return this.movieId;
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
     * Set value of movieId.
     *
     * @param movieIdParam
     */
    public final void setMovieId(@Nullable final Integer movieIdParam) {
        this.movieId = movieIdParam;
    }
}
