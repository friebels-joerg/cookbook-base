package de.friebels.cookbook.jpa.persistence;

import java.util.UUID;

import javax.persistence.Persistence;

import de.friebels.cookbook.domain.RecipeDao;

import org.junit.jupiter.api.AfterEach;
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