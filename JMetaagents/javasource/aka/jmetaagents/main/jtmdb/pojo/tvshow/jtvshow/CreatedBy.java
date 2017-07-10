package aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshow;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class CreatedBy {

	@Nullable
    private String name;
    @JsonProperty("profile_path")
	@Nullable
    private String profilePath;
	@Nullable
    private Integer id;

	/**
     * Empty Constructor.
     */
    public CreatedBy() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param nameParam String
     * @param profilePathParam String
     * @param idParam Integer
     */
    public CreatedBy(@Nullable final String nameParam, @Nullable final String profilePathParam, @Nullable final Integer idParam) {
        this.name = nameParam;
        this.profilePath = profilePathParam;
        this.id = idParam;
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
     * Get value of profilePath.
     *
     * @return String value of profilePath
     */
    @Nullable
    public final String getProfilePath() {
        return this.profilePath;
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
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
    }
    
    /**
     * Set value of profilePath.
     *
     * @param profilePathParam
     */
    public final void setProfilePath(@Nullable final String profilePathParam) {
        this.profilePath = profilePathParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
}
