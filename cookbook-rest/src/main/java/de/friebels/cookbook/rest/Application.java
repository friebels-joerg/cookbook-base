package de.friebels.cookbook.rest;

import de.friebels.cookbook.domain.recipe.AbstractDaoFactory;
import de.friebels.cookbook.jpa.persistence.CookbookJpaDaoFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        AbstractDaoFactory.setDaoFactory(new CookbookJpaDaoFactory());
        SpringApplication.run(Application.class, args);
    }
}