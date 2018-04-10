package aka.jmetaagents.main.tvdb.series.seriesidepisodes;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Links {

	@Nullable
    private Integer next;
	@Nullable
    private Integer last;
	@Nullable
    private Integer previous;
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
     * @param nextParam Integer
     * @param lastParam Integer
     * @param previousParam Integer
     * @param firstParam Integer
     */
    public Links(@Nullable final Integer nextParam, @Nullable final Integer lastParam, @Nullable final Integer previousParam, @Nullable final Integer firstParam) {
        this.next = nextParam;
        this.last = lastParam;
        this.previous = previousParam;
        this.first = firstParam;
    }
    
    /**
     * Get value of next.
     *
     * @return Integer value of next
     */
    @Nullable
    public final Integer getNext() {
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
     * Get value of previous.
     *
     * @return Integer value of previous
     */
    @Nullable
    public final Integer getPrevious() {
        return this.previous;
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
    public final void setNext(@Nullable final Integer nextParam) {
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
     * Set value of previous.
     *
     * @param previousParam
     */
    public final void setPrevious(@Nullable final Integer previousParam) {
        this.previous = previousParam;
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
