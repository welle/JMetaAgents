package aka.jmetaagents.main.omdb.episode.episodebyidimdb;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JEpisodebyidimdbQuestion {

	@Nullable
    private Integer imdbid;
	@Nullable
    private Integer y;

	/**
     * Empty Constructor.
     */
    public JEpisodebyidimdbQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param imdbidParam Integer
     * @param yParam Integer
     */
    public JEpisodebyidimdbQuestion(@Nullable final Integer imdbidParam, @Nullable final Integer yParam) {
        this.imdbid = imdbidParam;
        this.y = yParam;
    }
    
    /**
     * Get value of imdbid.
     *
     * @return Integer value of imdbid
     */
    @Nullable
    public final Integer getImdbid() {
        return this.imdbid;
    }
    
    /**
     * Get value of y.
     *
     * @return Integer value of y
     */
    @Nullable
    public final Integer getY() {
        return this.y;
    }

    
    /**
     * Set value of imdbid.
     *
     * @param imdbidParam
     */
    public final void setImdbid(@Nullable final Integer imdbidParam) {
        this.imdbid = imdbidParam;
    }
    
    /**
     * Set value of y.
     *
     * @param yParam
     */
    public final void setY(@Nullable final Integer yParam) {
        this.y = yParam;
    }
}
