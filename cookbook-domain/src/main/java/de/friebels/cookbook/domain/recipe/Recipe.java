package de.friebels.cookbook.domain.recipe;

import de.friebels.cookbook.domain.Id;
import de.friebels.cookbook.domain.Name;
import de.friebels.cookbook.domain.NumberOfPortions;

public class Recipe {
    private Id id;
    private Name name;
    private NumberOfPortions numberOfPortions;

    public Id getId() {
        return id;
    }

    public void setId(final Id id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(final Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("recipe={%s, %s}", getId(), getName());
    }
}
