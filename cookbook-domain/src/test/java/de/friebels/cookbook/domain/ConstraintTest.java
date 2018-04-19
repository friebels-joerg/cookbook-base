package de.friebels.cookbook.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ConstraintTest {

    @Nested class CheckIsNaturalNumber {

        static final int MINIMAL_NATURAL_NUMBER = 1;

        @Nested class Invariants {

            @Test
            void throwsException_WhenPassingNullValue() {
                assertThrows(IllegalArgumentException.class, () -> Constraint.checkIsNaturalNumber(null, "value"));
            }

            @Test
            void throwsException_WhenPassingNoneNaturalNumber() {
                assertThrows(IllegalArgumentException.class,
                        () -> Constraint.checkIsNaturalNumber(MINIMAL_NATURAL_NUMBER - 1, "value"));
            }
        }

        @Test
        void checkIsNaturalNumber() {
            assertThat(Constraint.checkIsNaturalNumber(MINIMAL_NATURAL_NUMBER, "value"))
                    .isEqualTo(MINIMAL_NATURAL_NUMBER);
        }
    }

    @Nested class CheckNotNullable {

        @Nested class Invariants {

            @Test
            void throwsException_WhenPassingNullValue() {
                assertThrows(IllegalArgumentException.class, () -> Constraint.checkNotNullable(null, "value"));
            }
        }

        @Test
        void checkNotNullable() {
            final String expected = "anyNotNullObject";
            assertThat(Constraint.checkNotNullable(expected, "value")).isEqualTo(expected);
        }
    }

    @Nested class CheckExactLengthString {

        private static final String FOUR_CHARS = "1234";

        @Nested class Invariants {

            @Test
            void throwsException_WhenPassingNullValue() {
                assertThrows(IllegalArgumentException.class,
                        () -> Constraint.checkExactLengthString(null, "value", 10));
            }

            @Test
            void throwsException_WhenPassingToShortValue() {
                assertThrows(IllegalArgumentException.class,
                        () -> Constraint.checkExactLengthString(FOUR_CHARS, "value", 10));
            }

            @Test
            void throwsException_WhenPassingToLongValue() {
                assertThrows(IllegalArgumentException.class,
                        () -> Constraint.checkExactLengthString(FOUR_CHARS, "value", 2));
            }
        }

        @Test
        void checkExactLengthString() {
            assertThat(Constraint.checkExactLengthString(FOUR_CHARS, "value", 4)).isEqualTo(FOUR_CHARS);
        }
    }
}