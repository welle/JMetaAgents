package aka.jmetaagents.main.tvdb.episodes.episodesid;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the Data object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Data.class })
public class Data_JUnitTest {

    /**
     * getThumbHeight with an new Data.
     */
    @org.junit.Test
    public void testGetThumbHeight() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getThumbHeight();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setThumbHeight with an new Data.
     */
    @org.junit.Test
    public void testSetThumbHeight() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setThumbHeight(expectedValue);
        final String result = data.getThumbHeight();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDvdSeason with an new Data.
     */
    @org.junit.Test
    public void testGetDvdSeason() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getDvdSeason();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDvdSeason with an new Data.
     */
    @org.junit.Test
    public void testSetDvdSeason() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setDvdSeason(expectedValue);
        final Integer result = data.getDvdSeason();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAirsBeforeEpisode with an new Data.
     */
    @org.junit.Test
    public void testGetAirsBeforeEpisode() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getAirsBeforeEpisode();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAirsBeforeEpisode with an new Data.
     */
    @org.junit.Test
    public void testSetAirsBeforeEpisode() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setAirsBeforeEpisode(expectedValue);
        final Integer result = data.getAirsBeforeEpisode();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbId with an new Data.
     */
    @org.junit.Test
    public void testGetImdbId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getImdbId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbId with an new Data.
     */
    @org.junit.Test
    public void testSetImdbId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setImdbId(expectedValue);
        final String result = data.getImdbId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDirectors with an new Data.
     */
    @org.junit.Test
    public void testGetDirectors() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final List result = data.getDirectors();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDirectors with an new Data.
     */
    @org.junit.Test
    public void testSetDirectors() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        data.setDirectors(expectedValue);
        final List<String> result = data.getDirectors();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getThumbAdded with an new Data.
     */
    @org.junit.Test
    public void testGetThumbAdded() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getThumbAdded();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setThumbAdded with an new Data.
     */
    @org.junit.Test
    public void testSetThumbAdded() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setThumbAdded(expectedValue);
        final String result = data.getThumbAdded();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAiredSeason with an new Data.
     */
    @org.junit.Test
    public void testGetAiredSeason() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getAiredSeason();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAiredSeason with an new Data.
     */
    @org.junit.Test
    public void testSetAiredSeason() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setAiredSeason(expectedValue);
        final Integer result = data.getAiredSeason();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getShowUrl with an new Data.
     */
    @org.junit.Test
    public void testGetShowUrl() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getShowUrl();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setShowUrl with an new Data.
     */
    @org.junit.Test
    public void testSetShowUrl() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setShowUrl(expectedValue);
        final String result = data.getShowUrl();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeriesId with an new Data.
     */
    @org.junit.Test
    public void testGetSeriesId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getSeriesId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeriesId with an new Data.
     */
    @org.junit.Test
    public void testSetSeriesId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setSeriesId(expectedValue);
        final String result = data.getSeriesId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLastUpdated with an new Data.
     */
    @org.junit.Test
    public void testGetLastUpdated() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getLastUpdated();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLastUpdated with an new Data.
     */
    @org.junit.Test
    public void testSetLastUpdated() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setLastUpdated(expectedValue);
        final Integer result = data.getLastUpdated();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProductionCode with an new Data.
     */
    @org.junit.Test
    public void testGetProductionCode() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getProductionCode();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProductionCode with an new Data.
     */
    @org.junit.Test
    public void testSetProductionCode() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setProductionCode(expectedValue);
        final String result = data.getProductionCode();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getThumbAuthor with an new Data.
     */
    @org.junit.Test
    public void testGetThumbAuthor() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getThumbAuthor();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setThumbAuthor with an new Data.
     */
    @org.junit.Test
    public void testSetThumbAuthor() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setThumbAuthor(expectedValue);
        final Integer result = data.getThumbAuthor();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new Data.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new Data.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setId(expectedValue);
        final Integer result = data.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDvdDiscid with an new Data.
     */
    @org.junit.Test
    public void testGetDvdDiscid() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getDvdDiscid();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDvdDiscid with an new Data.
     */
    @org.junit.Test
    public void testSetDvdDiscid() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setDvdDiscid(expectedValue);
        final String result = data.getDvdDiscid();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAiredEpisodeNumber with an new Data.
     */
    @org.junit.Test
    public void testGetAiredEpisodeNumber() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getAiredEpisodeNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAiredEpisodeNumber with an new Data.
     */
    @org.junit.Test
    public void testSetAiredEpisodeNumber() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setAiredEpisodeNumber(expectedValue);
        final Integer result = data.getAiredEpisodeNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAirsBeforeSeason with an new Data.
     */
    @org.junit.Test
    public void testGetAirsBeforeSeason() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getAirsBeforeSeason();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAirsBeforeSeason with an new Data.
     */
    @org.junit.Test
    public void testSetAirsBeforeSeason() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setAirsBeforeSeason(expectedValue);
        final Integer result = data.getAirsBeforeSeason();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLastUpdatedBy with an new Data.
     */
    @org.junit.Test
    public void testGetLastUpdatedBy() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getLastUpdatedBy();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLastUpdatedBy with an new Data.
     */
    @org.junit.Test
    public void testSetLastUpdatedBy() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setLastUpdatedBy(expectedValue);
        final String result = data.getLastUpdatedBy();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOverview with an new Data.
     */
    @org.junit.Test
    public void testGetOverview() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getOverview();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOverview with an new Data.
     */
    @org.junit.Test
    public void testSetOverview() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setOverview(expectedValue);
        final String result = data.getOverview();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAirsAfterSeason with an new Data.
     */
    @org.junit.Test
    public void testGetAirsAfterSeason() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getAirsAfterSeason();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAirsAfterSeason with an new Data.
     */
    @org.junit.Test
    public void testSetAirsAfterSeason() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setAirsAfterSeason(expectedValue);
        final Integer result = data.getAirsAfterSeason();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSiteRating with an new Data.
     */
    @org.junit.Test
    public void testGetSiteRating() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getSiteRating();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSiteRating with an new Data.
     */
    @org.junit.Test
    public void testSetSiteRating() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setSiteRating(expectedValue);
        final Integer result = data.getSiteRating();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAbsoluteNumber with an new Data.
     */
    @org.junit.Test
    public void testGetAbsoluteNumber() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getAbsoluteNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAbsoluteNumber with an new Data.
     */
    @org.junit.Test
    public void testSetAbsoluteNumber() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setAbsoluteNumber(expectedValue);
        final Integer result = data.getAbsoluteNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDirector with an new Data.
     */
    @org.junit.Test
    public void testGetDirector() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getDirector();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDirector with an new Data.
     */
    @org.junit.Test
    public void testSetDirector() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setDirector(expectedValue);
        final String result = data.getDirector();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getEpisodeName with an new Data.
     */
    @org.junit.Test
    public void testGetEpisodeName() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getEpisodeName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setEpisodeName with an new Data.
     */
    @org.junit.Test
    public void testSetEpisodeName() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setEpisodeName(expectedValue);
        final String result = data.getEpisodeName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFirstAired with an new Data.
     */
    @org.junit.Test
    public void testGetFirstAired() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getFirstAired();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFirstAired with an new Data.
     */
    @org.junit.Test
    public void testSetFirstAired() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setFirstAired(expectedValue);
        final String result = data.getFirstAired();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getThumbWidth with an new Data.
     */
    @org.junit.Test
    public void testGetThumbWidth() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getThumbWidth();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setThumbWidth with an new Data.
     */
    @org.junit.Test
    public void testSetThumbWidth() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setThumbWidth(expectedValue);
        final String result = data.getThumbWidth();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWriters with an new Data.
     */
    @org.junit.Test
    public void testGetWriters() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final List result = data.getWriters();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWriters with an new Data.
     */
    @org.junit.Test
    public void testSetWriters() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        data.setWriters(expectedValue);
        final List<String> result = data.getWriters();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDvdChapter with an new Data.
     */
    @org.junit.Test
    public void testGetDvdChapter() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getDvdChapter();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDvdChapter with an new Data.
     */
    @org.junit.Test
    public void testSetDvdChapter() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setDvdChapter(expectedValue);
        final Integer result = data.getDvdChapter();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSiteRatingCount with an new Data.
     */
    @org.junit.Test
    public void testGetSiteRatingCount() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getSiteRatingCount();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSiteRatingCount with an new Data.
     */
    @org.junit.Test
    public void testSetSiteRatingCount() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setSiteRatingCount(expectedValue);
        final Integer result = data.getSiteRatingCount();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFilename with an new Data.
     */
    @org.junit.Test
    public void testGetFilename() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getFilename();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFilename with an new Data.
     */
    @org.junit.Test
    public void testSetFilename() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setFilename(expectedValue);
        final String result = data.getFilename();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGuestStars with an new Data.
     */
    @org.junit.Test
    public void testGetGuestStars() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final List result = data.getGuestStars();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGuestStars with an new Data.
     */
    @org.junit.Test
    public void testSetGuestStars() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        data.setGuestStars(expectedValue);
        final List<String> result = data.getGuestStars();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDvdEpisodeNumber with an new Data.
     */
    @org.junit.Test
    public void testGetDvdEpisodeNumber() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getDvdEpisodeNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDvdEpisodeNumber with an new Data.
     */
    @org.junit.Test
    public void testSetDvdEpisodeNumber() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setDvdEpisodeNumber(expectedValue);
        final Integer result = data.getDvdEpisodeNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}