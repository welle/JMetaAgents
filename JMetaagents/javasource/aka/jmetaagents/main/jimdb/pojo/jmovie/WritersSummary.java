package aka.jmetaagents.main.jimdb.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class WritersSummary {

	@Nullable
    private Name name;
	@Nullable
    private String attr;

	/**
     * Empty Constructor.
     */
    public WritersSummary() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param nameParam Name
     * @param attrParam String
     */
    public WritersSummary(@Nullable final Name nameParam, @Nullable final String attrParam) {
        this.name = nameParam;
        this.attr = attrParam;
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
     * Get value of attr.
     *
     * @return String value of attr
     */
    @Nullable
    public final String getAttr() {
        return this.attr;
    }

    
    /**
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final Name nameParam) {
        this.name = nameParam;
    }
    
    /**
     * Set value of attr.
     *
     * @param attrParam
     */
    public final void setAttr(@Nullable final String attrParam) {
        this.attr = attrParam;
    }
}
