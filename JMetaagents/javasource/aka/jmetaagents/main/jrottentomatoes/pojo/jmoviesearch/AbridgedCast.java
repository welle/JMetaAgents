package aka.jmetaagents.main.jrottentomatoes.pojo.jmoviesearch;

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
public final class AbridgedCast {

	@NonNull
    private List<String> characters = new ArrayList<>();
	@Nullable
    private String name;
	@Nullable
    private String id;

	/**
     * Empty Constructor.
     */
    public AbridgedCast() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param charactersParam List<String>
     * @param nameParam String
     * @param idParam String
     */
    public AbridgedCast(@NonNull final List<String> charactersParam, @Nullable final String nameParam, @Nullable final String idParam) {
        this.characters = charactersParam;
        this.name = nameParam;
        this.id = idParam;
    }
    
    /**
     * Get value of characters.
     *
     * @return List<String> value of characters
     */
    @NonNull
    public final List<String> getCharacters() {
        return this.characters;
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
     * @return String value of id
     */
    @Nullable
    public final String getId() {
        return this.id;
    }

    
    /**
     * Set value of characters.
     *
     * @param charactersParam
     */
    public final void getCharacters(@NonNull final List<String> charactersParam) {
        this.characters = charactersParam;
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
    public final void setId(@Nullable final String idParam) {
        this.id = idParam;
    }
}
