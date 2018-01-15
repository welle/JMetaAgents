package aka.jmetaagents.main.jallocine.pojo.jperson;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jallocine.pojo.jperson.deserializers.DateYearMonthDayDashDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Person {

	@NonNull
    private List<Participation> participation = new ArrayList<>();
	@NonNull
    private List<News> news = new ArrayList<>();
	@Nullable
    private String activityShort;
	@Nullable
    private Integer code;
	@Nullable
    private Integer hasTopFilmography;
	@Nullable
    private Integer gender;
	@NonNull
    private List<Link> link = new ArrayList<>();
	@NonNull
    private List<FestivalSection> festivalSection = new ArrayList<>();
	@Nullable
    private String biography;
	@NonNull
    private List<Media> media = new ArrayList<>();
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date birthDate;
    @JsonProperty("picture")
	@Nullable
    private Picture2 picture2;
	@Nullable
    private Trailer trailer;
	@Nullable
    private String birthPlace;
    @JsonProperty("activity")
	@NonNull
    private List<Activity2> activity2 = new ArrayList<>();
	@Nullable
    private String biographyShort;
	@NonNull
    private List<Nationality> nationality = new ArrayList<>();
	@NonNull
    private List<Feature> feature = new ArrayList<>();
    @JsonProperty("statistics")
	@Nullable
    private Statistics2 statistics2;
	@Nullable
    private Name name;
	@Nullable
    private String trailerEmbed;

	/**
     * Empty Constructor.
     */
    public Person() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param participationParam List<Participation>
     * @param newsParam List<News>
     * @param activityShortParam String
     * @param codeParam Integer
     * @param hasTopFilmographyParam Integer
     * @param genderParam Integer
     * @param linkParam List<Link>
     * @param festivalSectionParam List<FestivalSection>
     * @param biographyParam String
     * @param mediaParam List<Media>
     * @param birthDateParam Date
     * @param picture2Param Picture2
     * @param trailerParam Trailer
     * @param birthPlaceParam String
     * @param activity2Param List<Activity2>
     * @param biographyShortParam String
     * @param nationalityParam List<Nationality>
     * @param featureParam List<Feature>
     * @param statistics2Param Statistics2
     * @param nameParam Name
     * @param trailerEmbedParam String
     */
    public Person(@NonNull final List<Participation> participationParam, @NonNull final List<News> newsParam, @Nullable final String activityShortParam, @Nullable final Integer codeParam, @Nullable final Integer hasTopFilmographyParam, @Nullable final Integer genderParam, @NonNull final List<Link> linkParam, @NonNull final List<FestivalSection> festivalSectionParam, @Nullable final String biographyParam, @NonNull final List<Media> mediaParam, @Nullable final Date birthDateParam, @Nullable final Picture2 picture2Param, @Nullable final Trailer trailerParam, @Nullable final String birthPlaceParam, @NonNull final List<Activity2> activity2Param, @Nullable final String biographyShortParam, @NonNull final List<Nationality> nationalityParam, @NonNull final List<Feature> featureParam, @Nullable final Statistics2 statistics2Param, @Nullable final Name nameParam, @Nullable final String trailerEmbedParam) {
        this.participation = participationParam;
        this.news = newsParam;
        this.activityShort = activityShortParam;
        this.code = codeParam;
        this.hasTopFilmography = hasTopFilmographyParam;
        this.gender = genderParam;
        this.link = linkParam;
        this.festivalSection = festivalSectionParam;
        this.biography = biographyParam;
        this.media = mediaParam;
        this.birthDate = birthDateParam;
        this.picture2 = picture2Param;
        this.trailer = trailerParam;
        this.birthPlace = birthPlaceParam;
        this.activity2 = activity2Param;
        this.biographyShort = biographyShortParam;
        this.nationality = nationalityParam;
        this.feature = featureParam;
        this.statistics2 = statistics2Param;
        this.name = nameParam;
        this.trailerEmbed = trailerEmbedParam;
    }
    
    /**
     * Get value of participation.
     *
     * @return List<Participation> value of participation
     */
    @NonNull
    public final List<Participation> getParticipation() {
        return this.participation;
    }
    
    /**
     * Get value of news.
     *
     * @return List<News> value of news
     */
    @NonNull
    public final List<News> getNews() {
        return this.news;
    }
    
    /**
     * Get value of activityShort.
     *
     * @return String value of activityShort
     */
    @Nullable
    public final String getActivityShort() {
        return this.activityShort;
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
     * Get value of hasTopFilmography.
     *
     * @return Integer value of hasTopFilmography
     */
    @Nullable
    public final Integer getHasTopFilmography() {
        return this.hasTopFilmography;
    }
    
    /**
     * Get value of gender.
     *
     * @return Integer value of gender
     */
    @Nullable
    public final Integer getGender() {
        return this.gender;
    }
    
    /**
     * Get value of link.
     *
     * @return List<Link> value of link
     */
    @NonNull
    public final List<Link> getLink() {
        return this.link;
    }
    
    /**
     * Get value of festivalSection.
     *
     * @return List<FestivalSection> value of festivalSection
     */
    @NonNull
    public final List<FestivalSection> getFestivalSection() {
        return this.festivalSection;
    }
    
    /**
     * Get value of biography.
     *
     * @return String value of biography
     */
    @Nullable
    public final String getBiography() {
        return this.biography;
    }
    
    /**
     * Get value of media.
     *
     * @return List<Media> value of media
     */
    @NonNull
    public final List<Media> getMedia() {
        return this.media;
    }
    
    /**
     * Get value of birthDate.
     *
     * @return Date value of birthDate
     */
    @Nullable
    public final Date getBirthDate() {
        return this.birthDate;
    }
    
    /**
     * Get value of picture2.
     *
     * @return Picture2 value of picture2
     */
    @Nullable
    public final Picture2 getPicture2() {
        return this.picture2;
    }
    
    /**
     * Get value of trailer.
     *
     * @return Trailer value of trailer
     */
    @Nullable
    public final Trailer getTrailer() {
        return this.trailer;
    }
    
    /**
     * Get value of birthPlace.
     *
     * @return String value of birthPlace
     */
    @Nullable
    public final String getBirthPlace() {
        return this.birthPlace;
    }
    
    /**
     * Get value of activity2.
     *
     * @return List<Activity2> value of activity2
     */
    @NonNull
    public final List<Activity2> getActivity2() {
        return this.activity2;
    }
    
    /**
     * Get value of biographyShort.
     *
     * @return String value of biographyShort
     */
    @Nullable
    public final String getBiographyShort() {
        return this.biographyShort;
    }
    
    /**
     * Get value of nationality.
     *
     * @return List<Nationality> value of nationality
     */
    @NonNull
    public final List<Nationality> getNationality() {
        return this.nationality;
    }
    
    /**
     * Get value of feature.
     *
     * @return List<Feature> value of feature
     */
    @NonNull
    public final List<Feature> getFeature() {
        return this.feature;
    }
    
    /**
     * Get value of statistics2.
     *
     * @return Statistics2 value of statistics2
     */
    @Nullable
    public final Statistics2 getStatistics2() {
        return this.statistics2;
    }
    
    /**
     * Get value of name.
     *
     * @return Name value of name
     */
    @Nullable
    public final Name getName() {
        return this.name;
    }
    
    /**
     * Get value of trailerEmbed.
     *
     * @return String value of trailerEmbed
     */
    @Nullable
    public final String getTrailerEmbed() {
        return this.trailerEmbed;
    }

    
    /**
     * Set value of participation.
     *
     * @param participationParam
     */
    public final void getParticipation(@NonNull final List<Participation> participationParam) {
        this.participation = participationParam;
    }
    
    /**
     * Set value of news.
     *
     * @param newsParam
     */
    public final void getNews(@NonNull final List<News> newsParam) {
        this.news = newsParam;
    }
    
    /**
     * Set value of activityShort.
     *
     * @param activityShortParam
     */
    public final void setActivityShort(@Nullable final String activityShortParam) {
        this.activityShort = activityShortParam;
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
     * Set value of hasTopFilmography.
     *
     * @param hasTopFilmographyParam
     */
    public final void setHasTopFilmography(@Nullable final Integer hasTopFilmographyParam) {
        this.hasTopFilmography = hasTopFilmographyParam;
    }
    
    /**
     * Set value of gender.
     *
     * @param genderParam
     */
    public final void setGender(@Nullable final Integer genderParam) {
        this.gender = genderParam;
    }
    
    /**
     * Set value of link.
     *
     * @param linkParam
     */
    public final void getLink(@NonNull final List<Link> linkParam) {
        this.link = linkParam;
    }
    
    /**
     * Set value of festivalSection.
     *
     * @param festivalSectionParam
     */
    public final void getFestivalSection(@NonNull final List<FestivalSection> festivalSectionParam) {
        this.festivalSection = festivalSectionParam;
    }
    
    /**
     * Set value of biography.
     *
     * @param biographyParam
     */
    public final void setBiography(@Nullable final String biographyParam) {
        this.biography = biographyParam;
    }
    
    /**
     * Set value of media.
     *
     * @param mediaParam
     */
    public final void getMedia(@NonNull final List<Media> mediaParam) {
        this.media = mediaParam;
    }
    
    /**
     * Set value of birthDate.
     *
     * @param birthDateParam
     */
    public final void setBirthDate(@Nullable final Date birthDateParam) {
        this.birthDate = birthDateParam;
    }
    
    /**
     * Set value of picture2.
     *
     * @param picture2Param
     */
    public final void setPicture2(@Nullable final Picture2 picture2Param) {
        this.picture2 = picture2Param;
    }
    
    /**
     * Set value of trailer.
     *
     * @param trailerParam
     */
    public final void setTrailer(@Nullable final Trailer trailerParam) {
        this.trailer = trailerParam;
    }
    
    /**
     * Set value of birthPlace.
     *
     * @param birthPlaceParam
     */
    public final void setBirthPlace(@Nullable final String birthPlaceParam) {
        this.birthPlace = birthPlaceParam;
    }
    
    /**
     * Set value of activity2.
     *
     * @param activity2Param
     */
    public final void getActivity2(@NonNull final List<Activity2> activity2Param) {
        this.activity2 = activity2Param;
    }
    
    /**
     * Set value of biographyShort.
     *
     * @param biographyShortParam
     */
    public final void setBiographyShort(@Nullable final String biographyShortParam) {
        this.biographyShort = biographyShortParam;
    }
    
    /**
     * Set value of nationality.
     *
     * @param nationalityParam
     */
    public final void getNationality(@NonNull final List<Nationality> nationalityParam) {
        this.nationality = nationalityParam;
    }
    
    /**
     * Set value of feature.
     *
     * @param featureParam
     */
    public final void getFeature(@NonNull final List<Feature> featureParam) {
        this.feature = featureParam;
    }
    
    /**
     * Set value of statistics2.
     *
     * @param statistics2Param
     */
    public final void setStatistics2(@Nullable final Statistics2 statistics2Param) {
        this.statistics2 = statistics2Param;
    }
    
    /**
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final Name nameParam) {
        this.name = nameParam;
    }
    
    /**
     * Set value of trailerEmbed.
     *
     * @param trailerEmbedParam
     */
    public final void setTrailerEmbed(@Nullable final String trailerEmbedParam) {
        this.trailerEmbed = trailerEmbedParam;
    }
}
