package aka.jmetaagents.main.tmdb.movies.moviesrecommandations;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMoviesrecommandationsQuestion {

	@Nullable
    private String language;
	@Nullable
    private Integer page;
    @JsonProperty("movie_id")
	@Nullable
    private Integer movieId;

	/**
     * Empty Constructor.
     */
    public JMoviesrecommandationsQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param languageParam String
     * @param pageParam Integer
     * @param movieIdParam Integer
     */
    public JMoviesrecommandationsQuestion(@Nullable final String languageParam, @Nullable final Integer pageParam, @Nullable final Integer movieIdParam) {
        this.language = languageParam;
        this.page = pageParam;
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
     * Get value of page.
     *
     * @return Integer value of page
     */
    @Nullable
    public final Integer getPage() {
        return this.page;
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
     * Set value of page.
     *
     * @param pageParam
     */
    public final void setPage(@Nullable final Integer pageParam) {
        this.page = pageParam;
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
