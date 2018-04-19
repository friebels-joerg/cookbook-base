package de.friebels.cookbook.domain;

import java.util.Objects;
import java.util.UUID;

import static de.friebels.cookbook.domain.Precondition.checkExactLengthString;

public class Id {

    private String value;

    private Id(final String value) {
        this.value = checkExactLengthString(value, "value", 36);
    }

    public static Id of(final String value) {
        return new Id(value);
    }

    public static Id generate() {
        return new Id(UUID.randomUUID().toString());
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("id=%s", value);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Id id = (Id) o;
        return Objects.equals(value, id.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }
}
