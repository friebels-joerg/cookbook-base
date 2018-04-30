package de.friebels.cookbook.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static de.friebels.cookbook.domain.IdTemplate.ANY_ID;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IdTest {

    @Nested class Creation {

        @Nested class Invariants {

            @Test
            void of_throwsException_whenValueIsToShort() {
                assertThrows(IllegalArgumentException.class, () -> Id.of("1234567890"));
            }

            @Test
            void of_throwsException_whenValueIsNull() {
                assertThrows(IllegalArgumentException.class, () -> Id.of(null));
            }
        }

        @Test
        void of() {
            final Id id = Id.of("123456789012345678901234567890123456");
            assertThat(id.getValue()).isEqualTo("123456789012345678901234567890123456");
        }

        @Test
        void generate() {
            Id.generate();
            //should not throw any exception
        }
    }

    @Test
    void toString_() {
        assertThat(ANY_ID.toString()).isEqualTo("Id=4ecd8569-ffbf-46b1-807f-293f315e6dfb");
    }
}