package de.friebels.cookbook.rest.recipe;

import de.friebels.cookbook.domain.recipe.AbstractDaoFactory;
import de.friebels.cookbook.domain.recipe.RecipeDao;
import de.friebels.cookbook.jpa.persistence.recipe.RecipeDaoImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static de.friebels.cookbook.rest.recipe.RecipeListEntryDtoTemplate.HUEHNERFRIKASSE;

@RestController
public class RecipeController {

    private RecipeDao recipeDao = AbstractDaoFactory.getFactory().recipeDao();

    @RequestMapping("/recipe")
    public RecipeListDto getRecipes() {
        recipeDao.get();

        final RecipeListDto recipes = new RecipeListDto();
        recipes.add(HUEHNERFRIKASSE);
        return recipes;
    }
}