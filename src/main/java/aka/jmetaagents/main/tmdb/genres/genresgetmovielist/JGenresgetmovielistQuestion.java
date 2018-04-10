package aka.jmetaagents.main.tmdb.genres.genresgetmovielist;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JGenresgetmovielistQuestion {

	@Nullable
    private String language;

	/**
     * Empty Constructor.
     */
    public JGenresgetmovielistQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param languageParam String
     */
    public JGenresgetmovielistQuestion(@Nullable final String languageParam) {
        this.language = languageParam;
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
     * Set value of language.
     *
     * @param languageParam
     */
    public final void setLanguage(@Nullable final String languageParam) {
        this.language = languageParam;
    }
}
