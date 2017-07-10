package aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseason;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class GuestStars {

	@Nullable
    private String character;
    @JsonProperty("credit_id")
	@Nullable
    private String creditId;
	@Nullable
    private String name;
    @JsonProperty("profile_path")
	@Nullable
    private String profilePath;
	@Nullable
    private Integer id;
	@Nullable
    private Integer order;

	/**
     * Empty Constructor.
     */
    public GuestStars() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param characterParam String
     * @param creditIdParam String
     * @param nameParam String
     * @param profilePathParam String
     * @param idParam Integer
     * @param orderParam Integer
     */
    public GuestStars(@Nullable final String characterParam, @Nullable final String creditIdParam, @Nullable final String nameParam, @Nullable final String profilePathParam, @Nullable final Integer idParam, @Nullable final Integer orderParam) {
        this.character = characterParam;
        this.creditId = creditIdParam;
        this.name = nameParam;
        this.profilePath = profilePathParam;
        this.id = idParam;
        this.order = orderParam;
    }
    
    /**
     * Get value of character.
     *
     * @return String value of character
     */
    @Nullable
    public final String getCharacter() {
        return this.character;
    }
    
    /**
     * Get value of creditId.
     *
     * @return String value of creditId
     */
    @Nullable
    public final String getCreditId() {
        return this.creditId;
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
     * Get value of order.
     *
     * @return Integer value of order
     */
    @Nullable
    public final Integer getOrder() {
        return this.order;
    }

    
    /**
     * Set value of character.
     *
     * @param characterParam
     */
    public final void setCharacter(@Nullable final String characterParam) {
        this.character = characterParam;
    }
    
    /**
     * Set value of creditId.
     *
     * @param creditIdParam
     */
    public final void setCreditId(@Nullable final String creditIdParam) {
        this.creditId = creditIdParam;
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
    
    /**
     * Set value of order.
     *
     * @param orderParam
     */
    public final void setOrder(@Nullable final Integer orderParam) {
        this.order = orderParam;
    }
}
