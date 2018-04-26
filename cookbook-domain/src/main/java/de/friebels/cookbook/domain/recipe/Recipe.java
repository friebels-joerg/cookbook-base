package de.friebels.cookbook.domain.recipe;

import java.util.StringJoiner;

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
        final StringBuilder sb = new StringBuilder();
        StringJoiner sj = new StringJoiner(", ");
        if (getId()!=null)
            sj.add(getId().toString());
        if (getName()!=null)
            sj.add(getName().toString());
        return String.format("recipe={%s}", sj.toString());
    }
}
