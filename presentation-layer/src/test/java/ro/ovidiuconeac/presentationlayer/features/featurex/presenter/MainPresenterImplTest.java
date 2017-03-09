package ro.ovidiuconeac.presentationlayer.features.featurex.presenter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import ro.ovidiuconeac.presentationlayer.features.Screen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by www.ovidiuconeac.ro on 3/9/17.
 */

public class MainPresenterImplTest {

    private MainPresenterImpl presenter;
    private Screen screen;

    @Before
    public void setUp() {
        presenter = mock(MainPresenterImpl.class);
        screen = mock(Screen.class);
    }

    @After
    public void tearDown() {
        presenter = null;
    }

    @Test
    public void requestFruit1() {
        doNothing().when(presenter).requestFruit1();
        presenter.requestFruit1();
    }

    @Test
    public void requestFruit2() {
        doNothing().when(presenter).requestFruit2();
        presenter.requestFruit2();
    }

    @Test
    public void requestCheese1() {
        doNothing().when(presenter).requestCheese1();
        presenter.requestCheese1();
    }

    @Test
    public void requestCheese2() {
        doNothing().when(presenter).requestCheese2();
        presenter.requestCheese2();
    }

    @Test
    public void requestSweet1() {
        doNothing().when(presenter).requestSweet1();
        presenter.requestSweet1();
    }

    @Test
    public void requestSweet2() {
        doNothing().when(presenter).requestSweet2();
        presenter.requestSweet2();
    }

    @Test
    public void testSetScreen() {
        doNothing().when(presenter).setScreen(any(Screen.class));
        presenter.setScreen(screen);
    }

    @Test
    public void testGetUuid() {
        UUID uuid = UUID.randomUUID();
        when(presenter.getUuid()).thenReturn(uuid);
        UUID result = presenter.getUuid();
        assertNotNull(result);
        assertEquals(uuid, result);
    }
}
