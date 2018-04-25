package de.friebels.cookbook.domain.recipe;

abstract public class AbstractDaoFactory {
    private static AbstractDaoFactory daoFactory;

    public static void setDaoFactory(final AbstractDaoFactory daoFactory) {
        AbstractDaoFactory.daoFactory = daoFactory;
    }

    public static AbstractDaoFactory getFactory() {
        return daoFactory;
    }

    abstract public RecipeDao recipeDao();
}
