package aka.jmetaagents.main.jallocine.pojo.jperson;

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

    @JsonProperty("person")
	@Nullable
    private Person1 person1;
	@Nullable
    private Activity activity;

	/**
     * Empty Constructor.
     */
    public CastMember() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param person1Param Person1
     * @param activityParam Activity
     */
    public CastMember(@Nullable final Person1 person1Param, @Nullable final Activity activityParam) {
        this.person1 = person1Param;
        this.activity = activityParam;
    }
    
    /**
     * Get value of person1.
     *
     * @return Person1 value of person1
     */
    @Nullable
    public final Person1 getPerson1() {
        return this.person1;
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
     * Set value of person1.
     *
     * @param person1Param
     */
    public final void setPerson1(@Nullable final Person1 person1Param) {
        this.person1 = person1Param;
    }
    
    /**
     * Set value of activity.
     *
     * @param activityParam
     */
    public final void setActivity(@Nullable final Activity activityParam) {
        this.activity = activityParam;
    }
}
