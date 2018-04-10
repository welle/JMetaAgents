package aka.jmetaagents.main.tmdb.find.findbyimdbid;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JFindbyimdbidResponse {

    @JsonProperty("person_results")
	@NonNull
    private List<String> personResults = new ArrayList<>();
    @JsonProperty("movie_results")
	@NonNull
    private List<MovieResults> movieResults = new ArrayList<>();
    @JsonProperty("tv_results")
	@NonNull
    private List<String> tvResults = new ArrayList<>();
    @JsonProperty("tv_episode_results")
	@NonNull
    private List<String> tvEpisodeResults = new ArrayList<>();
    @JsonProperty("tv_season_results")
	@NonNull
    private List<String> tvSeasonResults = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public JFindbyimdbidResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param personResultsParam List<String>
     * @param movieResultsParam List<MovieResults>
     * @param tvResultsParam List<String>
     * @param tvEpisodeResultsParam List<String>
     * @param tvSeasonResultsParam List<String>
     */
    public JFindbyimdbidResponse(@NonNull final List<String> personResultsParam, @NonNull final List<MovieResults> movieResultsParam, @NonNull final List<String> tvResultsParam, @NonNull final List<String> tvEpisodeResultsParam, @NonNull final List<String> tvSeasonResultsParam) {
        this.personResults = personResultsParam;
        this.movieResults = movieResultsParam;
        this.tvResults = tvResultsParam;
        this.tvEpisodeResults = tvEpisodeResultsParam;
        this.tvSeasonResults = tvSeasonResultsParam;
    }
    
    /**
     * Get value of personResults.
     *
     * @return List<String> value of personResults
     */
    @NonNull
    public final List<String> getPersonResults() {
        return this.personResults;
    }
    
    /**
     * Get value of movieResults.
     *
     * @return List<MovieResults> value of movieResults
     */
    @NonNull
    public final List<MovieResults> getMovieResults() {
        return this.movieResults;
    }
    
    /**
     * Get value of tvResults.
     *
     * @return List<String> value of tvResults
     */
    @NonNull
    public final List<String> getTvResults() {
        return this.tvResults;
    }
    
    /**
     * Get value of tvEpisodeResults.
     *
     * @return List<String> value of tvEpisodeResults
     */
    @NonNull
    public final List<String> getTvEpisodeResults() {
        return this.tvEpisodeResults;
    }
    
    /**
     * Get value of tvSeasonResults.
     *
     * @return List<String> value of tvSeasonResults
     */
    @NonNull
    public final List<String> getTvSeasonResults() {
        return this.tvSeasonResults;
    }

    
    /**
     * Set value of personResults.
     *
     * @param personResultsParam
     */
    public final void setPersonResults(@NonNull final List<String> personResultsParam) {
        this.personResults = personResultsParam;
    }
    
    /**
     * Set value of movieResults.
     *
     * @param movieResultsParam
     */
    public final void setMovieResults(@NonNull final List<MovieResults> movieResultsParam) {
        this.movieResults = movieResultsParam;
    }
    
    /**
     * Set value of tvResults.
     *
     * @param tvResultsParam
     */
    public final void setTvResults(@NonNull final List<String> tvResultsParam) {
        this.tvResults = tvResultsParam;
    }
    
    /**
     * Set value of tvEpisodeResults.
     *
     * @param tvEpisodeResultsParam
     */
    public final void setTvEpisodeResults(@NonNull final List<String> tvEpisodeResultsParam) {
        this.tvEpisodeResults = tvEpisodeResultsParam;
    }
    
    /**
     * Set value of tvSeasonResults.
     *
     * @param tvSeasonResultsParam
     */
    public final void setTvSeasonResults(@NonNull final List<String> tvSeasonResultsParam) {
        this.tvSeasonResults = tvSeasonResultsParam;
    }
}
