package de.friebels.cookbook.domain;

import java.util.Objects;

import static de.friebels.cookbook.domain.Constraint.checkIsNaturalNumber;

public class NumberOfPortions  {

    private Integer value;

    private NumberOfPortions(final Integer value) {
        this.value = checkIsNaturalNumber(value, "value");
    }

    public static NumberOfPortions of(final Integer value) {
        return new NumberOfPortions(value);
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final NumberOfPortions numberOfPortions = (NumberOfPortions) o;
        return Objects.equals(value, numberOfPortions.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.format("numberOfPortions=%d", value);
    }

}
