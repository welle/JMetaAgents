package aka.jmetaagents.main.jimdb.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Items {

	@Nullable
    private String head;
	@Nullable
    private String datetime;
	@Nullable
    private String source;
	@Nullable
    private String id;

	/**
     * Empty Constructor.
     */
    public Items() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param headParam String
     * @param datetimeParam String
     * @param sourceParam String
     * @param idParam String
     */
    public Items(@Nullable final String headParam, @Nullable final String datetimeParam, @Nullable final String sourceParam, @Nullable final String idParam) {
        this.head = headParam;
        this.datetime = datetimeParam;
        this.source = sourceParam;
        this.id = idParam;
    }
    
    /**
     * Get value of head.
     *
     * @return String value of head
     */
    @Nullable
    public final String getHead() {
        return this.head;
    }
    
    /**
     * Get value of datetime.
     *
     * @return String value of datetime
     */
    @Nullable
    public final String getDatetime() {
        return this.datetime;
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
     * Get value of id.
     *
     * @return String value of id
     */
    @Nullable
    public final String getId() {
        return this.id;
    }

    
    /**
     * Set value of head.
     *
     * @param headParam
     */
    public final void setHead(@Nullable final String headParam) {
        this.head = headParam;
    }
    
    /**
     * Set value of datetime.
     *
     * @param datetimeParam
     */
    public final void setDatetime(@Nullable final String datetimeParam) {
        this.datetime = datetimeParam;
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
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final String idParam) {
        this.id = idParam;
    }
}
