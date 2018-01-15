package aka.jmetaagents.main.jallocine.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class FestivalAward {

	@Nullable
    private ParentEdition parentEdition;
	@Nullable
    private Integer code;
	@Nullable
    private String name;
	@Nullable
    private ParentFestival parentFestival;
	@Nullable
    private AwardType awardType;

	/**
     * Empty Constructor.
     */
    public FestivalAward() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param parentEditionParam ParentEdition
     * @param codeParam Integer
     * @param nameParam String
     * @param parentFestivalParam ParentFestival
     * @param awardTypeParam AwardType
     */
    public FestivalAward(@Nullable final ParentEdition parentEditionParam, @Nullable final Integer codeParam, @Nullable final String nameParam, @Nullable final ParentFestival parentFestivalParam, @Nullable final AwardType awardTypeParam) {
        this.parentEdition = parentEditionParam;
        this.code = codeParam;
        this.name = nameParam;
        this.parentFestival = parentFestivalParam;
        this.awardType = awardTypeParam;
    }
    
    /**
     * Get value of parentEdition.
     *
     * @return ParentEdition value of parentEdition
     */
    @Nullable
    public final ParentEdition getParentEdition() {
        return this.parentEdition;
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
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
    }
    
    /**
     * Get value of parentFestival.
     *
     * @return ParentFestival value of parentFestival
     */
    @Nullable
    public final ParentFestival getParentFestival() {
        return this.parentFestival;
    }
    
    /**
     * Get value of awardType.
     *
     * @return AwardType value of awardType
     */
    @Nullable
    public final AwardType getAwardType() {
        return this.awardType;
    }

    
    /**
     * Set value of parentEdition.
     *
     * @param parentEditionParam
     */
    public final void setParentEdition(@Nullable final ParentEdition parentEditionParam) {
        this.parentEdition = parentEditionParam;
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
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
    }
    
    /**
     * Set value of parentFestival.
     *
     * @param parentFestivalParam
     */
    public final void setParentFestival(@Nullable final ParentFestival parentFestivalParam) {
        this.parentFestival = parentFestivalParam;
    }
    
    /**
     * Set value of awardType.
     *
     * @param awardTypeParam
     */
    public final void setAwardType(@Nullable final AwardType awardTypeParam) {
        this.awardType = awardTypeParam;
    }
}
