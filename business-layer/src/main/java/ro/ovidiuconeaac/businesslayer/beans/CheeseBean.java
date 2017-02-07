package ro.ovidiuconeaac.businesslayer.beans;

import java.util.Random;

import ro.ovidiuconeac.datalayer.database.Database;
import ro.ovidiuconeac.models.Cheese;

/**
 * Created by ovidiu on 2/7/17.
 */

public class CheeseBean {

    private Database database = Database.getInstance();

    public Cheese getRandomCheese() {
        int id = new Random().nextInt(14);
        return database.getCheeseById(id);
    }
}
