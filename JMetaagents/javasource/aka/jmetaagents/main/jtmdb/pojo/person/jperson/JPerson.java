package aka.jmetaagents.main.jtmdb.pojo.person.jperson;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jtmdb.pojo.person.jperson.deserializers.DateYearMonthDayDashDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JPerson {

    @JsonProperty("also_known_as")
	@NonNull
    private List<String> alsoKnownAs = new ArrayList<>();
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date birthday;
	@Nullable
    private Integer gender;
    @JsonProperty("imdb_id")
	@Nullable
    private String imdbId;
    @JsonProperty("profile_path")
	@Nullable
    private String profilePath;
	@Nullable
    private String biography;
	@Nullable
    private String deathday;
    @JsonProperty("place_of_birth")
	@Nullable
    private String placeOfBirth;
	@Nullable
    private Double popularity;
	@Nullable
    private String name;
	@Nullable
    private Integer id;
	@Nullable
    private Boolean adult;
	@Nullable
    private String homepage;

	/**
     * Empty Constructor.
     */
    public JPerson() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param alsoKnownAsParam List<String>
     * @param birthdayParam Date
     * @param genderParam Integer
     * @param imdbIdParam String
     * @param profilePathParam String
     * @param biographyParam String
     * @param deathdayParam String
     * @param placeOfBirthParam String
     * @param popularityParam Double
     * @param nameParam String
     * @param idParam Integer
     * @param adultParam Boolean
     * @param homepageParam String
     */
    public JPerson(@NonNull final List<String> alsoKnownAsParam, @Nullable final Date birthdayParam, @Nullable final Integer genderParam, @Nullable final String imdbIdParam, @Nullable final String profilePathParam, @Nullable final String biographyParam, @Nullable final String deathdayParam, @Nullable final String placeOfBirthParam, @Nullable final Double popularityParam, @Nullable final String nameParam, @Nullable final Integer idParam, @Nullable final Boolean adultParam, @Nullable final String homepageParam) {
        this.alsoKnownAs = alsoKnownAsParam;
        this.birthday = birthdayParam;
        this.gender = genderParam;
        this.imdbId = imdbIdParam;
        this.profilePath = profilePathParam;
        this.biography = biographyParam;
        this.deathday = deathdayParam;
        this.placeOfBirth = placeOfBirthParam;
        this.popularity = popularityParam;
        this.name = nameParam;
        this.id = idParam;
        this.adult = adultParam;
        this.homepage = homepageParam;
    }
    
    /**
     * Get value of alsoKnownAs.
     *
     * @return List<String> value of alsoKnownAs
     */
    @NonNull
    public final List<String> getAlsoKnownAs() {
        return this.alsoKnownAs;
    }
    
    /**
     * Get value of birthday.
     *
     * @return Date value of birthday
     */
    @Nullable
    public final Date getBirthday() {
        return this.birthday;
    }
    
    /**
     * Get value of gender.
     *
     * @return Integer value of gender
     */
    @Nullable
    public final Integer getGender() {
        return this.gender;
    }
    
    /**
     * Get value of imdbId.
     *
     * @return String value of imdbId
     */
    @Nullable
    public final String getImdbId() {
        return this.imdbId;
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
     * Get value of biography.
     *
     * @return String value of biography
     */
    @Nullable
    public final String getBiography() {
        return this.biography;
    }
    
    /**
     * Get value of deathday.
     *
     * @return String value of deathday
     */
    @Nullable
    public final String getDeathday() {
        return this.deathday;
    }
    
    /**
     * Get value of placeOfBirth.
     *
     * @return String value of placeOfBirth
     */
    @Nullable
    public final String getPlaceOfBirth() {
        return this.placeOfBirth;
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
     * Get value of homepage.
     *
     * @return String value of homepage
     */
    @Nullable
    public final String getHomepage() {
        return this.homepage;
    }

    
    /**
     * Set value of alsoKnownAs.
     *
     * @param alsoKnownAsParam
     */
    public final void getAlsoKnownAs(@NonNull final List<String> alsoKnownAsParam) {
        this.alsoKnownAs = alsoKnownAsParam;
    }
    
    /**
     * Set value of birthday.
     *
     * @param birthdayParam
     */
    public final void setBirthday(@Nullable final Date birthdayParam) {
        this.birthday = birthdayParam;
    }
    
    /**
     * Set value of gender.
     *
     * @param genderParam
     */
    public final void setGender(@Nullable final Integer genderParam) {
        this.gender = genderParam;
    }
    
    /**
     * Set value of imdbId.
     *
     * @param imdbIdParam
     */
    public final void setImdbId(@Nullable final String imdbIdParam) {
        this.imdbId = imdbIdParam;
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
     * Set value of biography.
     *
     * @param biographyParam
     */
    public final void setBiography(@Nullable final String biographyParam) {
        this.biography = biographyParam;
    }
    
    /**
     * Set value of deathday.
     *
     * @param deathdayParam
     */
    public final void setDeathday(@Nullable final String deathdayParam) {
        this.deathday = deathdayParam;
    }
    
    /**
     * Set value of placeOfBirth.
     *
     * @param placeOfBirthParam
     */
    public final void setPlaceOfBirth(@Nullable final String placeOfBirthParam) {
        this.placeOfBirth = placeOfBirthParam;
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
    
    /**
     * Set value of homepage.
     *
     * @param homepageParam
     */
    public final void setHomepage(@Nullable final String homepageParam) {
        this.homepage = homepageParam;
    }
}
