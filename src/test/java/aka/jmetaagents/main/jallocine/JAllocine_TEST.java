package aka.jmetaagents.main.jallocine;

import java.awt.image.BufferedImage;

import aka.jmetaagents.main.jallocine.exceptions.JAllocineException;
import aka.jmetaagents.main.jallocine.pojo.jfilmography.JFilmography;
import aka.jmetaagents.main.jallocine.pojo.jmovie.JMovie;
import aka.jmetaagents.main.jallocine.pojo.jmoviesearch.JMovieSearch;
import aka.jmetaagents.main.jallocine.pojo.jperson.JPerson;
import aka.jmetaagents.main.jallocine.pojo.jpersonsearch.JPersonSearch;
import aka.jmetaagents.main.jallocine.pojo.jtvshow.JTVShow;
import aka.jmetaagents.main.jallocine.pojo.jtvshowepisode.JTVShowEpisode;
import aka.jmetaagents.main.jallocine.pojo.jtvshowseason.JTVShowSeason;
import aka.jmetaagents.main.jallocine.pojo.jtvshowssearch.JTVShowsSearch;
import aka.jmetaagents.test.resource.MetaagentConstants;

/**
 * JUnit tests for the class JAllocine.
 *
 * @author JunitTestGenerator
 */
public class JAllocine_TEST {

    /**
     * searchMovie.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>int</li>
     * <li>int</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchMovieWithStringintint() {
        final String param0 = "";
        final int param1 = 1;
        final int param2 = 1;
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JMovieSearch jMovieSearchResult = jAllocine.searchMovie(param0, param1, param2);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * searchMovie.
     * With params:
     * <ul>
     * <li>String</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchMovieWithString() {
        final String param0 = "";
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JMovieSearch jMovieSearchResult = jAllocine.searchMovie(param0);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * searchMovie.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>int</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchMovieWithStringint() {
        final String param0 = "";
        final int param1 = 1;
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JMovieSearch jMovieSearchResult = jAllocine.searchMovie(param0, param1);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * getMovie.
     * With params:
     * <ul>
     * <li>int</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetMovieWithint() {
        final int param0 = 1;
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JMovie jMovieResult = jAllocine.getMovie(param0);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * getFilmography.
     * With params:
     * <ul>
     * <li>int</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetFilmographyWithint() {
        final int param0 = 1;
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JFilmography jFilmographyResult = jAllocine.getFilmography(param0);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * searchTVSeries.
     * With params:
     * <ul>
     * <li>String</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchTVSeriesWithString() {
        final String param0 = "";
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JTVShowsSearch jTVShowsSearchResult = jAllocine.searchTVSeries(param0);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * searchTVSeries.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>int</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchTVSeriesWithStringint() {
        final String param0 = "";
        final int param1 = 1;
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JTVShowsSearch jTVShowsSearchResult = jAllocine.searchTVSeries(param0, param1);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * searchTVSeries.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>int</li>
     * <li>int</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchTVSeriesWithStringintint() {
        final String param0 = "";
        final int param1 = 1;
        final int param2 = 1;
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JTVShowsSearch jTVShowsSearchResult = jAllocine.searchTVSeries(param0, param1, param2);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowSeason.
     * With params:
     * <ul>
     * <li>int</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowSeasonWithint() {
        final int param0 = 1;
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JTVShowSeason jTVShowSeasonResult = jAllocine.getTVShowSeason(param0);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * getTVShow.
     * With params:
     * <ul>
     * <li>int</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowWithint() {
        final int param0 = 1;
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JTVShow jTVShowResult = jAllocine.getTVShow(param0);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowEpisode.
     * With params:
     * <ul>
     * <li>int</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowEpisodeWithint() {
        final int param0 = 1;
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JTVShowEpisode jTVShowEpisodeResult = jAllocine.getTVShowEpisode(param0);

            // Add assertions

        } catch (final JAllocineException e) {
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
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final BufferedImage bufferedImageResult = jAllocine.getImage(param0);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * getPerson.
     * With params:
     * <ul>
     * <li>int</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetPersonWithint() {
        final int param0 = 1;
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JPerson jPersonResult = jAllocine.getPerson(param0);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * searchPerson.
     * With params:
     * <ul>
     * <li>String</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchPersonWithString() {
        final String param0 = "";
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JPersonSearch jPersonSearchResult = jAllocine.searchPerson(param0);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * searchPerson.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>int</li>
     * <li>int</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchPersonWithStringintint() {
        final String param0 = "";
        final int param1 = 1;
        final int param2 = 1;
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JPersonSearch jPersonSearchResult = jAllocine.searchPerson(param0, param1, param2);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

    /**
     * searchPerson.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>int</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchPersonWithStringint() {
        final String param0 = "";
        final int param1 = 1;
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);
        try {
            final JPersonSearch jPersonSearchResult = jAllocine.searchPerson(param0, param1);

            // Add assertions

        } catch (final JAllocineException e) {
            // Handle exception
        }
    }

}
