package ro.ovidiuconeaac.businesslayer.beans;

import java.util.Random;

import ro.ovidiuconeac.datalayer.dao.SweetsDao;
import ro.ovidiuconeac.datalayer.dao.SweetsDaoImpl;
import ro.ovidiuconeac.models.Sweet;

/**
 * Created by ovidiu on 2/7/17.
 */

public class SweetsBeanImpl implements SweetsBean {

    private SweetsDao dao;

    public SweetsBeanImpl() {
        dao = new SweetsDaoImpl();
    }

    @Override
    public Sweet getRandomSweet() {
        int id = new Random().nextInt(14);
        return dao.getSweetById(id);
    }
}
