package aka.jmetaagents.main.tmdb.tv.episode.tvepisodeimages;

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
 * JUnit skeleton for the JTvepisodeimagesResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvepisodeimagesResponse.class })
public class JTvepisodeimagesResponse_JUnitTest {

    /**
     * getStills with an new JTvepisodeimagesResponse.
     */
    @org.junit.Test
    public void testGetStills() {
        // arrange : set up the test
        final JTvepisodeimagesResponse jTvepisodeimagesResponse = mock(JTvepisodeimagesResponse.class);
        assert jTvepisodeimagesResponse != null;

        // act : run the test
        final List result = jTvepisodeimagesResponse.getStills();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setStills with an new JTvepisodeimagesResponse.
     */
    @org.junit.Test
    public void testSetStills() {
        // arrange : set up the test
        final JTvepisodeimagesResponse jTvepisodeimagesResponse = mock(JTvepisodeimagesResponse.class);
        assert jTvepisodeimagesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Stills> expectedValue = new ArrayList<>();
        Stills stillsItem = new Stills();
        expectedValue.add(stillsItem);
        jTvepisodeimagesResponse.setStills(expectedValue);
        final List<Stills> result = jTvepisodeimagesResponse.getStills();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JTvepisodeimagesResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JTvepisodeimagesResponse jTvepisodeimagesResponse = mock(JTvepisodeimagesResponse.class);
        assert jTvepisodeimagesResponse != null;

        // act : run the test
        final Integer result = jTvepisodeimagesResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JTvepisodeimagesResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JTvepisodeimagesResponse jTvepisodeimagesResponse = mock(JTvepisodeimagesResponse.class);
        assert jTvepisodeimagesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodeimagesResponse.setId(expectedValue);
        final Integer result = jTvepisodeimagesResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}