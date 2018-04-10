package aka.jmetaagents.main.tmdb.tv.season.tvseasonvideos;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTvseasonvideosQuestion {

    @JsonProperty("tv_id")
	@Nullable
    private Integer tvId;
    @JsonProperty("season_number")
	@Nullable
    private Integer seasonNumber;
	@Nullable
    private String language;

	/**
     * Empty Constructor.
     */
    public JTvseasonvideosQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param tvIdParam Integer
     * @param seasonNumberParam Integer
     * @param languageParam String
     */
    public JTvseasonvideosQuestion(@Nullable final Integer tvIdParam, @Nullable final Integer seasonNumberParam, @Nullable final String languageParam) {
        this.tvId = tvIdParam;
        this.seasonNumber = seasonNumberParam;
        this.language = languageParam;
    }
    
    /**
     * Get value of tvId.
     *
     * @return Integer value of tvId
     */
    @Nullable
    public final Integer getTvId() {
        return this.tvId;
    }
    
    /**
     * Get value of seasonNumber.
     *
     * @return Integer value of seasonNumber
     */
    @Nullable
    public final Integer getSeasonNumber() {
        return this.seasonNumber;
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
     * Set value of tvId.
     *
     * @param tvIdParam
     */
    public final void setTvId(@Nullable final Integer tvIdParam) {
        this.tvId = tvIdParam;
    }
    
    /**
     * Set value of seasonNumber.
     *
     * @param seasonNumberParam
     */
    public final void setSeasonNumber(@Nullable final Integer seasonNumberParam) {
        this.seasonNumber = seasonNumberParam;
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
