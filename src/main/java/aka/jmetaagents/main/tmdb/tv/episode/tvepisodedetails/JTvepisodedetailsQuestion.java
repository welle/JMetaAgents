package aka.jmetaagents.main.tmdb.tv.episode.tvepisodedetails;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTvepisodedetailsQuestion {

    @JsonProperty("tv_id")
	@Nullable
    private Integer tvId;
    @JsonProperty("episode_number")
	@Nullable
    private Integer episodeNumber;
    @JsonProperty("season_number")
	@Nullable
    private Integer seasonNumber;
	@Nullable
    private String language;

	/**
     * Empty Constructor.
     */
    public JTvepisodedetailsQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param tvIdParam Integer
     * @param episodeNumberParam Integer
     * @param seasonNumberParam Integer
     * @param languageParam String
     */
    public JTvepisodedetailsQuestion(@Nullable final Integer tvIdParam, @Nullable final Integer episodeNumberParam, @Nullable final Integer seasonNumberParam, @Nullable final String languageParam) {
        this.tvId = tvIdParam;
        this.episodeNumber = episodeNumberParam;
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
     * Get value of episodeNumber.
     *
     * @return Integer value of episodeNumber
     */
    @Nullable
    public final Integer getEpisodeNumber() {
        return this.episodeNumber;
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
     * Set value of episodeNumber.
     *
     * @param episodeNumberParam
     */
    public final void setEpisodeNumber(@Nullable final Integer episodeNumberParam) {
        this.episodeNumber = episodeNumberParam;
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
