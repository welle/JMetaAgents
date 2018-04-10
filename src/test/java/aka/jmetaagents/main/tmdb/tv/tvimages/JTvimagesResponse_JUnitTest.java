package aka.jmetaagents.main.tmdb.tv.tvimages;

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
 * JUnit skeleton for the JTvimagesResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvimagesResponse.class })
public class JTvimagesResponse_JUnitTest {

    /**
     * getBackdrops with an new JTvimagesResponse.
     */
    @org.junit.Test
    public void testGetBackdrops() {
        // arrange : set up the test
        final JTvimagesResponse jTvimagesResponse = mock(JTvimagesResponse.class);
        assert jTvimagesResponse != null;

        // act : run the test
        final List result = jTvimagesResponse.getBackdrops();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBackdrops with an new JTvimagesResponse.
     */
    @org.junit.Test
    public void testSetBackdrops() {
        // arrange : set up the test
        final JTvimagesResponse jTvimagesResponse = mock(JTvimagesResponse.class);
        assert jTvimagesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Backdrops> expectedValue = new ArrayList<>();
        Backdrops backdropsItem = new Backdrops();
        expectedValue.add(backdropsItem);
        jTvimagesResponse.setBackdrops(expectedValue);
        final List<Backdrops> result = jTvimagesResponse.getBackdrops();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}