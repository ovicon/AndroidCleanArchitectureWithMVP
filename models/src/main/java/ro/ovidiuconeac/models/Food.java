package ro.ovidiuconeac.models;

/**
 * Created by ovidiu on 2/7/17.
 */

public abstract class Food {

    protected String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return name != null ? name.equals(food.name) : food.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
