package de.friebels.cookbook.jpa.persistence.recipe;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import de.friebels.cookbook.domain.Id;
import de.friebels.cookbook.domain.recipe.Recipe;
import de.friebels.cookbook.domain.recipe.RecipeDao;
import de.friebels.cookbook.domain.recipe.RecipeList;

import org.springframework.stereotype.Service;

import static de.friebels.cookbook.jpa.persistence.recipe.RecipeListEntryTemplate.HUEHNERFRIKASSE;

@Service
public class RecipeDaoImpl implements RecipeDao {

    private EntityManagerFactory emf;

    public RecipeDaoImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Id save(final Recipe recipe) {

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
    public RecipeList get() {
        RecipeList recipes = new RecipeList();
        recipes.add(HUEHNERFRIKASSE);
        return recipes;
    }

    private RecipeEntity convertToEntity(final Recipe recipe) {
        return RecipeEntityBuilder
                .builder()
                .withName(recipe.getName())
                .withId(recipe.getId())
                .build();
    }
}
