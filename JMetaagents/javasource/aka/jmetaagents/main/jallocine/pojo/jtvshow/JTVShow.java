package aka.jmetaagents.main.jallocine.pojo.jtvshow;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTVShow {

	@Nullable
    private Tvseries tvseries;

	/**
     * Empty Constructor.
     */
    public JTVShow() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param tvseriesParam Tvseries
     */
    public JTVShow(@Nullable final Tvseries tvseriesParam) {
        this.tvseries = tvseriesParam;
    }
    
    /**
     * Get value of tvseries.
     *
     * @return Tvseries value of tvseries
     */
    @Nullable
    public final Tvseries getTvseries() {
        return this.tvseries;
    }

    
    /**
     * Set value of tvseries.
     *
     * @param tvseriesParam
     */
    public final void setTvseries(@Nullable final Tvseries tvseriesParam) {
        this.tvseries = tvseriesParam;
    }
}
