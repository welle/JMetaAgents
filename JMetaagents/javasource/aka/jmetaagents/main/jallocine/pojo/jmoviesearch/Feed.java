package aka.jmetaagents.main.jallocine.pojo.jmoviesearch;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Feed {

	@Nullable
    private Integer totalResults;
	@NonNull
    private List<Movie> movie = new ArrayList<>();
	@Nullable
    private Integer count;
	@Nullable
    private Integer page;
	@NonNull
    private List<Results> results = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public Feed() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param totalResultsParam Integer
     * @param movieParam List<Movie>
     * @param countParam Integer
     * @param pageParam Integer
     * @param resultsParam List<Results>
     */
    public Feed(@Nullable final Integer totalResultsParam, @NonNull final List<Movie> movieParam, @Nullable final Integer countParam, @Nullable final Integer pageParam, @NonNull final List<Results> resultsParam) {
        this.totalResults = totalResultsParam;
        this.movie = movieParam;
        this.count = countParam;
        this.page = pageParam;
        this.results = resultsParam;
    }
    
    /**
     * Get value of totalResults.
     *
     * @return Integer value of totalResults
     */
    @Nullable
    public final Integer getTotalResults() {
        return this.totalResults;
    }
    
    /**
     * Get value of movie.
     *
     * @return List<Movie> value of movie
     */
    @NonNull
    public final List<Movie> getMovie() {
        return this.movie;
    }
    
    /**
     * Get value of count.
     *
     * @return Integer value of count
     */
    @Nullable
    public final Integer getCount() {
        return this.count;
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
     * Get value of results.
     *
     * @return List<Results> value of results
     */
    @NonNull
    public final List<Results> getResults() {
        return this.results;
    }

    
    /**
     * Set value of totalResults.
     *
     * @param totalResultsParam
     */
    public final void setTotalResults(@Nullable final Integer totalResultsParam) {
        this.totalResults = totalResultsParam;
    }
    
    /**
     * Set value of movie.
     *
     * @param movieParam
     */
    public final void getMovie(@NonNull final List<Movie> movieParam) {
        this.movie = movieParam;
    }
    
    /**
     * Set value of count.
     *
     * @param countParam
     */
    public final void setCount(@Nullable final Integer countParam) {
        this.count = countParam;
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
     * Set value of results.
     *
     * @param resultsParam
     */
    public final void getResults(@NonNull final List<Results> resultsParam) {
        this.results = resultsParam;
    }
}
