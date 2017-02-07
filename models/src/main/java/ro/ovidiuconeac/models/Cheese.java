package ro.ovidiuconeac.models;

/**
 * Created by ovidiu on 2/7/17.
 */

public class Cheese {

    private String name;

    public Cheese(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cheese cheese = (Cheese) o;

        return name != null ? name.equals(cheese.name) : cheese.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
