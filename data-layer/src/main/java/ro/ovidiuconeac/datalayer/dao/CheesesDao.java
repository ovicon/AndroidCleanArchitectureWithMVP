package ro.ovidiuconeac.datalayer.dao;

import ro.ovidiuconeac.models.Cheese;

/**
 * Created by ovidiu on 2/7/17.
 */

public interface CheesesDao {
    Cheese getCheeseById(int id);
}
