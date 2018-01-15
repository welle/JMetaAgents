package aka.jmetaagents.main.jtvdb.pojo.jtvshowseason;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Links {

	@Nullable
    private String next;
	@Nullable
    private Integer last;
	@Nullable
    private String prev;
	@Nullable
    private Integer first;

	/**
     * Empty Constructor.
     */
    public Links() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param nextParam String
     * @param lastParam Integer
     * @param prevParam String
     * @param firstParam Integer
     */
    public Links(@Nullable final String nextParam, @Nullable final Integer lastParam, @Nullable final String prevParam, @Nullable final Integer firstParam) {
        this.next = nextParam;
        this.last = lastParam;
        this.prev = prevParam;
        this.first = firstParam;
    }
    
    /**
     * Get value of next.
     *
     * @return String value of next
     */
    @Nullable
    public final String getNext() {
        return this.next;
    }
    
    /**
     * Get value of last.
     *
     * @return Integer value of last
     */
    @Nullable
    public final Integer getLast() {
        return this.last;
    }
    
    /**
     * Get value of prev.
     *
     * @return String value of prev
     */
    @Nullable
    public final String getPrev() {
        return this.prev;
    }
    
    /**
     * Get value of first.
     *
     * @return Integer value of first
     */
    @Nullable
    public final Integer getFirst() {
        return this.first;
    }

    
    /**
     * Set value of next.
     *
     * @param nextParam
     */
    public final void setNext(@Nullable final String nextParam) {
        this.next = nextParam;
    }
    
    /**
     * Set value of last.
     *
     * @param lastParam
     */
    public final void setLast(@Nullable final Integer lastParam) {
        this.last = lastParam;
    }
    
    /**
     * Set value of prev.
     *
     * @param prevParam
     */
    public final void setPrev(@Nullable final String prevParam) {
        this.prev = prevParam;
    }
    
    /**
     * Set value of first.
     *
     * @param firstParam
     */
    public final void setFirst(@Nullable final Integer firstParam) {
        this.first = firstParam;
    }
}
