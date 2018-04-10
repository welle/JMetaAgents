package aka.jmetaagents.main.tvdb.series.seriesidimages;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JSeriesidimagesResponse {

	@Nullable
    private Data data;

	/**
     * Empty Constructor.
     */
    public JSeriesidimagesResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dataParam Data
     */
    public JSeriesidimagesResponse(@Nullable final Data dataParam) {
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
