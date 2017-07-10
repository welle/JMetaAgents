package aka.jmetaagents.main.jtvdb.pojo.jtvshowseason;

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
public final class JTVShowSeason {

	@NonNull
    private List<Data> data = new ArrayList<>();
	@Nullable
    private Links links;

	/**
     * Empty Constructor.
     */
    public JTVShowSeason() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dataParam List<Data>
     * @param linksParam Links
     */
    public JTVShowSeason(@NonNull final List<Data> dataParam, @Nullable final Links linksParam) {
        this.data = dataParam;
        this.links = linksParam;
    }
    
    /**
     * Get value of data.
     *
     * @return List<Data> value of data
     */
    @NonNull
    public final List<Data> getData() {
        return this.data;
    }
    
    /**
     * Get value of links.
     *
     * @return Links value of links
     */
    @Nullable
    public final Links getLinks() {
        return this.links;
    }

    
    /**
     * Set value of data.
     *
     * @param dataParam
     */
    public final void getData(@NonNull final List<Data> dataParam) {
        this.data = dataParam;
    }
    
    /**
     * Set value of links.
     *
     * @param linksParam
     */
    public final void setLinks(@Nullable final Links linksParam) {
        this.links = linksParam;
    }
}
