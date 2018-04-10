package aka.jmetaagents.main;

import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * This is a generated file.
 */
public abstract class AbstractAgent {

    private static Logger LOGGER = null;

    /**
     * Invoke method to read value and return requested result
     *
     * @param className
     * @param jsonString
     * @return result
     */
    @SuppressWarnings("unchecked")
    @Nullable
    protected final <T, @Nullable S> S readValue(final Class<T> className, final String jsonString) {
        S result = null;
        try {
            result = AccessController.doPrivileged((PrivilegedExceptionAction<S>) () -> {
                final Method method = className.getMethod("readValue", String.class);
                return (S) method.invoke(null, jsonString);
            });
        } catch (final PrivilegedActionException e) {
            getLogger().logp(Level.SEVERE, "AbstractAgent", "readValue", e.getMessage(), e);
        }

        return result;
    }

    /**
     * Get logger
     *
     * @return logger
     */
    @NonNull
    protected final Logger getLogger() {
        Logger result = LOGGER;
        if (result == null) {
            final String packageName = AbstractAgent.class.getClass().getName();
            result = LOGGER = Logger.getLogger(packageName);
            assert result != null;
        }

        return result;
    }

    /**
     * Get language from given locale.
     *
     * @param locale
     * @return language from locale, "en" if locale is null
     */
    public @NonNull String getLanguage(@Nullable final Locale locale) {
        Locale currentLocale = locale;
        if (currentLocale == null) {
            currentLocale = new Locale("en", "US");
        }

        String language = currentLocale.getLanguage();
        if (language == null || language.trim().length() == 0) {
            language = "en";
        }

        assert language != null;
        return language;
    }

    /**
     * Get country from given locale.
     *
     * @param locale
     * @return country from locale, "US" if locale is null
     */
    public @NonNull String getCountry(@Nullable final Locale locale) {
        Locale currentLocale = locale;
        if (currentLocale == null) {
            currentLocale = new Locale("en", "US");
        }

        String country = currentLocale.getCountry();
        if (country == null || country.trim().length() == 0) {
            country = "US";
        }

        assert country != null;
        return country;
    }

    /**
     * Get page string value.
     *
     * @param page
     * @return string value of page (return "1" if page parameter is null)
     */
    public @NonNull String getPage(@Nullable final Integer page) {
        Integer currentPage = page;
        if (currentPage == null) {
            currentPage = Integer.valueOf(1);
        }

        final String result = currentPage.toString();

        assert result != null;
        return result;
    }

    /**
     * Get count string value.
     *
     * @param count
     * @param defaultValue if count is null
     * @param maxValue maximum value for count result
     * @return string value of count (return defaultValue if page parameter is null)
     */
    public @NonNull String getCount(@Nullable final Integer count, final int defaultValue, final int maxValue) {
        Integer currentCount = count;
        if (currentCount == null) {
            currentCount = Integer.valueOf(defaultValue);
        }

        if (currentCount.intValue() > maxValue) {
            currentCount = Integer.valueOf(maxValue);
        }

        final String result = currentCount.toString();

        assert result != null;
        return result;
    }
}
