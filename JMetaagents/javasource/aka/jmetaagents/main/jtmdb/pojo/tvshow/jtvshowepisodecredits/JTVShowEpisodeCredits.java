package aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowepisodecredits;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTVShowEpisodeCredits {

	@NonNull
    private List<Cast> cast = new ArrayList<>();
	@Nullable
    private Integer id;
	@NonNull
    private List<Crew> crew = new ArrayList<>();
    @JsonProperty("guest_stars")
	@NonNull
    private List<GuestStars> guestStars = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public JTVShowEpisodeCredits() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param castParam List<Cast>
     * @param idParam Integer
     * @param crewParam List<Crew>
     * @param guestStarsParam List<GuestStars>
     */
    public JTVShowEpisodeCredits(@NonNull final List<Cast> castParam, @Nullable final Integer idParam, @NonNull final List<Crew> crewParam, @NonNull final List<GuestStars> guestStarsParam) {
        this.cast = castParam;
        this.id = idParam;
        this.crew = crewParam;
        this.guestStars = guestStarsParam;
    }
    
    /**
     * Get value of cast.
     *
     * @return List<Cast> value of cast
     */
    @NonNull
    public final List<Cast> getCast() {
        return this.cast;
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
     * Get value of crew.
     *
     * @return List<Crew> value of crew
     */
    @NonNull
    public final List<Crew> getCrew() {
        return this.crew;
    }
    
    /**
     * Get value of guestStars.
     *
     * @return List<GuestStars> value of guestStars
     */
    @NonNull
    public final List<GuestStars> getGuestStars() {
        return this.guestStars;
    }

    
    /**
     * Set value of cast.
     *
     * @param castParam
     */
    public final void getCast(@NonNull final List<Cast> castParam) {
        this.cast = castParam;
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
     * Set value of crew.
     *
     * @param crewParam
     */
    public final void getCrew(@NonNull final List<Crew> crewParam) {
        this.crew = crewParam;
    }
    
    /**
     * Set value of guestStars.
     *
     * @param guestStarsParam
     */
    public final void getGuestStars(@NonNull final List<GuestStars> guestStarsParam) {
        this.guestStars = guestStarsParam;
    }
}
