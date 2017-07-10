package aka.jmetaagents.main.jallocine.pojo.jperson;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JPerson {

	@Nullable
    private Person person;

	/**
     * Empty Constructor.
     */
    public JPerson() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param personParam Person
     */
    public JPerson(@Nullable final Person personParam) {
        this.person = personParam;
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
     * Set value of person.
     *
     * @param personParam
     */
    public final void setPerson(@Nullable final Person personParam) {
        this.person = personParam;
    }
}
