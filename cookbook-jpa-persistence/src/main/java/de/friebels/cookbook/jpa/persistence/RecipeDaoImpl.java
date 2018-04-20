package de.friebels.cookbook.jpa.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import de.friebels.cookbook.domain.RecipeDao;
import de.friebels.cookbook.domain.Recipes;

public class RecipeDaoImpl implements RecipeDao {

    @PersistenceUnit(unitName = "test")
    private EntityManagerFactory entityManagerFactory;

    @Override
    public Recipes getAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            return null;
        } finally {
            entityManager.close();
        }
    }
}
