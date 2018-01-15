package aka.jmetaagents.main.jtvdb.pojo.jtvshowepisode;

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
    private Data data;

	/**
     * Empty Constructor.
     */
    public JTVShowEpisode() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dataParam Data
     */
    public JTVShowEpisode(@Nullable final Data dataParam) {
        this.data = dataParam;
    }
    
    /**
     * Get value of data.
     *
     * @return Data value of data
     */
    @Nullable
    public final Data getData() {
        return this.data;
    }

    
    /**
     * Set value of data.
     *
     * @param dataParam
     */
    public final void setData(@Nullable final Data dataParam) {
        this.data = dataParam;
    }
}
