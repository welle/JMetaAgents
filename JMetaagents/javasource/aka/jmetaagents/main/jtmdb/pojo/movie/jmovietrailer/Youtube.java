package aka.jmetaagents.main.jtmdb.pojo.movie.jmovietrailer;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Youtube {

	@Nullable
    private String size;
	@Nullable
    private String name;
	@Nullable
    private String source;
	@Nullable
    private String type;

	/**
     * Empty Constructor.
     */
    public Youtube() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param sizeParam String
     * @param nameParam String
     * @param sourceParam String
     * @param typeParam String
     */
    public Youtube(@Nullable final String sizeParam, @Nullable final String nameParam, @Nullable final String sourceParam, @Nullable final String typeParam) {
        this.size = sizeParam;
        this.name = nameParam;
        this.source = sourceParam;
        this.type = typeParam;
    }
    
    /**
     * Get value of size.
     *
     * @return String value of size
     */
    @Nullable
    public final String getSize() {
        return this.size;
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
     * Get value of source.
     *
     * @return String value of source
     */
    @Nullable
    public final String getSource() {
        return this.source;
    }
    
    /**
     * Get value of type.
     *
     * @return String value of type
     */
    @Nullable
    public final String getType() {
        return this.type;
    }

    
    /**
     * Set value of size.
     *
     * @param sizeParam
     */
    public final void setSize(@Nullable final String sizeParam) {
        this.size = sizeParam;
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
     * Set value of source.
     *
     * @param sourceParam
     */
    public final void setSource(@Nullable final String sourceParam) {
        this.source = sourceParam;
    }
    
    /**
     * Set value of type.
     *
     * @param typeParam
     */
    public final void setType(@Nullable final String typeParam) {
        this.type = typeParam;
    }
}
