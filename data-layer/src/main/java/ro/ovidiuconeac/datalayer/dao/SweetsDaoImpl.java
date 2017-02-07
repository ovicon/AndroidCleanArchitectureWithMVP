package ro.ovidiuconeac.datalayer.dao;

import ro.ovidiuconeac.datalayer.database.Database;
import ro.ovidiuconeac.datalayer.database.DatabaseImpl;
import ro.ovidiuconeac.models.Sweet;

/**
 * Created by ovidiu on 2/7/17.
 */

public class SweetsDaoImpl implements SweetsDao {

    private Database database = DatabaseImpl.getInstance();

    @Override
    public Sweet getSweetById(int id) {
        return database.getSweetById(id);
    }
}
