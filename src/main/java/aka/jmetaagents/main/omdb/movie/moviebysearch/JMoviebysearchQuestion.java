package aka.jmetaagents.main.omdb.movie.moviebysearch;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMoviebysearchQuestion {

	@Nullable
    private Integer y;
	@Nullable
    private Integer page;
	@Nullable
    private String title;

	/**
     * Empty Constructor.
     */
    public JMoviebysearchQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param yParam Integer
     * @param pageParam Integer
     * @param titleParam String
     */
    public JMoviebysearchQuestion(@Nullable final Integer yParam, @Nullable final Integer pageParam, @Nullable final String titleParam) {
        this.y = yParam;
        this.page = pageParam;
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
     * Get value of page.
     *
     * @return Integer value of page
     */
    @Nullable
    public final Integer getPage() {
        return this.page;
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
     * Set value of page.
     *
     * @param pageParam
     */
    public final void setPage(@Nullable final Integer pageParam) {
        this.page = pageParam;
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
