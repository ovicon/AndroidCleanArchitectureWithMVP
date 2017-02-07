package ro.ovidiuconeac.presentationlayer.features.featurex.presenter;

import android.os.AsyncTask;

import java.util.UUID;

import ro.ovidiuconeac.models.Cheese;
import ro.ovidiuconeac.models.Fruit;
import ro.ovidiuconeac.models.Sweet;
import ro.ovidiuconeac.presentationlayer.common.Util;
import ro.ovidiuconeac.presentationlayer.features.Screen;
import ro.ovidiuconeac.presentationlayer.features.featurex.model.MainUseCases;
import ro.ovidiuconeac.presentationlayer.features.featurex.view.MainView;

/**
 * Created by ovidiu on 2/6/17.
 */

public class MainPresenterImpl implements MainPresenter {

    private UUID uuid;
    private MainView view;
    private MainUseCases model;

    public MainPresenterImpl(MainView view) {
        this.uuid = UUID.randomUUID();
        this.view = view;
        this.model = new MainUseCases();
    }

    @Override
    public void requestFruit1() {
        new AsyncTask<Void, Void, Fruit>() {

            @Override
            protected Fruit doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                return model.getFruit1();
            }

            @Override
            protected void onPostExecute(Fruit fruit) {
                super.onPostExecute(fruit);
                view.postFruit1(fruit.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestFruit2() {
        new AsyncTask<Void, Void, Fruit>() {

            @Override
            protected Fruit doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                return model.getFruit2();
            }

            @Override
            protected void onPostExecute(Fruit fruit) {
                super.onPostExecute(fruit);
                view.postFruit2(fruit.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestCheese1() {
        new AsyncTask<Void, Void, Cheese>() {

            @Override
            protected Cheese doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                return model.getCheese1();
            }

            @Override
            protected void onPostExecute(Cheese cheese) {
                super.onPostExecute(cheese);
                view.postCheese1(cheese.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestCheese2() {
        new AsyncTask<Void, Void, Cheese>() {

            @Override
            protected Cheese doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                return model.getCheese2();
            }

            @Override
            protected void onPostExecute(Cheese cheese) {
                super.onPostExecute(cheese);
                view.postCheese2(cheese.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestSweet1() {
        new AsyncTask<Void, Void, Sweet>() {

            @Override
            protected Sweet doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                return model.getSweet1();
            }

            @Override
            protected void onPostExecute(Sweet sweet) {
                super.onPostExecute(sweet);
                view.postSweet1(sweet.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestSweet2() {
        new AsyncTask<Void, Void, Sweet>() {

            @Override
            protected Sweet doInBackground(Void... params) {
                Util.simulateNetworkLatency(4000);
                return model.getSweet2();
            }

            @Override
            protected void onPostExecute(Sweet sweet) {
                super.onPostExecute(sweet);
                view.postSweet2(sweet.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void setScreen(Screen screen) {
        this.view = (MainView) screen;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }
}
