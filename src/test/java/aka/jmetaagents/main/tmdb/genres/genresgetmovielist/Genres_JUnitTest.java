package aka.jmetaagents.main.tmdb.genres.genresgetmovielist;

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
 * JUnit skeleton for the Genres object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Genres.class })
public class Genres_JUnitTest {

    /**
     * getName with an new Genres.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final Genres genres = mock(Genres.class);
        assert genres != null;

        // act : run the test
        final String result = genres.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new Genres.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final Genres genres = mock(Genres.class);
        assert genres != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        genres.setName(expectedValue);
        final String result = genres.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new Genres.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final Genres genres = mock(Genres.class);
        assert genres != null;

        // act : run the test
        final Integer result = genres.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new Genres.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final Genres genres = mock(Genres.class);
        assert genres != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        genres.setId(expectedValue);
        final Integer result = genres.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}