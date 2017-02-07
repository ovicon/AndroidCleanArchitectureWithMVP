package ro.ovidiuconeac.datalayer.dao;

import ro.ovidiuconeac.datalayer.database.Database;
import ro.ovidiuconeac.datalayer.database.DatabaseImpl;
import ro.ovidiuconeac.models.Cheese;

/**
 * Created by ovidiu on 2/7/17.
 */

public class CheesesDaoImpl implements CheesesDao {

    private Database database = DatabaseImpl.getInstance();

    @Override
    public Cheese getCheeseById(int id) {
        return database.getCheeseById(id);
    }
}
