package ro.ovidiuconeaac.businesslayer.beans;

import java.util.Random;

import ro.ovidiuconeac.datalayer.database.Database;
import ro.ovidiuconeac.models.Fruit;

/**
 * Created by ovidiu on 2/7/17.
 */

public class FruitsBean {

    private Database database = Database.getInstance();

    public Fruit getRandomFruit() {
        int id = new Random().nextInt(14);
        return database.getFruitById(id);
    }
}
