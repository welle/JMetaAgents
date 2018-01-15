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
public final class RelatedName {

    @JsonProperty("image")
	@Nullable
    private Image4 image4;
	@Nullable
    private String name;
	@Nullable
    private String nconst;

	/**
     * Empty Constructor.
     */
    public RelatedName() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param image4Param Image4
     * @param nameParam String
     * @param nconstParam String
     */
    public RelatedName(@Nullable final Image4 image4Param, @Nullable final String nameParam, @Nullable final String nconstParam) {
        this.image4 = image4Param;
        this.name = nameParam;
        this.nconst = nconstParam;
    }
    
    /**
     * Get value of image4.
     *
     * @return Image4 value of image4
     */
    @Nullable
    public final Image4 getImage4() {
        return this.image4;
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
     * Set value of image4.
     *
     * @param image4Param
     */
    public final void setImage4(@Nullable final Image4 image4Param) {
        this.image4 = image4Param;
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
