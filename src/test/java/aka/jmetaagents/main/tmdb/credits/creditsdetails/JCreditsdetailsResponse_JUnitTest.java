package aka.jmetaagents.main.tmdb.credits.creditsdetails;

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
 * JUnit skeleton for the JCreditsdetailsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JCreditsdetailsResponse.class })
public class JCreditsdetailsResponse_JUnitTest {

    /**
     * getMediaType with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testGetMediaType() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        final String result = jCreditsdetailsResponse.getMediaType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMediaType with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testSetMediaType() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCreditsdetailsResponse.setMediaType(expectedValue);
        final String result = jCreditsdetailsResponse.getMediaType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPerson with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testGetPerson() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        final Person result = jCreditsdetailsResponse.getPerson();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPerson with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testSetPerson() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Person expectedValue = null;
        jCreditsdetailsResponse.setPerson(expectedValue);
        final Person result = jCreditsdetailsResponse.getPerson();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getMedia with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testGetMedia() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        final Media result = jCreditsdetailsResponse.getMedia();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMedia with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testSetMedia() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Media expectedValue = null;
        jCreditsdetailsResponse.setMedia(expectedValue);
        final Media result = jCreditsdetailsResponse.getMedia();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        final String result = jCreditsdetailsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCreditsdetailsResponse.setId(expectedValue);
        final String result = jCreditsdetailsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getCreditType with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testGetCreditType() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        final String result = jCreditsdetailsResponse.getCreditType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCreditType with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testSetCreditType() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCreditsdetailsResponse.setCreditType(expectedValue);
        final String result = jCreditsdetailsResponse.getCreditType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDepartment with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testGetDepartment() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        final String result = jCreditsdetailsResponse.getDepartment();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDepartment with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testSetDepartment() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCreditsdetailsResponse.setDepartment(expectedValue);
        final String result = jCreditsdetailsResponse.getDepartment();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getJob with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testGetJob() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        final String result = jCreditsdetailsResponse.getJob();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setJob with an new JCreditsdetailsResponse.
     */
    @org.junit.Test
    public void testSetJob() {
        // arrange : set up the test
        final JCreditsdetailsResponse jCreditsdetailsResponse = mock(JCreditsdetailsResponse.class);
        assert jCreditsdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCreditsdetailsResponse.setJob(expectedValue);
        final String result = jCreditsdetailsResponse.getJob();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}