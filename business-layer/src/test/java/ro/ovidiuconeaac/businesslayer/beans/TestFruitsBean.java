package ro.ovidiuconeaac.businesslayer.beans;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ovidiu on 2/7/17.
 */

public class TestFruitsBean {

    private FruitsBean fruitsBean;

    @Before
    public void init() {
        fruitsBean = new FruitsBean();
    }

    @After
    public void deinit() {
        fruitsBean = null;
    }

    @Test
    public void getFruit() {
        assertNotNull(fruitsBean.getRandomFruit());
    }
}
