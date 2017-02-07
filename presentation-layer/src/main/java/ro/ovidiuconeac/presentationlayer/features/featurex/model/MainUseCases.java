package ro.ovidiuconeac.presentationlayer.features.featurex.model;

import ro.ovidiuconeaac.businesslayer.beans.CheeseBean;
import ro.ovidiuconeaac.businesslayer.beans.FruitsBean;
import ro.ovidiuconeaac.businesslayer.beans.SweetsBean;
import ro.ovidiuconeac.models.Cheese;
import ro.ovidiuconeac.models.Fruit;
import ro.ovidiuconeac.models.Sweet;

/**
 * Created by ovidiu on 2/6/17.
 */

public class MainUseCases {

    private FruitsBean fruitBean;
    private CheeseBean cheeseBean;
    private SweetsBean sweetsBean;

    public MainUseCases() {
        this.fruitBean = new FruitsBean();
        this.cheeseBean = new CheeseBean();
        this.sweetsBean = new SweetsBean();
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
