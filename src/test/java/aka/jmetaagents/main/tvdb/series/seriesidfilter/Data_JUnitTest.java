package aka.jmetaagents.main.tvdb.series.seriesidfilter;

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
     * getAirsDayOfWeek with an new Data.
     */
    @org.junit.Test
    public void testGetAirsDayOfWeek() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getAirsDayOfWeek();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAirsDayOfWeek with an new Data.
     */
    @org.junit.Test
    public void testSetAirsDayOfWeek() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setAirsDayOfWeek(expectedValue);
        final String result = data.getAirsDayOfWeek();

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
     * getAliases with an new Data.
     */
    @org.junit.Test
    public void testGetAliases() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final List result = data.getAliases();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAliases with an new Data.
     */
    @org.junit.Test
    public void testSetAliases() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        data.setAliases(expectedValue);
        final List<String> result = data.getAliases();

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
     * getAdded with an new Data.
     */
    @org.junit.Test
    public void testGetAdded() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getAdded();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAdded with an new Data.
     */
    @org.junit.Test
    public void testSetAdded() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setAdded(expectedValue);
        final String result = data.getAdded();

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
     * getSeriesName with an new Data.
     */
    @org.junit.Test
    public void testGetSeriesName() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getSeriesName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeriesName with an new Data.
     */
    @org.junit.Test
    public void testSetSeriesName() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setSeriesName(expectedValue);
        final String result = data.getSeriesName();

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
     * getRating with an new Data.
     */
    @org.junit.Test
    public void testGetRating() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getRating();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRating with an new Data.
     */
    @org.junit.Test
    public void testSetRating() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setRating(expectedValue);
        final String result = data.getRating();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBanner with an new Data.
     */
    @org.junit.Test
    public void testGetBanner() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getBanner();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBanner with an new Data.
     */
    @org.junit.Test
    public void testSetBanner() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setBanner(expectedValue);
        final String result = data.getBanner();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRuntime with an new Data.
     */
    @org.junit.Test
    public void testGetRuntime() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getRuntime();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRuntime with an new Data.
     */
    @org.junit.Test
    public void testSetRuntime() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setRuntime(expectedValue);
        final String result = data.getRuntime();

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
        final Integer result = data.getSeriesId();

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
        final Integer expectedValue = null;
        data.setSeriesId(expectedValue);
        final Integer result = data.getSeriesId();

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
     * getNetwork with an new Data.
     */
    @org.junit.Test
    public void testGetNetwork() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getNetwork();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setNetwork with an new Data.
     */
    @org.junit.Test
    public void testSetNetwork() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setNetwork(expectedValue);
        final String result = data.getNetwork();

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
     * getAirsTime with an new Data.
     */
    @org.junit.Test
    public void testGetAirsTime() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getAirsTime();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAirsTime with an new Data.
     */
    @org.junit.Test
    public void testSetAirsTime() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setAirsTime(expectedValue);
        final String result = data.getAirsTime();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getZap2itId with an new Data.
     */
    @org.junit.Test
    public void testGetZap2itId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getZap2itId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setZap2itId with an new Data.
     */
    @org.junit.Test
    public void testSetZap2itId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setZap2itId(expectedValue);
        final String result = data.getZap2itId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGenre with an new Data.
     */
    @org.junit.Test
    public void testGetGenre() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final List result = data.getGenre();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenre with an new Data.
     */
    @org.junit.Test
    public void testSetGenre() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        data.setGenre(expectedValue);
        final List<String> result = data.getGenre();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getNetworkId with an new Data.
     */
    @org.junit.Test
    public void testGetNetworkId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getNetworkId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setNetworkId with an new Data.
     */
    @org.junit.Test
    public void testSetNetworkId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setNetworkId(expectedValue);
        final String result = data.getNetworkId();

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
     * getStatus with an new Data.
     */
    @org.junit.Test
    public void testGetStatus() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getStatus();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setStatus with an new Data.
     */
    @org.junit.Test
    public void testSetStatus() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setStatus(expectedValue);
        final String result = data.getStatus();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}