package de.friebels.cookbook.domain.recipe;

import java.util.StringJoiner;

import de.friebels.cookbook.domain.Id;
import de.friebels.cookbook.domain.Name;
import de.friebels.cookbook.domain.NumberOfPortions;

public class DetailedRecipe implements Cloneable {

    private Id id;
    private Name name;
    private NumberOfPortions numberOfPortions;

    public static DetailedRecipe create() {
        return new DetailedRecipe();
    }

    private DetailedRecipe() {
        super();
    }

    public Id getId() {
        return id;
    }

    public DetailedRecipe setId(final Id id) {
        final DetailedRecipe clone = cloneMe();
        clone.id = id;
        return clone;
    }

    public Name getName() {
        return name;
    }

    public DetailedRecipe setName(final Name name) {
        final DetailedRecipe clone = cloneMe();
        clone.name = name;
        return clone;
    }

    private DetailedRecipe cloneMe() {
        try {
            return (DetailedRecipe) clone();
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
        return String.format("%s={%s}", "recipe", sj.toString());
    }
}