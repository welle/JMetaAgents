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
public final class Participation {

    @JsonProperty("activity")
	@Nullable
    private Activity1 activity1;
	@Nullable
    private String role;
	@Nullable
    private Movie movie;

	/**
     * Empty Constructor.
     */
    public Participation() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param activity1Param Activity1
     * @param roleParam String
     * @param movieParam Movie
     */
    public Participation(@Nullable final Activity1 activity1Param, @Nullable final String roleParam, @Nullable final Movie movieParam) {
        this.activity1 = activity1Param;
        this.role = roleParam;
        this.movie = movieParam;
    }
    
    /**
     * Get value of activity1.
     *
     * @return Activity1 value of activity1
     */
    @Nullable
    public final Activity1 getActivity1() {
        return this.activity1;
    }
    
    /**
     * Get value of role.
     *
     * @return String value of role
     */
    @Nullable
    public final String getRole() {
        return this.role;
    }
    
    /**
     * Get value of movie.
     *
     * @return Movie value of movie
     */
    @Nullable
    public final Movie getMovie() {
        return this.movie;
    }

    
    /**
     * Set value of activity1.
     *
     * @param activity1Param
     */
    public final void setActivity1(@Nullable final Activity1 activity1Param) {
        this.activity1 = activity1Param;
    }
    
    /**
     * Set value of role.
     *
     * @param roleParam
     */
    public final void setRole(@Nullable final String roleParam) {
        this.role = roleParam;
    }
    
    /**
     * Set value of movie.
     *
     * @param movieParam
     */
    public final void setMovie(@Nullable final Movie movieParam) {
        this.movie = movieParam;
    }
}
