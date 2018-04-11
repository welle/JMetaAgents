package aka.jmetaagents.main.omdb.episode.episodebyidimdb;

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
 * JUnit skeleton for the JEpisodebyidimdbQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JEpisodebyidimdbQuestion.class })
public class JEpisodebyidimdbQuestion_JUnitTest {

    /**
     * getImdbid with an new JEpisodebyidimdbQuestion.
     */
    @org.junit.Test
    public void testGetImdbid() {
        // arrange : set up the test
        final JEpisodebyidimdbQuestion jEpisodebyidimdbQuestion = mock(JEpisodebyidimdbQuestion.class);
        assert jEpisodebyidimdbQuestion != null;

        // act : run the test
        final Integer result = jEpisodebyidimdbQuestion.getImdbid();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbid with an new JEpisodebyidimdbQuestion.
     */
    @org.junit.Test
    public void testSetImdbid() {
        // arrange : set up the test
        final JEpisodebyidimdbQuestion jEpisodebyidimdbQuestion = mock(JEpisodebyidimdbQuestion.class);
        assert jEpisodebyidimdbQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jEpisodebyidimdbQuestion.setImdbid(expectedValue);
        final Integer result = jEpisodebyidimdbQuestion.getImdbid();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getY with an new JEpisodebyidimdbQuestion.
     */
    @org.junit.Test
    public void testGetY() {
        // arrange : set up the test
        final JEpisodebyidimdbQuestion jEpisodebyidimdbQuestion = mock(JEpisodebyidimdbQuestion.class);
        assert jEpisodebyidimdbQuestion != null;

        // act : run the test
        final Integer result = jEpisodebyidimdbQuestion.getY();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setY with an new JEpisodebyidimdbQuestion.
     */
    @org.junit.Test
    public void testSetY() {
        // arrange : set up the test
        final JEpisodebyidimdbQuestion jEpisodebyidimdbQuestion = mock(JEpisodebyidimdbQuestion.class);
        assert jEpisodebyidimdbQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jEpisodebyidimdbQuestion.setY(expectedValue);
        final Integer result = jEpisodebyidimdbQuestion.getY();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}