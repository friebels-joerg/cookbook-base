package de.friebels.cookbook.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static de.friebels.cookbook.domain.NumberOfPortionsTemplate.ONE;
import static de.friebels.cookbook.domain.NumberOfPortionsTemplate.TWO;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfPortionsTest {

    @Nested class Invariants {

        @Test
        void should_throw_exception_when_passing_null_value() {
            assertThrows(NullPointerException.class, () -> NumberOfPortions.of(null));
        }

        @Test
        void should_throw_exception_when_passing_not_natural_value() {
            assertAll(
                    () -> assertThrows(IllegalArgumentException.class, () -> NumberOfPortions.of(-1)),
                    () -> assertThrows(IllegalArgumentException.class, () -> NumberOfPortions.of(0))
            );
        }
    }

    @Nested
    class Comparing {

        @Test
        void should_compare_to_other_weights() {
            assertAll(
                    () -> assertThat(ONE.compareTo(ONE)).isEqualTo(0),
                    () -> assertThat(ONE.compareTo(TWO)).isLessThan(0),
                    () -> assertThat(TWO.compareTo(ONE)).isGreaterThan(0)
            );
        }
    }
}