package aka.jmetaagents.main.jimdb.pojo.jmoviesearch;

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
public final class Results {

	@Nullable
    private String label;
    @JsonProperty("list")
	@NonNull
    private List<ListRes> listRes = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public Results() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param labelParam String
     * @param listResParam List<ListRes>
     */
    public Results(@Nullable final String labelParam, @NonNull final List<ListRes> listResParam) {
        this.label = labelParam;
        this.listRes = listResParam;
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
     * Get value of listRes.
     *
     * @return List<ListRes> value of listRes
     */
    @NonNull
    public final List<ListRes> getListRes() {
        return this.listRes;
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
     * Set value of listRes.
     *
     * @param listResParam
     */
    public final void getListRes(@NonNull final List<ListRes> listResParam) {
        this.listRes = listResParam;
    }
}
