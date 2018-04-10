package aka.jmetaagents.main.tvdb.series.seriesidimagesqueryparams;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Data {

	@NonNull
    private List<String> subKey = new ArrayList<>();
	@Nullable
    private String languageId;
	@Nullable
    private String keyType;
	@NonNull
    private List<String> resolution = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public Data() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param subKeyParam List<String>
     * @param languageIdParam String
     * @param keyTypeParam String
     * @param resolutionParam List<String>
     */
    public Data(@NonNull final List<String> subKeyParam, @Nullable final String languageIdParam, @Nullable final String keyTypeParam, @NonNull final List<String> resolutionParam) {
        this.subKey = subKeyParam;
        this.languageId = languageIdParam;
        this.keyType = keyTypeParam;
        this.resolution = resolutionParam;
    }
    
    /**
     * Get value of subKey.
     *
     * @return List<String> value of subKey
     */
    @NonNull
    public final List<String> getSubKey() {
        return this.subKey;
    }
    
    /**
     * Get value of languageId.
     *
     * @return String value of languageId
     */
    @Nullable
    public final String getLanguageId() {
        return this.languageId;
    }
    
    /**
     * Get value of keyType.
     *
     * @return String value of keyType
     */
    @Nullable
    public final String getKeyType() {
        return this.keyType;
    }
    
    /**
     * Get value of resolution.
     *
     * @return List<String> value of resolution
     */
    @NonNull
    public final List<String> getResolution() {
        return this.resolution;
    }

    
    /**
     * Set value of subKey.
     *
     * @param subKeyParam
     */
    public final void setSubKey(@NonNull final List<String> subKeyParam) {
        this.subKey = subKeyParam;
    }
    
    /**
     * Set value of languageId.
     *
     * @param languageIdParam
     */
    public final void setLanguageId(@Nullable final String languageIdParam) {
        this.languageId = languageIdParam;
    }
    
    /**
     * Set value of keyType.
     *
     * @param keyTypeParam
     */
    public final void setKeyType(@Nullable final String keyTypeParam) {
        this.keyType = keyTypeParam;
    }
    
    /**
     * Set value of resolution.
     *
     * @param resolutionParam
     */
    public final void setResolution(@NonNull final List<String> resolutionParam) {
        this.resolution = resolutionParam;
    }
}
