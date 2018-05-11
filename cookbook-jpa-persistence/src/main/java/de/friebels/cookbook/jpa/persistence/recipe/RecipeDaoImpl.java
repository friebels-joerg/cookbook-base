package de.friebels.cookbook.jpa.persistence.recipe;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import de.friebels.cookbook.domain.Id;
import de.friebels.cookbook.domain.recipe.DetailedRecipe;
import de.friebels.cookbook.domain.recipe.RecipeDao;
import de.friebels.cookbook.domain.recipe.Recipes;

import org.springframework.stereotype.Service;

import static de.friebels.cookbook.jpa.persistence.recipe.RecipeTemplate.HUEHNERFRIKASSE;

@Service
public class RecipeDaoImpl implements RecipeDao {

    private EntityManagerFactory emf;

    public RecipeDaoImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Id save(final DetailedRecipe recipe) {

        final RecipeEntity recipeEntity = convertToEntity(recipe);
        if (recipeEntity.idIsNotSet()) {
            recipeEntity.setId(UUID.randomUUID().toString());
        }

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

    @Override
    public Recipes get() {
        Recipes recipes = new Recipes();
        recipes.add(HUEHNERFRIKASSE);
        return recipes;
    }

    private RecipeEntity convertToEntity(final DetailedRecipe recipe) {
        return RecipeEntityBuilder
                .builder()
                .withName(recipe.getName())
                .withId(recipe.getId())
                .build();
    }
}
