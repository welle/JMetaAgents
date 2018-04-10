package aka.jmetaagents.main.tmdb.tv.tvtranslations;

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
 * JUnit skeleton for the JTvtranslationsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvtranslationsResponse.class })
public class JTvtranslationsResponse_JUnitTest {

    /**
     * getTranslations with an new JTvtranslationsResponse.
     */
    @org.junit.Test
    public void testGetTranslations() {
        // arrange : set up the test
        final JTvtranslationsResponse jTvtranslationsResponse = mock(JTvtranslationsResponse.class);
        assert jTvtranslationsResponse != null;

        // act : run the test
        final List result = jTvtranslationsResponse.getTranslations();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTranslations with an new JTvtranslationsResponse.
     */
    @org.junit.Test
    public void testSetTranslations() {
        // arrange : set up the test
        final JTvtranslationsResponse jTvtranslationsResponse = mock(JTvtranslationsResponse.class);
        assert jTvtranslationsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Translations> expectedValue = new ArrayList<>();
        Translations translationsItem = new Translations();
        expectedValue.add(translationsItem);
        jTvtranslationsResponse.setTranslations(expectedValue);
        final List<Translations> result = jTvtranslationsResponse.getTranslations();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JTvtranslationsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JTvtranslationsResponse jTvtranslationsResponse = mock(JTvtranslationsResponse.class);
        assert jTvtranslationsResponse != null;

        // act : run the test
        final Integer result = jTvtranslationsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JTvtranslationsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JTvtranslationsResponse jTvtranslationsResponse = mock(JTvtranslationsResponse.class);
        assert jTvtranslationsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvtranslationsResponse.setId(expectedValue);
        final Integer result = jTvtranslationsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}