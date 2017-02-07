package ro.ovidiuconeac.datalayer.dao;

import ro.ovidiuconeac.datalayer.database.Database;
import ro.ovidiuconeac.datalayer.database.DatabaseImpl;
import ro.ovidiuconeac.models.Fruit;

/**
 * Created by ovidiu on 2/7/17.
 */

public class FruitsDaoImpl implements FruitsDao {

    private Database database = DatabaseImpl.getInstance();

    @Override
    public Fruit getFruitById(int id) {
        return database.getFruitById(id);
    }
}
