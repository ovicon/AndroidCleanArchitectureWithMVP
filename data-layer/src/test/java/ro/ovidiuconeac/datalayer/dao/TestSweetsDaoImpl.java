package ro.ovidiuconeac.datalayer.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ovidiu on 2/7/17.
 */

public class TestSweetsDaoImpl {

    private SweetsDao dao;
    private int id;

    @Before
    public void init() {
        dao = new SweetsDaoImpl();
        id = new Random().nextInt(14);
    }

    @After
    public void deinit() {
        dao = null;
    }

    @Test
    public void whenIdCorrectGetFruitById() {
        assertNotNull(dao.getSweetById(id));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIdWrongThrowException() {
        dao.getSweetById(-1);
    }
}
