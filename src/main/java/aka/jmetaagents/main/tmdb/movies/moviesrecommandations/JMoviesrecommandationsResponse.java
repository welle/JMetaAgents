package aka.jmetaagents.main.tmdb.movies.moviesrecommandations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMoviesrecommandationsResponse {

	@Nullable
    private Integer page;
    @JsonProperty("total_pages")
	@Nullable
    private Integer totalPages;
	@NonNull
    private List<Results> results = new ArrayList<>();
    @JsonProperty("total_results")
	@Nullable
    private Integer totalResults;

	/**
     * Empty Constructor.
     */
    public JMoviesrecommandationsResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param pageParam Integer
     * @param totalPagesParam Integer
     * @param resultsParam List<Results>
     * @param totalResultsParam Integer
     */
    public JMoviesrecommandationsResponse(@Nullable final Integer pageParam, @Nullable final Integer totalPagesParam, @NonNull final List<Results> resultsParam, @Nullable final Integer totalResultsParam) {
        this.page = pageParam;
        this.totalPages = totalPagesParam;
        this.results = resultsParam;
        this.totalResults = totalResultsParam;
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
     * Get value of totalPages.
     *
     * @return Integer value of totalPages
     */
    @Nullable
    public final Integer getTotalPages() {
        return this.totalPages;
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
     * Get value of totalResults.
     *
     * @return Integer value of totalResults
     */
    @Nullable
    public final Integer getTotalResults() {
        return this.totalResults;
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
     * Set value of totalPages.
     *
     * @param totalPagesParam
     */
    public final void setTotalPages(@Nullable final Integer totalPagesParam) {
        this.totalPages = totalPagesParam;
    }
    
    /**
     * Set value of results.
     *
     * @param resultsParam
     */
    public final void setResults(@NonNull final List<Results> resultsParam) {
        this.results = resultsParam;
    }
    
    /**
     * Set value of totalResults.
     *
     * @param totalResultsParam
     */
    public final void setTotalResults(@Nullable final Integer totalResultsParam) {
        this.totalResults = totalResultsParam;
    }
}
