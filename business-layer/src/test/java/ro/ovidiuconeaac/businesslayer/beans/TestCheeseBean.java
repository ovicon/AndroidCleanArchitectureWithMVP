package ro.ovidiuconeaac.businesslayer.beans;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ovidiu on 2/7/17.
 */

public class TestCheeseBean {

    private CheeseBean cheeseBean;

    @Before
    public void init() {
        cheeseBean = new CheeseBean();
    }

    @After
    public void deinit() {
        cheeseBean = null;
    }

    @Test
    public void getFruit() {
        assertNotNull(cheeseBean.getRandomCheese());
    }
}
