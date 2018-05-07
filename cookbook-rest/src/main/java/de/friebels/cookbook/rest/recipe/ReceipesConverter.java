package de.friebels.cookbook.rest.recipe;

import de.friebels.cookbook.domain.recipe.Recipes;
import de.friebels.cookbook.domain.recipe.RecipesEntry;

public class ReceipesConverter {

    public static RecipesDto recipesToDto(final Recipes recipes) {
        final RecipesDto dto = new RecipesDto();
        for(final RecipesEntry recipe : recipes) {
            final RecipesEntryDto recipesEntryDto = recipeToDto(recipe);
            dto.add(recipesEntryDto);
        }
        return dto;
    }

    static RecipesEntryDto recipeToDto(final RecipesEntry recipe) {
        final RecipesEntryDto dto = new RecipesEntryDto();
        dto.setName(recipe.getName().getValue());
        dto.setId(recipe.getId().getValue());
        return dto;
    }
}
