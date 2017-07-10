package aka.jmetaagents.main.jallocine.pojo.jperson;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class FestivalSection {

	@Nullable
    private ParentEdition parentEdition;
	@Nullable
    private Integer code;
	@Nullable
    private Entities entities;
	@Nullable
    private String name;
	@Nullable
    private SectionType sectionType;
	@Nullable
    private ParentFestival parentFestival;

	/**
     * Empty Constructor.
     */
    public FestivalSection() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param parentEditionParam ParentEdition
     * @param codeParam Integer
     * @param entitiesParam Entities
     * @param nameParam String
     * @param sectionTypeParam SectionType
     * @param parentFestivalParam ParentFestival
     */
    public FestivalSection(@Nullable final ParentEdition parentEditionParam, @Nullable final Integer codeParam, @Nullable final Entities entitiesParam, @Nullable final String nameParam, @Nullable final SectionType sectionTypeParam, @Nullable final ParentFestival parentFestivalParam) {
        this.parentEdition = parentEditionParam;
        this.code = codeParam;
        this.entities = entitiesParam;
        this.name = nameParam;
        this.sectionType = sectionTypeParam;
        this.parentFestival = parentFestivalParam;
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
     * Get value of entities.
     *
     * @return Entities value of entities
     */
    @Nullable
    public final Entities getEntities() {
        return this.entities;
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
     * Get value of sectionType.
     *
     * @return SectionType value of sectionType
     */
    @Nullable
    public final SectionType getSectionType() {
        return this.sectionType;
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
     * Set value of entities.
     *
     * @param entitiesParam
     */
    public final void setEntities(@Nullable final Entities entitiesParam) {
        this.entities = entitiesParam;
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
     * Set value of sectionType.
     *
     * @param sectionTypeParam
     */
    public final void setSectionType(@Nullable final SectionType sectionTypeParam) {
        this.sectionType = sectionTypeParam;
    }
    
    /**
     * Set value of parentFestival.
     *
     * @param parentFestivalParam
     */
    public final void setParentFestival(@Nullable final ParentFestival parentFestivalParam) {
        this.parentFestival = parentFestivalParam;
    }
}
