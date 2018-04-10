package aka.jmetaagents.main.tmdb.tv.season.tvseasoncredits;

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
public final class JTvseasoncreditsResponse {

	@NonNull
    private List<Cast> cast = new ArrayList<>();
	@Nullable
    private Integer id;
	@NonNull
    private List<Crew> crew = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public JTvseasoncreditsResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param castParam List<Cast>
     * @param idParam Integer
     * @param crewParam List<Crew>
     */
    public JTvseasoncreditsResponse(@NonNull final List<Cast> castParam, @Nullable final Integer idParam, @NonNull final List<Crew> crewParam) {
        this.cast = castParam;
        this.id = idParam;
        this.crew = crewParam;
    }
    
    /**
     * Get value of cast.
     *
     * @return List<Cast> value of cast
     */
    @NonNull
    public final List<Cast> getCast() {
        return this.cast;
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
     * Get value of crew.
     *
     * @return List<Crew> value of crew
     */
    @NonNull
    public final List<Crew> getCrew() {
        return this.crew;
    }

    
    /**
     * Set value of cast.
     *
     * @param castParam
     */
    public final void setCast(@NonNull final List<Cast> castParam) {
        this.cast = castParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of crew.
     *
     * @param crewParam
     */
    public final void setCrew(@NonNull final List<Crew> crewParam) {
        this.crew = crewParam;
    }
}
