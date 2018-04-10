package aka.jmetaagents.main.tmdb.movies.moviesdetails;

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
 * JUnit skeleton for the JMoviesdetailsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviesdetailsResponse.class })
public class JMoviesdetailsResponse_JUnitTest {

    /**
     * getOriginalLanguage with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetOriginalLanguage() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final String result = jMoviesdetailsResponse.getOriginalLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOriginalLanguage with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetOriginalLanguage() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesdetailsResponse.setOriginalLanguage(expectedValue);
        final String result = jMoviesdetailsResponse.getOriginalLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbId with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetImdbId() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final String result = jMoviesdetailsResponse.getImdbId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbId with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetImdbId() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesdetailsResponse.setImdbId(expectedValue);
        final String result = jMoviesdetailsResponse.getImdbId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVideo with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetVideo() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final Boolean result = jMoviesdetailsResponse.getVideo();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVideo with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetVideo() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Boolean expectedValue = null;
        jMoviesdetailsResponse.setVideo(expectedValue);
        final Boolean result = jMoviesdetailsResponse.getVideo();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final String result = jMoviesdetailsResponse.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesdetailsResponse.setTitle(expectedValue);
        final String result = jMoviesdetailsResponse.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBackdropPath with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetBackdropPath() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final String result = jMoviesdetailsResponse.getBackdropPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBackdropPath with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetBackdropPath() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesdetailsResponse.setBackdropPath(expectedValue);
        final String result = jMoviesdetailsResponse.getBackdropPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRevenue with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetRevenue() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final Integer result = jMoviesdetailsResponse.getRevenue();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRevenue with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetRevenue() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesdetailsResponse.setRevenue(expectedValue);
        final Integer result = jMoviesdetailsResponse.getRevenue();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGenres with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetGenres() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final List result = jMoviesdetailsResponse.getGenres();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenres with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetGenres() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Genres> expectedValue = new ArrayList<>();
        Genres genresItem = new Genres();
        expectedValue.add(genresItem);
        jMoviesdetailsResponse.setGenres(expectedValue);
        final List<Genres> result = jMoviesdetailsResponse.getGenres();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPopularity with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetPopularity() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final Double result = jMoviesdetailsResponse.getPopularity();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPopularity with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetPopularity() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        jMoviesdetailsResponse.setPopularity(expectedValue);
        final Double result = jMoviesdetailsResponse.getPopularity();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProductionCountries with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetProductionCountries() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final List result = jMoviesdetailsResponse.getProductionCountries();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProductionCountries with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetProductionCountries() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<ProductionCountries> expectedValue = new ArrayList<>();
        ProductionCountries productionCountriesItem = new ProductionCountries();
        expectedValue.add(productionCountriesItem);
        jMoviesdetailsResponse.setProductionCountries(expectedValue);
        final List<ProductionCountries> result = jMoviesdetailsResponse.getProductionCountries();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final Integer result = jMoviesdetailsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesdetailsResponse.setId(expectedValue);
        final Integer result = jMoviesdetailsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteCount with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetVoteCount() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final Integer result = jMoviesdetailsResponse.getVoteCount();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteCount with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetVoteCount() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesdetailsResponse.setVoteCount(expectedValue);
        final Integer result = jMoviesdetailsResponse.getVoteCount();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBudget with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetBudget() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final Integer result = jMoviesdetailsResponse.getBudget();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBudget with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetBudget() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesdetailsResponse.setBudget(expectedValue);
        final Integer result = jMoviesdetailsResponse.getBudget();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOverview with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetOverview() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final String result = jMoviesdetailsResponse.getOverview();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOverview with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetOverview() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesdetailsResponse.setOverview(expectedValue);
        final String result = jMoviesdetailsResponse.getOverview();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOriginalTitle with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetOriginalTitle() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final String result = jMoviesdetailsResponse.getOriginalTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOriginalTitle with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetOriginalTitle() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesdetailsResponse.setOriginalTitle(expectedValue);
        final String result = jMoviesdetailsResponse.getOriginalTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRuntime with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetRuntime() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final Integer result = jMoviesdetailsResponse.getRuntime();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRuntime with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetRuntime() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesdetailsResponse.setRuntime(expectedValue);
        final Integer result = jMoviesdetailsResponse.getRuntime();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPosterPath with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetPosterPath() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final String result = jMoviesdetailsResponse.getPosterPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPosterPath with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetPosterPath() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesdetailsResponse.setPosterPath(expectedValue);
        final String result = jMoviesdetailsResponse.getPosterPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSpokenLanguages with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetSpokenLanguages() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final List result = jMoviesdetailsResponse.getSpokenLanguages();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSpokenLanguages with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetSpokenLanguages() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<SpokenLanguages> expectedValue = new ArrayList<>();
        SpokenLanguages spokenLanguagesItem = new SpokenLanguages();
        expectedValue.add(spokenLanguagesItem);
        jMoviesdetailsResponse.setSpokenLanguages(expectedValue);
        final List<SpokenLanguages> result = jMoviesdetailsResponse.getSpokenLanguages();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProductionCompanies with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetProductionCompanies() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final List result = jMoviesdetailsResponse.getProductionCompanies();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProductionCompanies with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetProductionCompanies() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<ProductionCompanies> expectedValue = new ArrayList<>();
        ProductionCompanies productionCompaniesItem = new ProductionCompanies();
        expectedValue.add(productionCompaniesItem);
        jMoviesdetailsResponse.setProductionCompanies(expectedValue);
        final List<ProductionCompanies> result = jMoviesdetailsResponse.getProductionCompanies();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getReleaseDate with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetReleaseDate() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final Date result = jMoviesdetailsResponse.getReleaseDate();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setReleaseDate with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetReleaseDate() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        jMoviesdetailsResponse.setReleaseDate(expectedValue);
        final Date result = jMoviesdetailsResponse.getReleaseDate();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteAverage with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetVoteAverage() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final Double result = jMoviesdetailsResponse.getVoteAverage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteAverage with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetVoteAverage() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        jMoviesdetailsResponse.setVoteAverage(expectedValue);
        final Double result = jMoviesdetailsResponse.getVoteAverage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBelongsToCollection with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetBelongsToCollection() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final String result = jMoviesdetailsResponse.getBelongsToCollection();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBelongsToCollection with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetBelongsToCollection() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesdetailsResponse.setBelongsToCollection(expectedValue);
        final String result = jMoviesdetailsResponse.getBelongsToCollection();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTagline with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetTagline() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final String result = jMoviesdetailsResponse.getTagline();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTagline with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetTagline() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesdetailsResponse.setTagline(expectedValue);
        final String result = jMoviesdetailsResponse.getTagline();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAdult with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetAdult() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final Boolean result = jMoviesdetailsResponse.getAdult();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAdult with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetAdult() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Boolean expectedValue = null;
        jMoviesdetailsResponse.setAdult(expectedValue);
        final Boolean result = jMoviesdetailsResponse.getAdult();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getHomepage with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetHomepage() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final String result = jMoviesdetailsResponse.getHomepage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setHomepage with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetHomepage() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesdetailsResponse.setHomepage(expectedValue);
        final String result = jMoviesdetailsResponse.getHomepage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getStatus with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testGetStatus() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        final String result = jMoviesdetailsResponse.getStatus();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setStatus with an new JMoviesdetailsResponse.
     */
    @org.junit.Test
    public void testSetStatus() {
        // arrange : set up the test
        final JMoviesdetailsResponse jMoviesdetailsResponse = mock(JMoviesdetailsResponse.class);
        assert jMoviesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesdetailsResponse.setStatus(expectedValue);
        final String result = jMoviesdetailsResponse.getStatus();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}