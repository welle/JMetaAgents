package aka.jmetaagents.main.tvdb.languages.languages;

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
public final class JLanguagesQuestion {

	@NonNull
    private List<Data> data = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public JLanguagesQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dataParam List<Data>
     */
    public JLanguagesQuestion(@NonNull final List<Data> dataParam) {
        this.data = dataParam;
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
     * Set value of data.
     *
     * @param dataParam
     */
    public final void setData(@NonNull final List<Data> dataParam) {
        this.data = dataParam;
    }
}
