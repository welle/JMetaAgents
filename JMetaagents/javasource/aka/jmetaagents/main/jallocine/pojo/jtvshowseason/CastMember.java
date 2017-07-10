package aka.jmetaagents.main.jallocine.pojo.jtvshowseason;

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
public final class CastMember {

    @JsonProperty("episode")
	@NonNull
    private List<Episode1> episode1 = new ArrayList<>();
	@Nullable
    private String role;
	@Nullable
    private Activity activity;
	@Nullable
    private Person person;
    @JsonProperty("picture")
	@Nullable
    private Picture1 picture1;
	@Nullable
    private Integer isLeadActor;

	/**
     * Empty Constructor.
     */
    public CastMember() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param episode1Param List<Episode1>
     * @param roleParam String
     * @param activityParam Activity
     * @param personParam Person
     * @param picture1Param Picture1
     * @param isLeadActorParam Integer
     */
    public CastMember(@NonNull final List<Episode1> episode1Param, @Nullable final String roleParam, @Nullable final Activity activityParam, @Nullable final Person personParam, @Nullable final Picture1 picture1Param, @Nullable final Integer isLeadActorParam) {
        this.episode1 = episode1Param;
        this.role = roleParam;
        this.activity = activityParam;
        this.person = personParam;
        this.picture1 = picture1Param;
        this.isLeadActor = isLeadActorParam;
    }
    
    /**
     * Get value of episode1.
     *
     * @return List<Episode1> value of episode1
     */
    @NonNull
    public final List<Episode1> getEpisode1() {
        return this.episode1;
    }
    
    /**
     * Get value of role.
     *
     * @return String value of role
     */
    @Nullable
    public final String getRole() {
        return this.role;
    }
    
    /**
     * Get value of activity.
     *
     * @return Activity value of activity
     */
    @Nullable
    public final Activity getActivity() {
        return this.activity;
    }
    
    /**
     * Get value of person.
     *
     * @return Person value of person
     */
    @Nullable
    public final Person getPerson() {
        return this.person;
    }
    
    /**
     * Get value of picture1.
     *
     * @return Picture1 value of picture1
     */
    @Nullable
    public final Picture1 getPicture1() {
        return this.picture1;
    }
    
    /**
     * Get value of isLeadActor.
     *
     * @return Integer value of isLeadActor
     */
    @Nullable
    public final Integer getIsLeadActor() {
        return this.isLeadActor;
    }

    
    /**
     * Set value of episode1.
     *
     * @param episode1Param
     */
    public final void getEpisode1(@NonNull final List<Episode1> episode1Param) {
        this.episode1 = episode1Param;
    }
    
    /**
     * Set value of role.
     *
     * @param roleParam
     */
    public final void setRole(@Nullable final String roleParam) {
        this.role = roleParam;
    }
    
    /**
     * Set value of activity.
     *
     * @param activityParam
     */
    public final void setActivity(@Nullable final Activity activityParam) {
        this.activity = activityParam;
    }
    
    /**
     * Set value of person.
     *
     * @param personParam
     */
    public final void setPerson(@Nullable final Person personParam) {
        this.person = personParam;
    }
    
    /**
     * Set value of picture1.
     *
     * @param picture1Param
     */
    public final void setPicture1(@Nullable final Picture1 picture1Param) {
        this.picture1 = picture1Param;
    }
    
    /**
     * Set value of isLeadActor.
     *
     * @param isLeadActorParam
     */
    public final void setIsLeadActor(@Nullable final Integer isLeadActorParam) {
        this.isLeadActor = isLeadActorParam;
    }
}
