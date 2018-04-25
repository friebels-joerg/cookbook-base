package de.friebels.cookbook.jpa.persistence.recipe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import de.friebels.cookbook.domain.Id;
import de.friebels.cookbook.domain.recipe.Recipe;
import de.friebels.cookbook.domain.recipe.RecipeDao;

import org.springframework.stereotype.Service;

@Service
public class RecipeDaoImpl implements RecipeDao {

    private EntityManagerFactory emf;

    RecipeDaoImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Id save(final Recipe recipe) {

        final RecipeEntity recipeEntity = convertToEntity(recipe);

        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(recipeEntity);
            em.getTransaction().commit();
        } finally {
            em.close();
        }

        return Id.of(recipeEntity.getId());
    }

    private RecipeEntity convertToEntity(final Recipe recipe) {
        return RecipeEntityBuilder.builder().withName(recipe.getName()).withId(recipe.getId()).build();
    }
}