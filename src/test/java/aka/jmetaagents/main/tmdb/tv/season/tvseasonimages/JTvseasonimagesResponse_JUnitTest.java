package aka.jmetaagents.main.tmdb.tv.season.tvseasonimages;

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
 * JUnit skeleton for the JTvseasonimagesResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvseasonimagesResponse.class })
public class JTvseasonimagesResponse_JUnitTest {

    /**
     * getPosters with an new JTvseasonimagesResponse.
     */
    @org.junit.Test
    public void testGetPosters() {
        // arrange : set up the test
        final JTvseasonimagesResponse jTvseasonimagesResponse = mock(JTvseasonimagesResponse.class);
        assert jTvseasonimagesResponse != null;

        // act : run the test
        final List result = jTvseasonimagesResponse.getPosters();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPosters with an new JTvseasonimagesResponse.
     */
    @org.junit.Test
    public void testSetPosters() {
        // arrange : set up the test
        final JTvseasonimagesResponse jTvseasonimagesResponse = mock(JTvseasonimagesResponse.class);
        assert jTvseasonimagesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Posters> expectedValue = new ArrayList<>();
        Posters postersItem = new Posters();
        expectedValue.add(postersItem);
        jTvseasonimagesResponse.setPosters(expectedValue);
        final List<Posters> result = jTvseasonimagesResponse.getPosters();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JTvseasonimagesResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JTvseasonimagesResponse jTvseasonimagesResponse = mock(JTvseasonimagesResponse.class);
        assert jTvseasonimagesResponse != null;

        // act : run the test
        final Integer result = jTvseasonimagesResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JTvseasonimagesResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JTvseasonimagesResponse jTvseasonimagesResponse = mock(JTvseasonimagesResponse.class);
        assert jTvseasonimagesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvseasonimagesResponse.setId(expectedValue);
        final Integer result = jTvseasonimagesResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}