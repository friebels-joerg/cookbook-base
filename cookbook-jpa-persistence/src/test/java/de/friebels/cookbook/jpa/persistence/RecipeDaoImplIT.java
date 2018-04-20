package de.friebels.cookbook.jpa.persistence;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class RecipeDaoImplIT extends JPAHibernateTest {
    @Test
    public void testPersist_success() {
        em.getTransaction().begin();
        em.persist(new RecipeEntity(UUID.randomUUID().toString(), "Hühnerfrikasse"));
        em.getTransaction().commit();

    }

}