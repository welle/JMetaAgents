package aka.jmetaagents.main.tvdb.series.seriesidepisodes;

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
 * JUnit skeleton for the Errors object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Errors.class })
public class Errors_JUnitTest {

    /**
     * getInvalidLanguage with an new Errors.
     */
    @org.junit.Test
    public void testGetInvalidLanguage() {
        // arrange : set up the test
        final Errors errors = mock(Errors.class);
        assert errors != null;

        // act : run the test
        final String result = errors.getInvalidLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setInvalidLanguage with an new Errors.
     */
    @org.junit.Test
    public void testSetInvalidLanguage() {
        // arrange : set up the test
        final Errors errors = mock(Errors.class);
        assert errors != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        errors.setInvalidLanguage(expectedValue);
        final String result = errors.getInvalidLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getInvalidQueryParams with an new Errors.
     */
    @org.junit.Test
    public void testGetInvalidQueryParams() {
        // arrange : set up the test
        final Errors errors = mock(Errors.class);
        assert errors != null;

        // act : run the test
        final List result = errors.getInvalidQueryParams();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setInvalidQueryParams with an new Errors.
     */
    @org.junit.Test
    public void testSetInvalidQueryParams() {
        // arrange : set up the test
        final Errors errors = mock(Errors.class);
        assert errors != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        errors.setInvalidQueryParams(expectedValue);
        final List<String> result = errors.getInvalidQueryParams();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getInvalidFilters with an new Errors.
     */
    @org.junit.Test
    public void testGetInvalidFilters() {
        // arrange : set up the test
        final Errors errors = mock(Errors.class);
        assert errors != null;

        // act : run the test
        final List result = errors.getInvalidFilters();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setInvalidFilters with an new Errors.
     */
    @org.junit.Test
    public void testSetInvalidFilters() {
        // arrange : set up the test
        final Errors errors = mock(Errors.class);
        assert errors != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        errors.setInvalidFilters(expectedValue);
        final List<String> result = errors.getInvalidFilters();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}