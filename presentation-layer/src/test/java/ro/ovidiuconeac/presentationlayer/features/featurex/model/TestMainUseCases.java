package ro.ovidiuconeac.presentationlayer.features.featurex.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ovidiuconeaac.businesslayer.beans.CheeseBean;
import ro.ovidiuconeaac.businesslayer.beans.FruitsBean;
import ro.ovidiuconeaac.businesslayer.beans.SweetsBean;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ovidiu on 2/7/17.
 */

public class TestMainUseCases {

    private FruitsBean fruitsBean;
    private CheeseBean cheeseBean;
    private SweetsBean sweetsBean;

    @Before
    public void init() {
        fruitsBean = new FruitsBean();
        cheeseBean = new CheeseBean();
        sweetsBean = new SweetsBean();
    }

    @After
    public void deinit() {
        fruitsBean = null;
        cheeseBean = null;
        sweetsBean = null;
    }

    @Test
    public void getFruit() {
        assertNotNull(fruitsBean.getRandomFruit());
    }

    @Test
    public void getCheese() {
        assertNotNull(cheeseBean.getRandomCheese());
    }

    @Test
    public void getSweets() {
        assertNotNull(sweetsBean.getRandomSweet());
    }
}