package ro.ovidiuconeac.datalayer.database;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ovidiu on 2/7/17.
 */

public class DatabaseImplTest {

    private DatabaseImpl database;
    private int id;

    @Before
    public void setUp() {
        database = DatabaseImpl.getInstance();
    }

    @After
    public void tearDown() {
        id = new Random().nextInt(14);
    }

    @Test
    public void whenCorrectIdGetFruitFromDatabase() {
        assertNotNull(database.getFruitById(id));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenWrongIdForFruitThrowExpectedException() {
        database.getFruitById(16);
    }

    @Test
    public void whenCorrectIdGetCheeseFromDatabase() {
        assertNotNull(database.getCheeseById(id));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenWrongIdForCheeseThrowExpectedException() {
        database.getCheeseById(-1);
    }

    @Test
    public void whenCorrectIdGetSweetFromDatabase() {
        assertNotNull(database.getSweetById(id));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenWrongIdForSweetThrowExpectedException() {
        database.getSweetById(123);
    }
}
