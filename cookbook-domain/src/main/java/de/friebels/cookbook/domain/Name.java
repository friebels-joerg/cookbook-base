package de.friebels.cookbook.domain;

public class Name implements Comparable<Name> {
    private String value;

    private Name(String value) {
        this.value = Precondition.checkNotNullableString(value, "value");
    }

    static Name of(final String value) {
        return new Name(value);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "name=" + value;
    }

    @Override
    public int compareTo(final Name that) {
        return this.getValue().compareTo(that.getValue());
    }
}