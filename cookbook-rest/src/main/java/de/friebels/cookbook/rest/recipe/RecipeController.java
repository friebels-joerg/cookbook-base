package de.friebels.cookbook.rest.recipe;

import de.friebels.cookbook.domain.recipe.AbstractDaoFactory;
import de.friebels.cookbook.domain.recipe.RecipeDao;
import de.friebels.cookbook.domain.recipe.Recipes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    private RecipeDao recipeDao;

    @RequestMapping("/recipe")
    public RecipesDto getRecipes() {
        final Recipes recipes = getRecipeDao().get();

        final RecipesDto recipesDto = ReceipesConverter.recipesToDto(recipes);
        return recipesDto;
    }

    public RecipeDao getRecipeDao() {
        if (recipeDao==null) {
            recipeDao = AbstractDaoFactory.getFactory().recipeDao();
        }
        return recipeDao;
    }
}