package de.friebels.cookbook.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static de.friebels.cookbook.domain.NameTemplate.CORDON_BLEU;
import static de.friebels.cookbook.domain.NameTemplate.HUEHNERFRIKASSE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NameTest {

    @Nested class Invariants {

        @Test
        void throwsException_WhenValueIsNull() {
            assertThrows(IllegalArgumentException.class, () -> Name.of(null));
        }
    }

    @Nested class Comparing {

        @Test
        void compareTo() {
            assertAll(
                    () -> assertThat(HUEHNERFRIKASSE.compareTo(HUEHNERFRIKASSE)).isEqualTo(0),
                    () -> assertThat(CORDON_BLEU.compareTo(HUEHNERFRIKASSE)).isLessThan(0),
                    () -> assertThat(HUEHNERFRIKASSE.compareTo(CORDON_BLEU)).isGreaterThan(0)
            );
        }
    }
}