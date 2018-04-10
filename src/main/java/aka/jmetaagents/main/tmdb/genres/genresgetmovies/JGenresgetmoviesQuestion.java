package aka.jmetaagents.main.tmdb.genres.genresgetmovies;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JGenresgetmoviesQuestion {

    @JsonProperty("include_adult")
	@Nullable
    private Boolean includeAdult;
	@Nullable
    private String language;
    @JsonProperty("genre_id")
	@Nullable
    private Integer genreId;

	/**
     * Empty Constructor.
     */
    public JGenresgetmoviesQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param includeAdultParam Boolean
     * @param languageParam String
     * @param genreIdParam Integer
     */
    public JGenresgetmoviesQuestion(@Nullable final Boolean includeAdultParam, @Nullable final String languageParam, @Nullable final Integer genreIdParam) {
        this.includeAdult = includeAdultParam;
        this.language = languageParam;
        this.genreId = genreIdParam;
    }
    
    /**
     * Get value of includeAdult.
     *
     * @return Boolean value of includeAdult
     */
    @Nullable
    public final Boolean getIncludeAdult() {
        return this.includeAdult;
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
     * Get value of genreId.
     *
     * @return Integer value of genreId
     */
    @Nullable
    public final Integer getGenreId() {
        return this.genreId;
    }

    
    /**
     * Set value of includeAdult.
     *
     * @param includeAdultParam
     */
    public final void setIncludeAdult(@Nullable final Boolean includeAdultParam) {
        this.includeAdult = includeAdultParam;
    }
    
    /**
     * Set value of language.
     *
     * @param languageParam
     */
    public final void setLanguage(@Nullable final String languageParam) {
        this.language = languageParam;
    }
    
    /**
     * Set value of genreId.
     *
     * @param genreIdParam
     */
    public final void setGenreId(@Nullable final Integer genreIdParam) {
        this.genreId = genreIdParam;
    }
}
