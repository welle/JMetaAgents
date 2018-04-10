package aka.jmetaagents.main.tmdb.companies.companiesimages;

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
 * JUnit skeleton for the Logos object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Logos.class })
public class Logos_JUnitTest {

    /**
     * getAspectRatio with an new Logos.
     */
    @org.junit.Test
    public void testGetAspectRatio() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        final Double result = logos.getAspectRatio();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAspectRatio with an new Logos.
     */
    @org.junit.Test
    public void testSetAspectRatio() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        logos.setAspectRatio(expectedValue);
        final Double result = logos.getAspectRatio();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFilePath with an new Logos.
     */
    @org.junit.Test
    public void testGetFilePath() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        final String result = logos.getFilePath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFilePath with an new Logos.
     */
    @org.junit.Test
    public void testSetFilePath() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        logos.setFilePath(expectedValue);
        final String result = logos.getFilePath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFileType with an new Logos.
     */
    @org.junit.Test
    public void testGetFileType() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        final String result = logos.getFileType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFileType with an new Logos.
     */
    @org.junit.Test
    public void testSetFileType() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        logos.setFileType(expectedValue);
        final String result = logos.getFileType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteAverage with an new Logos.
     */
    @org.junit.Test
    public void testGetVoteAverage() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        final Integer result = logos.getVoteAverage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteAverage with an new Logos.
     */
    @org.junit.Test
    public void testSetVoteAverage() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        logos.setVoteAverage(expectedValue);
        final Integer result = logos.getVoteAverage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWidth with an new Logos.
     */
    @org.junit.Test
    public void testGetWidth() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        final Integer result = logos.getWidth();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWidth with an new Logos.
     */
    @org.junit.Test
    public void testSetWidth() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        logos.setWidth(expectedValue);
        final Integer result = logos.getWidth();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new Logos.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        final String result = logos.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new Logos.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        logos.setId(expectedValue);
        final String result = logos.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteCount with an new Logos.
     */
    @org.junit.Test
    public void testGetVoteCount() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        final Integer result = logos.getVoteCount();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteCount with an new Logos.
     */
    @org.junit.Test
    public void testSetVoteCount() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        logos.setVoteCount(expectedValue);
        final Integer result = logos.getVoteCount();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getHeight with an new Logos.
     */
    @org.junit.Test
    public void testGetHeight() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        final Integer result = logos.getHeight();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setHeight with an new Logos.
     */
    @org.junit.Test
    public void testSetHeight() {
        // arrange : set up the test
        final Logos logos = mock(Logos.class);
        assert logos != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        logos.setHeight(expectedValue);
        final Integer result = logos.getHeight();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}