package de.friebels.cookbook.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PreconditionTest {

    @Nested class CheckIsNaturalNumber {

        private static final int MINIMAL_NATURAL_NUMBER = 1;

        @Nested class Invariants {

            @Test
            void throwsException_WhenPassingNullValue() {
                assertThrows(IllegalArgumentException.class, () -> Precondition.checkIsNaturalNumber(null, "dummy"));
            }

            @Test
            void throwsException_WhenPassingNoneNaturalNumber() {
                assertThrows(IllegalArgumentException.class,
                        () -> Precondition.checkIsNaturalNumber(MINIMAL_NATURAL_NUMBER - 1, "dummy"));
            }
        }

        @Test
        void checkIsNaturalNumber() {
            assertThat(Precondition.checkIsNaturalNumber(MINIMAL_NATURAL_NUMBER, "dummy"))
                    .isEqualTo(MINIMAL_NATURAL_NUMBER);
        }
    }

    @Nested class CheckNotNullable {

        @Nested class Invariants {

            @Test
            void throwsException_WhenPassingNullValue() {
                assertThrows(IllegalArgumentException.class, () -> Precondition.checkNotNullable(null, "dummy"));
            }
        }

        @Test
        void checkNotNullable() {
            final String expected = "anyNotNullObject";
            assertThat(Precondition.checkNotNullable(expected, "dummy")).isEqualTo(expected);
        }
    }
}