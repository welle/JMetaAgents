package aka.jmetaagents.main.tvdb.series.seriesidimagesqueryparams;

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
     * getSubKey with an new Data.
     */
    @org.junit.Test
    public void testGetSubKey() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final List result = data.getSubKey();

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
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        data.setSubKey(expectedValue);
        final List<String> result = data.getSubKey();

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
        final String result = data.getLanguageId();

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
        final String expectedValue = "X";
        data.setLanguageId(expectedValue);
        final String result = data.getLanguageId();

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
        final List result = data.getResolution();

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
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        data.setResolution(expectedValue);
        final List<String> result = data.getResolution();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}