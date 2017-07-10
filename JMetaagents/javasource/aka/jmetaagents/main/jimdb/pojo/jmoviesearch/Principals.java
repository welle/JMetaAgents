package aka.jmetaagents.main.jimdb.pojo.jmoviesearch;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Principals {

	@Nullable
    private String name;
	@Nullable
    private String nconst;

	/**
     * Empty Constructor.
     */
    public Principals() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param nameParam String
     * @param nconstParam String
     */
    public Principals(@Nullable final String nameParam, @Nullable final String nconstParam) {
        this.name = nameParam;
        this.nconst = nconstParam;
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
     * Get value of nconst.
     *
     * @return String value of nconst
     */
    @Nullable
    public final String getNconst() {
        return this.nconst;
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
     * Set value of nconst.
     *
     * @param nconstParam
     */
    public final void setNconst(@Nullable final String nconstParam) {
        this.nconst = nconstParam;
    }
}
