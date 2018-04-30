package de.friebels.cookbook.domain.recipe;

import java.util.StringJoiner;

import de.friebels.cookbook.domain.Id;
import de.friebels.cookbook.domain.Name;
import de.friebels.cookbook.domain.NumberOfPortions;

public class Recipe implements Cloneable {

    private Id id;
    private Name name;
    private NumberOfPortions numberOfPortions;

    public static Recipe create() {
        return new Recipe();
    }

    private Recipe() {
    }

    public Id getId() {
        return id;
    }

    public Recipe setId(final Id id) {
        final Recipe clone = cloneMe();
        clone.id = id;
        return clone;
    }

    public Name getName() {
        return name;
    }

    public Recipe setName(final Name name) {
        final Recipe clone = cloneMe();
        clone.name = name;
        return clone;
    }

    private Recipe cloneMe() {
        try {
            return (Recipe) clone();
        } catch (CloneNotSupportedException e) {
            // TODO: -JOF- 30.04.18 handle Exception
            return null;
        }
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
        return String.format("recipe={%s}", sj.toString());
    }

}