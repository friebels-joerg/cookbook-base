package de.friebels.cookbook.domain;

import java.util.Objects;

import de.friebels.domain.StringAttribute;

import static de.friebels.cookbook.domain.Constraint.checkNotNullable;

public class Name extends StringAttribute implements Comparable<Name> {

    private Name(String value) {
        super(checkNotNullable(value, "value"));
    }

    public static Name of(final String value) {
        return new Name(value);
    }

    @Override
    public int compareTo(final Name that) {
        return this.getValue().compareTo(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}