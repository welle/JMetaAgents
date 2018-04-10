package aka.jmetaagents.main.tmdb.companies.companiesalternatename;

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
 * JUnit skeleton for the Results object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Results.class })
public class Results_JUnitTest {

    /**
     * getName with an new Results.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new Results.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setName(expectedValue);
        final String result = results.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getType with an new Results.
     */
    @org.junit.Test
    public void testGetType() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setType with an new Results.
     */
    @org.junit.Test
    public void testSetType() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setType(expectedValue);
        final String result = results.getType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}