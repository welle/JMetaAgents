package aka.jmetaagents.main.jallocine.pojo.jtvshowseason;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Episode1 {

	@Nullable
    private Integer code;
	@Nullable
    private Integer episodeNumberSeason;

	/**
     * Empty Constructor.
     */
    public Episode1() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param episodeNumberSeasonParam Integer
     */
    public Episode1(@Nullable final Integer codeParam, @Nullable final Integer episodeNumberSeasonParam) {
        this.code = codeParam;
        this.episodeNumberSeason = episodeNumberSeasonParam;
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
     * Get value of episodeNumberSeason.
     *
     * @return Integer value of episodeNumberSeason
     */
    @Nullable
    public final Integer getEpisodeNumberSeason() {
        return this.episodeNumberSeason;
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
     * Set value of episodeNumberSeason.
     *
     * @param episodeNumberSeasonParam
     */
    public final void setEpisodeNumberSeason(@Nullable final Integer episodeNumberSeasonParam) {
        this.episodeNumberSeason = episodeNumberSeasonParam;
    }
}
