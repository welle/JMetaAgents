package aka.jmetaagents.main.jallocine.pojo.jtvshow;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class News {

	@Nullable
    private Integer pageCount;
	@Nullable
    private Integer code;
	@Nullable
    private Publication publication;
	@Nullable
    private String title;
	@NonNull
    private List<Category> category = new ArrayList<>();
	@Nullable
    private Picture picture;
	@Nullable
    private DisplayMode displayMode;

	/**
     * Empty Constructor.
     */
    public News() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param pageCountParam Integer
     * @param codeParam Integer
     * @param publicationParam Publication
     * @param titleParam String
     * @param categoryParam List<Category>
     * @param pictureParam Picture
     * @param displayModeParam DisplayMode
     */
    public News(@Nullable final Integer pageCountParam, @Nullable final Integer codeParam, @Nullable final Publication publicationParam, @Nullable final String titleParam, @NonNull final List<Category> categoryParam, @Nullable final Picture pictureParam, @Nullable final DisplayMode displayModeParam) {
        this.pageCount = pageCountParam;
        this.code = codeParam;
        this.publication = publicationParam;
        this.title = titleParam;
        this.category = categoryParam;
        this.picture = pictureParam;
        this.displayMode = displayModeParam;
    }
    
    /**
     * Get value of pageCount.
     *
     * @return Integer value of pageCount
     */
    @Nullable
    public final Integer getPageCount() {
        return this.pageCount;
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
     * Get value of publication.
     *
     * @return Publication value of publication
     */
    @Nullable
    public final Publication getPublication() {
        return this.publication;
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
     * Get value of category.
     *
     * @return List<Category> value of category
     */
    @NonNull
    public final List<Category> getCategory() {
        return this.category;
    }
    
    /**
     * Get value of picture.
     *
     * @return Picture value of picture
     */
    @Nullable
    public final Picture getPicture() {
        return this.picture;
    }
    
    /**
     * Get value of displayMode.
     *
     * @return DisplayMode value of displayMode
     */
    @Nullable
    public final DisplayMode getDisplayMode() {
        return this.displayMode;
    }

    
    /**
     * Set value of pageCount.
     *
     * @param pageCountParam
     */
    public final void setPageCount(@Nullable final Integer pageCountParam) {
        this.pageCount = pageCountParam;
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
     * Set value of publication.
     *
     * @param publicationParam
     */
    public final void setPublication(@Nullable final Publication publicationParam) {
        this.publication = publicationParam;
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
     * Set value of category.
     *
     * @param categoryParam
     */
    public final void getCategory(@NonNull final List<Category> categoryParam) {
        this.category = categoryParam;
    }
    
    /**
     * Set value of picture.
     *
     * @param pictureParam
     */
    public final void setPicture(@Nullable final Picture pictureParam) {
        this.picture = pictureParam;
    }
    
    /**
     * Set value of displayMode.
     *
     * @param displayModeParam
     */
    public final void setDisplayMode(@Nullable final DisplayMode displayModeParam) {
        this.displayMode = displayModeParam;
    }
}
