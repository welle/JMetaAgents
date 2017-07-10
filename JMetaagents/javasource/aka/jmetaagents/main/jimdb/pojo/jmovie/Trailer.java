package aka.jmetaagents.main.jimdb.pojo.jmovie;

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
public final class Trailer {

    @JsonProperty("duration_seconds")
	@Nullable
    private Integer durationSeconds;
	@Nullable
    private RelatedName relatedName;
    @JsonProperty("content_type")
	@Nullable
    private String contentType;
	@Nullable
    private Encodings encodings;
    @JsonProperty("@type")
	@Nullable
    private String type;
	@NonNull
    private List<Slates> slates = new ArrayList<>();
	@Nullable
    private String description;
	@Nullable
    private String id;
	@Nullable
    private String title;
	@Nullable
    private RelatedTitle relatedTitle;

	/**
     * Empty Constructor.
     */
    public Trailer() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param durationSecondsParam Integer
     * @param relatedNameParam RelatedName
     * @param contentTypeParam String
     * @param encodingsParam Encodings
     * @param typeParam String
     * @param slatesParam List<Slates>
     * @param descriptionParam String
     * @param idParam String
     * @param titleParam String
     * @param relatedTitleParam RelatedTitle
     */
    public Trailer(@Nullable final Integer durationSecondsParam, @Nullable final RelatedName relatedNameParam, @Nullable final String contentTypeParam, @Nullable final Encodings encodingsParam, @Nullable final String typeParam, @NonNull final List<Slates> slatesParam, @Nullable final String descriptionParam, @Nullable final String idParam, @Nullable final String titleParam, @Nullable final RelatedTitle relatedTitleParam) {
        this.durationSeconds = durationSecondsParam;
        this.relatedName = relatedNameParam;
        this.contentType = contentTypeParam;
        this.encodings = encodingsParam;
        this.type = typeParam;
        this.slates = slatesParam;
        this.description = descriptionParam;
        this.id = idParam;
        this.title = titleParam;
        this.relatedTitle = relatedTitleParam;
    }
    
    /**
     * Get value of durationSeconds.
     *
     * @return Integer value of durationSeconds
     */
    @Nullable
    public final Integer getDurationSeconds() {
        return this.durationSeconds;
    }
    
    /**
     * Get value of relatedName.
     *
     * @return RelatedName value of relatedName
     */
    @Nullable
    public final RelatedName getRelatedName() {
        return this.relatedName;
    }
    
    /**
     * Get value of contentType.
     *
     * @return String value of contentType
     */
    @Nullable
    public final String getContentType() {
        return this.contentType;
    }
    
    /**
     * Get value of encodings.
     *
     * @return Encodings value of encodings
     */
    @Nullable
    public final Encodings getEncodings() {
        return this.encodings;
    }
    
    /**
     * Get value of type.
     *
     * @return String value of type
     */
    @Nullable
    public final String getType() {
        return this.type;
    }
    
    /**
     * Get value of slates.
     *
     * @return List<Slates> value of slates
     */
    @NonNull
    public final List<Slates> getSlates() {
        return this.slates;
    }
    
    /**
     * Get value of description.
     *
     * @return String value of description
     */
    @Nullable
    public final String getDescription() {
        return this.description;
    }
    
    /**
     * Get value of id.
     *
     * @return String value of id
     */
    @Nullable
    public final String getId() {
        return this.id;
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
     * Get value of relatedTitle.
     *
     * @return RelatedTitle value of relatedTitle
     */
    @Nullable
    public final RelatedTitle getRelatedTitle() {
        return this.relatedTitle;
    }

    
    /**
     * Set value of durationSeconds.
     *
     * @param durationSecondsParam
     */
    public final void setDurationSeconds(@Nullable final Integer durationSecondsParam) {
        this.durationSeconds = durationSecondsParam;
    }
    
    /**
     * Set value of relatedName.
     *
     * @param relatedNameParam
     */
    public final void setRelatedName(@Nullable final RelatedName relatedNameParam) {
        this.relatedName = relatedNameParam;
    }
    
    /**
     * Set value of contentType.
     *
     * @param contentTypeParam
     */
    public final void setContentType(@Nullable final String contentTypeParam) {
        this.contentType = contentTypeParam;
    }
    
    /**
     * Set value of encodings.
     *
     * @param encodingsParam
     */
    public final void setEncodings(@Nullable final Encodings encodingsParam) {
        this.encodings = encodingsParam;
    }
    
    /**
     * Set value of type.
     *
     * @param typeParam
     */
    public final void setType(@Nullable final String typeParam) {
        this.type = typeParam;
    }
    
    /**
     * Set value of slates.
     *
     * @param slatesParam
     */
    public final void getSlates(@NonNull final List<Slates> slatesParam) {
        this.slates = slatesParam;
    }
    
    /**
     * Set value of description.
     *
     * @param descriptionParam
     */
    public final void setDescription(@Nullable final String descriptionParam) {
        this.description = descriptionParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final String idParam) {
        this.id = idParam;
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
     * Set value of relatedTitle.
     *
     * @param relatedTitleParam
     */
    public final void setRelatedTitle(@Nullable final RelatedTitle relatedTitleParam) {
        this.relatedTitle = relatedTitleParam;
    }
}
