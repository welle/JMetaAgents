package aka.jmetaagents.main.tmdb.movies.moviesalternativetitles;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Titles {

    @JsonProperty("iso_3166_1")
	@Nullable
    private String iso31661;
	@Nullable
    private String title;

	/**
     * Empty Constructor.
     */
    public Titles() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param iso31661Param String
     * @param titleParam String
     */
    public Titles(@Nullable final String iso31661Param, @Nullable final String titleParam) {
        this.iso31661 = iso31661Param;
        this.title = titleParam;
    }
    
    /**
     * Get value of iso31661.
     *
     * @return String value of iso31661
     */
    @Nullable
    public final String getIso31661() {
        return this.iso31661;
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
     * Set value of iso31661.
     *
     * @param iso31661Param
     */
    public final void setIso31661(@Nullable final String iso31661Param) {
        this.iso31661 = iso31661Param;
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
