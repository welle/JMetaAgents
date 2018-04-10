package aka.jmetaagents.main.tvdb.series.seriesidfilterparams;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JSeriesidfilterparamsResponse {

	@NonNull
    private List<String> data = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public JSeriesidfilterparamsResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dataParam List<String>
     */
    public JSeriesidfilterparamsResponse(@NonNull final List<String> dataParam) {
        this.data = dataParam;
    }
    
    /**
     * Get value of data.
     *
     * @return List<String> value of data
     */
    @NonNull
    public final List<String> getData() {
        return this.data;
    }

    
    /**
     * Set value of data.
     *
     * @param dataParam
     */
    public final void setData(@NonNull final List<String> dataParam) {
        this.data = dataParam;
    }
}
