package aka.jmetaagents.main;

import org.eclipse.jdt.annotation.Nullable;

import aka.jmetaagents.main.jallocine.JAllocine;
import aka.jmetaagents.main.jallocine.exceptions.JAllocineException;
import aka.jmetaagents.main.jallocine.pojo.jfilmography.JFilmography;
import aka.jmetaagents.main.jallocine.pojo.jmovie.JMovie;
import aka.jmetaagents.main.jallocine.pojo.jmovie.Movie;
import aka.jmetaagents.main.jallocine.pojo.jperson.JPerson;
import aka.jmetaagents.main.jallocine.pojo.jperson.Name;
import aka.jmetaagents.main.jallocine.pojo.jperson.Person;
import aka.jmetaagents.main.jallocine.pojo.jtvshow.JTVShow;
import aka.jmetaagents.main.jallocine.pojo.jtvshowepisode.JTVShowEpisode;
import aka.jmetaagents.main.jallocine.pojo.jtvshowseason.JTVShowSeason;
import aka.jmetaagents.main.jallocine.pojo.jtvshowssearch.JTVShowsSearch;
import resource.MetaagentConstants;

/**
 * Test classe
 *
 * @author Charlotte
 *
 */
public class Jallocine_JUnitTest {

    /**
     * @throws JAllocineException
     */
    @org.junit.Test
    public void TestJMovie() throws JAllocineException {
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);

        final JMovie jmovie = jAllocine.getMovie(62);

        if (jmovie != null) {
            @Nullable
            final Movie movie = jmovie.getMovie();
            if (movie != null) {
                System.err.println("[Jallocine] getMovie - " + movie.getOriginalTitle());
            }
        }
    }

    /**
     * @throws JAllocineException
     */
    @org.junit.Test
    public void TestJPerson() throws JAllocineException {
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);

        final JPerson jperson = jAllocine.getPerson(258);

        if (jperson != null) {
            @Nullable
            final Person person = jperson.getPerson();
            if (person != null) {
                @Nullable
                final Name name = person.getName();
                if (name != null) {
                    System.err.println("[Jallocine] getMovie - " + name.getFamily());
                }
            }
        }
    }

    /**
     * @throws JAllocineException
     */
    @org.junit.Test
    public void TestJFilmography() throws JAllocineException {
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);

        final JFilmography jFilmography = jAllocine.getFilmography(259);

        if (jFilmography != null) {
            final aka.jmetaagents.main.jallocine.pojo.jfilmography.@Nullable Person person = jFilmography.getPerson();
            if (person != null) {
                final aka.jmetaagents.main.jallocine.pojo.jfilmography.@Nullable Name name = person.getName();
                if (name != null) {
                    System.err.println("[Jallocine] getMovie - " + name.getFamily());
                }
            }
        }
    }

    /**
     * @throws JAllocineException
     */
    @org.junit.Test
    public void TestJTVShow() throws JAllocineException {
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);

        final JTVShow jTVShow = jAllocine.getTVShow(7157);

        if (jTVShow != null) {
//            @NonNull
//            final List<Season> season = jTVShow.getTvseries().getSeason();
//            if (person != null) {
//                final aka.jmetaagents.main.jallocine.pojo.jfilmography.@Nullable Name name = person.getName();
//                if (name != null) {
//                    System.err.println("[Jallocine] getMovie - " + name.getFamily());
//                }
//            }
        }
    }

    /**
     * @throws JAllocineException
     */
    @org.junit.Test
    public void TestJTVShowSeason() throws JAllocineException {
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);

        final JTVShowSeason jTVShow = jAllocine.getTVShowSeason(24060);

        if (jTVShow != null) {
//            @NonNull
//            final List<Season> season = jTVShow.getTvseries().getSeason();
//            if (person != null) {
//                final aka.jmetaagents.main.jallocine.pojo.jfilmography.@Nullable Name name = person.getName();
//                if (name != null) {
//                    System.err.println("[Jallocine] getMovie - " + name.getFamily());
//                }
//            }
        }
    }

    /**
     * @throws JAllocineException
     */
    @org.junit.Test
    public void TestJTVShowEpisode() throws JAllocineException {
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);

        final JTVShowEpisode jTVShow = jAllocine.getTVShowEpisode(512301);

        if (jTVShow != null) {
//            @NonNull
//            final List<Season> season = jTVShow.getTvseries().getSeason();
//            if (person != null) {
//                final aka.jmetaagents.main.jallocine.pojo.jfilmography.@Nullable Name name = person.getName();
//                if (name != null) {
//                    System.err.println("[Jallocine] getMovie - " + name.getFamily());
//                }
//            }
        }
    }

    /**
     * @throws JAllocineException
     */
    @org.junit.Test
    public void TestSearchMovie() throws JAllocineException {
        final JAllocine jAllocine = new JAllocine(MetaagentConstants.ALLOCINE_API_KEY);

        final @Nullable JTVShowsSearch jFilmography = jAllocine.searchTVSeries("game");

        if (jFilmography != null) {
//            final aka.jmetaagents.main.jallocine.pojo.jfilmography.@Nullable Person person = jFilmography.getPerson();
//            if (person != null) {
//                final aka.jmetaagents.main.jallocine.pojo.jfilmography.@Nullable Name name = person.getName();
//                if (name != null) {
//                    System.err.println("[Jallocine] getMovie - " + name.getFamily());
//                }
//            }
        }
    }
}
