package de.friebels.cookbook.rest.recipe;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class RecipeListEntryDto {

    private String id;
    private String name;

    public void setName(final String name) {
        this.name = name;
    }

    public void setId(final String id) {
        this.id = id;
    }
}