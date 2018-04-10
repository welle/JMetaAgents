package aka.jmetaagents.main.tmdb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.awt.image.BufferedImage;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jmetaagents.main.MetaagentConstants;
import aka.jmetaagents.main.tmdb.exceptions.JtmdbException;
import aka.jmetaagents.main.tmdb.JTMDB;
import aka.jmetaagents.main.tmdb.authentification.guest.JGuestQuestion;
import aka.jmetaagents.main.tmdb.authentification.guest.JGuestResponse;
import aka.jmetaagents.main.tmdb.collections.collectionsdetails.JCollectionsdetailsQuestion;
import aka.jmetaagents.main.tmdb.collections.collectionsdetails.JCollectionsdetailsResponse;
import aka.jmetaagents.main.tmdb.collections.collectionsimages.JCollectionsimagesQuestion;
import aka.jmetaagents.main.tmdb.collections.collectionsimages.JCollectionsimagesResponse;
import aka.jmetaagents.main.tmdb.collections.collectionstranslations.JCollectionstranslationsQuestion;
import aka.jmetaagents.main.tmdb.collections.collectionstranslations.JCollectionstranslationsResponse;
import aka.jmetaagents.main.tmdb.companies.companiesalternatename.JCompaniesalternatenameQuestion;
import aka.jmetaagents.main.tmdb.companies.companiesalternatename.JCompaniesalternatenameResponse;
import aka.jmetaagents.main.tmdb.companies.companiesdetails.JCompaniesdetailsQuestion;
import aka.jmetaagents.main.tmdb.companies.companiesdetails.JCompaniesdetailsResponse;
import aka.jmetaagents.main.tmdb.companies.companiesimages.JCompaniesimagesQuestion;
import aka.jmetaagents.main.tmdb.companies.companiesimages.JCompaniesimagesResponse;
import aka.jmetaagents.main.tmdb.credits.creditsdetails.JCreditsdetailsQuestion;
import aka.jmetaagents.main.tmdb.credits.creditsdetails.JCreditsdetailsResponse;
import aka.jmetaagents.main.tmdb.find.findbyimdbid.JFindbyimdbidQuestion;
import aka.jmetaagents.main.tmdb.find.findbyimdbid.JFindbyimdbidResponse;
import aka.jmetaagents.main.tmdb.find.findbytvdbid.JFindbytvdbidQuestion;
import aka.jmetaagents.main.tmdb.find.findbytvdbid.JFindbytvdbidResponse;
import aka.jmetaagents.main.tmdb.genres.genresgetmovielist.JGenresgetmovielistQuestion;
import aka.jmetaagents.main.tmdb.genres.genresgetmovielist.JGenresgetmovielistResponse;
import aka.jmetaagents.main.tmdb.genres.genresgetmovies.JGenresgetmoviesQuestion;
import aka.jmetaagents.main.tmdb.genres.genresgetmovies.JGenresgetmoviesResponse;
import aka.jmetaagents.main.tmdb.genres.genresgettvlist.JGenresgettvlistQuestion;
import aka.jmetaagents.main.tmdb.genres.genresgettvlist.JGenresgettvlistResponse;

/**
 * Generated JTMDB Tests unit.
 */
public final class JTMDB_Test {

    private @NonNull String apiKey = MetaagentConstants.THE_MOVIE_DB_API_KEY;

    /**
     * Test getJCollectionsdetails method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJCollectionsdetails_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer collectionId = null;
        final String language = null;
        final JCollectionsdetailsQuestion jTMDBQuestion = new JCollectionsdetailsQuestion(collectionId, language);
        final JCollectionsdetailsResponse result = jTMDB.getJCollectionsdetails(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJCollectionsimages method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJCollectionsimages_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer collectionId = null;
        final String language = null;
        final JCollectionsimagesQuestion jTMDBQuestion = new JCollectionsimagesQuestion(collectionId, language);
        final JCollectionsimagesResponse result = jTMDB.getJCollectionsimages(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJCollectionstranslations method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJCollectionstranslations_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer collectionId = null;
        final String language = null;
        final JCollectionstranslationsQuestion jTMDBQuestion = new JCollectionstranslationsQuestion(collectionId, language);
        final JCollectionstranslationsResponse result = jTMDB.getJCollectionstranslations(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJCompaniesalternatename method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJCompaniesalternatename_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer companyId = null;
        final JCompaniesalternatenameQuestion jTMDBQuestion = new JCompaniesalternatenameQuestion(companyId);
        final JCompaniesalternatenameResponse result = jTMDB.getJCompaniesalternatename(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJCompaniesdetails method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJCompaniesdetails_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer companyId = null;
        final JCompaniesdetailsQuestion jTMDBQuestion = new JCompaniesdetailsQuestion(companyId);
        final JCompaniesdetailsResponse result = jTMDB.getJCompaniesdetails(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJCompaniesimages method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJCompaniesimages_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer companyId = null;
        final JCompaniesimagesQuestion jTMDBQuestion = new JCompaniesimagesQuestion(companyId);
        final JCompaniesimagesResponse result = jTMDB.getJCompaniesimages(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJCreditsdetails method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJCreditsdetails_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer creditId = null;
        final JCreditsdetailsQuestion jTMDBQuestion = new JCreditsdetailsQuestion(creditId);
        final JCreditsdetailsResponse result = jTMDB.getJCreditsdetails(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJFindbyimdbid method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJFindbyimdbid_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer externalId = null;
        final String language = null;
        final JFindbyimdbidQuestion jTMDBQuestion = new JFindbyimdbidQuestion(externalId, language);
        final JFindbyimdbidResponse result = jTMDB.getJFindbyimdbid(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJFindbytvdbid method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJFindbytvdbid_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer externalId = null;
        final String language = null;
        final JFindbytvdbidQuestion jTMDBQuestion = new JFindbytvdbidQuestion(externalId, language);
        final JFindbytvdbidResponse result = jTMDB.getJFindbytvdbid(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJGenresgetmovielist method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJGenresgetmovielist_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final String language = null;
        final JGenresgetmovielistQuestion jTMDBQuestion = new JGenresgetmovielistQuestion(language);
        final JGenresgetmovielistResponse result = jTMDB.getJGenresgetmovielist(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJGenresgetmovies method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJGenresgetmovies_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Boolean includeAdult = null;
        final String language = null;
        final Integer genreId = null;
        final JGenresgetmoviesQuestion jTMDBQuestion = new JGenresgetmoviesQuestion(includeAdult, language, genreId);
        final JGenresgetmoviesResponse result = jTMDB.getJGenresgetmovies(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJGenresgettvlist method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJGenresgettvlist_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final String language = null;
        final JGenresgettvlistQuestion jTMDBQuestion = new JGenresgettvlistQuestion(language);
        final JGenresgettvlistResponse result = jTMDB.getJGenresgettvlist(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getImage method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getImage_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        
        // act : run the test
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        String urlImage = "";
        final BufferedImage result = jTMDB.getImage(urlImage);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

}
