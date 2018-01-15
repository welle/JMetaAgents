package aka.jmetaagents.main.jtmdb.pojo.collection.jcollectionsearch;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Results {

    @JsonProperty("backdrop_path")
	@Nullable
    private String backdropPath;
	@Nullable
    private String name;
	@Nullable
    private Integer id;
    @JsonProperty("poster_path")
	@Nullable
    private String posterPath;

	/**
     * Empty Constructor.
     */
    public Results() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param backdropPathParam String
     * @param nameParam String
     * @param idParam Integer
     * @param posterPathParam String
     */
    public Results(@Nullable final String backdropPathParam, @Nullable final String nameParam, @Nullable final Integer idParam, @Nullable final String posterPathParam) {
        this.backdropPath = backdropPathParam;
        this.name = nameParam;
        this.id = idParam;
        this.posterPath = posterPathParam;
    }
    
    /**
     * Get value of backdropPath.
     *
     * @return String value of backdropPath
     */
    @Nullable
    public final String getBackdropPath() {
        return this.backdropPath;
    }
    
    /**
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
    }
    
    /**
     * Get value of id.
     *
     * @return Integer value of id
     */
    @Nullable
    public final Integer getId() {
        return this.id;
    }
    
    /**
     * Get value of posterPath.
     *
     * @return String value of posterPath
     */
    @Nullable
    public final String getPosterPath() {
        return this.posterPath;
    }

    
    /**
     * Set value of backdropPath.
     *
     * @param backdropPathParam
     */
    public final void setBackdropPath(@Nullable final String backdropPathParam) {
        this.backdropPath = backdropPathParam;
    }
    
    /**
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of posterPath.
     *
     * @param posterPathParam
     */
    public final void setPosterPath(@Nullable final String posterPathParam) {
        this.posterPath = posterPathParam;
    }
}
