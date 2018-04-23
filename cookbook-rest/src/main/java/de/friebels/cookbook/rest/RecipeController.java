package de.friebels.cookbook.rest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    @RequestMapping("/recipe")
    public RecipesJson greeting(@RequestParam(value="name", defaultValue="World") String name) {
        final RecipesJson recipes = new RecipesJson();
        recipes.add(RecipeJsonTemplate.HUEHNERFRIKASSE);
        return recipes;
    }
}