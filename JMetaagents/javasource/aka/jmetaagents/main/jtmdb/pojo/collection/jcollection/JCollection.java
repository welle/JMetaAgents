package aka.jmetaagents.main.jtmdb.pojo.collection.jcollection;

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
public final class JCollection {

    @JsonProperty("backdrop_path")
	@Nullable
    private String backdropPath;
	@Nullable
    private String overview;
	@Nullable
    private String name;
	@NonNull
    private List<Parts> parts = new ArrayList<>();
	@Nullable
    private Integer id;
    @JsonProperty("poster_path")
	@Nullable
    private String posterPath;

	/**
     * Empty Constructor.
     */
    public JCollection() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param backdropPathParam String
     * @param overviewParam String
     * @param nameParam String
     * @param partsParam List<Parts>
     * @param idParam Integer
     * @param posterPathParam String
     */
    public JCollection(@Nullable final String backdropPathParam, @Nullable final String overviewParam, @Nullable final String nameParam, @NonNull final List<Parts> partsParam, @Nullable final Integer idParam, @Nullable final String posterPathParam) {
        this.backdropPath = backdropPathParam;
        this.overview = overviewParam;
        this.name = nameParam;
        this.parts = partsParam;
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
     * Get value of overview.
     *
     * @return String value of overview
     */
    @Nullable
    public final String getOverview() {
        return this.overview;
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
     * Get value of parts.
     *
     * @return List<Parts> value of parts
     */
    @NonNull
    public final List<Parts> getParts() {
        return this.parts;
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
     * Set value of overview.
     *
     * @param overviewParam
     */
    public final void setOverview(@Nullable final String overviewParam) {
        this.overview = overviewParam;
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
     * Set value of parts.
     *
     * @param partsParam
     */
    public final void getParts(@NonNull final List<Parts> partsParam) {
        this.parts = partsParam;
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
