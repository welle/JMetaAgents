package aka.jmetaagents.main.tmdb.tv.tvdetails;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the JTvdetailsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvdetailsResponse.class })
public class JTvdetailsResponse_JUnitTest {

    /**
     * getOriginalLanguage with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetOriginalLanguage() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final String result = jTvdetailsResponse.getOriginalLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOriginalLanguage with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetOriginalLanguage() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvdetailsResponse.setOriginalLanguage(expectedValue);
        final String result = jTvdetailsResponse.getOriginalLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getNumberOfEpisodes with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetNumberOfEpisodes() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final Integer result = jTvdetailsResponse.getNumberOfEpisodes();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setNumberOfEpisodes with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetNumberOfEpisodes() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvdetailsResponse.setNumberOfEpisodes(expectedValue);
        final Integer result = jTvdetailsResponse.getNumberOfEpisodes();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getNetworks with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetNetworks() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final List result = jTvdetailsResponse.getNetworks();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setNetworks with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetNetworks() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Networks> expectedValue = new ArrayList<>();
        Networks networksItem = new Networks();
        expectedValue.add(networksItem);
        jTvdetailsResponse.setNetworks(expectedValue);
        final List<Networks> result = jTvdetailsResponse.getNetworks();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getType with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetType() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final String result = jTvdetailsResponse.getType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setType with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetType() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvdetailsResponse.setType(expectedValue);
        final String result = jTvdetailsResponse.getType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBackdropPath with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetBackdropPath() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final String result = jTvdetailsResponse.getBackdropPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBackdropPath with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetBackdropPath() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvdetailsResponse.setBackdropPath(expectedValue);
        final String result = jTvdetailsResponse.getBackdropPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGenres with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetGenres() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final List result = jTvdetailsResponse.getGenres();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenres with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetGenres() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Genres> expectedValue = new ArrayList<>();
        Genres genresItem = new Genres();
        expectedValue.add(genresItem);
        jTvdetailsResponse.setGenres(expectedValue);
        final List<Genres> result = jTvdetailsResponse.getGenres();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPopularity with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetPopularity() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final Double result = jTvdetailsResponse.getPopularity();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPopularity with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetPopularity() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        jTvdetailsResponse.setPopularity(expectedValue);
        final Double result = jTvdetailsResponse.getPopularity();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final Integer result = jTvdetailsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvdetailsResponse.setId(expectedValue);
        final Integer result = jTvdetailsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getNumberOfSeasons with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetNumberOfSeasons() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final Integer result = jTvdetailsResponse.getNumberOfSeasons();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setNumberOfSeasons with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetNumberOfSeasons() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvdetailsResponse.setNumberOfSeasons(expectedValue);
        final Integer result = jTvdetailsResponse.getNumberOfSeasons();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteCount with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetVoteCount() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final Integer result = jTvdetailsResponse.getVoteCount();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteCount with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetVoteCount() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvdetailsResponse.setVoteCount(expectedValue);
        final Integer result = jTvdetailsResponse.getVoteCount();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFirstAirDate with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetFirstAirDate() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final Date result = jTvdetailsResponse.getFirstAirDate();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFirstAirDate with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetFirstAirDate() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        jTvdetailsResponse.setFirstAirDate(expectedValue);
        final Date result = jTvdetailsResponse.getFirstAirDate();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOverview with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetOverview() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final String result = jTvdetailsResponse.getOverview();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOverview with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetOverview() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvdetailsResponse.setOverview(expectedValue);
        final String result = jTvdetailsResponse.getOverview();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeasons with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetSeasons() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final List result = jTvdetailsResponse.getSeasons();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeasons with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetSeasons() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Seasons> expectedValue = new ArrayList<>();
        Seasons seasonsItem = new Seasons();
        expectedValue.add(seasonsItem);
        jTvdetailsResponse.setSeasons(expectedValue);
        final List<Seasons> result = jTvdetailsResponse.getSeasons();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguages with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetLanguages() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final List result = jTvdetailsResponse.getLanguages();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguages with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetLanguages() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        jTvdetailsResponse.setLanguages(expectedValue);
        final List<String> result = jTvdetailsResponse.getLanguages();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getCreatedBy with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetCreatedBy() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final List result = jTvdetailsResponse.getCreatedBy();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCreatedBy with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetCreatedBy() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<CreatedBy> expectedValue = new ArrayList<>();
        CreatedBy createdByItem = new CreatedBy();
        expectedValue.add(createdByItem);
        jTvdetailsResponse.setCreatedBy(expectedValue);
        final List<CreatedBy> result = jTvdetailsResponse.getCreatedBy();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPosterPath with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetPosterPath() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final String result = jTvdetailsResponse.getPosterPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPosterPath with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetPosterPath() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvdetailsResponse.setPosterPath(expectedValue);
        final String result = jTvdetailsResponse.getPosterPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOriginCountry with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetOriginCountry() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final List result = jTvdetailsResponse.getOriginCountry();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOriginCountry with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetOriginCountry() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        jTvdetailsResponse.setOriginCountry(expectedValue);
        final List<String> result = jTvdetailsResponse.getOriginCountry();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProductionCompanies with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetProductionCompanies() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final List result = jTvdetailsResponse.getProductionCompanies();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProductionCompanies with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetProductionCompanies() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<ProductionCompanies> expectedValue = new ArrayList<>();
        ProductionCompanies productionCompaniesItem = new ProductionCompanies();
        expectedValue.add(productionCompaniesItem);
        jTvdetailsResponse.setProductionCompanies(expectedValue);
        final List<ProductionCompanies> result = jTvdetailsResponse.getProductionCompanies();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOriginalName with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetOriginalName() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final String result = jTvdetailsResponse.getOriginalName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOriginalName with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetOriginalName() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvdetailsResponse.setOriginalName(expectedValue);
        final String result = jTvdetailsResponse.getOriginalName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteAverage with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetVoteAverage() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final Integer result = jTvdetailsResponse.getVoteAverage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteAverage with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetVoteAverage() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvdetailsResponse.setVoteAverage(expectedValue);
        final Integer result = jTvdetailsResponse.getVoteAverage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final String result = jTvdetailsResponse.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvdetailsResponse.setName(expectedValue);
        final String result = jTvdetailsResponse.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getEpisodeRunTime with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetEpisodeRunTime() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final List result = jTvdetailsResponse.getEpisodeRunTime();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setEpisodeRunTime with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetEpisodeRunTime() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        jTvdetailsResponse.setEpisodeRunTime(expectedValue);
        final List<String> result = jTvdetailsResponse.getEpisodeRunTime();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getInProduction with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetInProduction() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final Boolean result = jTvdetailsResponse.getInProduction();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setInProduction with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetInProduction() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Boolean expectedValue = null;
        jTvdetailsResponse.setInProduction(expectedValue);
        final Boolean result = jTvdetailsResponse.getInProduction();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLastAirDate with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetLastAirDate() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final Date result = jTvdetailsResponse.getLastAirDate();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLastAirDate with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetLastAirDate() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        jTvdetailsResponse.setLastAirDate(expectedValue);
        final Date result = jTvdetailsResponse.getLastAirDate();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getHomepage with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetHomepage() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final URI result = jTvdetailsResponse.getHomepage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setHomepage with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetHomepage() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jTvdetailsResponse.setHomepage(expectedValue);
        final URI result = jTvdetailsResponse.getHomepage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getStatus with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testGetStatus() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        final String result = jTvdetailsResponse.getStatus();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setStatus with an new JTvdetailsResponse.
     */
    @org.junit.Test
    public void testSetStatus() {
        // arrange : set up the test
        final JTvdetailsResponse jTvdetailsResponse = mock(JTvdetailsResponse.class);
        assert jTvdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvdetailsResponse.setStatus(expectedValue);
        final String result = jTvdetailsResponse.getStatus();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}