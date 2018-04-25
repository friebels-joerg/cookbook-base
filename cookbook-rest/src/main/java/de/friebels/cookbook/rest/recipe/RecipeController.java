package de.friebels.cookbook.rest.recipe;

import de.friebels.cookbook.domain.recipe.RecipeDao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    private RecipeDao recipeDao;

    @RequestMapping("/recipe")
    public RecipesDto greeting(@RequestParam(value="name", defaultValue="World") String name) {
        final RecipesDto recipes = new RecipesDto();
        recipes.add(RecipeDtoTemplate.HUEHNERFRIKASSE);
        return recipes;
    }
}