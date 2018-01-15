package aka.jmetaagents.main.jallocine.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMovie {

	@Nullable
    private Movie movie;

	/**
     * Empty Constructor.
     */
    public JMovie() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param movieParam Movie
     */
    public JMovie(@Nullable final Movie movieParam) {
        this.movie = movieParam;
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
     * Set value of movie.
     *
     * @param movieParam
     */
    public final void setMovie(@Nullable final Movie movieParam) {
        this.movie = movieParam;
    }
}
