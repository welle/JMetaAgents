package aka.jmetaagents.main.tmdb.movies.moviesdetails;

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
 * JUnit skeleton for the SpokenLanguages object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ SpokenLanguages.class })
public class SpokenLanguages_JUnitTest {

    /**
     * getName with an new SpokenLanguages.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final SpokenLanguages spokenLanguages = mock(SpokenLanguages.class);
        assert spokenLanguages != null;

        // act : run the test
        final String result = spokenLanguages.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new SpokenLanguages.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final SpokenLanguages spokenLanguages = mock(SpokenLanguages.class);
        assert spokenLanguages != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        spokenLanguages.setName(expectedValue);
        final String result = spokenLanguages.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getIso6391 with an new SpokenLanguages.
     */
    @org.junit.Test
    public void testGetIso6391() {
        // arrange : set up the test
        final SpokenLanguages spokenLanguages = mock(SpokenLanguages.class);
        assert spokenLanguages != null;

        // act : run the test
        final String result = spokenLanguages.getIso6391();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setIso6391 with an new SpokenLanguages.
     */
    @org.junit.Test
    public void testSetIso6391() {
        // arrange : set up the test
        final SpokenLanguages spokenLanguages = mock(SpokenLanguages.class);
        assert spokenLanguages != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        spokenLanguages.setIso6391(expectedValue);
        final String result = spokenLanguages.getIso6391();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}