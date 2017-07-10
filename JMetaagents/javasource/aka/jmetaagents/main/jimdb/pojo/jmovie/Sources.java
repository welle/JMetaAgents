package aka.jmetaagents.main.jimdb.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Sources {

	@Nullable
    private Ns0000222 ns0000222;
	@Nullable
    private Ns0005386 ns0005386;
	@Nullable
    private Ns0000139 ns0000139;

	/**
     * Empty Constructor.
     */
    public Sources() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param ns0000222Param Ns0000222
     * @param ns0005386Param Ns0005386
     * @param ns0000139Param Ns0000139
     */
    public Sources(@Nullable final Ns0000222 ns0000222Param, @Nullable final Ns0005386 ns0005386Param, @Nullable final Ns0000139 ns0000139Param) {
        this.ns0000222 = ns0000222Param;
        this.ns0005386 = ns0005386Param;
        this.ns0000139 = ns0000139Param;
    }
    
    /**
     * Get value of ns0000222.
     *
     * @return Ns0000222 value of ns0000222
     */
    @Nullable
    public final Ns0000222 getNs0000222() {
        return this.ns0000222;
    }
    
    /**
     * Get value of ns0005386.
     *
     * @return Ns0005386 value of ns0005386
     */
    @Nullable
    public final Ns0005386 getNs0005386() {
        return this.ns0005386;
    }
    
    /**
     * Get value of ns0000139.
     *
     * @return Ns0000139 value of ns0000139
     */
    @Nullable
    public final Ns0000139 getNs0000139() {
        return this.ns0000139;
    }

    
    /**
     * Set value of ns0000222.
     *
     * @param ns0000222Param
     */
    public final void setNs0000222(@Nullable final Ns0000222 ns0000222Param) {
        this.ns0000222 = ns0000222Param;
    }
    
    /**
     * Set value of ns0005386.
     *
     * @param ns0005386Param
     */
    public final void setNs0005386(@Nullable final Ns0005386 ns0005386Param) {
        this.ns0005386 = ns0005386Param;
    }
    
    /**
     * Set value of ns0000139.
     *
     * @param ns0000139Param
     */
    public final void setNs0000139(@Nullable final Ns0000139 ns0000139Param) {
        this.ns0000139 = ns0000139Param;
    }
}
