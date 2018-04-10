package aka.jmetaagents.main.tvdb.languages.languages;

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
     * getEnglishName with an new Data.
     */
    @org.junit.Test
    public void testGetEnglishName() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getEnglishName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setEnglishName with an new Data.
     */
    @org.junit.Test
    public void testSetEnglishName() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setEnglishName(expectedValue);
        final String result = data.getEnglishName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new Data.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new Data.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setName(expectedValue);
        final String result = data.getName();

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
     * getAbbreviation with an new Data.
     */
    @org.junit.Test
    public void testGetAbbreviation() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getAbbreviation();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAbbreviation with an new Data.
     */
    @org.junit.Test
    public void testSetAbbreviation() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setAbbreviation(expectedValue);
        final String result = data.getAbbreviation();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}