package aka.jmetaagents.main.tmdb.movies.moviesvideos;

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
 * JUnit skeleton for the Posters object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Posters.class })
public class Posters_JUnitTest {

    /**
     * getAspectRatio with an new Posters.
     */
    @org.junit.Test
    public void testGetAspectRatio() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        final Double result = posters.getAspectRatio();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAspectRatio with an new Posters.
     */
    @org.junit.Test
    public void testSetAspectRatio() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        posters.setAspectRatio(expectedValue);
        final Double result = posters.getAspectRatio();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFilePath with an new Posters.
     */
    @org.junit.Test
    public void testGetFilePath() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        final String result = posters.getFilePath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFilePath with an new Posters.
     */
    @org.junit.Test
    public void testSetFilePath() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        posters.setFilePath(expectedValue);
        final String result = posters.getFilePath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteAverage with an new Posters.
     */
    @org.junit.Test
    public void testGetVoteAverage() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        final Integer result = posters.getVoteAverage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteAverage with an new Posters.
     */
    @org.junit.Test
    public void testSetVoteAverage() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        posters.setVoteAverage(expectedValue);
        final Integer result = posters.getVoteAverage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWidth with an new Posters.
     */
    @org.junit.Test
    public void testGetWidth() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        final Integer result = posters.getWidth();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWidth with an new Posters.
     */
    @org.junit.Test
    public void testSetWidth() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        posters.setWidth(expectedValue);
        final Integer result = posters.getWidth();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getIso6391 with an new Posters.
     */
    @org.junit.Test
    public void testGetIso6391() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        final String result = posters.getIso6391();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setIso6391 with an new Posters.
     */
    @org.junit.Test
    public void testSetIso6391() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        posters.setIso6391(expectedValue);
        final String result = posters.getIso6391();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteCount with an new Posters.
     */
    @org.junit.Test
    public void testGetVoteCount() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        final Integer result = posters.getVoteCount();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteCount with an new Posters.
     */
    @org.junit.Test
    public void testSetVoteCount() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        posters.setVoteCount(expectedValue);
        final Integer result = posters.getVoteCount();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getHeight with an new Posters.
     */
    @org.junit.Test
    public void testGetHeight() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        final Integer result = posters.getHeight();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setHeight with an new Posters.
     */
    @org.junit.Test
    public void testSetHeight() {
        // arrange : set up the test
        final Posters posters = mock(Posters.class);
        assert posters != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        posters.setHeight(expectedValue);
        final Integer result = posters.getHeight();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}