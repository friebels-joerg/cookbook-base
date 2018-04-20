package de.friebels.cookbook.jpa.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Recipe")
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
}
