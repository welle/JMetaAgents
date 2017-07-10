package aka.jmetaagents.main.jtvdb.pojo.jtvshowsearch;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowsearch.deserializers.DateYearMonthDayDashDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Data {

	@Nullable
    private String overview;
	@NonNull
    private List<String> aliases = new ArrayList<>();
	@Nullable
    private String seriesName;
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date firstAired;
	@Nullable
    private String banner;
	@Nullable
    private Integer id;
	@Nullable
    private String network;
	@Nullable
    private String status;

	/**
     * Empty Constructor.
     */
    public Data() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param overviewParam String
     * @param aliasesParam List<String>
     * @param seriesNameParam String
     * @param firstAiredParam Date
     * @param bannerParam String
     * @param idParam Integer
     * @param networkParam String
     * @param statusParam String
     */
    public Data(@Nullable final String overviewParam, @NonNull final List<String> aliasesParam, @Nullable final String seriesNameParam, @Nullable final Date firstAiredParam, @Nullable final String bannerParam, @Nullable final Integer idParam, @Nullable final String networkParam, @Nullable final String statusParam) {
        this.overview = overviewParam;
        this.aliases = aliasesParam;
        this.seriesName = seriesNameParam;
        this.firstAired = firstAiredParam;
        this.banner = bannerParam;
        this.id = idParam;
        this.network = networkParam;
        this.status = statusParam;
    }
    
    /**
     * Get value of overview.
     *
     * @return String value of overview
     */
    @Nullable
    public final String getOverview() {
        return this.overview;
    }
    
    /**
     * Get value of aliases.
     *
     * @return List<String> value of aliases
     */
    @NonNull
    public final List<String> getAliases() {
        return this.aliases;
    }
    
    /**
     * Get value of seriesName.
     *
     * @return String value of seriesName
     */
    @Nullable
    public final String getSeriesName() {
        return this.seriesName;
    }
    
    /**
     * Get value of firstAired.
     *
     * @return Date value of firstAired
     */
    @Nullable
    public final Date getFirstAired() {
        return this.firstAired;
    }
    
    /**
     * Get value of banner.
     *
     * @return String value of banner
     */
    @Nullable
    public final String getBanner() {
        return this.banner;
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
     * Get value of network.
     *
     * @return String value of network
     */
    @Nullable
    public final String getNetwork() {
        return this.network;
    }
    
    /**
     * Get value of status.
     *
     * @return String value of status
     */
    @Nullable
    public final String getStatus() {
        return this.status;
    }

    
    /**
     * Set value of overview.
     *
     * @param overviewParam
     */
    public final void setOverview(@Nullable final String overviewParam) {
        this.overview = overviewParam;
    }
    
    /**
     * Set value of aliases.
     *
     * @param aliasesParam
     */
    public final void getAliases(@NonNull final List<String> aliasesParam) {
        this.aliases = aliasesParam;
    }
    
    /**
     * Set value of seriesName.
     *
     * @param seriesNameParam
     */
    public final void setSeriesName(@Nullable final String seriesNameParam) {
        this.seriesName = seriesNameParam;
    }
    
    /**
     * Set value of firstAired.
     *
     * @param firstAiredParam
     */
    public final void setFirstAired(@Nullable final Date firstAiredParam) {
        this.firstAired = firstAiredParam;
    }
    
    /**
     * Set value of banner.
     *
     * @param bannerParam
     */
    public final void setBanner(@Nullable final String bannerParam) {
        this.banner = bannerParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of network.
     *
     * @param networkParam
     */
    public final void setNetwork(@Nullable final String networkParam) {
        this.network = networkParam;
    }
    
    /**
     * Set value of status.
     *
     * @param statusParam
     */
    public final void setStatus(@Nullable final String statusParam) {
        this.status = statusParam;
    }
}
