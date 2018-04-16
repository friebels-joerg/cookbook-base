package de.friebels.cookbook.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PreconditionTest {

    @Nested class CheckIsNaturalNumber {

        @Test
        void should_throw_exception_when_passing_null_value() {
            assertThrows(NullPointerException.class, () -> Precondition.checkIsNaturalNumber(null, "dummy"));
        }

        @Test
        void should_throw_exception_when_passing_not_natural_number() {
            assertThrows(IllegalArgumentException.class,
                    () -> Precondition.checkIsNaturalNumber(0, "dummy"));
        }

        @Test
        void should_return_number_when_passing_natural_number() {
            assertThat(Precondition.checkIsNaturalNumber(1, "dummy")).isEqualTo(1);
        }
    }

    @Nested
    class CheckNotNullableString {
        @Test
        void should_throw_exception_when_passing_null_value() {
            assertThrows(NullPointerException.class, () -> Precondition.checkNotNullableString(null, "dummy"));
        }

        @Test
        void should_return_value_when_passing_natural_number() {
            assertThat(Precondition.checkNotNullableString("aString", "dummy")).isEqualTo("aString");
        }
    }
}