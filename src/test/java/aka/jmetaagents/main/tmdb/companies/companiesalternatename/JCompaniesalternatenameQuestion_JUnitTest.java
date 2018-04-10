package aka.jmetaagents.main.tmdb.companies.companiesalternatename;

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
 * JUnit skeleton for the JCompaniesalternatenameQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JCompaniesalternatenameQuestion.class })
public class JCompaniesalternatenameQuestion_JUnitTest {

    /**
     * getCompanyId with an new JCompaniesalternatenameQuestion.
     */
    @org.junit.Test
    public void testGetCompanyId() {
        // arrange : set up the test
        final JCompaniesalternatenameQuestion jCompaniesalternatenameQuestion = mock(JCompaniesalternatenameQuestion.class);
        assert jCompaniesalternatenameQuestion != null;

        // act : run the test
        final Integer result = jCompaniesalternatenameQuestion.getCompanyId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCompanyId with an new JCompaniesalternatenameQuestion.
     */
    @org.junit.Test
    public void testSetCompanyId() {
        // arrange : set up the test
        final JCompaniesalternatenameQuestion jCompaniesalternatenameQuestion = mock(JCompaniesalternatenameQuestion.class);
        assert jCompaniesalternatenameQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jCompaniesalternatenameQuestion.setCompanyId(expectedValue);
        final Integer result = jCompaniesalternatenameQuestion.getCompanyId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}