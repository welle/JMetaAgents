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
public final class Name {

	@Nullable
    private String name;
	@Nullable
    private String nconst;
    @JsonProperty("image")
	@Nullable
    private Image1 image1;

	/**
     * Empty Constructor.
     */
    public Name() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param nameParam String
     * @param nconstParam String
     * @param image1Param Image1
     */
    public Name(@Nullable final String nameParam, @Nullable final String nconstParam, @Nullable final Image1 image1Param) {
        this.name = nameParam;
        this.nconst = nconstParam;
        this.image1 = image1Param;
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
     * Get value of image1.
     *
     * @return Image1 value of image1
     */
    @Nullable
    public final Image1 getImage1() {
        return this.image1;
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
    
    /**
     * Set value of image1.
     *
     * @param image1Param
     */
    public final void setImage1(@Nullable final Image1 image1Param) {
        this.image1 = image1Param;
    }
}
