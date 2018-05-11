package de.friebels.cookbook.domain.recipe;

import org.junit.jupiter.api.Test;

import static de.friebels.cookbook.domain.recipe.DetailedRecipeTemplate.HUEHNERFRIKASSE;
import static org.assertj.core.api.Assertions.assertThat;

class DetailedRecipeTest {

    @Test
    void test_toString() {
        assertThat(HUEHNERFRIKASSE.toString()).isEqualTo("recipe={Name=Hühnerfrikasse}");
    }
}