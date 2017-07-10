package aka.jmetaagents.main.jallocine.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class MovieCertificate {

	@Nullable
    private Certificate certificate;

	/**
     * Empty Constructor.
     */
    public MovieCertificate() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param certificateParam Certificate
     */
    public MovieCertificate(@Nullable final Certificate certificateParam) {
        this.certificate = certificateParam;
    }
    
    /**
     * Get value of certificate.
     *
     * @return Certificate value of certificate
     */
    @Nullable
    public final Certificate getCertificate() {
        return this.certificate;
    }

    
    /**
     * Set value of certificate.
     *
     * @param certificateParam
     */
    public final void setCertificate(@Nullable final Certificate certificateParam) {
        this.certificate = certificateParam;
    }
}
