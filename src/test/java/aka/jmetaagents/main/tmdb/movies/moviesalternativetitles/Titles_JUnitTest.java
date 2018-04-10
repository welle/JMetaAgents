package aka.jmetaagents.main.tmdb.movies.moviesalternativetitles;

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
 * JUnit skeleton for the Titles object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Titles.class })
public class Titles_JUnitTest {

    /**
     * getIso31661 with an new Titles.
     */
    @org.junit.Test
    public void testGetIso31661() {
        // arrange : set up the test
        final Titles titles = mock(Titles.class);
        assert titles != null;

        // act : run the test
        final String result = titles.getIso31661();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setIso31661 with an new Titles.
     */
    @org.junit.Test
    public void testSetIso31661() {
        // arrange : set up the test
        final Titles titles = mock(Titles.class);
        assert titles != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        titles.setIso31661(expectedValue);
        final String result = titles.getIso31661();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new Titles.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final Titles titles = mock(Titles.class);
        assert titles != null;

        // act : run the test
        final String result = titles.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new Titles.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final Titles titles = mock(Titles.class);
        assert titles != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        titles.setTitle(expectedValue);
        final String result = titles.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}