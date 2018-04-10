package aka.jmetaagents.main.tmdb.genres.genresgetmovielist;

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
 * JUnit skeleton for the JGenresgetmovielistResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JGenresgetmovielistResponse.class })
public class JGenresgetmovielistResponse_JUnitTest {

    /**
     * getGenres with an new JGenresgetmovielistResponse.
     */
    @org.junit.Test
    public void testGetGenres() {
        // arrange : set up the test
        final JGenresgetmovielistResponse jGenresgetmovielistResponse = mock(JGenresgetmovielistResponse.class);
        assert jGenresgetmovielistResponse != null;

        // act : run the test
        final List result = jGenresgetmovielistResponse.getGenres();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenres with an new JGenresgetmovielistResponse.
     */
    @org.junit.Test
    public void testSetGenres() {
        // arrange : set up the test
        final JGenresgetmovielistResponse jGenresgetmovielistResponse = mock(JGenresgetmovielistResponse.class);
        assert jGenresgetmovielistResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Genres> expectedValue = new ArrayList<>();
        Genres genresItem = new Genres();
        expectedValue.add(genresItem);
        jGenresgetmovielistResponse.setGenres(expectedValue);
        final List<Genres> result = jGenresgetmovielistResponse.getGenres();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}