package de.friebels.cookbook.jpa.persistence.recipe;

import de.friebels.cookbook.domain.recipe.AbstractDaoFactory;
import de.friebels.cookbook.domain.recipe.RecipeDao;
import de.friebels.cookbook.jpa.persistence.CookbookTestJpaDaoFactory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecipeDaoImplIT {

    private RecipeDao serviceUnderTest;

    @BeforeAll
    public static void beforeAll() {
        AbstractDaoFactory.setDaoFactory(new CookbookTestJpaDaoFactory());
    }

    @BeforeEach
    public void beforeEach() {
        serviceUnderTest = AbstractDaoFactory.getFactory().recipeDao();
    }
    @Test
    public void save() {
        serviceUnderTest.save(RecipeTemplate.HUEHNERFRIKASSE);
    }

}