package de.friebels.cookbook.domain.recipe;

import java.util.StringJoiner;

import de.friebels.cookbook.domain.Id;
import de.friebels.cookbook.domain.Name;

public class RecipeListEntry implements Cloneable {

    private Id id;
    private Name name;

    private RecipeListEntry() {
    }

    public static RecipeListEntry create() {
        return new RecipeListEntry();
    }

    public Id getId() {
        return id;
    }

    public RecipeListEntry setId(final Id id) {
        final RecipeListEntry clone = cloneMe();
        clone.id = id;
        return clone;
    }

    private RecipeListEntry cloneMe() {
        try {
            return (RecipeListEntry) clone();
        } catch (CloneNotSupportedException e) {
            // TODO: -JOF- 30.04.18 handle exception
            return null;
        }
    }

    public Name getName() {
        return name;
    }

    public RecipeListEntry setName(final Name name) {
        final RecipeListEntry clone = cloneMe();
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
        return String.format("recipeListEntry={%s}", sj.toString());
    }
}