package aka.jmetaagents.main.jtvdb.pojo.jtvshowepisode;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Language {

	@Nullable
    private String overview;
	@Nullable
    private String episodeName;

	/**
     * Empty Constructor.
     */
    public Language() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param overviewParam String
     * @param episodeNameParam String
     */
    public Language(@Nullable final String overviewParam, @Nullable final String episodeNameParam) {
        this.overview = overviewParam;
        this.episodeName = episodeNameParam;
    }
    
    /**
     * Get value of overview.
     *
     * @return String value of overview
     */
    @Nullable
    public final String getOverview() {
        return this.overview;
    }
    
    /**
     * Get value of episodeName.
     *
     * @return String value of episodeName
     */
    @Nullable
    public final String getEpisodeName() {
        return this.episodeName;
    }

    
    /**
     * Set value of overview.
     *
     * @param overviewParam
     */
    public final void setOverview(@Nullable final String overviewParam) {
        this.overview = overviewParam;
    }
    
    /**
     * Set value of episodeName.
     *
     * @param episodeNameParam
     */
    public final void setEpisodeName(@Nullable final String episodeNameParam) {
        this.episodeName = episodeNameParam;
    }
}
