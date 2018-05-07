package de.friebels.cookbook.rest.recipe;

import de.friebels.cookbook.domain.recipe.Recipes;
import de.friebels.cookbook.jpa.persistence.recipe.RecipesEntryTemplate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReceipesConverterTest {

    @Test
    void recipesToDto() {
        Recipes recipes = new Recipes();
        recipes.add(RecipesEntryTemplate.HUEHNERFRIKASSE);

        final RecipesDto recipesDto = ReceipesConverter.recipesToDto(recipes);

        assertThat(recipesDto.size()).isEqualTo(1);
        for (RecipesEntryDto recipe : recipesDto) {
            assertThat(recipe).isNotNull();
        }
    }

    @Test
    void recipeToDto() {
        final RecipesEntryDto recipesEntry = ReceipesConverter.recipeToDto(RecipesEntryTemplate.HUEHNERFRIKASSE);

        assertThat(recipesEntry).isNotNull();
        assertThat(recipesEntry.getName()).isEqualTo(RecipesEntryTemplate.HUEHNERFRIKASSE.getName().getValue());
        assertThat(recipesEntry.getId()).isEqualTo(RecipesEntryTemplate.HUEHNERFRIKASSE.getId().getValue());
    }
}