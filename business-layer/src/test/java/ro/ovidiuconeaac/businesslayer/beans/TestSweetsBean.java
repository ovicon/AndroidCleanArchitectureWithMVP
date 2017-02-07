package ro.ovidiuconeaac.businesslayer.beans;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ovidiu on 2/7/17.
 */

public class TestSweetsBean {

    private SweetsBeanImpl sweetsBean;

    @Before
    public void init() {
        sweetsBean = new SweetsBeanImpl();
    }

    @After
    public void deinit() {
        sweetsBean = null;
    }

    @Test
    public void getFruit() {
        assertNotNull(sweetsBean.getRandomSweet());
    }
}
