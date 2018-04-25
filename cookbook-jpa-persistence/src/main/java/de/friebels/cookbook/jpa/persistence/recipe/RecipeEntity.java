package de.friebels.cookbook.jpa.persistence.recipe;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;

@Entity
@Table(name = "Recipe")
public class RecipeEntity {

    @Id
    String id;

    String name;

    RecipeEntity() {
        // solves: HHH000182: No default (no-argument) constructor for class
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean idIsNotSet() {
        if (id == null) {
            return true;
        }

        return StringUtils.isNoneBlank(id);
    }

    @Override
    public String toString() {
        return String.format("recipeEntity={%s, %s}", getId(), getName());
    }
}
