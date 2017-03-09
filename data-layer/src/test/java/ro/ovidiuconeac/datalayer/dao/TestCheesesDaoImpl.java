package ro.ovidiuconeac.datalayer.dao;

import org.junit.After;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * Created by ovidiu on 2/7/17.
 */

public class TestCheesesDaoImpl {

    private CheesesDao dao;
    private int id;

    @Before
    public void setUp() {
        dao = new CheesesDaoImpl();
        id = new Random().nextInt(14);
    }

    @After
    public void tearDown() {
        dao = null;
    }

    @Test
    public void whenIdCorrectGetCheeseById() {
        assertNotNull(dao.getCheeseById(id));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIdWrongThrowException() {
        dao.getCheeseById(-1);
    }
}
