package aka.jmetaagents.main.jallocine.pojo.jtvshow;

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
     * @param roleParam String
     * @param activityParam Activity
     * @param personParam Person
     * @param picture1Param Picture1
     * @param isLeadActorParam Integer
     */
    public CastMember(@Nullable final String roleParam, @Nullable final Activity activityParam, @Nullable final Person personParam, @Nullable final Picture1 picture1Param, @Nullable final Integer isLeadActorParam) {
        this.role = roleParam;
        this.activity = activityParam;
        this.person = personParam;
        this.picture1 = picture1Param;
        this.isLeadActor = isLeadActorParam;
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
