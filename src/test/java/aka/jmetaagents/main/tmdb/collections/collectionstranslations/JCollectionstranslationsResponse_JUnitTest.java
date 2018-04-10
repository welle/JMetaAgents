package aka.jmetaagents.main.tmdb.collections.collectionstranslations;

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
 * JUnit skeleton for the JCollectionstranslationsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JCollectionstranslationsResponse.class })
public class JCollectionstranslationsResponse_JUnitTest {

    /**
     * getTranslations with an new JCollectionstranslationsResponse.
     */
    @org.junit.Test
    public void testGetTranslations() {
        // arrange : set up the test
        final JCollectionstranslationsResponse jCollectionstranslationsResponse = mock(JCollectionstranslationsResponse.class);
        assert jCollectionstranslationsResponse != null;

        // act : run the test
        final List result = jCollectionstranslationsResponse.getTranslations();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTranslations with an new JCollectionstranslationsResponse.
     */
    @org.junit.Test
    public void testSetTranslations() {
        // arrange : set up the test
        final JCollectionstranslationsResponse jCollectionstranslationsResponse = mock(JCollectionstranslationsResponse.class);
        assert jCollectionstranslationsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Translations> expectedValue = new ArrayList<>();
        Translations translationsItem = new Translations();
        expectedValue.add(translationsItem);
        jCollectionstranslationsResponse.setTranslations(expectedValue);
        final List<Translations> result = jCollectionstranslationsResponse.getTranslations();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JCollectionstranslationsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JCollectionstranslationsResponse jCollectionstranslationsResponse = mock(JCollectionstranslationsResponse.class);
        assert jCollectionstranslationsResponse != null;

        // act : run the test
        final Integer result = jCollectionstranslationsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JCollectionstranslationsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JCollectionstranslationsResponse jCollectionstranslationsResponse = mock(JCollectionstranslationsResponse.class);
        assert jCollectionstranslationsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jCollectionstranslationsResponse.setId(expectedValue);
        final Integer result = jCollectionstranslationsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}