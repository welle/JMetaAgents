package aka.jmetaagents.main.tvdb.series.seriesidimagesquery;

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
     * getFileName with an new Data.
     */
    @org.junit.Test
    public void testGetFileName() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getFileName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFileName with an new Data.
     */
    @org.junit.Test
    public void testSetFileName() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setFileName(expectedValue);
        final String result = data.getFileName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getThumbnail with an new Data.
     */
    @org.junit.Test
    public void testGetThumbnail() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getThumbnail();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setThumbnail with an new Data.
     */
    @org.junit.Test
    public void testSetThumbnail() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setThumbnail(expectedValue);
        final String result = data.getThumbnail();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSubKey with an new Data.
     */
    @org.junit.Test
    public void testGetSubKey() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getSubKey();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSubKey with an new Data.
     */
    @org.junit.Test
    public void testSetSubKey() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setSubKey(expectedValue);
        final String result = data.getSubKey();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRatingsInfo with an new Data.
     */
    @org.junit.Test
    public void testGetRatingsInfo() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final RatingsInfo result = data.getRatingsInfo();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRatingsInfo with an new Data.
     */
    @org.junit.Test
    public void testSetRatingsInfo() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final RatingsInfo expectedValue = null;
        data.setRatingsInfo(expectedValue);
        final RatingsInfo result = data.getRatingsInfo();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguageId with an new Data.
     */
    @org.junit.Test
    public void testGetLanguageId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getLanguageId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguageId with an new Data.
     */
    @org.junit.Test
    public void testSetLanguageId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setLanguageId(expectedValue);
        final Integer result = data.getLanguageId();

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
     * getKeyType with an new Data.
     */
    @org.junit.Test
    public void testGetKeyType() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getKeyType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setKeyType with an new Data.
     */
    @org.junit.Test
    public void testSetKeyType() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setKeyType(expectedValue);
        final String result = data.getKeyType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getResolution with an new Data.
     */
    @org.junit.Test
    public void testGetResolution() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getResolution();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setResolution with an new Data.
     */
    @org.junit.Test
    public void testSetResolution() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setResolution(expectedValue);
        final String result = data.getResolution();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}