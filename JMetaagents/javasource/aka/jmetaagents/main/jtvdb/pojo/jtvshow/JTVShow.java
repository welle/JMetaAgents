package aka.jmetaagents.main.jtvdb.pojo.jtvshow;

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
    private Data data;

	/**
     * Empty Constructor.
     */
    public JTVShow() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dataParam Data
     */
    public JTVShow(@Nullable final Data dataParam) {
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
