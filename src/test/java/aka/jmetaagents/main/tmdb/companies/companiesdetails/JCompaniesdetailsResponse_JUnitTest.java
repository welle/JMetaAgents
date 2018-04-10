package aka.jmetaagents.main.tmdb.companies.companiesdetails;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.net.URI;

import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the JCompaniesdetailsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JCompaniesdetailsResponse.class })
public class JCompaniesdetailsResponse_JUnitTest {

    /**
     * getHeadquarters with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testGetHeadquarters() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        final String result = jCompaniesdetailsResponse.getHeadquarters();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setHeadquarters with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testSetHeadquarters() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCompaniesdetailsResponse.setHeadquarters(expectedValue);
        final String result = jCompaniesdetailsResponse.getHeadquarters();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getParentCompany with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testGetParentCompany() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        final String result = jCompaniesdetailsResponse.getParentCompany();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setParentCompany with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testSetParentCompany() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCompaniesdetailsResponse.setParentCompany(expectedValue);
        final String result = jCompaniesdetailsResponse.getParentCompany();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLogoPath with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testGetLogoPath() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        final String result = jCompaniesdetailsResponse.getLogoPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLogoPath with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testSetLogoPath() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCompaniesdetailsResponse.setLogoPath(expectedValue);
        final String result = jCompaniesdetailsResponse.getLogoPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        final String result = jCompaniesdetailsResponse.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCompaniesdetailsResponse.setName(expectedValue);
        final String result = jCompaniesdetailsResponse.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDescription with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testGetDescription() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        final String result = jCompaniesdetailsResponse.getDescription();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDescription with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testSetDescription() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCompaniesdetailsResponse.setDescription(expectedValue);
        final String result = jCompaniesdetailsResponse.getDescription();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        final Integer result = jCompaniesdetailsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jCompaniesdetailsResponse.setId(expectedValue);
        final Integer result = jCompaniesdetailsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getHomepage with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testGetHomepage() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        final URI result = jCompaniesdetailsResponse.getHomepage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setHomepage with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testSetHomepage() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jCompaniesdetailsResponse.setHomepage(expectedValue);
        final URI result = jCompaniesdetailsResponse.getHomepage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOriginCountry with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testGetOriginCountry() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        final String result = jCompaniesdetailsResponse.getOriginCountry();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOriginCountry with an new JCompaniesdetailsResponse.
     */
    @org.junit.Test
    public void testSetOriginCountry() {
        // arrange : set up the test
        final JCompaniesdetailsResponse jCompaniesdetailsResponse = mock(JCompaniesdetailsResponse.class);
        assert jCompaniesdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCompaniesdetailsResponse.setOriginCountry(expectedValue);
        final String result = jCompaniesdetailsResponse.getOriginCountry();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}