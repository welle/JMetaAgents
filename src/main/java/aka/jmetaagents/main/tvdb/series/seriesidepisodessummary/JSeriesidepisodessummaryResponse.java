package aka.jmetaagents.main.tvdb.series.seriesidepisodessummary;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JSeriesidepisodessummaryResponse {

	@Nullable
    private String dvdEpisodes;
	@NonNull
    private List<String> dvdSeasons = new ArrayList<>();
	@NonNull
    private List<String> airedSeasons = new ArrayList<>();
	@Nullable
    private String airedEpisodes;

	/**
     * Empty Constructor.
     */
    public JSeriesidepisodessummaryResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dvdEpisodesParam String
     * @param dvdSeasonsParam List<String>
     * @param airedSeasonsParam List<String>
     * @param airedEpisodesParam String
     */
    public JSeriesidepisodessummaryResponse(@Nullable final String dvdEpisodesParam, @NonNull final List<String> dvdSeasonsParam, @NonNull final List<String> airedSeasonsParam, @Nullable final String airedEpisodesParam) {
        this.dvdEpisodes = dvdEpisodesParam;
        this.dvdSeasons = dvdSeasonsParam;
        this.airedSeasons = airedSeasonsParam;
        this.airedEpisodes = airedEpisodesParam;
    }
    
    /**
     * Get value of dvdEpisodes.
     *
     * @return String value of dvdEpisodes
     */
    @Nullable
    public final String getDvdEpisodes() {
        return this.dvdEpisodes;
    }
    
    /**
     * Get value of dvdSeasons.
     *
     * @return List<String> value of dvdSeasons
     */
    @NonNull
    public final List<String> getDvdSeasons() {
        return this.dvdSeasons;
    }
    
    /**
     * Get value of airedSeasons.
     *
     * @return List<String> value of airedSeasons
     */
    @NonNull
    public final List<String> getAiredSeasons() {
        return this.airedSeasons;
    }
    
    /**
     * Get value of airedEpisodes.
     *
     * @return String value of airedEpisodes
     */
    @Nullable
    public final String getAiredEpisodes() {
        return this.airedEpisodes;
    }

    
    /**
     * Set value of dvdEpisodes.
     *
     * @param dvdEpisodesParam
     */
    public final void setDvdEpisodes(@Nullable final String dvdEpisodesParam) {
        this.dvdEpisodes = dvdEpisodesParam;
    }
    
    /**
     * Set value of dvdSeasons.
     *
     * @param dvdSeasonsParam
     */
    public final void setDvdSeasons(@NonNull final List<String> dvdSeasonsParam) {
        this.dvdSeasons = dvdSeasonsParam;
    }
    
    /**
     * Set value of airedSeasons.
     *
     * @param airedSeasonsParam
     */
    public final void setAiredSeasons(@NonNull final List<String> airedSeasonsParam) {
        this.airedSeasons = airedSeasonsParam;
    }
    
    /**
     * Set value of airedEpisodes.
     *
     * @param airedEpisodesParam
     */
    public final void setAiredEpisodes(@Nullable final String airedEpisodesParam) {
        this.airedEpisodes = airedEpisodesParam;
    }
}
