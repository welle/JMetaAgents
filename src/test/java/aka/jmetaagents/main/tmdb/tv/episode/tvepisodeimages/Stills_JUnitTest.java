package aka.jmetaagents.main.tmdb.tv.episode.tvepisodeimages;

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
 * JUnit skeleton for the Stills object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Stills.class })
public class Stills_JUnitTest {

    /**
     * getAspectRatio with an new Stills.
     */
    @org.junit.Test
    public void testGetAspectRatio() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        final Double result = stills.getAspectRatio();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAspectRatio with an new Stills.
     */
    @org.junit.Test
    public void testSetAspectRatio() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        stills.setAspectRatio(expectedValue);
        final Double result = stills.getAspectRatio();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFilePath with an new Stills.
     */
    @org.junit.Test
    public void testGetFilePath() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        final String result = stills.getFilePath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFilePath with an new Stills.
     */
    @org.junit.Test
    public void testSetFilePath() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        stills.setFilePath(expectedValue);
        final String result = stills.getFilePath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteAverage with an new Stills.
     */
    @org.junit.Test
    public void testGetVoteAverage() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        final Double result = stills.getVoteAverage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteAverage with an new Stills.
     */
    @org.junit.Test
    public void testSetVoteAverage() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        stills.setVoteAverage(expectedValue);
        final Double result = stills.getVoteAverage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWidth with an new Stills.
     */
    @org.junit.Test
    public void testGetWidth() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        final Integer result = stills.getWidth();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWidth with an new Stills.
     */
    @org.junit.Test
    public void testSetWidth() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        stills.setWidth(expectedValue);
        final Integer result = stills.getWidth();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getIso6391 with an new Stills.
     */
    @org.junit.Test
    public void testGetIso6391() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        final String result = stills.getIso6391();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setIso6391 with an new Stills.
     */
    @org.junit.Test
    public void testSetIso6391() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        stills.setIso6391(expectedValue);
        final String result = stills.getIso6391();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteCount with an new Stills.
     */
    @org.junit.Test
    public void testGetVoteCount() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        final Integer result = stills.getVoteCount();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteCount with an new Stills.
     */
    @org.junit.Test
    public void testSetVoteCount() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        stills.setVoteCount(expectedValue);
        final Integer result = stills.getVoteCount();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getHeight with an new Stills.
     */
    @org.junit.Test
    public void testGetHeight() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        final Integer result = stills.getHeight();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setHeight with an new Stills.
     */
    @org.junit.Test
    public void testSetHeight() {
        // arrange : set up the test
        final Stills stills = mock(Stills.class);
        assert stills != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        stills.setHeight(expectedValue);
        final Integer result = stills.getHeight();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}