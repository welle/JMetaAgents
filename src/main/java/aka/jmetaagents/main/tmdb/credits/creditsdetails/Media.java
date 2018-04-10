package aka.jmetaagents.main.tmdb.credits.creditsdetails;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Media {

	@Nullable
    private String character;
	@NonNull
    private List<Seasons> seasons = new ArrayList<>();
    @JsonProperty("original_name")
	@Nullable
    private String originalName;
	@Nullable
    private String name;
	@Nullable
    private Integer id;
	@NonNull
    private List<String> episodes = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public Media() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param characterParam String
     * @param seasonsParam List<Seasons>
     * @param originalNameParam String
     * @param nameParam String
     * @param idParam Integer
     * @param episodesParam List<String>
     */
    public Media(@Nullable final String characterParam, @NonNull final List<Seasons> seasonsParam, @Nullable final String originalNameParam, @Nullable final String nameParam, @Nullable final Integer idParam, @NonNull final List<String> episodesParam) {
        this.character = characterParam;
        this.seasons = seasonsParam;
        this.originalName = originalNameParam;
        this.name = nameParam;
        this.id = idParam;
        this.episodes = episodesParam;
    }
    
    /**
     * Get value of character.
     *
     * @return String value of character
     */
    @Nullable
    public final String getCharacter() {
        return this.character;
    }
    
    /**
     * Get value of seasons.
     *
     * @return List<Seasons> value of seasons
     */
    @NonNull
    public final List<Seasons> getSeasons() {
        return this.seasons;
    }
    
    /**
     * Get value of originalName.
     *
     * @return String value of originalName
     */
    @Nullable
    public final String getOriginalName() {
        return this.originalName;
    }
    
    /**
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
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
     * Get value of episodes.
     *
     * @return List<String> value of episodes
     */
    @NonNull
    public final List<String> getEpisodes() {
        return this.episodes;
    }

    
    /**
     * Set value of character.
     *
     * @param characterParam
     */
    public final void setCharacter(@Nullable final String characterParam) {
        this.character = characterParam;
    }
    
    /**
     * Set value of seasons.
     *
     * @param seasonsParam
     */
    public final void setSeasons(@NonNull final List<Seasons> seasonsParam) {
        this.seasons = seasonsParam;
    }
    
    /**
     * Set value of originalName.
     *
     * @param originalNameParam
     */
    public final void setOriginalName(@Nullable final String originalNameParam) {
        this.originalName = originalNameParam;
    }
    
    /**
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of episodes.
     *
     * @param episodesParam
     */
    public final void setEpisodes(@NonNull final List<String> episodesParam) {
        this.episodes = episodesParam;
    }
}
