package de.friebels.cookbook.domain;

public class Recipe {
    private Id id;
    private Name name;
    private NumberOfPortions numberOfPortions;

    void setName(final Name name) {
        this.name = name;
    }

    public void setId(final Id id) {
        this.id = id;
    }
}
