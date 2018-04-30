package de.friebels.cookbook.domain.recipe;

import org.junit.jupiter.api.Test;

import static de.friebels.cookbook.domain.recipe.RecipeTemplate.HUEHNERFRIKASSE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void test_toString() {
        assertThat(HUEHNERFRIKASSE.toString()).isEqualTo("recipe={Name=Hühnerfrikasse}");
    }
}