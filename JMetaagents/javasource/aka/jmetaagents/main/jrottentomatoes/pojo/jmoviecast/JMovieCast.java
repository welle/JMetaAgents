package aka.jmetaagents.main.jrottentomatoes.pojo.jmoviecast;

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
public final class JMovieCast {

	@NonNull
    private List<Cast> cast = new ArrayList<>();
	@Nullable
    private Links links;

	/**
     * Empty Constructor.
     */
    public JMovieCast() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param castParam List<Cast>
     * @param linksParam Links
     */
    public JMovieCast(@NonNull final List<Cast> castParam, @Nullable final Links linksParam) {
        this.cast = castParam;
        this.links = linksParam;
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
     * Get value of links.
     *
     * @return Links value of links
     */
    @Nullable
    public final Links getLinks() {
        return this.links;
    }

    
    /**
     * Set value of cast.
     *
     * @param castParam
     */
    public final void getCast(@NonNull final List<Cast> castParam) {
        this.cast = castParam;
    }
    
    /**
     * Set value of links.
     *
     * @param linksParam
     */
    public final void setLinks(@Nullable final Links linksParam) {
        this.links = linksParam;
    }
}
