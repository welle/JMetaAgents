package aka.jmetaagents.main.tmdb.movies.moviesalternativetitles;

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
 * JUnit skeleton for the JMoviesalternativetitlesResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviesalternativetitlesResponse.class })
public class JMoviesalternativetitlesResponse_JUnitTest {

    /**
     * getId with an new JMoviesalternativetitlesResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JMoviesalternativetitlesResponse jMoviesalternativetitlesResponse = mock(JMoviesalternativetitlesResponse.class);
        assert jMoviesalternativetitlesResponse != null;

        // act : run the test
        final Integer result = jMoviesalternativetitlesResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JMoviesalternativetitlesResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JMoviesalternativetitlesResponse jMoviesalternativetitlesResponse = mock(JMoviesalternativetitlesResponse.class);
        assert jMoviesalternativetitlesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesalternativetitlesResponse.setId(expectedValue);
        final Integer result = jMoviesalternativetitlesResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitles with an new JMoviesalternativetitlesResponse.
     */
    @org.junit.Test
    public void testGetTitles() {
        // arrange : set up the test
        final JMoviesalternativetitlesResponse jMoviesalternativetitlesResponse = mock(JMoviesalternativetitlesResponse.class);
        assert jMoviesalternativetitlesResponse != null;

        // act : run the test
        final List result = jMoviesalternativetitlesResponse.getTitles();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitles with an new JMoviesalternativetitlesResponse.
     */
    @org.junit.Test
    public void testSetTitles() {
        // arrange : set up the test
        final JMoviesalternativetitlesResponse jMoviesalternativetitlesResponse = mock(JMoviesalternativetitlesResponse.class);
        assert jMoviesalternativetitlesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Titles> expectedValue = new ArrayList<>();
        Titles titlesItem = new Titles();
        expectedValue.add(titlesItem);
        jMoviesalternativetitlesResponse.setTitles(expectedValue);
        final List<Titles> result = jMoviesalternativetitlesResponse.getTitles();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}