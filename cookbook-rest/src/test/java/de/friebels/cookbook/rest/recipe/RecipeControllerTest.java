package de.friebels.cookbook.rest.recipe;

import de.friebels.cookbook.domain.recipe.RecipeDao;
import de.friebels.cookbook.domain.recipe.Recipes;
import de.friebels.cookbook.jpa.persistence.recipe.RecipeDaoImpl;
import de.friebels.cookbook.jpa.persistence.recipe.RecipesEntryTemplate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class RecipeControllerTest {

    @Mock
    public RecipeDao recipeDao;

    @InjectMocks
    private RecipeController sut = new RecipeController();



    @Test
    public void test() {
        assertThat(recipeDao).isNotNull();


        final Recipes recipes = new Recipes();
        recipes.add(RecipesEntryTemplate.HUEHNERFRIKASSE);
        Mockito.when(recipeDao.get()).thenReturn(recipes);

        final RecipesDto recipesDto = sut.getRecipes();

        assertThat(recipesDto.size()).isEqualTo(1);
    }
}