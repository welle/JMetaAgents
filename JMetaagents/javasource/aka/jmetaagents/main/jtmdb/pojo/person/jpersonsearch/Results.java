package aka.jmetaagents.main.jtmdb.pojo.person.jpersonsearch;

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
public final class Results {

    @JsonProperty("known_for")
	@NonNull
    private List<KnownFor> knownFor = new ArrayList<>();
	@Nullable
    private Double popularity;
	@Nullable
    private String name;
    @JsonProperty("profile_path")
	@Nullable
    private String profilePath;
	@Nullable
    private Integer id;
	@Nullable
    private Boolean adult;

	/**
     * Empty Constructor.
     */
    public Results() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param knownForParam List<KnownFor>
     * @param popularityParam Double
     * @param nameParam String
     * @param profilePathParam String
     * @param idParam Integer
     * @param adultParam Boolean
     */
    public Results(@NonNull final List<KnownFor> knownForParam, @Nullable final Double popularityParam, @Nullable final String nameParam, @Nullable final String profilePathParam, @Nullable final Integer idParam, @Nullable final Boolean adultParam) {
        this.knownFor = knownForParam;
        this.popularity = popularityParam;
        this.name = nameParam;
        this.profilePath = profilePathParam;
        this.id = idParam;
        this.adult = adultParam;
    }
    
    /**
     * Get value of knownFor.
     *
     * @return List<KnownFor> value of knownFor
     */
    @NonNull
    public final List<KnownFor> getKnownFor() {
        return this.knownFor;
    }
    
    /**
     * Get value of popularity.
     *
     * @return Double value of popularity
     */
    @Nullable
    public final Double getPopularity() {
        return this.popularity;
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
     * Get value of adult.
     *
     * @return Boolean value of adult
     */
    @Nullable
    public final Boolean getAdult() {
        return this.adult;
    }

    
    /**
     * Set value of knownFor.
     *
     * @param knownForParam
     */
    public final void getKnownFor(@NonNull final List<KnownFor> knownForParam) {
        this.knownFor = knownForParam;
    }
    
    /**
     * Set value of popularity.
     *
     * @param popularityParam
     */
    public final void setPopularity(@Nullable final Double popularityParam) {
        this.popularity = popularityParam;
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
     * Set value of adult.
     *
     * @param adultParam
     */
    public final void setAdult(@Nullable final Boolean adultParam) {
        this.adult = adultParam;
    }
}
