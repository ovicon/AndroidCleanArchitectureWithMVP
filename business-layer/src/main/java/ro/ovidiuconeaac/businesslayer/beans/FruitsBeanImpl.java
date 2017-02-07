package ro.ovidiuconeaac.businesslayer.beans;

import java.util.Random;

import ro.ovidiuconeac.datalayer.dao.FruitsDao;
import ro.ovidiuconeac.datalayer.dao.FruitsDaoImpl;
import ro.ovidiuconeac.models.Fruit;

/**
 * Created by ovidiu on 2/7/17.
 */

public class FruitsBeanImpl implements FruitsBean {

    private FruitsDao dao;

    public FruitsBeanImpl() {
        dao = new FruitsDaoImpl();
    }

    @Override
    public Fruit getRandomFruit() {
        int id = new Random().nextInt(14);
        return dao.getFruitById(id);
    }
}
