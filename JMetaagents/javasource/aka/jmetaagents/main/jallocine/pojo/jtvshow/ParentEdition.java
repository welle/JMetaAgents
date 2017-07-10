package aka.jmetaagents.main.jallocine.pojo.jtvshow;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jallocine.pojo.jtvshow.deserializers.DateYearDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class ParentEdition {

	@Nullable
    private Integer code;
    @JsonDeserialize(using = DateYearDeserializer.class)
    private Date name;

	/**
     * Empty Constructor.
     */
    public ParentEdition() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param nameParam Date
     */
    public ParentEdition(@Nullable final Integer codeParam, @Nullable final Date nameParam) {
        this.code = codeParam;
        this.name = nameParam;
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
     * @return Date value of name
     */
    @Nullable
    public final Date getName() {
        return this.name;
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
    public final void setName(@Nullable final Date nameParam) {
        this.name = nameParam;
    }
}
