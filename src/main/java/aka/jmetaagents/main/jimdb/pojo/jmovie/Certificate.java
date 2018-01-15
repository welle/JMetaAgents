package aka.jmetaagents.main.jimdb.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Certificate {

	@Nullable
    private String certificate;
	@Nullable
    private String attr;

	/**
     * Empty Constructor.
     */
    public Certificate() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param certificateParam String
     * @param attrParam String
     */
    public Certificate(@Nullable final String certificateParam, @Nullable final String attrParam) {
        this.certificate = certificateParam;
        this.attr = attrParam;
    }
    
    /**
     * Get value of certificate.
     *
     * @return String value of certificate
     */
    @Nullable
    public final String getCertificate() {
        return this.certificate;
    }
    
    /**
     * Get value of attr.
     *
     * @return String value of attr
     */
    @Nullable
    public final String getAttr() {
        return this.attr;
    }

    
    /**
     * Set value of certificate.
     *
     * @param certificateParam
     */
    public final void setCertificate(@Nullable final String certificateParam) {
        this.certificate = certificateParam;
    }
    
    /**
     * Set value of attr.
     *
     * @param attrParam
     */
    public final void setAttr(@Nullable final String attrParam) {
        this.attr = attrParam;
    }
}
