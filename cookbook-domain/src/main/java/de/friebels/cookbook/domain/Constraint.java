package de.friebels.cookbook.domain;

import de.friebels.cookbook.domain.recipe.Recipe;

/**
 * use this to chaeck parameters of methods....
 */
final class Constraint {

    private Constraint() {
    }

    /**
     * Natural number are > 0
     */
    static Integer checkIsNaturalNumber(final Integer value, final String parameterName) {
        checkNotNullable(value, parameterName);
        if (value < 1) {
            throw new IllegalArgumentException(String.format("Parameter '%s' must > 0", parameterName));
        }
        return value;
    }

    public static <T> T checkNotNullable(final T value, final String parameterName) {
        if (value==null)
            throw new IllegalArgumentException( String.format("Parameter '%s' must not be null", parameterName));
        return value;
    }

    public static String checkExactLengthString(final String value, final String parameterName, final Integer length) {
        checkNotNullable(value, parameterName);
        if (value.length() != length) {
            throw new IllegalArgumentException(
                    String.format("Parameter '%s' has to be exactly %d characters long", parameterName, length));
        }
        return value;
    }

    static class RecipeBuilder {

        private final Recipe recipe;

        static RecipeBuilder recipeBuilder() {
            return new RecipeBuilder();
        }

        private RecipeBuilder() {
            recipe = new Recipe();
        }

        RecipeBuilder withId(String id) {
            return withId(Id.of(id));
        }

        RecipeBuilder withId(Id id) {
            recipe.setId(id);
            return this;
        }

        RecipeBuilder withName(String name) {
            return withName(Name.of(name));
        }

        RecipeBuilder withName(Name name) {
            recipe.setName(name);
            return this;
        }

        Recipe build() {
            return recipe;
        }
    }
}
