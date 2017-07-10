package aka.jmetaagents.main.jallocine.pojo.jperson;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Entities {

    @JsonProperty("movie")
	@Nullable
    private Movie1 movie1;

	/**
     * Empty Constructor.
     */
    public Entities() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param movie1Param Movie1
     */
    public Entities(@Nullable final Movie1 movie1Param) {
        this.movie1 = movie1Param;
    }
    
    /**
     * Get value of movie1.
     *
     * @return Movie1 value of movie1
     */
    @Nullable
    public final Movie1 getMovie1() {
        return this.movie1;
    }

    
    /**
     * Set value of movie1.
     *
     * @param movie1Param
     */
    public final void setMovie1(@Nullable final Movie1 movie1Param) {
        this.movie1 = movie1Param;
    }
}
