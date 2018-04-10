package aka.jmetaagents.main.tmdb.movies.moviescredits;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMoviescreditsQuestion {

    @JsonProperty("movie_id")
	@Nullable
    private Integer movieId;

	/**
     * Empty Constructor.
     */
    public JMoviescreditsQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param movieIdParam Integer
     */
    public JMoviescreditsQuestion(@Nullable final Integer movieIdParam) {
        this.movieId = movieIdParam;
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
     * Set value of movieId.
     *
     * @param movieIdParam
     */
    public final void setMovieId(@Nullable final Integer movieIdParam) {
        this.movieId = movieIdParam;
    }
}
