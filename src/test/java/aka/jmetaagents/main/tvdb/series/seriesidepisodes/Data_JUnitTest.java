package aka.jmetaagents.main.tvdb.series.seriesidepisodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;


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
}