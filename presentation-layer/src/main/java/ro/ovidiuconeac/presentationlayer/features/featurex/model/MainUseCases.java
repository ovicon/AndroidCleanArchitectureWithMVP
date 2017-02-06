package ro.ovidiuconeac.presentationlayer.features.featurex.model;

import java.util.Random;

/**
 * Created by ovidiu on 2/6/17.
 */

public class MainUseCases {
    public String getFruit1() {
        return String.valueOf(new Random().nextInt(1232432525));
    }

    public String getFruit2() {
        return String.valueOf(new Random().nextInt(1232432525));
    }

    public String getCheese1() {
        return String.valueOf(new Random().nextInt(1232432525));
    }

    public String getCheese2() {
        return String.valueOf(new Random().nextInt(1232432525));
    }

    public String getSweet1() {
        return String.valueOf(new Random().nextInt(1232432525));
    }

    public String getSweet2() {
        return String.valueOf(new Random().nextInt(1232432525));
    }
}
