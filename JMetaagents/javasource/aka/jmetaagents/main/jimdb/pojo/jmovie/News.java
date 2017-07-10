package aka.jmetaagents.main.jimdb.pojo.jmovie;

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
public final class News {

	@Nullable
    private Integer total;
	@Nullable
    private Sources sources;
	@Nullable
    private String markup;
    @JsonProperty("@type")
	@Nullable
    private String type;
	@Nullable
    private String channel;
	@Nullable
    private Integer limit;
	@Nullable
    private Integer start;
	@Nullable
    private String label;
	@NonNull
    private List<Items> items = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public News() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param totalParam Integer
     * @param sourcesParam Sources
     * @param markupParam String
     * @param typeParam String
     * @param channelParam String
     * @param limitParam Integer
     * @param startParam Integer
     * @param labelParam String
     * @param itemsParam List<Items>
     */
    public News(@Nullable final Integer totalParam, @Nullable final Sources sourcesParam, @Nullable final String markupParam, @Nullable final String typeParam, @Nullable final String channelParam, @Nullable final Integer limitParam, @Nullable final Integer startParam, @Nullable final String labelParam, @NonNull final List<Items> itemsParam) {
        this.total = totalParam;
        this.sources = sourcesParam;
        this.markup = markupParam;
        this.type = typeParam;
        this.channel = channelParam;
        this.limit = limitParam;
        this.start = startParam;
        this.label = labelParam;
        this.items = itemsParam;
    }
    
    /**
     * Get value of total.
     *
     * @return Integer value of total
     */
    @Nullable
    public final Integer getTotal() {
        return this.total;
    }
    
    /**
     * Get value of sources.
     *
     * @return Sources value of sources
     */
    @Nullable
    public final Sources getSources() {
        return this.sources;
    }
    
    /**
     * Get value of markup.
     *
     * @return String value of markup
     */
    @Nullable
    public final String getMarkup() {
        return this.markup;
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
     * Get value of channel.
     *
     * @return String value of channel
     */
    @Nullable
    public final String getChannel() {
        return this.channel;
    }
    
    /**
     * Get value of limit.
     *
     * @return Integer value of limit
     */
    @Nullable
    public final Integer getLimit() {
        return this.limit;
    }
    
    /**
     * Get value of start.
     *
     * @return Integer value of start
     */
    @Nullable
    public final Integer getStart() {
        return this.start;
    }
    
    /**
     * Get value of label.
     *
     * @return String value of label
     */
    @Nullable
    public final String getLabel() {
        return this.label;
    }
    
    /**
     * Get value of items.
     *
     * @return List<Items> value of items
     */
    @NonNull
    public final List<Items> getItems() {
        return this.items;
    }

    
    /**
     * Set value of total.
     *
     * @param totalParam
     */
    public final void setTotal(@Nullable final Integer totalParam) {
        this.total = totalParam;
    }
    
    /**
     * Set value of sources.
     *
     * @param sourcesParam
     */
    public final void setSources(@Nullable final Sources sourcesParam) {
        this.sources = sourcesParam;
    }
    
    /**
     * Set value of markup.
     *
     * @param markupParam
     */
    public final void setMarkup(@Nullable final String markupParam) {
        this.markup = markupParam;
    }
    
    /**
     * Set value of type.
     *
     * @param typeParam
     */
    public final void setType(@Nullable final String typeParam) {
        this.type = typeParam;
    }
    
    /**
     * Set value of channel.
     *
     * @param channelParam
     */
    public final void setChannel(@Nullable final String channelParam) {
        this.channel = channelParam;
    }
    
    /**
     * Set value of limit.
     *
     * @param limitParam
     */
    public final void setLimit(@Nullable final Integer limitParam) {
        this.limit = limitParam;
    }
    
    /**
     * Set value of start.
     *
     * @param startParam
     */
    public final void setStart(@Nullable final Integer startParam) {
        this.start = startParam;
    }
    
    /**
     * Set value of label.
     *
     * @param labelParam
     */
    public final void setLabel(@Nullable final String labelParam) {
        this.label = labelParam;
    }
    
    /**
     * Set value of items.
     *
     * @param itemsParam
     */
    public final void getItems(@NonNull final List<Items> itemsParam) {
        this.items = itemsParam;
    }
}
