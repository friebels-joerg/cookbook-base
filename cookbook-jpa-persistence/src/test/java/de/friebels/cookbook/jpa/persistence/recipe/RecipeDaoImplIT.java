package de.friebels.cookbook.jpa.persistence.recipe;

import de.friebels.cookbook.domain.recipe.RecipeDao;
import de.friebels.cookbook.jpa.persistence.JpaHibernateTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecipeDaoImplIT extends JpaHibernateTest {

    private RecipeDao serviceUnderTest;


    @BeforeEach
    public void beforeEach() {
        serviceUnderTest = new RecipeDaoImpl(emf);
    }

    @Test
    public void save() {
        serviceUnderTest.save(RecipeTemplate.HUEHNERFRIKASSE);
    }

}