package aka.jmetaagents.main.tmdb.find.findbyimdbid;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the MovieResults object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ MovieResults.class })
public class MovieResults_JUnitTest {

    /**
     * getOverview with an new MovieResults.
     */
    @org.junit.Test
    public void testGetOverview() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final String result = movieResults.getOverview();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOverview with an new MovieResults.
     */
    @org.junit.Test
    public void testSetOverview() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        movieResults.setOverview(expectedValue);
        final String result = movieResults.getOverview();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOriginalLanguage with an new MovieResults.
     */
    @org.junit.Test
    public void testGetOriginalLanguage() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final String result = movieResults.getOriginalLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOriginalLanguage with an new MovieResults.
     */
    @org.junit.Test
    public void testSetOriginalLanguage() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        movieResults.setOriginalLanguage(expectedValue);
        final String result = movieResults.getOriginalLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOriginalTitle with an new MovieResults.
     */
    @org.junit.Test
    public void testGetOriginalTitle() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final String result = movieResults.getOriginalTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOriginalTitle with an new MovieResults.
     */
    @org.junit.Test
    public void testSetOriginalTitle() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        movieResults.setOriginalTitle(expectedValue);
        final String result = movieResults.getOriginalTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVideo with an new MovieResults.
     */
    @org.junit.Test
    public void testGetVideo() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final Boolean result = movieResults.getVideo();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVideo with an new MovieResults.
     */
    @org.junit.Test
    public void testSetVideo() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final Boolean expectedValue = null;
        movieResults.setVideo(expectedValue);
        final Boolean result = movieResults.getVideo();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new MovieResults.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final String result = movieResults.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new MovieResults.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        movieResults.setTitle(expectedValue);
        final String result = movieResults.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGenreIds with an new MovieResults.
     */
    @org.junit.Test
    public void testGetGenreIds() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final List result = movieResults.getGenreIds();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenreIds with an new MovieResults.
     */
    @org.junit.Test
    public void testSetGenreIds() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        movieResults.setGenreIds(expectedValue);
        final List<String> result = movieResults.getGenreIds();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPosterPath with an new MovieResults.
     */
    @org.junit.Test
    public void testGetPosterPath() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final String result = movieResults.getPosterPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPosterPath with an new MovieResults.
     */
    @org.junit.Test
    public void testSetPosterPath() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        movieResults.setPosterPath(expectedValue);
        final String result = movieResults.getPosterPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBackdropPath with an new MovieResults.
     */
    @org.junit.Test
    public void testGetBackdropPath() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final String result = movieResults.getBackdropPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBackdropPath with an new MovieResults.
     */
    @org.junit.Test
    public void testSetBackdropPath() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        movieResults.setBackdropPath(expectedValue);
        final String result = movieResults.getBackdropPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getReleaseDate with an new MovieResults.
     */
    @org.junit.Test
    public void testGetReleaseDate() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final Date result = movieResults.getReleaseDate();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setReleaseDate with an new MovieResults.
     */
    @org.junit.Test
    public void testSetReleaseDate() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        movieResults.setReleaseDate(expectedValue);
        final Date result = movieResults.getReleaseDate();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPopularity with an new MovieResults.
     */
    @org.junit.Test
    public void testGetPopularity() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final Double result = movieResults.getPopularity();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPopularity with an new MovieResults.
     */
    @org.junit.Test
    public void testSetPopularity() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        movieResults.setPopularity(expectedValue);
        final Double result = movieResults.getPopularity();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteAverage with an new MovieResults.
     */
    @org.junit.Test
    public void testGetVoteAverage() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final Double result = movieResults.getVoteAverage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteAverage with an new MovieResults.
     */
    @org.junit.Test
    public void testSetVoteAverage() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        movieResults.setVoteAverage(expectedValue);
        final Double result = movieResults.getVoteAverage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new MovieResults.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final Integer result = movieResults.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new MovieResults.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        movieResults.setId(expectedValue);
        final Integer result = movieResults.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAdult with an new MovieResults.
     */
    @org.junit.Test
    public void testGetAdult() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final Boolean result = movieResults.getAdult();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAdult with an new MovieResults.
     */
    @org.junit.Test
    public void testSetAdult() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final Boolean expectedValue = null;
        movieResults.setAdult(expectedValue);
        final Boolean result = movieResults.getAdult();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteCount with an new MovieResults.
     */
    @org.junit.Test
    public void testGetVoteCount() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        final Integer result = movieResults.getVoteCount();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteCount with an new MovieResults.
     */
    @org.junit.Test
    public void testSetVoteCount() {
        // arrange : set up the test
        final MovieResults movieResults = mock(MovieResults.class);
        assert movieResults != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        movieResults.setVoteCount(expectedValue);
        final Integer result = movieResults.getVoteCount();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}