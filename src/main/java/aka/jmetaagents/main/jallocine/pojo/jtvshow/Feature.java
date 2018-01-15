package aka.jmetaagents.main.jallocine.pojo.jtvshow;

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
	@Nullable
    private String title;
    @JsonProperty("publication")
	@Nullable
    private Publication2 publication2;
    @JsonProperty("picture")
	@Nullable
    private Picture2 picture2;

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
     * @param titleParam String
     * @param publication2Param Publication2
     * @param picture2Param Picture2
     */
    public Feature(@Nullable final Integer codeParam, @NonNull final List<Category1> category1Param, @Nullable final String titleParam, @Nullable final Publication2 publication2Param, @Nullable final Picture2 picture2Param) {
        this.code = codeParam;
        this.category1 = category1Param;
        this.title = titleParam;
        this.publication2 = publication2Param;
        this.picture2 = picture2Param;
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
     * Get value of title.
     *
     * @return String value of title
     */
    @Nullable
    public final String getTitle() {
        return this.title;
    }
    
    /**
     * Get value of publication2.
     *
     * @return Publication2 value of publication2
     */
    @Nullable
    public final Publication2 getPublication2() {
        return this.publication2;
    }
    
    /**
     * Get value of picture2.
     *
     * @return Picture2 value of picture2
     */
    @Nullable
    public final Picture2 getPicture2() {
        return this.picture2;
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
     * Set value of title.
     *
     * @param titleParam
     */
    public final void setTitle(@Nullable final String titleParam) {
        this.title = titleParam;
    }
    
    /**
     * Set value of publication2.
     *
     * @param publication2Param
     */
    public final void setPublication2(@Nullable final Publication2 publication2Param) {
        this.publication2 = publication2Param;
    }
    
    /**
     * Set value of picture2.
     *
     * @param picture2Param
     */
    public final void setPicture2(@Nullable final Picture2 picture2Param) {
        this.picture2 = picture2Param;
    }
}