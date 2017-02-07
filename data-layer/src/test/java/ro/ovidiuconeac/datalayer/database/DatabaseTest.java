package ro.ovidiuconeac.datalayer.database;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ovidiu on 2/7/17.
 */

public class DatabaseTest {

    private Database database;
    private int id;

    @Before
    public void init() {
        database = Database.getInstance();
    }

    @After
    public void deinit() {
        id = new Random().nextInt(14);
    }

    @Test
    public void whenCorrectIdGetFruitFromDatabase() {
        assertNotNull(database.getFruitById(id));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenWrongIdForFruitThrowExpectedException() {
        assertNotNull(database.getFruitById(16));
    }

    @Test
    public void whenCorrectIdGetCheeseFromDatabase() {
        assertNotNull(database.getCheeseById(id));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenWrongIdForCheeseThrowExpectedException() {
        assertNotNull(database.getCheeseById(-1));
    }

    @Test
    public void whenCorrectIdGetSweetFromDatabase() {
        assertNotNull(database.getSweetById(id));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenWrongIdForSweetThrowExpectedException() {
        assertNotNull(database.getSweetById(123));
    }
}
