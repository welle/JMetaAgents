package aka.jmetaagents.main.tmdb.collections.collectionstranslations;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JCollectionstranslationsQuestion {

    @JsonProperty("collection_id")
	@Nullable
    private Integer collectionId;
	@Nullable
    private String language;

	/**
     * Empty Constructor.
     */
    public JCollectionstranslationsQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param collectionIdParam Integer
     * @param languageParam String
     */
    public JCollectionstranslationsQuestion(@Nullable final Integer collectionIdParam, @Nullable final String languageParam) {
        this.collectionId = collectionIdParam;
        this.language = languageParam;
    }
    
    /**
     * Get value of collectionId.
     *
     * @return Integer value of collectionId
     */
    @Nullable
    public final Integer getCollectionId() {
        return this.collectionId;
    }
    
    /**
     * Get value of language.
     *
     * @return String value of language
     */
    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    
    /**
     * Set value of collectionId.
     *
     * @param collectionIdParam
     */
    public final void setCollectionId(@Nullable final Integer collectionIdParam) {
        this.collectionId = collectionIdParam;
    }
    
    /**
     * Set value of language.
     *
     * @param languageParam
     */
    public final void setLanguage(@Nullable final String languageParam) {
        this.language = languageParam;
    }
}
