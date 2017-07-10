package aka.jmetaagents.main.jimdb.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Name1 {

    @JsonProperty("image")
	@Nullable
    private Image3 image3;
	@Nullable
    private String name;
	@Nullable
    private String nconst;

	/**
     * Empty Constructor.
     */
    public Name1() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param image3Param Image3
     * @param nameParam String
     * @param nconstParam String
     */
    public Name1(@Nullable final Image3 image3Param, @Nullable final String nameParam, @Nullable final String nconstParam) {
        this.image3 = image3Param;
        this.name = nameParam;
        this.nconst = nconstParam;
    }
    
    /**
     * Get value of image3.
     *
     * @return Image3 value of image3
     */
    @Nullable
    public final Image3 getImage3() {
        return this.image3;
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
     * Set value of image3.
     *
     * @param image3Param
     */
    public final void setImage3(@Nullable final Image3 image3Param) {
        this.image3 = image3Param;
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
