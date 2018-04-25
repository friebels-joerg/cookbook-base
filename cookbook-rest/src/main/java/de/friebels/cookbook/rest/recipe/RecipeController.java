package de.friebels.cookbook.rest.recipe;

import de.friebels.cookbook.domain.recipe.RecipeDao;
import de.friebels.cookbook.jpa.persistence.recipe.RecipeDaoImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    private RecipeDao recipeDao =new RecipeDaoImpl(null);

    @RequestMapping("/recipe")
    public RecipesDto getRecipes() {
        recipeDao.get();

        final RecipesDto recipes = new RecipesDto();
        recipes.add(RecipeDtoTemplate.HUEHNERFRIKASSE);
        return recipes;
    }
}