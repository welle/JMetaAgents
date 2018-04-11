package aka.jmetaagents.main.omdb.movie.moviebyidimdb;

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
 * JUnit skeleton for the Ratings object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Ratings.class })
public class Ratings_JUnitTest {

    /**
     * getValue with an new Ratings.
     */
    @org.junit.Test
    public void testGetValue() {
        // arrange : set up the test
        final Ratings ratings = mock(Ratings.class);
        assert ratings != null;

        // act : run the test
        final String result = ratings.getValue();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setValue with an new Ratings.
     */
    @org.junit.Test
    public void testSetValue() {
        // arrange : set up the test
        final Ratings ratings = mock(Ratings.class);
        assert ratings != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        ratings.setValue(expectedValue);
        final String result = ratings.getValue();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSource with an new Ratings.
     */
    @org.junit.Test
    public void testGetSource() {
        // arrange : set up the test
        final Ratings ratings = mock(Ratings.class);
        assert ratings != null;

        // act : run the test
        final String result = ratings.getSource();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSource with an new Ratings.
     */
    @org.junit.Test
    public void testSetSource() {
        // arrange : set up the test
        final Ratings ratings = mock(Ratings.class);
        assert ratings != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        ratings.setSource(expectedValue);
        final String result = ratings.getSource();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}