package aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseasonimage;

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
public final class JTVShowSeasonImage {

	@NonNull
    private List<Posters> posters = new ArrayList<>();
	@Nullable
    private Integer id;

	/**
     * Empty Constructor.
     */
    public JTVShowSeasonImage() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param postersParam List<Posters>
     * @param idParam Integer
     */
    public JTVShowSeasonImage(@NonNull final List<Posters> postersParam, @Nullable final Integer idParam) {
        this.posters = postersParam;
        this.id = idParam;
    }
    
    /**
     * Get value of posters.
     *
     * @return List<Posters> value of posters
     */
    @NonNull
    public final List<Posters> getPosters() {
        return this.posters;
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
     * Set value of posters.
     *
     * @param postersParam
     */
    public final void getPosters(@NonNull final List<Posters> postersParam) {
        this.posters = postersParam;
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
