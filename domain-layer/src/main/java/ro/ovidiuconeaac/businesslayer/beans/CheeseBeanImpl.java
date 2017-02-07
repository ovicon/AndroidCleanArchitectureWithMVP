package ro.ovidiuconeaac.businesslayer.beans;

import java.util.Random;

import ro.ovidiuconeac.datalayer.dao.CheesesDao;
import ro.ovidiuconeac.datalayer.dao.CheesesDaoImpl;
import ro.ovidiuconeac.models.Cheese;

/**
 * Created by ovidiu on 2/7/17.
 */

public class CheeseBeanImpl implements CheeseBean {

    private CheesesDao dao;

    public CheeseBeanImpl() {
        dao = new CheesesDaoImpl();
    }

    @Override
    public Cheese getRandomCheese() {
        int id = new Random().nextInt(14);
        return dao.getCheeseById(id);
    }
}
