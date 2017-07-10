package aka.jmetaagents.main.jallocine.pojo.jtvshowepisode;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTVShowEpisode {

	@Nullable
    private Episode episode;

	/**
     * Empty Constructor.
     */
    public JTVShowEpisode() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param episodeParam Episode
     */
    public JTVShowEpisode(@Nullable final Episode episodeParam) {
        this.episode = episodeParam;
    }
    
    /**
     * Get value of episode.
     *
     * @return Episode value of episode
     */
    @Nullable
    public final Episode getEpisode() {
        return this.episode;
    }

    
    /**
     * Set value of episode.
     *
     * @param episodeParam
     */
    public final void setEpisode(@Nullable final Episode episodeParam) {
        this.episode = episodeParam;
    }
}
