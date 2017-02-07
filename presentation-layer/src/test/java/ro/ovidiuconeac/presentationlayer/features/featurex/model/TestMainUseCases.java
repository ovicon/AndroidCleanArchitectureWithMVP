package ro.ovidiuconeac.presentationlayer.features.featurex.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ovidiuconeaac.businesslayer.beans.CheeseBeanImpl;
import ro.ovidiuconeaac.businesslayer.beans.FruitsBeanImpl;
import ro.ovidiuconeaac.businesslayer.beans.SweetsBeanImpl;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ovidiu on 2/7/17.
 */

public class TestMainUseCases {

    private FruitsBeanImpl fruitsBean;
    private CheeseBeanImpl cheeseBean;
    private SweetsBeanImpl sweetsBean;

    @Before
    public void init() {
        fruitsBean = new FruitsBeanImpl();
        cheeseBean = new CheeseBeanImpl();
        sweetsBean = new SweetsBeanImpl();
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