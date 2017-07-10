package aka.jmetaagents.main.jtvdb.constants;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Image type.
 *
 * @author Cha
 */
public enum KEY_TYPE {

    /**
     * SEASON.
     */
    SEASON("season"),

    /**
     * SEASON_WIDE.
     */
    SEASON_WIDE("seasonwide"),

    /**
     * SERIES.
     */
    SERIES("series"),

    /**
     * POSTER.
     */
    POSTER("poster"),

    /**
     * FANART.
     */
    FANART("fanart");

    private @NonNull String value;

    KEY_TYPE(@NonNull final String value) {
        this.value = value;
    }

    /**
     * Get the enum value.
     *
     * @return value
     */
    @NonNull
    public String getValue() {
        return this.value;
    }
}
