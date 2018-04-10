package aka.jmetaagents.main.tmdb.tv.episode.tvepisodecredits;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTvepisodecreditsQuestion {

    @JsonProperty("tv_id")
	@Nullable
    private Integer tvId;
    @JsonProperty("episode_number")
	@Nullable
    private Integer episodeNumber;
    @JsonProperty("season_number")
	@Nullable
    private Integer seasonNumber;

	/**
     * Empty Constructor.
     */
    public JTvepisodecreditsQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param tvIdParam Integer
     * @param episodeNumberParam Integer
     * @param seasonNumberParam Integer
     */
    public JTvepisodecreditsQuestion(@Nullable final Integer tvIdParam, @Nullable final Integer episodeNumberParam, @Nullable final Integer seasonNumberParam) {
        this.tvId = tvIdParam;
        this.episodeNumber = episodeNumberParam;
        this.seasonNumber = seasonNumberParam;
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
}
