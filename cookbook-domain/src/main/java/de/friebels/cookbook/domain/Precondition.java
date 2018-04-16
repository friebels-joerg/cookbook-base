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
        Objects.requireNonNull(value, "Parameter '" + parameterName + "' must not be null");
        if (value < 1) {
            throw new IllegalArgumentException("Parameter '" + parameterName + "' must not be negative");
        }
        return value;
    }

    public static String checkNotNullableString(final String value, final String parameterName) {
        Objects.requireNonNull(value, "Parameter '" + parameterName + "' must not be null");
        return value;
    }
}
