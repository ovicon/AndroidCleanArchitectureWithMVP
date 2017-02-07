package ro.ovidiuconeac.presentationlayer.features.featurex.model;

import ro.ovidiuconeaac.businesslayer.beans.CheeseBeanImpl;
import ro.ovidiuconeaac.businesslayer.beans.FruitsBeanImpl;
import ro.ovidiuconeaac.businesslayer.beans.SweetsBeanImpl;
import ro.ovidiuconeac.models.Cheese;
import ro.ovidiuconeac.models.Fruit;
import ro.ovidiuconeac.models.Sweet;

/**
 * Created by ovidiu on 2/6/17.
 */

public class MainUseCases {

    private FruitsBeanImpl fruitBean;
    private CheeseBeanImpl cheeseBean;
    private SweetsBeanImpl sweetsBean;

    public MainUseCases() {
        this.fruitBean = new FruitsBeanImpl();
        this.cheeseBean = new CheeseBeanImpl();
        this.sweetsBean = new SweetsBeanImpl();
    }

    public Fruit getFruit1() {
        return fruitBean.getRandomFruit();
    }

    public Fruit getFruit2() {
        return fruitBean.getRandomFruit();
    }

    public Cheese getCheese1() {
        return cheeseBean.getRandomCheese();
    }

    public Cheese getCheese2() {
        return cheeseBean.getRandomCheese();
    }

    public Sweet getSweet1() {
        return sweetsBean.getRandomSweet();
    }

    public Sweet getSweet2() {
        return sweetsBean.getRandomSweet();
    }
}
