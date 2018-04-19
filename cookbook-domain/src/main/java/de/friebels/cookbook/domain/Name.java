package de.friebels.cookbook.domain;

import java.util.Objects;

import static de.friebels.cookbook.domain.Constraint.checkNotNullable;

public class Name implements Comparable<Name> {
    private String value;

    private Name(String value) {
        this.value = checkNotNullable(value, "value");
    }

    static Name of(final String value) {
        return new Name(value);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("name=%s", value);
    }

    @Override
    public int compareTo(final Name that) {
        return this.getValue().compareTo(that.getValue());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Name name = (Name) o;
        return Objects.equals(value, name.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}