package de.friebels.cookbook.rest.recipe;

import de.friebels.cookbook.domain.recipe.AbstractDaoFactory;
import de.friebels.cookbook.jpa.persistence.recipe.CookbookTestJpaDaoFactory;
import de.friebels.cookbook.rest.recipe.RecipeController;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@WebMvcTest(RecipeController.class)
class RecipeControllerIT {

    @Autowired
    private MockMvc mvc;

    @BeforeAll
    public static void beforeAll() {
        AbstractDaoFactory.setDaoFactory(new CookbookTestJpaDaoFactory());
    }

    @Nested class Get {

        @Test
        void all() throws Exception {
            mvc.perform(MockMvcRequestBuilders.get("/recipe"))
                    .andExpect(MockMvcResultMatchers.status().isOk());
        }
    }
}