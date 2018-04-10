package aka.jmetaagents.main.tmdb.genres.genresgettvlist;

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
 * JUnit skeleton for the JGenresgettvlistResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JGenresgettvlistResponse.class })
public class JGenresgettvlistResponse_JUnitTest {

    /**
     * getGenres with an new JGenresgettvlistResponse.
     */
    @org.junit.Test
    public void testGetGenres() {
        // arrange : set up the test
        final JGenresgettvlistResponse jGenresgettvlistResponse = mock(JGenresgettvlistResponse.class);
        assert jGenresgettvlistResponse != null;

        // act : run the test
        final List result = jGenresgettvlistResponse.getGenres();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenres with an new JGenresgettvlistResponse.
     */
    @org.junit.Test
    public void testSetGenres() {
        // arrange : set up the test
        final JGenresgettvlistResponse jGenresgettvlistResponse = mock(JGenresgettvlistResponse.class);
        assert jGenresgettvlistResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Genres> expectedValue = new ArrayList<>();
        Genres genresItem = new Genres();
        expectedValue.add(genresItem);
        jGenresgettvlistResponse.setGenres(expectedValue);
        final List<Genres> result = jGenresgettvlistResponse.getGenres();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}