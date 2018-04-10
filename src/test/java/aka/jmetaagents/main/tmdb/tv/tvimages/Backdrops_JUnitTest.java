package aka.jmetaagents.main.tmdb.tv.tvimages;

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
 * JUnit skeleton for the Backdrops object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Backdrops.class })
public class Backdrops_JUnitTest {

    /**
     * getAspectRatio with an new Backdrops.
     */
    @org.junit.Test
    public void testGetAspectRatio() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        final Double result = backdrops.getAspectRatio();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAspectRatio with an new Backdrops.
     */
    @org.junit.Test
    public void testSetAspectRatio() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        backdrops.setAspectRatio(expectedValue);
        final Double result = backdrops.getAspectRatio();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFilePath with an new Backdrops.
     */
    @org.junit.Test
    public void testGetFilePath() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        final String result = backdrops.getFilePath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFilePath with an new Backdrops.
     */
    @org.junit.Test
    public void testSetFilePath() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        backdrops.setFilePath(expectedValue);
        final String result = backdrops.getFilePath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteAverage with an new Backdrops.
     */
    @org.junit.Test
    public void testGetVoteAverage() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        final Double result = backdrops.getVoteAverage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteAverage with an new Backdrops.
     */
    @org.junit.Test
    public void testSetVoteAverage() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        backdrops.setVoteAverage(expectedValue);
        final Double result = backdrops.getVoteAverage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWidth with an new Backdrops.
     */
    @org.junit.Test
    public void testGetWidth() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        final Integer result = backdrops.getWidth();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWidth with an new Backdrops.
     */
    @org.junit.Test
    public void testSetWidth() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        backdrops.setWidth(expectedValue);
        final Integer result = backdrops.getWidth();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getIso6391 with an new Backdrops.
     */
    @org.junit.Test
    public void testGetIso6391() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        final String result = backdrops.getIso6391();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setIso6391 with an new Backdrops.
     */
    @org.junit.Test
    public void testSetIso6391() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        backdrops.setIso6391(expectedValue);
        final String result = backdrops.getIso6391();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteCount with an new Backdrops.
     */
    @org.junit.Test
    public void testGetVoteCount() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        final Integer result = backdrops.getVoteCount();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteCount with an new Backdrops.
     */
    @org.junit.Test
    public void testSetVoteCount() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        backdrops.setVoteCount(expectedValue);
        final Integer result = backdrops.getVoteCount();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getHeight with an new Backdrops.
     */
    @org.junit.Test
    public void testGetHeight() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        final Integer result = backdrops.getHeight();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setHeight with an new Backdrops.
     */
    @org.junit.Test
    public void testSetHeight() {
        // arrange : set up the test
        final Backdrops backdrops = mock(Backdrops.class);
        assert backdrops != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        backdrops.setHeight(expectedValue);
        final Integer result = backdrops.getHeight();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}