package ro.ovidiuconeac.datalayer.dao;

import ro.ovidiuconeac.models.Fruit;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface FruitsDao {
    Fruit getFruitById(int id);
}
