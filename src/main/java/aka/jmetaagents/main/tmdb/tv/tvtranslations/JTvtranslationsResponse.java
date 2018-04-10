package aka.jmetaagents.main.tmdb.tv.tvtranslations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTvtranslationsResponse {

	@NonNull
    private List<Translations> translations = new ArrayList<>();
	@Nullable
    private Integer id;

	/**
     * Empty Constructor.
     */
    public JTvtranslationsResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param translationsParam List<Translations>
     * @param idParam Integer
     */
    public JTvtranslationsResponse(@NonNull final List<Translations> translationsParam, @Nullable final Integer idParam) {
        this.translations = translationsParam;
        this.id = idParam;
    }
    
    /**
     * Get value of translations.
     *
     * @return List<Translations> value of translations
     */
    @NonNull
    public final List<Translations> getTranslations() {
        return this.translations;
    }
    
    /**
     * Get value of id.
     *
     * @return Integer value of id
     */
    @Nullable
    public final Integer getId() {
        return this.id;
    }

    
    /**
     * Set value of translations.
     *
     * @param translationsParam
     */
    public final void setTranslations(@NonNull final List<Translations> translationsParam) {
        this.translations = translationsParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
}
