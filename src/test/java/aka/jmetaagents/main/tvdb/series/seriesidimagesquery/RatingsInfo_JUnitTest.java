package aka.jmetaagents.main.tvdb.series.seriesidimagesquery;

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
 * JUnit skeleton for the RatingsInfo object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ RatingsInfo.class })
public class RatingsInfo_JUnitTest {

    /**
     * getAverage with an new RatingsInfo.
     */
    @org.junit.Test
    public void testGetAverage() {
        // arrange : set up the test
        final RatingsInfo ratingsInfo = mock(RatingsInfo.class);
        assert ratingsInfo != null;

        // act : run the test
        final Integer result = ratingsInfo.getAverage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAverage with an new RatingsInfo.
     */
    @org.junit.Test
    public void testSetAverage() {
        // arrange : set up the test
        final RatingsInfo ratingsInfo = mock(RatingsInfo.class);
        assert ratingsInfo != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        ratingsInfo.setAverage(expectedValue);
        final Integer result = ratingsInfo.getAverage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getCount with an new RatingsInfo.
     */
    @org.junit.Test
    public void testGetCount() {
        // arrange : set up the test
        final RatingsInfo ratingsInfo = mock(RatingsInfo.class);
        assert ratingsInfo != null;

        // act : run the test
        final Integer result = ratingsInfo.getCount();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCount with an new RatingsInfo.
     */
    @org.junit.Test
    public void testSetCount() {
        // arrange : set up the test
        final RatingsInfo ratingsInfo = mock(RatingsInfo.class);
        assert ratingsInfo != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        ratingsInfo.setCount(expectedValue);
        final Integer result = ratingsInfo.getCount();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}