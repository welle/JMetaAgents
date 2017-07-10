package aka.jmetaagents.main.jimdb.pojo.jmoviesearch;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Data {

	@Nullable
    private String q;
	@NonNull
    private List<String> fields = new ArrayList<>();
	@NonNull
    private List<Results> results = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public Data() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param qParam String
     * @param fieldsParam List<String>
     * @param resultsParam List<Results>
     */
    public Data(@Nullable final String qParam, @NonNull final List<String> fieldsParam, @NonNull final List<Results> resultsParam) {
        this.q = qParam;
        this.fields = fieldsParam;
        this.results = resultsParam;
    }
    
    /**
     * Get value of q.
     *
     * @return String value of q
     */
    @Nullable
    public final String getQ() {
        return this.q;
    }
    
    /**
     * Get value of fields.
     *
     * @return List<String> value of fields
     */
    @NonNull
    public final List<String> getFields() {
        return this.fields;
    }
    
    /**
     * Get value of results.
     *
     * @return List<Results> value of results
     */
    @NonNull
    public final List<Results> getResults() {
        return this.results;
    }

    
    /**
     * Set value of q.
     *
     * @param qParam
     */
    public final void setQ(@Nullable final String qParam) {
        this.q = qParam;
    }
    
    /**
     * Set value of fields.
     *
     * @param fieldsParam
     */
    public final void getFields(@NonNull final List<String> fieldsParam) {
        this.fields = fieldsParam;
    }
    
    /**
     * Set value of results.
     *
     * @param resultsParam
     */
    public final void getResults(@NonNull final List<Results> resultsParam) {
        this.results = resultsParam;
    }
}
