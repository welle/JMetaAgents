package aka.jmetaagents.main.jimdb.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class DirectorsSummary {

    @JsonProperty("name")
	@Nullable
    private Name1 name1;

	/**
     * Empty Constructor.
     */
    public DirectorsSummary() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param name1Param Name1
     */
    public DirectorsSummary(@Nullable final Name1 name1Param) {
        this.name1 = name1Param;
    }
    
    /**
     * Get value of name1.
     *
     * @return Name1 value of name1
     */
    @Nullable
    public final Name1 getName1() {
        return this.name1;
    }

    
    /**
     * Set value of name1.
     *
     * @param name1Param
     */
    public final void setName1(@Nullable final Name1 name1Param) {
        this.name1 = name1Param;
    }
}
