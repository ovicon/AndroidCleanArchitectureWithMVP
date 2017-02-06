package ro.ovidiuconeac.presentationlayer.features.featurex.view;

import ro.ovidiuconeac.presentationlayer.features.Screen;

/**
 * Created by ovidiu on 2/6/17.
 */

public interface MainView extends Screen {
    void requestFruit1();
    void postFruit1(String fruit);
    void enableUiFruit1(boolean enable);
    void requestFruit2();
    void postFruit2(String fruit);
    void enableUiFruit2(boolean enable);
    void requestCheese1();
    void postCheese1(String cheese);
    void enableUiCheese1(boolean enable);
    void requestCheese2();
    void postCheese2(String cheese);
    void enableUiCheese2(boolean enable);
    void requestSweet1();
    void postSweet1(String sweet);
    void enableUiSweet1(boolean enable);
    void requestSweet2();
    void postSweet2(String sweet);
    void enableUiSweet2(boolean enable);
}
