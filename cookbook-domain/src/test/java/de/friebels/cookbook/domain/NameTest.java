package de.friebels.cookbook.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static de.friebels.cookbook.domain.NameTemplate.CORDON_BLEU;
import static de.friebels.cookbook.domain.NameTemplate.HÜHNERFRIKASSE;
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

    @Nested
    class Comparing {

        @Test
        void compareTo() {
            assertAll(
                    () -> assertThat(HÜHNERFRIKASSE.compareTo(HÜHNERFRIKASSE)).isEqualTo(0),
                    () -> assertThat(CORDON_BLEU.compareTo(HÜHNERFRIKASSE)).isLessThan(0),
                    () -> assertThat(HÜHNERFRIKASSE.compareTo(CORDON_BLEU)).isGreaterThan(0)
            );
        }
    }
}