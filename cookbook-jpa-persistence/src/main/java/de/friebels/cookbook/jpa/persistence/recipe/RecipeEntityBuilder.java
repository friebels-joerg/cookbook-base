package de.friebels.cookbook.jpa.persistence.recipe;

import java.util.UUID;

import de.friebels.cookbook.domain.Id;
import de.friebels.cookbook.domain.Name;

import org.apache.commons.lang3.StringUtils;

class RecipeEntityBuilder {

    private final RecipeEntity recipeEntity;

    static RecipeEntityBuilder builder() {
        return new RecipeEntityBuilder();
    }

    private RecipeEntityBuilder() {
        recipeEntity = new RecipeEntity();
    }

    public RecipeEntityBuilder withId(final Id id) {
        if (id != null && StringUtils.isNoneBlank(id.getValue())) {
            recipeEntity.setId(id.getValue());
        } else {
            recipeEntity.setId(UUID.randomUUID().toString());
        }
        return this;
    }

    RecipeEntityBuilder withName(Name name) {
        if (name != null && StringUtils.isNoneBlank(name.getValue())) {
            recipeEntity.setName(name.getValue());
        }
        return this;
    }

    RecipeEntity build() {
        return recipeEntity;
    }

}
