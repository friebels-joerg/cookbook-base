package de.friebels.cookbook.domain.recipe;

import java.util.StringJoiner;

import de.friebels.cookbook.domain.Id;
import de.friebels.cookbook.domain.Name;

public class RecipesEntry implements Cloneable {

    private Id id;
    private Name name;

    private RecipesEntry() {
    }

    public static RecipesEntry create() {
        return new RecipesEntry();
    }

    public Id getId() {
        return id;
    }

    public RecipesEntry setId(final Id id) {
        final RecipesEntry clone = cloneMe();
        clone.id = id;
        return clone;
    }

    private RecipesEntry cloneMe() {
        try {
            return (RecipesEntry) clone();
        } catch (CloneNotSupportedException e) {
            // TODO: -JOF- 30.04.18 handle exception
            return null;
        }
    }

    public Name getName() {
        return name;
    }

    public RecipesEntry setName(final Name name) {
        final RecipesEntry clone = cloneMe();
        clone.name = name;
        return clone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        StringJoiner sj = new StringJoiner(", ");
        if (getId() != null) {
            sj.add(getId().toString());
        }
        if (getName() != null) {
            sj.add(getName().toString());
        }
        return String.format("recipesEntry={%s}", sj.toString());
    }
}