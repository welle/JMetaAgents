package aka.jmetaagents.main.omdb.episode.episodebytitle;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JEpisodebytitleQuestion {

	@Nullable
    private Integer y;
	@Nullable
    private String title;

	/**
     * Empty Constructor.
     */
    public JEpisodebytitleQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param yParam Integer
     * @param titleParam String
     */
    public JEpisodebytitleQuestion(@Nullable final Integer yParam, @Nullable final String titleParam) {
        this.y = yParam;
        this.title = titleParam;
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
     * Get value of title.
     *
     * @return String value of title
     */
    @Nullable
    public final String getTitle() {
        return this.title;
    }

    
    /**
     * Set value of y.
     *
     * @param yParam
     */
    public final void setY(@Nullable final Integer yParam) {
        this.y = yParam;
    }
    
    /**
     * Set value of title.
     *
     * @param titleParam
     */
    public final void setTitle(@Nullable final String titleParam) {
        this.title = titleParam;
    }
}
