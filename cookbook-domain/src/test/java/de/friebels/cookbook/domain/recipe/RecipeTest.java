package de.friebels.cookbook.domain.recipe;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void test_toString() {
        assertThat(RecipeTemplate.HUEHNERFRIKASSE.toString()).isEqualTo("recipe={name=Hühnerfrikasse}");
    }
}