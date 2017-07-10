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
public final class Name2 {

    @JsonProperty("image")
	@Nullable
    private Image6 image6;
	@Nullable
    private String name;
	@Nullable
    private String nconst;

	/**
     * Empty Constructor.
     */
    public Name2() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param image6Param Image6
     * @param nameParam String
     * @param nconstParam String
     */
    public Name2(@Nullable final Image6 image6Param, @Nullable final String nameParam, @Nullable final String nconstParam) {
        this.image6 = image6Param;
        this.name = nameParam;
        this.nconst = nconstParam;
    }
    
    /**
     * Get value of image6.
     *
     * @return Image6 value of image6
     */
    @Nullable
    public final Image6 getImage6() {
        return this.image6;
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
     * Set value of image6.
     *
     * @param image6Param
     */
    public final void setImage6(@Nullable final Image6 image6Param) {
        this.image6 = image6Param;
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
