package aka.jmetaagents.main.jrottentomatoes.pojo.jmoviesearch;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMovieSearch {

	@NonNull
    private List<Movies> movies = new ArrayList<>();
	@Nullable
    private Integer total;
    @JsonProperty("link_template")
	@Nullable
    private String linkTemplate;
    @JsonProperty("links")
	@Nullable
    private Links1 links1;

	/**
     * Empty Constructor.
     */
    public JMovieSearch() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param moviesParam List<Movies>
     * @param totalParam Integer
     * @param linkTemplateParam String
     * @param links1Param Links1
     */
    public JMovieSearch(@NonNull final List<Movies> moviesParam, @Nullable final Integer totalParam, @Nullable final String linkTemplateParam, @Nullable final Links1 links1Param) {
        this.movies = moviesParam;
        this.total = totalParam;
        this.linkTemplate = linkTemplateParam;
        this.links1 = links1Param;
    }
    
    /**
     * Get value of movies.
     *
     * @return List<Movies> value of movies
     */
    @NonNull
    public final List<Movies> getMovies() {
        return this.movies;
    }
    
    /**
     * Get value of total.
     *
     * @return Integer value of total
     */
    @Nullable
    public final Integer getTotal() {
        return this.total;
    }
    
    /**
     * Get value of linkTemplate.
     *
     * @return String value of linkTemplate
     */
    @Nullable
    public final String getLinkTemplate() {
        return this.linkTemplate;
    }
    
    /**
     * Get value of links1.
     *
     * @return Links1 value of links1
     */
    @Nullable
    public final Links1 getLinks1() {
        return this.links1;
    }

    
    /**
     * Set value of movies.
     *
     * @param moviesParam
     */
    public final void getMovies(@NonNull final List<Movies> moviesParam) {
        this.movies = moviesParam;
    }
    
    /**
     * Set value of total.
     *
     * @param totalParam
     */
    public final void setTotal(@Nullable final Integer totalParam) {
        this.total = totalParam;
    }
    
    /**
     * Set value of linkTemplate.
     *
     * @param linkTemplateParam
     */
    public final void setLinkTemplate(@Nullable final String linkTemplateParam) {
        this.linkTemplate = linkTemplateParam;
    }
    
    /**
     * Set value of links1.
     *
     * @param links1Param
     */
    public final void setLinks1(@Nullable final Links1 links1Param) {
        this.links1 = links1Param;
    }
}
