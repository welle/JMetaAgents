package aka.jmetaagents.main.jallocine.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Rating {

	@Nullable
    private Double note;
    @JsonProperty("$")
	@Nullable
    private Integer value;

	/**
     * Empty Constructor.
     */
    public Rating() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param noteParam Double
     * @param valueParam Integer
     */
    public Rating(@Nullable final Double noteParam, @Nullable final Integer valueParam) {
        this.note = noteParam;
        this.value = valueParam;
    }
    
    /**
     * Get value of note.
     *
     * @return Double value of note
     */
    @Nullable
    public final Double getNote() {
        return this.note;
    }
    
    /**
     * Get value of value.
     *
     * @return Integer value of value
     */
    @Nullable
    public final Integer getValue() {
        return this.value;
    }

    
    /**
     * Set value of note.
     *
     * @param noteParam
     */
    public final void setNote(@Nullable final Double noteParam) {
        this.note = noteParam;
    }
    
    /**
     * Set value of value.
     *
     * @param valueParam
     */
    public final void setValue(@Nullable final Integer valueParam) {
        this.value = valueParam;
    }
}
