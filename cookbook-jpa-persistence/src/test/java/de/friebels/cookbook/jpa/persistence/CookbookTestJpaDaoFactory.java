package de.friebels.cookbook.jpa.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.friebels.cookbook.jpa.persistence.CookbookJpaDaoFactory;

public class CookbookTestJpaDaoFactory extends CookbookJpaDaoFactory {

    @Override
    protected EntityManagerFactory getEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("cookbook-test");
    }
}
