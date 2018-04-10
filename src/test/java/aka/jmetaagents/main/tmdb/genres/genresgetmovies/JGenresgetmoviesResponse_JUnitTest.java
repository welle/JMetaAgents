package aka.jmetaagents.main.tmdb.genres.genresgetmovies;

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
 * JUnit skeleton for the JGenresgetmoviesResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JGenresgetmoviesResponse.class })
public class JGenresgetmoviesResponse_JUnitTest {

    /**
     * getGenres with an new JGenresgetmoviesResponse.
     */
    @org.junit.Test
    public void testGetGenres() {
        // arrange : set up the test
        final JGenresgetmoviesResponse jGenresgetmoviesResponse = mock(JGenresgetmoviesResponse.class);
        assert jGenresgetmoviesResponse != null;

        // act : run the test
        final List result = jGenresgetmoviesResponse.getGenres();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenres with an new JGenresgetmoviesResponse.
     */
    @org.junit.Test
    public void testSetGenres() {
        // arrange : set up the test
        final JGenresgetmoviesResponse jGenresgetmoviesResponse = mock(JGenresgetmoviesResponse.class);
        assert jGenresgetmoviesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Genres> expectedValue = new ArrayList<>();
        Genres genresItem = new Genres();
        expectedValue.add(genresItem);
        jGenresgetmoviesResponse.setGenres(expectedValue);
        final List<Genres> result = jGenresgetmoviesResponse.getGenres();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}