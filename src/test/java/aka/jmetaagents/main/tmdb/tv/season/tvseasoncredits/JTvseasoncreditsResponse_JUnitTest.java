package aka.jmetaagents.main.tmdb.tv.season.tvseasoncredits;

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
 * JUnit skeleton for the JTvseasoncreditsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvseasoncreditsResponse.class })
public class JTvseasoncreditsResponse_JUnitTest {

    /**
     * getCast with an new JTvseasoncreditsResponse.
     */
    @org.junit.Test
    public void testGetCast() {
        // arrange : set up the test
        final JTvseasoncreditsResponse jTvseasoncreditsResponse = mock(JTvseasoncreditsResponse.class);
        assert jTvseasoncreditsResponse != null;

        // act : run the test
        final List result = jTvseasoncreditsResponse.getCast();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCast with an new JTvseasoncreditsResponse.
     */
    @org.junit.Test
    public void testSetCast() {
        // arrange : set up the test
        final JTvseasoncreditsResponse jTvseasoncreditsResponse = mock(JTvseasoncreditsResponse.class);
        assert jTvseasoncreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Cast> expectedValue = new ArrayList<>();
        Cast castItem = new Cast();
        expectedValue.add(castItem);
        jTvseasoncreditsResponse.setCast(expectedValue);
        final List<Cast> result = jTvseasoncreditsResponse.getCast();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JTvseasoncreditsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JTvseasoncreditsResponse jTvseasoncreditsResponse = mock(JTvseasoncreditsResponse.class);
        assert jTvseasoncreditsResponse != null;

        // act : run the test
        final Integer result = jTvseasoncreditsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JTvseasoncreditsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JTvseasoncreditsResponse jTvseasoncreditsResponse = mock(JTvseasoncreditsResponse.class);
        assert jTvseasoncreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvseasoncreditsResponse.setId(expectedValue);
        final Integer result = jTvseasoncreditsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getCrew with an new JTvseasoncreditsResponse.
     */
    @org.junit.Test
    public void testGetCrew() {
        // arrange : set up the test
        final JTvseasoncreditsResponse jTvseasoncreditsResponse = mock(JTvseasoncreditsResponse.class);
        assert jTvseasoncreditsResponse != null;

        // act : run the test
        final List result = jTvseasoncreditsResponse.getCrew();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCrew with an new JTvseasoncreditsResponse.
     */
    @org.junit.Test
    public void testSetCrew() {
        // arrange : set up the test
        final JTvseasoncreditsResponse jTvseasoncreditsResponse = mock(JTvseasoncreditsResponse.class);
        assert jTvseasoncreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Crew> expectedValue = new ArrayList<>();
        Crew crewItem = new Crew();
        expectedValue.add(crewItem);
        jTvseasoncreditsResponse.setCrew(expectedValue);
        final List<Crew> result = jTvseasoncreditsResponse.getCrew();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}