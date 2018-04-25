package de.friebels.cookbook.jpa.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.friebels.cookbook.domain.recipe.AbstractDaoFactory;
import de.friebels.cookbook.domain.recipe.RecipeDao;
import de.friebels.cookbook.jpa.persistence.recipe.RecipeDaoImpl;

public class CookbookJpaDaoFactory extends AbstractDaoFactory {

    @Override
    public RecipeDao recipeDao() {
        return new RecipeDaoImpl(getEntityManagerFactory());
    }

   protected EntityManagerFactory getEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("cookbook");
    }
}
