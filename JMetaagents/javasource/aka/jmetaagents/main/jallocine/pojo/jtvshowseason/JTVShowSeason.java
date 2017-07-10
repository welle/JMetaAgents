package aka.jmetaagents.main.jallocine.pojo.jtvshowseason;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTVShowSeason {

	@Nullable
    private Season season;

	/**
     * Empty Constructor.
     */
    public JTVShowSeason() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param seasonParam Season
     */
    public JTVShowSeason(@Nullable final Season seasonParam) {
        this.season = seasonParam;
    }
    
    /**
     * Get value of season.
     *
     * @return Season value of season
     */
    @Nullable
    public final Season getSeason() {
        return this.season;
    }

    
    /**
     * Set value of season.
     *
     * @param seasonParam
     */
    public final void setSeason(@Nullable final Season seasonParam) {
        this.season = seasonParam;
    }
}
