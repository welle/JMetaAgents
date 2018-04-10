package aka.jmetaagents.main.tvdb.series.seriesidactors;

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
public final class JSeriesidactorsResponse {

	@NonNull
    private List<Data> data = new ArrayList<>();
	@Nullable
    private Errors errors;

	/**
     * Empty Constructor.
     */
    public JSeriesidactorsResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dataParam List<Data>
     * @param errorsParam Errors
     */
    public JSeriesidactorsResponse(@NonNull final List<Data> dataParam, @Nullable final Errors errorsParam) {
        this.data = dataParam;
        this.errors = errorsParam;
    }
    
    /**
     * Get value of data.
     *
     * @return List<Data> value of data
     */
    @NonNull
    public final List<Data> getData() {
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
    public final void setData(@NonNull final List<Data> dataParam) {
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
