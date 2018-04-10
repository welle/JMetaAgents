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
import aka.jmetaagents.main.tmdb.genres.genresgettvlist.JGenresgettvlistQuestion;
import aka.jmetaagents.main.tmdb.genres.genresgettvlist.JGenresgettvlistResponse;
import aka.jmetaagents.main.tmdb.movies.moviesalternativetitles.JMoviesalternativetitlesQuestion;
import aka.jmetaagents.main.tmdb.movies.moviesalternativetitles.JMoviesalternativetitlesResponse;
import aka.jmetaagents.main.tmdb.movies.moviescredits.JMoviescreditsQuestion;
import aka.jmetaagents.main.tmdb.movies.moviescredits.JMoviescreditsResponse;
import aka.jmetaagents.main.tmdb.movies.moviesdetails.JMoviesdetailsQuestion;
import aka.jmetaagents.main.tmdb.movies.moviesdetails.JMoviesdetailsResponse;
import aka.jmetaagents.main.tmdb.movies.moviesexternalids.JMoviesexternalidsQuestion;
import aka.jmetaagents.main.tmdb.movies.moviesexternalids.JMoviesexternalidsResponse;
import aka.jmetaagents.main.tmdb.movies.moviesimages.JMoviesimagesQuestion;
import aka.jmetaagents.main.tmdb.movies.moviesimages.JMoviesimagesResponse;
import aka.jmetaagents.main.tmdb.movies.moviesrecommandations.JMoviesrecommandationsQuestion;
import aka.jmetaagents.main.tmdb.movies.moviesrecommandations.JMoviesrecommandationsResponse;
import aka.jmetaagents.main.tmdb.movies.moviessimilar.JMoviessimilarQuestion;
import aka.jmetaagents.main.tmdb.movies.moviessimilar.JMoviessimilarResponse;
import aka.jmetaagents.main.tmdb.movies.moviestranslations.JMoviestranslationsQuestion;
import aka.jmetaagents.main.tmdb.movies.moviestranslations.JMoviestranslationsResponse;
import aka.jmetaagents.main.tmdb.movies.moviesvideos.JMoviesvideosQuestion;
import aka.jmetaagents.main.tmdb.movies.moviesvideos.JMoviesvideosResponse;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodecredits.JTvepisodecreditsQuestion;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodecredits.JTvepisodecreditsResponse;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodedetails.JTvepisodedetailsQuestion;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodedetails.JTvepisodedetailsResponse;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodeexternalids.JTvepisodeexternalidsQuestion;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodeexternalids.JTvepisodeexternalidsResponse;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodeimages.JTvepisodeimagesQuestion;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodeimages.JTvepisodeimagesResponse;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodevideos.JTvepisodevideosQuestion;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodevideos.JTvepisodevideosResponse;
import aka.jmetaagents.main.tmdb.tv.season.tvseasoncredits.JTvseasoncreditsQuestion;
import aka.jmetaagents.main.tmdb.tv.season.tvseasoncredits.JTvseasoncreditsResponse;
import aka.jmetaagents.main.tmdb.tv.season.tvseasondetails.JTvseasondetailsQuestion;
import aka.jmetaagents.main.tmdb.tv.season.tvseasondetails.JTvseasondetailsResponse;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonexternalids.JTvseasonexternalidsQuestion;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonexternalids.JTvseasonexternalidsResponse;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonimages.JTvseasonimagesQuestion;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonimages.JTvseasonimagesResponse;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonvideos.JTvseasonvideosQuestion;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonvideos.JTvseasonvideosResponse;
import aka.jmetaagents.main.tmdb.tv.tvalternativetitles.JTvalternativetitlesQuestion;
import aka.jmetaagents.main.tmdb.tv.tvalternativetitles.JTvalternativetitlesResponse;
import aka.jmetaagents.main.tmdb.tv.tvcredits.JTvcreditsQuestion;
import aka.jmetaagents.main.tmdb.tv.tvcredits.JTvcreditsResponse;
import aka.jmetaagents.main.tmdb.tv.tvdetails.JTvdetailsQuestion;
import aka.jmetaagents.main.tmdb.tv.tvdetails.JTvdetailsResponse;
import aka.jmetaagents.main.tmdb.tv.tvexternalids.JTvexternalidsQuestion;
import aka.jmetaagents.main.tmdb.tv.tvexternalids.JTvexternalidsResponse;
import aka.jmetaagents.main.tmdb.tv.tvimages.JTvimagesQuestion;
import aka.jmetaagents.main.tmdb.tv.tvimages.JTvimagesResponse;
import aka.jmetaagents.main.tmdb.tv.tvrecommandations.JTvrecommandationsQuestion;
import aka.jmetaagents.main.tmdb.tv.tvrecommandations.JTvrecommandationsResponse;
import aka.jmetaagents.main.tmdb.tv.tvsimilar.JTvsimilarQuestion;
import aka.jmetaagents.main.tmdb.tv.tvsimilar.JTvsimilarResponse;
import aka.jmetaagents.main.tmdb.tv.tvtranslations.JTvtranslationsQuestion;
import aka.jmetaagents.main.tmdb.tv.tvtranslations.JTvtranslationsResponse;
import aka.jmetaagents.main.tmdb.tv.tvvideos.JTvvideosQuestion;
import aka.jmetaagents.main.tmdb.tv.tvvideos.JTvvideosResponse;

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
     * Test getJMoviesalternativetitles method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJMoviesalternativetitles_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final String country = null;
        final Integer movieId = null;
        final JMoviesalternativetitlesQuestion jTMDBQuestion = new JMoviesalternativetitlesQuestion(country, movieId);
        final JMoviesalternativetitlesResponse result = jTMDB.getJMoviesalternativetitles(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJMoviescredits method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJMoviescredits_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer movieId = null;
        final JMoviescreditsQuestion jTMDBQuestion = new JMoviescreditsQuestion(movieId);
        final JMoviescreditsResponse result = jTMDB.getJMoviescredits(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJMoviesdetails method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJMoviesdetails_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final String language = null;
        final Integer movieId = null;
        final JMoviesdetailsQuestion jTMDBQuestion = new JMoviesdetailsQuestion(language, movieId);
        final JMoviesdetailsResponse result = jTMDB.getJMoviesdetails(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJMoviesexternalids method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJMoviesexternalids_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer movieId = null;
        final JMoviesexternalidsQuestion jTMDBQuestion = new JMoviesexternalidsQuestion(movieId);
        final JMoviesexternalidsResponse result = jTMDB.getJMoviesexternalids(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJMoviesimages method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJMoviesimages_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final String language = null;
        final Integer movieId = null;
        final JMoviesimagesQuestion jTMDBQuestion = new JMoviesimagesQuestion(language, movieId);
        final JMoviesimagesResponse result = jTMDB.getJMoviesimages(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJMoviesrecommandations method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJMoviesrecommandations_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final String language = null;
        final Integer page = null;
        final Integer movieId = null;
        final JMoviesrecommandationsQuestion jTMDBQuestion = new JMoviesrecommandationsQuestion(language, page, movieId);
        final JMoviesrecommandationsResponse result = jTMDB.getJMoviesrecommandations(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJMoviessimilar method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJMoviessimilar_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final String language = null;
        final Integer page = null;
        final Integer movieId = null;
        final JMoviessimilarQuestion jTMDBQuestion = new JMoviessimilarQuestion(language, page, movieId);
        final JMoviessimilarResponse result = jTMDB.getJMoviessimilar(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJMoviestranslations method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJMoviestranslations_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer movieId = null;
        final JMoviestranslationsQuestion jTMDBQuestion = new JMoviestranslationsQuestion(movieId);
        final JMoviestranslationsResponse result = jTMDB.getJMoviestranslations(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJMoviesvideos method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJMoviesvideos_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final String language = null;
        final Integer movieId = null;
        final JMoviesvideosQuestion jTMDBQuestion = new JMoviesvideosQuestion(language, movieId);
        final JMoviesvideosResponse result = jTMDB.getJMoviesvideos(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvepisodecredits method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvepisodecredits_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final Integer episodeNumber = null;
        final Integer seasonNumber = null;
        final JTvepisodecreditsQuestion jTMDBQuestion = new JTvepisodecreditsQuestion(tvId, episodeNumber, seasonNumber);
        final JTvepisodecreditsResponse result = jTMDB.getJTvepisodecredits(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvepisodedetails method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvepisodedetails_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final Integer episodeNumber = null;
        final Integer seasonNumber = null;
        final String language = null;
        final JTvepisodedetailsQuestion jTMDBQuestion = new JTvepisodedetailsQuestion(tvId, episodeNumber, seasonNumber, language);
        final JTvepisodedetailsResponse result = jTMDB.getJTvepisodedetails(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvepisodeexternalids method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvepisodeexternalids_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final Integer episodeNumber = null;
        final Integer seasonNumber = null;
        final JTvepisodeexternalidsQuestion jTMDBQuestion = new JTvepisodeexternalidsQuestion(tvId, episodeNumber, seasonNumber);
        final JTvepisodeexternalidsResponse result = jTMDB.getJTvepisodeexternalids(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvepisodeimages method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvepisodeimages_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final Integer episodeNumber = null;
        final Integer seasonNumber = null;
        final JTvepisodeimagesQuestion jTMDBQuestion = new JTvepisodeimagesQuestion(tvId, episodeNumber, seasonNumber);
        final JTvepisodeimagesResponse result = jTMDB.getJTvepisodeimages(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvepisodevideos method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvepisodevideos_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final Integer episodeNumber = null;
        final Integer seasonNumber = null;
        final String language = null;
        final JTvepisodevideosQuestion jTMDBQuestion = new JTvepisodevideosQuestion(tvId, episodeNumber, seasonNumber, language);
        final JTvepisodevideosResponse result = jTMDB.getJTvepisodevideos(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvseasoncredits method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvseasoncredits_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final Integer seasonNumber = null;
        final String language = null;
        final JTvseasoncreditsQuestion jTMDBQuestion = new JTvseasoncreditsQuestion(tvId, seasonNumber, language);
        final JTvseasoncreditsResponse result = jTMDB.getJTvseasoncredits(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvseasondetails method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvseasondetails_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final Integer seasonNumber = null;
        final String language = null;
        final JTvseasondetailsQuestion jTMDBQuestion = new JTvseasondetailsQuestion(tvId, seasonNumber, language);
        final JTvseasondetailsResponse result = jTMDB.getJTvseasondetails(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvseasonexternalids method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvseasonexternalids_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final Integer seasonNumber = null;
        final String language = null;
        final JTvseasonexternalidsQuestion jTMDBQuestion = new JTvseasonexternalidsQuestion(tvId, seasonNumber, language);
        final JTvseasonexternalidsResponse result = jTMDB.getJTvseasonexternalids(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvseasonimages method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvseasonimages_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final Integer seasonNumber = null;
        final String language = null;
        final JTvseasonimagesQuestion jTMDBQuestion = new JTvseasonimagesQuestion(tvId, seasonNumber, language);
        final JTvseasonimagesResponse result = jTMDB.getJTvseasonimages(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvseasonvideos method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvseasonvideos_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final Integer seasonNumber = null;
        final String language = null;
        final JTvseasonvideosQuestion jTMDBQuestion = new JTvseasonvideosQuestion(tvId, seasonNumber, language);
        final JTvseasonvideosResponse result = jTMDB.getJTvseasonvideos(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvalternativetitles method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvalternativetitles_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final String language = null;
        final JTvalternativetitlesQuestion jTMDBQuestion = new JTvalternativetitlesQuestion(tvId, language);
        final JTvalternativetitlesResponse result = jTMDB.getJTvalternativetitles(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvcredits method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvcredits_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final String language = null;
        final JTvcreditsQuestion jTMDBQuestion = new JTvcreditsQuestion(tvId, language);
        final JTvcreditsResponse result = jTMDB.getJTvcredits(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvdetails method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvdetails_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final String language = null;
        final JTvdetailsQuestion jTMDBQuestion = new JTvdetailsQuestion(tvId, language);
        final JTvdetailsResponse result = jTMDB.getJTvdetails(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvexternalids method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvexternalids_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final String language = null;
        final JTvexternalidsQuestion jTMDBQuestion = new JTvexternalidsQuestion(tvId, language);
        final JTvexternalidsResponse result = jTMDB.getJTvexternalids(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvimages method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvimages_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final String language = null;
        final JTvimagesQuestion jTMDBQuestion = new JTvimagesQuestion(tvId, language);
        final JTvimagesResponse result = jTMDB.getJTvimages(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvrecommandations method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvrecommandations_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final String language = null;
        final String page = null;
        final JTvrecommandationsQuestion jTMDBQuestion = new JTvrecommandationsQuestion(tvId, language, page);
        final JTvrecommandationsResponse result = jTMDB.getJTvrecommandations(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvsimilar method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvsimilar_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final String language = null;
        final String page = null;
        final JTvsimilarQuestion jTMDBQuestion = new JTvsimilarQuestion(tvId, language, page);
        final JTvsimilarResponse result = jTMDB.getJTvsimilar(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvtranslations method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvtranslations_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final String language = null;
        final JTvtranslationsQuestion jTMDBQuestion = new JTvtranslationsQuestion(tvId, language);
        final JTvtranslationsResponse result = jTMDB.getJTvtranslations(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJTvvideos method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJTvvideos_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer tvId = null;
        final String language = null;
        final JTvvideosQuestion jTMDBQuestion = new JTvvideosQuestion(tvId, language);
        final JTvvideosResponse result = jTMDB.getJTvvideos(jTMDBQuestion);
        
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
