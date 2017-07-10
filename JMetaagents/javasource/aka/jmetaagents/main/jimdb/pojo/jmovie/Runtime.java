package aka.jmetaagents.main.jimdb.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Runtime {

	@Nullable
    private Integer time;

	/**
     * Empty Constructor.
     */
    public Runtime() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param timeParam Integer
     */
    public Runtime(@Nullable final Integer timeParam) {
        this.time = timeParam;
    }
    
    /**
     * Get value of time.
     *
     * @return Integer value of time
     */
    @Nullable
    public final Integer getTime() {
        return this.time;
    }

    
    /**
     * Set value of time.
     *
     * @param timeParam
     */
    public final void setTime(@Nullable final Integer timeParam) {
        this.time = timeParam;
    }
}
