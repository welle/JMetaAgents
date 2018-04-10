package aka.jmetaagents.main.tmdb.tv.episode.tvepisodeexternalids;

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
 * JUnit skeleton for the JTvepisodeexternalidsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvepisodeexternalidsQuestion.class })
public class JTvepisodeexternalidsQuestion_JUnitTest {

    /**
     * getTvId with an new JTvepisodeexternalidsQuestion.
     */
    @org.junit.Test
    public void testGetTvId() {
        // arrange : set up the test
        final JTvepisodeexternalidsQuestion jTvepisodeexternalidsQuestion = mock(JTvepisodeexternalidsQuestion.class);
        assert jTvepisodeexternalidsQuestion != null;

        // act : run the test
        final Integer result = jTvepisodeexternalidsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvId with an new JTvepisodeexternalidsQuestion.
     */
    @org.junit.Test
    public void testSetTvId() {
        // arrange : set up the test
        final JTvepisodeexternalidsQuestion jTvepisodeexternalidsQuestion = mock(JTvepisodeexternalidsQuestion.class);
        assert jTvepisodeexternalidsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodeexternalidsQuestion.setTvId(expectedValue);
        final Integer result = jTvepisodeexternalidsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getEpisodeNumber with an new JTvepisodeexternalidsQuestion.
     */
    @org.junit.Test
    public void testGetEpisodeNumber() {
        // arrange : set up the test
        final JTvepisodeexternalidsQuestion jTvepisodeexternalidsQuestion = mock(JTvepisodeexternalidsQuestion.class);
        assert jTvepisodeexternalidsQuestion != null;

        // act : run the test
        final Integer result = jTvepisodeexternalidsQuestion.getEpisodeNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setEpisodeNumber with an new JTvepisodeexternalidsQuestion.
     */
    @org.junit.Test
    public void testSetEpisodeNumber() {
        // arrange : set up the test
        final JTvepisodeexternalidsQuestion jTvepisodeexternalidsQuestion = mock(JTvepisodeexternalidsQuestion.class);
        assert jTvepisodeexternalidsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodeexternalidsQuestion.setEpisodeNumber(expectedValue);
        final Integer result = jTvepisodeexternalidsQuestion.getEpisodeNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeasonNumber with an new JTvepisodeexternalidsQuestion.
     */
    @org.junit.Test
    public void testGetSeasonNumber() {
        // arrange : set up the test
        final JTvepisodeexternalidsQuestion jTvepisodeexternalidsQuestion = mock(JTvepisodeexternalidsQuestion.class);
        assert jTvepisodeexternalidsQuestion != null;

        // act : run the test
        final Integer result = jTvepisodeexternalidsQuestion.getSeasonNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeasonNumber with an new JTvepisodeexternalidsQuestion.
     */
    @org.junit.Test
    public void testSetSeasonNumber() {
        // arrange : set up the test
        final JTvepisodeexternalidsQuestion jTvepisodeexternalidsQuestion = mock(JTvepisodeexternalidsQuestion.class);
        assert jTvepisodeexternalidsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodeexternalidsQuestion.setSeasonNumber(expectedValue);
        final Integer result = jTvepisodeexternalidsQuestion.getSeasonNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}