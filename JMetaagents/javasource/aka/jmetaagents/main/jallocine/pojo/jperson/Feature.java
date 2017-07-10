package aka.jmetaagents.main.jallocine.pojo.jperson;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Feature {

	@Nullable
    private Integer code;
    @JsonProperty("category")
	@NonNull
    private List<Category1> category1 = new ArrayList<>();
    @JsonProperty("picture")
	@Nullable
    private Picture1 picture1;
	@Nullable
    private String title;
    @JsonProperty("publication")
	@Nullable
    private Publication1 publication1;

	/**
     * Empty Constructor.
     */
    public Feature() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param category1Param List<Category1>
     * @param picture1Param Picture1
     * @param titleParam String
     * @param publication1Param Publication1
     */
    public Feature(@Nullable final Integer codeParam, @NonNull final List<Category1> category1Param, @Nullable final Picture1 picture1Param, @Nullable final String titleParam, @Nullable final Publication1 publication1Param) {
        this.code = codeParam;
        this.category1 = category1Param;
        this.picture1 = picture1Param;
        this.title = titleParam;
        this.publication1 = publication1Param;
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
     * Get value of category1.
     *
     * @return List<Category1> value of category1
     */
    @NonNull
    public final List<Category1> getCategory1() {
        return this.category1;
    }
    
    /**
     * Get value of picture1.
     *
     * @return Picture1 value of picture1
     */
    @Nullable
    public final Picture1 getPicture1() {
        return this.picture1;
    }
    
    /**
     * Get value of title.
     *
     * @return String value of title
     */
    @Nullable
    public final String getTitle() {
        return this.title;
    }
    
    /**
     * Get value of publication1.
     *
     * @return Publication1 value of publication1
     */
    @Nullable
    public final Publication1 getPublication1() {
        return this.publication1;
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
     * Set value of category1.
     *
     * @param category1Param
     */
    public final void getCategory1(@NonNull final List<Category1> category1Param) {
        this.category1 = category1Param;
    }
    
    /**
     * Set value of picture1.
     *
     * @param picture1Param
     */
    public final void setPicture1(@Nullable final Picture1 picture1Param) {
        this.picture1 = picture1Param;
    }
    
    /**
     * Set value of title.
     *
     * @param titleParam
     */
    public final void setTitle(@Nullable final String titleParam) {
        this.title = titleParam;
    }
    
    /**
     * Set value of publication1.
     *
     * @param publication1Param
     */
    public final void setPublication1(@Nullable final Publication1 publication1Param) {
        this.publication1 = publication1Param;
    }
}
