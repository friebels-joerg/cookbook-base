package de.friebels.cookbook.domain;

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
}
