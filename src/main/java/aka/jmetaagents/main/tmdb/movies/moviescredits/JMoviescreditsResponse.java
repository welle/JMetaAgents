package aka.jmetaagents.main.tmdb.movies.moviescredits;

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
public final class JMoviescreditsResponse {

	@NonNull
    private List<Cast> cast = new ArrayList<>();
	@Nullable
    private Integer id;

	/**
     * Empty Constructor.
     */
    public JMoviescreditsResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param castParam List<Cast>
     * @param idParam Integer
     */
    public JMoviescreditsResponse(@NonNull final List<Cast> castParam, @Nullable final Integer idParam) {
        this.cast = castParam;
        this.id = idParam;
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
}
