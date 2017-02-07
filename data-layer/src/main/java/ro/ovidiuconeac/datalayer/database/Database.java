package ro.ovidiuconeac.datalayer.database;

import ro.ovidiuconeac.models.Cheese;
import ro.ovidiuconeac.models.Fruit;
import ro.ovidiuconeac.models.Sweet;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface Database {
    Fruit getFruitById(int id);
    Cheese getCheeseById(int id);
    Sweet getSweetById(int id);
}
