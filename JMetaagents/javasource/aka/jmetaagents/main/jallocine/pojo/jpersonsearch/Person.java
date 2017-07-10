package aka.jmetaagents.main.jallocine.pojo.jpersonsearch;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jallocine.pojo.jpersonsearch.deserializers.DateYearMonthDayDashDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Person {

	@Nullable
    private String realName;
	@Nullable
    private Integer code;
	@Nullable
    private Integer gender;
	@NonNull
    private List<Activity> activity = new ArrayList<>();
	@NonNull
    private List<Nationality> nationality = new ArrayList<>();
	@Nullable
    private String name;
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date deathDate;
	@NonNull
    private List<Link> link = new ArrayList<>();
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date birthDate;
	@Nullable
    private Picture picture;

	/**
     * Empty Constructor.
     */
    public Person() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param realNameParam String
     * @param codeParam Integer
     * @param genderParam Integer
     * @param activityParam List<Activity>
     * @param nationalityParam List<Nationality>
     * @param nameParam String
     * @param deathDateParam Date
     * @param linkParam List<Link>
     * @param birthDateParam Date
     * @param pictureParam Picture
     */
    public Person(@Nullable final String realNameParam, @Nullable final Integer codeParam, @Nullable final Integer genderParam, @NonNull final List<Activity> activityParam, @NonNull final List<Nationality> nationalityParam, @Nullable final String nameParam, @Nullable final Date deathDateParam, @NonNull final List<Link> linkParam, @Nullable final Date birthDateParam, @Nullable final Picture pictureParam) {
        this.realName = realNameParam;
        this.code = codeParam;
        this.gender = genderParam;
        this.activity = activityParam;
        this.nationality = nationalityParam;
        this.name = nameParam;
        this.deathDate = deathDateParam;
        this.link = linkParam;
        this.birthDate = birthDateParam;
        this.picture = pictureParam;
    }
    
    /**
     * Get value of realName.
     *
     * @return String value of realName
     */
    @Nullable
    public final String getRealName() {
        return this.realName;
    }
    
    /**
     * Get value of code.
     *
     * @return Integer value of code
     */
    @Nullable
    public final Integer getCode() {
        return this.code;
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
     * Get value of activity.
     *
     * @return List<Activity> value of activity
     */
    @NonNull
    public final List<Activity> getActivity() {
        return this.activity;
    }
    
    /**
     * Get value of nationality.
     *
     * @return List<Nationality> value of nationality
     */
    @NonNull
    public final List<Nationality> getNationality() {
        return this.nationality;
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
     * Get value of deathDate.
     *
     * @return Date value of deathDate
     */
    @Nullable
    public final Date getDeathDate() {
        return this.deathDate;
    }
    
    /**
     * Get value of link.
     *
     * @return List<Link> value of link
     */
    @NonNull
    public final List<Link> getLink() {
        return this.link;
    }
    
    /**
     * Get value of birthDate.
     *
     * @return Date value of birthDate
     */
    @Nullable
    public final Date getBirthDate() {
        return this.birthDate;
    }
    
    /**
     * Get value of picture.
     *
     * @return Picture value of picture
     */
    @Nullable
    public final Picture getPicture() {
        return this.picture;
    }

    
    /**
     * Set value of realName.
     *
     * @param realNameParam
     */
    public final void setRealName(@Nullable final String realNameParam) {
        this.realName = realNameParam;
    }
    
    /**
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final Integer codeParam) {
        this.code = codeParam;
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
     * Set value of activity.
     *
     * @param activityParam
     */
    public final void getActivity(@NonNull final List<Activity> activityParam) {
        this.activity = activityParam;
    }
    
    /**
     * Set value of nationality.
     *
     * @param nationalityParam
     */
    public final void getNationality(@NonNull final List<Nationality> nationalityParam) {
        this.nationality = nationalityParam;
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
     * Set value of deathDate.
     *
     * @param deathDateParam
     */
    public final void setDeathDate(@Nullable final Date deathDateParam) {
        this.deathDate = deathDateParam;
    }
    
    /**
     * Set value of link.
     *
     * @param linkParam
     */
    public final void getLink(@NonNull final List<Link> linkParam) {
        this.link = linkParam;
    }
    
    /**
     * Set value of birthDate.
     *
     * @param birthDateParam
     */
    public final void setBirthDate(@Nullable final Date birthDateParam) {
        this.birthDate = birthDateParam;
    }
    
    /**
     * Set value of picture.
     *
     * @param pictureParam
     */
    public final void setPicture(@Nullable final Picture pictureParam) {
        this.picture = pictureParam;
    }
}
