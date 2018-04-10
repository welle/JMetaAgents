package aka.jmetaagents.main.tvdb.series.seriesidimages;

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
     * getSeries with an new Data.
     */
    @org.junit.Test
    public void testGetSeries() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getSeries();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeries with an new Data.
     */
    @org.junit.Test
    public void testSetSeries() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setSeries(expectedValue);
        final Integer result = data.getSeries();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFanart with an new Data.
     */
    @org.junit.Test
    public void testGetFanart() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getFanart();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFanart with an new Data.
     */
    @org.junit.Test
    public void testSetFanart() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setFanart(expectedValue);
        final Integer result = data.getFanart();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeason with an new Data.
     */
    @org.junit.Test
    public void testGetSeason() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getSeason();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeason with an new Data.
     */
    @org.junit.Test
    public void testSetSeason() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setSeason(expectedValue);
        final Integer result = data.getSeason();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPoster with an new Data.
     */
    @org.junit.Test
    public void testGetPoster() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getPoster();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPoster with an new Data.
     */
    @org.junit.Test
    public void testSetPoster() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setPoster(expectedValue);
        final Integer result = data.getPoster();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeasonwide with an new Data.
     */
    @org.junit.Test
    public void testGetSeasonwide() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getSeasonwide();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeasonwide with an new Data.
     */
    @org.junit.Test
    public void testSetSeasonwide() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setSeasonwide(expectedValue);
        final Integer result = data.getSeasonwide();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}