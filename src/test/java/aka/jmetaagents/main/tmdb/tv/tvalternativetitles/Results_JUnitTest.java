package aka.jmetaagents.main.tmdb.tv.tvalternativetitles;

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
     * getIso31661 with an new Results.
     */
    @org.junit.Test
    public void testGetIso31661() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getIso31661();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setIso31661 with an new Results.
     */
    @org.junit.Test
    public void testSetIso31661() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setIso31661(expectedValue);
        final String result = results.getIso31661();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new Results.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new Results.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setTitle(expectedValue);
        final String result = results.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}