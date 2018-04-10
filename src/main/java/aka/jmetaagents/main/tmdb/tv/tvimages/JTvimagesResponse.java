package aka.jmetaagents.main.tmdb.tv.tvimages;

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
public final class JTvimagesResponse {

	@NonNull
    private List<Backdrops> backdrops = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public JTvimagesResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param backdropsParam List<Backdrops>
     */
    public JTvimagesResponse(@NonNull final List<Backdrops> backdropsParam) {
        this.backdrops = backdropsParam;
    }
    
    /**
     * Get value of backdrops.
     *
     * @return List<Backdrops> value of backdrops
     */
    @NonNull
    public final List<Backdrops> getBackdrops() {
        return this.backdrops;
    }

    
    /**
     * Set value of backdrops.
     *
     * @param backdropsParam
     */
    public final void setBackdrops(@NonNull final List<Backdrops> backdropsParam) {
        this.backdrops = backdropsParam;
    }
}
