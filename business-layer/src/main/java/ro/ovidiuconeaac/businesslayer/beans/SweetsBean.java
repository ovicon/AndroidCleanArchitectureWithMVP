package ro.ovidiuconeaac.businesslayer.beans;

import java.util.Random;

import ro.ovidiuconeac.datalayer.database.Database;
import ro.ovidiuconeac.models.Sweet;

/**
 * Created by ovidiu on 2/7/17.
 */

public class SweetsBean {

    private Database database = Database.getInstance();

    public Sweet getRandomSweet() {
        int id = new Random().nextInt(14);
        return database.getSweetById(id);
    }
}
