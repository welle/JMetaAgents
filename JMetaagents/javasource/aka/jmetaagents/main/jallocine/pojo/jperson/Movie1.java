package aka.jmetaagents.main.jallocine.pojo.jperson;

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
public final class Movie1 {

	@Nullable
    private CastingShort castingShort;
	@Nullable
    private Integer code;
	@NonNull
    private List<Genre> genre = new ArrayList<>();
    @JsonProperty("poster")
	@Nullable
    private Poster1 poster1;
	@Nullable
    private Integer productionYear;
	@Nullable
    private String title;

	/**
     * Empty Constructor.
     */
    public Movie1() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param castingShortParam CastingShort
     * @param codeParam Integer
     * @param genreParam List<Genre>
     * @param poster1Param Poster1
     * @param productionYearParam Integer
     * @param titleParam String
     */
    public Movie1(@Nullable final CastingShort castingShortParam, @Nullable final Integer codeParam, @NonNull final List<Genre> genreParam, @Nullable final Poster1 poster1Param, @Nullable final Integer productionYearParam, @Nullable final String titleParam) {
        this.castingShort = castingShortParam;
        this.code = codeParam;
        this.genre = genreParam;
        this.poster1 = poster1Param;
        this.productionYear = productionYearParam;
        this.title = titleParam;
    }
    
    /**
     * Get value of castingShort.
     *
     * @return CastingShort value of castingShort
     */
    @Nullable
    public final CastingShort getCastingShort() {
        return this.castingShort;
    }
    
    /**
     * Get value of code.
     *
     * @return Integer value of code
     */
    @Nullable
    public final Integer getCode() {
        return this.code;
    }
    
    /**
     * Get value of genre.
     *
     * @return List<Genre> value of genre
     */
    @NonNull
    public final List<Genre> getGenre() {
        return this.genre;
    }
    
    /**
     * Get value of poster1.
     *
     * @return Poster1 value of poster1
     */
    @Nullable
    public final Poster1 getPoster1() {
        return this.poster1;
    }
    
    /**
     * Get value of productionYear.
     *
     * @return Integer value of productionYear
     */
    @Nullable
    public final Integer getProductionYear() {
        return this.productionYear;
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
     * Set value of castingShort.
     *
     * @param castingShortParam
     */
    public final void setCastingShort(@Nullable final CastingShort castingShortParam) {
        this.castingShort = castingShortParam;
    }
    
    /**
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final Integer codeParam) {
        this.code = codeParam;
    }
    
    /**
     * Set value of genre.
     *
     * @param genreParam
     */
    public final void getGenre(@NonNull final List<Genre> genreParam) {
        this.genre = genreParam;
    }
    
    /**
     * Set value of poster1.
     *
     * @param poster1Param
     */
    public final void setPoster1(@Nullable final Poster1 poster1Param) {
        this.poster1 = poster1Param;
    }
    
    /**
     * Set value of productionYear.
     *
     * @param productionYearParam
     */
    public final void setProductionYear(@Nullable final Integer productionYearParam) {
        this.productionYear = productionYearParam;
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
