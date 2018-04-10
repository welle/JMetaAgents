package aka.jmetaagents.main.tvdb.series.seriesidfilter;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JSeriesidfilterResponse {

	@Nullable
    private Data data;
	@Nullable
    private Errors errors;

	/**
     * Empty Constructor.
     */
    public JSeriesidfilterResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dataParam Data
     * @param errorsParam Errors
     */
    public JSeriesidfilterResponse(@Nullable final Data dataParam, @Nullable final Errors errorsParam) {
        this.data = dataParam;
        this.errors = errorsParam;
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
     * Get value of errors.
     *
     * @return Errors value of errors
     */
    @Nullable
    public final Errors getErrors() {
        return this.errors;
    }

    
    /**
     * Set value of data.
     *
     * @param dataParam
     */
    public final void setData(@Nullable final Data dataParam) {
        this.data = dataParam;
    }
    
    /**
     * Set value of errors.
     *
     * @param errorsParam
     */
    public final void setErrors(@Nullable final Errors errorsParam) {
        this.errors = errorsParam;
    }
}
