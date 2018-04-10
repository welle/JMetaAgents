package aka.jmetaagents.main.tvdb.series.seriesidepisodesqueryparams;

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
public final class JSeriesidepisodesqueryparamsResponse {

	@NonNull
    private List<String> data = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public JSeriesidepisodesqueryparamsResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dataParam List<String>
     */
    public JSeriesidepisodesqueryparamsResponse(@NonNull final List<String> dataParam) {
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
