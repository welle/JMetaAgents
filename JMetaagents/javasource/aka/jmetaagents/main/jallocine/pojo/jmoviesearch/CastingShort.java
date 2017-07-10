package aka.jmetaagents.main.jallocine.pojo.jmoviesearch;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class CastingShort {

	@Nullable
    private String actors;
	@Nullable
    private String directors;

	/**
     * Empty Constructor.
     */
    public CastingShort() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param actorsParam String
     * @param directorsParam String
     */
    public CastingShort(@Nullable final String actorsParam, @Nullable final String directorsParam) {
        this.actors = actorsParam;
        this.directors = directorsParam;
    }
    
    /**
     * Get value of actors.
     *
     * @return String value of actors
     */
    @Nullable
    public final String getActors() {
        return this.actors;
    }
    
    /**
     * Get value of directors.
     *
     * @return String value of directors
     */
    @Nullable
    public final String getDirectors() {
        return this.directors;
    }

    
    /**
     * Set value of actors.
     *
     * @param actorsParam
     */
    public final void setActors(@Nullable final String actorsParam) {
        this.actors = actorsParam;
    }
    
    /**
     * Set value of directors.
     *
     * @param directorsParam
     */
    public final void setDirectors(@Nullable final String directorsParam) {
        this.directors = directorsParam;
    }
}
