package aka.jmetaagents.main.jallocine.pojo.jfilmography;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Person {

	@NonNull
    private List<Participation> participation = new ArrayList<>();
	@Nullable
    private Integer code;
	@Nullable
    private Name name;

	/**
     * Empty Constructor.
     */
    public Person() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param participationParam List<Participation>
     * @param codeParam Integer
     * @param nameParam Name
     */
    public Person(@NonNull final List<Participation> participationParam, @Nullable final Integer codeParam, @Nullable final Name nameParam) {
        this.participation = participationParam;
        this.code = codeParam;
        this.name = nameParam;
    }
    
    /**
     * Get value of participation.
     *
     * @return List<Participation> value of participation
     */
    @NonNull
    public final List<Participation> getParticipation() {
        return this.participation;
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
     * Get value of name.
     *
     * @return Name value of name
     */
    @Nullable
    public final Name getName() {
        return this.name;
    }

    
    /**
     * Set value of participation.
     *
     * @param participationParam
     */
    public final void getParticipation(@NonNull final List<Participation> participationParam) {
        this.participation = participationParam;
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
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final Name nameParam) {
        this.name = nameParam;
    }
}
