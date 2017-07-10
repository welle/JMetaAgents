package aka.jmetaagents.main.jallocine.pojo.jtvshowssearch;

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
    private String creators;

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
     * @param creatorsParam String
     */
    public CastingShort(@Nullable final String actorsParam, @Nullable final String creatorsParam) {
        this.actors = actorsParam;
        this.creators = creatorsParam;
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
     * Get value of creators.
     *
     * @return String value of creators
     */
    @Nullable
    public final String getCreators() {
        return this.creators;
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
     * Set value of creators.
     *
     * @param creatorsParam
     */
    public final void setCreators(@Nullable final String creatorsParam) {
        this.creators = creatorsParam;
    }
}
