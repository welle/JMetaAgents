package aka.jmetaagents.main.tmdb.tv.episode.tvepisodeimages;

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
public final class JTvepisodeimagesResponse {

	@NonNull
    private List<Stills> stills = new ArrayList<>();
	@Nullable
    private Integer id;

	/**
     * Empty Constructor.
     */
    public JTvepisodeimagesResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param stillsParam List<Stills>
     * @param idParam Integer
     */
    public JTvepisodeimagesResponse(@NonNull final List<Stills> stillsParam, @Nullable final Integer idParam) {
        this.stills = stillsParam;
        this.id = idParam;
    }
    
    /**
     * Get value of stills.
     *
     * @return List<Stills> value of stills
     */
    @NonNull
    public final List<Stills> getStills() {
        return this.stills;
    }
    
    /**
     * Get value of id.
     *
     * @return Integer value of id
     */
    @Nullable
    public final Integer getId() {
        return this.id;
    }

    
    /**
     * Set value of stills.
     *
     * @param stillsParam
     */
    public final void setStills(@NonNull final List<Stills> stillsParam) {
        this.stills = stillsParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
}
