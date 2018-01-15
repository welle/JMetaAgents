package aka.jmetaagents.main.jtmdb.pojo.person.jpersonimage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JPersonImage {

	@NonNull
    private List<Profiles> profiles = new ArrayList<>();
	@Nullable
    private Integer id;

	/**
     * Empty Constructor.
     */
    public JPersonImage() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param profilesParam List<Profiles>
     * @param idParam Integer
     */
    public JPersonImage(@NonNull final List<Profiles> profilesParam, @Nullable final Integer idParam) {
        this.profiles = profilesParam;
        this.id = idParam;
    }
    
    /**
     * Get value of profiles.
     *
     * @return List<Profiles> value of profiles
     */
    @NonNull
    public final List<Profiles> getProfiles() {
        return this.profiles;
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
     * Set value of profiles.
     *
     * @param profilesParam
     */
    public final void getProfiles(@NonNull final List<Profiles> profilesParam) {
        this.profiles = profilesParam;
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
