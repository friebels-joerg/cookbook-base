package de.friebels.cookbook.rest.recipe;

import de.friebels.cookbook.domain.recipe.Recipes;
import de.friebels.cookbook.jpa.persistence.recipe.RecipeTemplate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReceipesConverterTest {

    @Test
    void recipesToDto() {
        Recipes recipes = new Recipes();
        recipes.add(RecipeTemplate.HUEHNERFRIKASSE);

        final RecipesDto recipesDto = ReceipesConverter.recipesToDto(recipes);

        assertThat(recipesDto.size()).isEqualTo(1);
        for (RecipeDto recipe : recipesDto) {
            assertThat(recipe).isNotNull();
        }
    }

    @Test
    void recipeToDto() {
        final RecipeDto recipesEntry = ReceipesConverter.recipeToDto(RecipeTemplate.HUEHNERFRIKASSE);

        assertThat(recipesEntry).isNotNull();
        assertThat(recipesEntry.getName()).isEqualTo(RecipeTemplate.HUEHNERFRIKASSE.getName().getValue());
        assertThat(recipesEntry.getId()).isEqualTo(RecipeTemplate.HUEHNERFRIKASSE.getId().getValue());
    }
}