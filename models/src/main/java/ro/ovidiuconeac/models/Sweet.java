package ro.ovidiuconeac.models;

/**
 * Created by ovidiu on 2/7/17.
 */

public class Sweet {

    private String name;

    public Sweet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sweet sweet = (Sweet) o;

        return name != null ? name.equals(sweet.name) : sweet.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
