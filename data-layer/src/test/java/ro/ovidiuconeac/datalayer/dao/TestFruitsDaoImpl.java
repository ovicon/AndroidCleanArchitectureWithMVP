package ro.ovidiuconeac.datalayer.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ovidiu on 2/7/17.
 */

public class TestFruitsDaoImpl {

    private FruitsDao dao;
    private int id;

    @Before
    public void init() {
        dao = new FruitsDaoImpl();
        id = new Random().nextInt(14);
    }

    @After
    public void deinit() {
        dao = null;
    }

    @Test
    public void whenIdCorrectGetFruitById() {
        assertNotNull(dao.getFruitById(id));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIdWrongThrowException() {
        dao.getFruitById(-1);
    }
}
