package aka.jmetaagents.main.tvdb.series.seriesidepisodes;

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
public final class JSeriesidepisodesResponse {

	@NonNull
    private List<Data> data = new ArrayList<>();
	@Nullable
    private Links links;
	@Nullable
    private Errors errors;

	/**
     * Empty Constructor.
     */
    public JSeriesidepisodesResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dataParam List<Data>
     * @param linksParam Links
     * @param errorsParam Errors
     */
    public JSeriesidepisodesResponse(@NonNull final List<Data> dataParam, @Nullable final Links linksParam, @Nullable final Errors errorsParam) {
        this.data = dataParam;
        this.links = linksParam;
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
     * Get value of links.
     *
     * @return Links value of links
     */
    @Nullable
    public final Links getLinks() {
        return this.links;
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
     * Set value of links.
     *
     * @param linksParam
     */
    public final void setLinks(@Nullable final Links linksParam) {
        this.links = linksParam;
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
