package aka.jmetaagents.main.tmdb.tv.season.tvseasondetails;

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
 * JUnit skeleton for the Crew object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Crew.class })
public class Crew_JUnitTest {

    /**
     * getCreditId with an new Crew.
     */
    @org.junit.Test
    public void testGetCreditId() {
        // arrange : set up the test
        final Crew crew = mock(Crew.class);
        assert crew != null;

        // act : run the test
        final String result = crew.getCreditId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCreditId with an new Crew.
     */
    @org.junit.Test
    public void testSetCreditId() {
        // arrange : set up the test
        final Crew crew = mock(Crew.class);
        assert crew != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        crew.setCreditId(expectedValue);
        final String result = crew.getCreditId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new Crew.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final Crew crew = mock(Crew.class);
        assert crew != null;

        // act : run the test
        final String result = crew.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new Crew.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final Crew crew = mock(Crew.class);
        assert crew != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        crew.setName(expectedValue);
        final String result = crew.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProfilePath with an new Crew.
     */
    @org.junit.Test
    public void testGetProfilePath() {
        // arrange : set up the test
        final Crew crew = mock(Crew.class);
        assert crew != null;

        // act : run the test
        final String result = crew.getProfilePath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProfilePath with an new Crew.
     */
    @org.junit.Test
    public void testSetProfilePath() {
        // arrange : set up the test
        final Crew crew = mock(Crew.class);
        assert crew != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        crew.setProfilePath(expectedValue);
        final String result = crew.getProfilePath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new Crew.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final Crew crew = mock(Crew.class);
        assert crew != null;

        // act : run the test
        final Integer result = crew.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new Crew.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final Crew crew = mock(Crew.class);
        assert crew != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        crew.setId(expectedValue);
        final Integer result = crew.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDepartment with an new Crew.
     */
    @org.junit.Test
    public void testGetDepartment() {
        // arrange : set up the test
        final Crew crew = mock(Crew.class);
        assert crew != null;

        // act : run the test
        final String result = crew.getDepartment();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDepartment with an new Crew.
     */
    @org.junit.Test
    public void testSetDepartment() {
        // arrange : set up the test
        final Crew crew = mock(Crew.class);
        assert crew != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        crew.setDepartment(expectedValue);
        final String result = crew.getDepartment();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getJob with an new Crew.
     */
    @org.junit.Test
    public void testGetJob() {
        // arrange : set up the test
        final Crew crew = mock(Crew.class);
        assert crew != null;

        // act : run the test
        final String result = crew.getJob();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setJob with an new Crew.
     */
    @org.junit.Test
    public void testSetJob() {
        // arrange : set up the test
        final Crew crew = mock(Crew.class);
        assert crew != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        crew.setJob(expectedValue);
        final String result = crew.getJob();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}