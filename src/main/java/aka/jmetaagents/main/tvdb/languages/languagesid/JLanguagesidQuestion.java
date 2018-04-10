package aka.jmetaagents.main.tvdb.languages.languagesid;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JLanguagesidQuestion {

	@Nullable
    private Integer id;

	/**
     * Empty Constructor.
     */
    public JLanguagesidQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param idParam Integer
     */
    public JLanguagesidQuestion(@Nullable final Integer idParam) {
        this.id = idParam;
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
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
}
