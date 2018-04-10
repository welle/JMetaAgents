package aka.jmetaagents.main.tvdb.series.seriesidepisodesquery;

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
 * JUnit skeleton for the JSeriesidepisodesqueryQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidepisodesqueryQuestion.class })
public class JSeriesidepisodesqueryQuestion_JUnitTest {

    /**
     * getDvdSeason with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testGetDvdSeason() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        final String result = jSeriesidepisodesqueryQuestion.getDvdSeason();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDvdSeason with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testSetDvdSeason() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidepisodesqueryQuestion.setDvdSeason(expectedValue);
        final String result = jSeriesidepisodesqueryQuestion.getDvdSeason();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDvdEpisode with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testGetDvdEpisode() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        final String result = jSeriesidepisodesqueryQuestion.getDvdEpisode();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDvdEpisode with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testSetDvdEpisode() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidepisodesqueryQuestion.setDvdEpisode(expectedValue);
        final String result = jSeriesidepisodesqueryQuestion.getDvdEpisode();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAiredEpisode with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testGetAiredEpisode() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        final String result = jSeriesidepisodesqueryQuestion.getAiredEpisode();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAiredEpisode with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testSetAiredEpisode() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidepisodesqueryQuestion.setAiredEpisode(expectedValue);
        final String result = jSeriesidepisodesqueryQuestion.getAiredEpisode();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAbsoluteNumber with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testGetAbsoluteNumber() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        final String result = jSeriesidepisodesqueryQuestion.getAbsoluteNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAbsoluteNumber with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testSetAbsoluteNumber() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidepisodesqueryQuestion.setAbsoluteNumber(expectedValue);
        final String result = jSeriesidepisodesqueryQuestion.getAbsoluteNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbId with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testGetImdbId() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        final String result = jSeriesidepisodesqueryQuestion.getImdbId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbId with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testSetImdbId() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidepisodesqueryQuestion.setImdbId(expectedValue);
        final String result = jSeriesidepisodesqueryQuestion.getImdbId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAiredSeason with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testGetAiredSeason() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        final String result = jSeriesidepisodesqueryQuestion.getAiredSeason();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAiredSeason with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testSetAiredSeason() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidepisodesqueryQuestion.setAiredSeason(expectedValue);
        final String result = jSeriesidepisodesqueryQuestion.getAiredSeason();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        final Integer result = jSeriesidepisodesqueryQuestion.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesidepisodesqueryQuestion.setId(expectedValue);
        final Integer result = jSeriesidepisodesqueryQuestion.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAcceptLanguage with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testGetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        final String result = jSeriesidepisodesqueryQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAcceptLanguage with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testSetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidepisodesqueryQuestion.setAcceptLanguage(expectedValue);
        final String result = jSeriesidepisodesqueryQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPage with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testGetPage() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        final String result = jSeriesidepisodesqueryQuestion.getPage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPage with an new JSeriesidepisodesqueryQuestion.
     */
    @org.junit.Test
    public void testSetPage() {
        // arrange : set up the test
        final JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion = mock(JSeriesidepisodesqueryQuestion.class);
        assert jSeriesidepisodesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidepisodesqueryQuestion.setPage(expectedValue);
        final String result = jSeriesidepisodesqueryQuestion.getPage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}