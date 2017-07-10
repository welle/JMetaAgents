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
public final class Subject {

    @JsonProperty("movie")
	@Nullable
    private Movie2 movie2;

	/**
     * Empty Constructor.
     */
    public Subject() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param movie2Param Movie2
     */
    public Subject(@Nullable final Movie2 movie2Param) {
        this.movie2 = movie2Param;
    }
    
    /**
     * Get value of movie2.
     *
     * @return Movie2 value of movie2
     */
    @Nullable
    public final Movie2 getMovie2() {
        return this.movie2;
    }

    
    /**
     * Set value of movie2.
     *
     * @param movie2Param
     */
    public final void setMovie2(@Nullable final Movie2 movie2Param) {
        this.movie2 = movie2Param;
    }
}
