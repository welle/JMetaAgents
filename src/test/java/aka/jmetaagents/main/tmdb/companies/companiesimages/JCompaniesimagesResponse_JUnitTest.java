package aka.jmetaagents.main.tmdb.companies.companiesimages;

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
 * JUnit skeleton for the JCompaniesimagesResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JCompaniesimagesResponse.class })
public class JCompaniesimagesResponse_JUnitTest {

    /**
     * getId with an new JCompaniesimagesResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JCompaniesimagesResponse jCompaniesimagesResponse = mock(JCompaniesimagesResponse.class);
        assert jCompaniesimagesResponse != null;

        // act : run the test
        final Integer result = jCompaniesimagesResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JCompaniesimagesResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JCompaniesimagesResponse jCompaniesimagesResponse = mock(JCompaniesimagesResponse.class);
        assert jCompaniesimagesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jCompaniesimagesResponse.setId(expectedValue);
        final Integer result = jCompaniesimagesResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLogos with an new JCompaniesimagesResponse.
     */
    @org.junit.Test
    public void testGetLogos() {
        // arrange : set up the test
        final JCompaniesimagesResponse jCompaniesimagesResponse = mock(JCompaniesimagesResponse.class);
        assert jCompaniesimagesResponse != null;

        // act : run the test
        final List result = jCompaniesimagesResponse.getLogos();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLogos with an new JCompaniesimagesResponse.
     */
    @org.junit.Test
    public void testSetLogos() {
        // arrange : set up the test
        final JCompaniesimagesResponse jCompaniesimagesResponse = mock(JCompaniesimagesResponse.class);
        assert jCompaniesimagesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Logos> expectedValue = new ArrayList<>();
        Logos logosItem = new Logos();
        expectedValue.add(logosItem);
        jCompaniesimagesResponse.setLogos(expectedValue);
        final List<Logos> result = jCompaniesimagesResponse.getLogos();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}