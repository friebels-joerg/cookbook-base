package de.friebels.cookbook.domain;

import java.util.Objects;

/**
 * use this to chaeck parameters of methods....
 */
final class Precondition {

    private Precondition() {
    }

    /**
     * Natural number are >= 1
     */
    static Integer checkIsNaturalNumber(final Integer value, final String parameterName) {
        checkNotNullable(value, parameterName);
        if (value < 1) {
            throw new IllegalArgumentException(String.format("Parameter '%s' must not be negative", parameterName));
        }
        return value;
    }

    public static <T> T checkNotNullable(final T value, final String parameterName) {
        if (value==null)
            throw new IllegalArgumentException( String.format("Parameter '%s' must not be null", parameterName));
        return value;
    }

    public static String checkExactLengthString(final String value, final String parameterName, final Integer length) {
        checkNotNullable(value, parameterName);
        if (value.length() != length) {
            throw new IllegalArgumentException(
                    String.format("Parameter '%s' has to be exactly %d characters long", parameterName, length));
        }
        return value;
    }
}
