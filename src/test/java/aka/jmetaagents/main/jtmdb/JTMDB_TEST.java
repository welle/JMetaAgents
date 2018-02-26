package aka.jmetaagents.main.jtmdb;

import java.awt.image.BufferedImage;
import java.util.Locale;

import aka.jmetaagents.main.jtmdb.exceptions.JTMDBException;
import aka.jmetaagents.main.jtmdb.pojo.collection.jcollection.JCollection;
import aka.jmetaagents.main.jtmdb.pojo.collection.jcollectionimage.JCollectionImage;
import aka.jmetaagents.main.jtmdb.pojo.collection.jcollectionsearch.JCollectionSearch;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovie.JMovie;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviealternativetitle.JMovieAlternativeTitle;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviecast.JMovieCast;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovieimage.JMovieImage;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviepopular.JMoviePopular;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovierelease.JMovieRelease;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviesearch.JMovieSearch;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviesimilar.JMovieSimilar;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovietoprated.JMovieTopRated;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovietrailer.JMovieTrailer;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovievideo.JMovieVideo;
import aka.jmetaagents.main.jtmdb.pojo.person.jperson.JPerson;
import aka.jmetaagents.main.jtmdb.pojo.person.jpersoncredits.JPersonCredits;
import aka.jmetaagents.main.jtmdb.pojo.person.jpersonimage.JPersonImage;
import aka.jmetaagents.main.jtmdb.pojo.person.jpersonsearch.JPersonSearch;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshow.JTVShow;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowalternativetitle.JTVShowAlternativeTitle;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowcredits.JTVShowCredits;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowepisode.JTVShowEpisode;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowepisodecredits.JTVShowEpisodeCredits;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowepisodeimage.JTVShowEpisodeImage;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowepisodevideo.JTVShowEpisodeVideo;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowimage.JTVShowImage;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowpopular.JTVShowPopular;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowsearch.JTVShowSearch;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseason.JTVShowSeason;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseasonimage.JTVShowSeasonImage;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseasonvideo.JTVShowSeasonVideo;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowsimilar.JTVShowSimilar;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowtoprated.JTVShowTopRated;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowvideo.JTVShowVideo;
import aka.jmetaagents.test.resource.MetaagentConstants;

/**
 * JUnit tests for the class JTMDB.
 *
 * @author JunitTestGenerator
 */
public class JTMDB_TEST {

    /**
     * getTVShowSeasonImage.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>String</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowSeasonImageWithStringString() {
        final String param0 = "";
        final String param1 = "";
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowSeasonImage jTVShowSeasonImageResult = jTMDB.getTVShowSeasonImage(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getMoviesTopRated.
     * With params:
     * <ul>
     * <li>Locale</li>
     * <li>Integer</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetMoviesTopRatedWithLocaleInteger() {
        final Locale param0 = null;
        final Integer param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JMovieTopRated jMovieTopRatedResult = jTMDB.getMoviesTopRated(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowSeasonVideo.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowSeasonVideoWithStringStringLocale() {
        final String param0 = "";
        final String param1 = "";
        final Locale param2 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowSeasonVideo jTVShowSeasonVideoResult = jTMDB.getTVShowSeasonVideo(param0, param1, param2);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getCollectionImage.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetCollectionImageWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JCollectionImage jCollectionImageResult = jTMDB.getCollectionImage(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getMovieAltTitles.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetMovieAltTitlesWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JMovieAlternativeTitle jMovieAlternativeTitleResult = jTMDB.getMovieAltTitles(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowAltTitles.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowAltTitlesWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowAlternativeTitle jTVShowAlternativeTitleResult = jTMDB.getTVShowAltTitles(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowsPopular.
     * With params:
     * <ul>
     * <li>Locale</li>
     * <li>Integer</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowsPopularWithLocaleInteger() {
        final Locale param0 = null;
        final Integer param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowPopular jTVShowPopularResult = jTMDB.getTVShowsPopular(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowsTopRated.
     * With params:
     * <ul>
     * <li>Locale</li>
     * <li>Integer</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowsTopRatedWithLocaleInteger() {
        final Locale param0 = null;
        final Integer param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowTopRated jTVShowTopRatedResult = jTMDB.getTVShowsTopRated(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowEpisodeCredits.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>String</li>
     * <li>String</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowEpisodeCreditsWithStringStringString() {
        final String param0 = "";
        final String param1 = "";
        final String param2 = "";
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowEpisodeCredits jTVShowEpisodeCreditsResult = jTMDB.getTVShowEpisodeCredits(param0, param1, param2);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowEpisodeImage.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>String</li>
     * <li>String</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowEpisodeImageWithStringStringString() {
        final String param0 = "";
        final String param1 = "";
        final String param2 = "";
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowEpisodeImage jTVShowEpisodeImageResult = jTMDB.getTVShowEpisodeImage(param0, param1, param2);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * searchCollections.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * <li>Integer</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchCollectionsWithStringLocaleInteger() {
        final String param0 = "";
        final Locale param1 = null;
        final Integer param2 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JCollectionSearch jCollectionSearchResult = jTMDB.searchCollections(param0, param1, param2);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowEpisodeVideo.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>String</li>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowEpisodeVideoWithStringStringStringLocale() {
        final String param0 = "";
        final String param1 = "";
        final String param2 = "";
        final Locale param3 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowEpisodeVideo jTVShowEpisodeVideoResult = jTMDB.getTVShowEpisodeVideo(param0, param1, param2, param3);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getMovieReleaseInfo.
     * With params:
     * <ul>
     * <li>String</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetMovieReleaseInfoWithString() {
        final String param0 = "";
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JMovieRelease jMovieReleaseResult = jTMDB.getMovieReleaseInfo(param0);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getMovie.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetMovieWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JMovie jMovieResult = jTMDB.getMovie(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowSeason.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowSeasonWithStringStringLocale() {
        final String param0 = "";
        final String param1 = "";
        final Locale param2 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowSeason jTVShowSeasonResult = jTMDB.getTVShowSeason(param0, param1, param2);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShow.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShow jTVShowResult = jTMDB.getTVShow(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * searchTVShows.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * <li>Integer</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchTVShowsWithStringLocaleInteger() {
        final String param0 = "";
        final Locale param1 = null;
        final Integer param2 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowSearch jTVShowSearchResult = jTMDB.searchTVShows(param0, param1, param2);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowEpisode.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>String</li>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowEpisodeWithStringStringStringLocale() {
        final String param0 = "";
        final String param1 = "";
        final String param2 = "";
        final Locale param3 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowEpisode jTVShowEpisodeResult = jTMDB.getTVShowEpisode(param0, param1, param2, param3);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getImage.
     * With params:
     * <ul>
     * <li>String</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetImageWithString() {
        final String param0 = "";
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final BufferedImage bufferedImageResult = jTMDB.getImage(param0);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getPerson.
     * With params:
     * <ul>
     * <li>String</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetPersonWithString() {
        final String param0 = "";
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JPerson jPersonResult = jTMDB.getPerson(param0);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * searchPerson.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * <li>Integer</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchPersonWithStringLocaleInteger() {
        final String param0 = "";
        final Locale param1 = null;
        final Integer param2 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JPersonSearch jPersonSearchResult = jTMDB.searchPerson(param0, param1, param2);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowVideos.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowVideosWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowVideo jTVShowVideoResult = jTMDB.getTVShowVideos(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getPersonImages.
     * With params:
     * <ul>
     * <li>String</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetPersonImagesWithString() {
        final String param0 = "";
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JPersonImage jPersonImageResult = jTMDB.getPersonImages(param0);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getMovieByIMDBid.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetMovieByIMDBidWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JMovie jMovieResult = jTMDB.getMovieByIMDBid(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getMovieImage.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetMovieImageWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JMovieImage jMovieImageResult = jTMDB.getMovieImage(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowSimilar.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * <li>Integer</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowSimilarWithStringLocaleInteger() {
        final String param0 = "";
        final Locale param1 = null;
        final Integer param2 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowSimilar jTVShowSimilarResult = jTMDB.getTVShowSimilar(param0, param1, param2);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getMovieSimilar.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * <li>Integer</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetMovieSimilarWithStringLocaleInteger() {
        final String param0 = "";
        final Locale param1 = null;
        final Integer param2 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JMovieSimilar jMovieSimilarResult = jTMDB.getMovieSimilar(param0, param1, param2);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowCredits.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowCreditsWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowCredits jTVShowCreditsResult = jTMDB.getTVShowCredits(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * searchMovies.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * <li>Integer</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchMoviesWithStringLocaleInteger() {
        final String param0 = "";
        final Locale param1 = null;
        final Integer param2 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JMovieSearch jMovieSearchResult = jTMDB.searchMovies(param0, param1, param2);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowImage.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowImageWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JTVShowImage jTVShowImageResult = jTMDB.getTVShowImage(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getCollection.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetCollectionWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JCollection jCollectionResult = jTMDB.getCollection(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getMovieVideos.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetMovieVideosWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JMovieVideo jMovieVideoResult = jTMDB.getMovieVideos(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getMovieCast.
     * With params:
     * <ul>
     * <li>String</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetMovieCastWithString() {
        final String param0 = "";
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JMovieCast jMovieCastResult = jTMDB.getMovieCast(param0);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getMoviesPopular.
     * With params:
     * <ul>
     * <li>Locale</li>
     * <li>Integer</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetMoviesPopularWithLocaleInteger() {
        final Locale param0 = null;
        final Integer param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JMoviePopular jMoviePopularResult = jTMDB.getMoviesPopular(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getMovieTrailer.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetMovieTrailerWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JMovieTrailer jMovieTrailerResult = jTMDB.getMovieTrailer(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

    /**
     * getPersonCredits.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetPersonCreditsWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        final JTMDB jTMDB = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);
        try {
            final JPersonCredits jPersonCreditsResult = jTMDB.getPersonCredits(param0, param1);

            // Add assertions

        } catch (final JTMDBException e) {
            // Handle exception
        }
    }

}
