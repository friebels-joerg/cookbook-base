package de.friebels.cookbook.rest.recipe;

import de.friebels.cookbook.domain.recipe.Recipes;
import de.friebels.cookbook.domain.recipe.Recipe;

public class ReceipesConverter {

    public static RecipesDto recipesToDto(final Recipes recipes) {
        final RecipesDto dto = new RecipesDto();
        for(final Recipe recipe : recipes) {
            final RecipeDto recipeDto = recipeToDto(recipe);
            dto.add(recipeDto);
        }
        return dto;
    }

    static RecipeDto recipeToDto(final Recipe recipe) {
        final RecipeDto dto = new RecipeDto();
        dto.setName(recipe.getName().getValue());
        dto.setId(recipe.getId().getValue());
        return dto;
    }
}
