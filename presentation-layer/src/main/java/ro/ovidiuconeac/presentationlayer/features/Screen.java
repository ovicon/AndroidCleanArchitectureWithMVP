package ro.ovidiuconeac.presentationlayer.features;

import java.util.UUID;

/**
 * Created by ovidiu on 2/2/17.
 *
 * Common screen interface.
 *
 * The purpose of this interface is to facilitate
 * the creation of the {@link Presenter} interface's
 * {@link Presenter#setScreen(Screen)} method.
 */

public interface Screen {
    void cachePresenter(Presenter presenter);
    void restorePresenter(UUID uuid);
}
