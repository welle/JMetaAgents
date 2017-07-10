package aka.jmetaagents.main.jimdb.pojo.jmoviesearch;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jimdb.pojo.jmoviesearch.deserializers.DateYearDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class ListRes {

	@Nullable
    private Image image;
    @JsonDeserialize(using = DateYearDeserializer.class)
    private Date year;
	@Nullable
    private String tconst;
    @JsonProperty("known_for")
	@Nullable
    private String knownFor;
	@Nullable
    private String name;
	@Nullable
    private String nconst;
	@NonNull
    private List<Principals> principals = new ArrayList<>();
	@Nullable
    private String type;
	@Nullable
    private String title;

	/**
     * Empty Constructor.
     */
    public ListRes() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param imageParam Image
     * @param yearParam Date
     * @param tconstParam String
     * @param knownForParam String
     * @param nameParam String
     * @param nconstParam String
     * @param principalsParam List<Principals>
     * @param typeParam String
     * @param titleParam String
     */
    public ListRes(@Nullable final Image imageParam, @Nullable final Date yearParam, @Nullable final String tconstParam, @Nullable final String knownForParam, @Nullable final String nameParam, @Nullable final String nconstParam, @NonNull final List<Principals> principalsParam, @Nullable final String typeParam, @Nullable final String titleParam) {
        this.image = imageParam;
        this.year = yearParam;
        this.tconst = tconstParam;
        this.knownFor = knownForParam;
        this.name = nameParam;
        this.nconst = nconstParam;
        this.principals = principalsParam;
        this.type = typeParam;
        this.title = titleParam;
    }
    
    /**
     * Get value of image.
     *
     * @return Image value of image
     */
    @Nullable
    public final Image getImage() {
        return this.image;
    }
    
    /**
     * Get value of year.
     *
     * @return Date value of year
     */
    @Nullable
    public final Date getYear() {
        return this.year;
    }
    
    /**
     * Get value of tconst.
     *
     * @return String value of tconst
     */
    @Nullable
    public final String getTconst() {
        return this.tconst;
    }
    
    /**
     * Get value of knownFor.
     *
     * @return String value of knownFor
     */
    @Nullable
    public final String getKnownFor() {
        return this.knownFor;
    }
    
    /**
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
    }
    
    /**
     * Get value of nconst.
     *
     * @return String value of nconst
     */
    @Nullable
    public final String getNconst() {
        return this.nconst;
    }
    
    /**
     * Get value of principals.
     *
     * @return List<Principals> value of principals
     */
    @NonNull
    public final List<Principals> getPrincipals() {
        return this.principals;
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
     * Get value of title.
     *
     * @return String value of title
     */
    @Nullable
    public final String getTitle() {
        return this.title;
    }

    
    /**
     * Set value of image.
     *
     * @param imageParam
     */
    public final void setImage(@Nullable final Image imageParam) {
        this.image = imageParam;
    }
    
    /**
     * Set value of year.
     *
     * @param yearParam
     */
    public final void setYear(@Nullable final Date yearParam) {
        this.year = yearParam;
    }
    
    /**
     * Set value of tconst.
     *
     * @param tconstParam
     */
    public final void setTconst(@Nullable final String tconstParam) {
        this.tconst = tconstParam;
    }
    
    /**
     * Set value of knownFor.
     *
     * @param knownForParam
     */
    public final void setKnownFor(@Nullable final String knownForParam) {
        this.knownFor = knownForParam;
    }
    
    /**
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
    }
    
    /**
     * Set value of nconst.
     *
     * @param nconstParam
     */
    public final void setNconst(@Nullable final String nconstParam) {
        this.nconst = nconstParam;
    }
    
    /**
     * Set value of principals.
     *
     * @param principalsParam
     */
    public final void getPrincipals(@NonNull final List<Principals> principalsParam) {
        this.principals = principalsParam;
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
     * Set value of title.
     *
     * @param titleParam
     */
    public final void setTitle(@Nullable final String titleParam) {
        this.title = titleParam;
    }
}
