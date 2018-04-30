package de.friebels.domain;

import java.util.Objects;

import de.friebels.cookbook.domain.Id;

public class StringAttribute {

    private String value;

    protected StringAttribute(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s=%s", getClass().getSimpleName(), value);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final StringAttribute stringAttribute = (StringAttribute) o;
        return Objects.equals(value, stringAttribute.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
