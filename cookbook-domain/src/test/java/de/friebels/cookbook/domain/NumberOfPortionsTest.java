package de.friebels.cookbook.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static de.friebels.cookbook.domain.NumberOfPortionsTemplate.ONE;
import static de.friebels.cookbook.domain.NumberOfPortionsTemplate.TWO;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfPortionsTest {

    @Nested class Creation {

        static final int MINIMUM_VALUE = 1;

        @Nested class Invariants {

            @Test
            void of_throwsException_whenValueIsNull() {
                assertThrows(IllegalArgumentException.class, () -> NumberOfPortions.of(null));
            }

            @Test
            void of_throwsException_whenValueIsntANaturalNumber() {
                assertThrows(IllegalArgumentException.class, () -> NumberOfPortions.of(MINIMUM_VALUE - 1));
            }
        }

        @Test
        void of() {
            assertThat(NumberOfPortions.of(MINIMUM_VALUE).getValue()).isEqualTo(MINIMUM_VALUE);
        }

    }
}