package ro.ovidiuconeac.presentationlayer.features;

import java.util.UUID;

/**
 * Created by ovidiu on 2/2/17.
 *
 * Common presenter interface.
 */

public interface Presenter {

    /*
     The method is used to restore the view
     reference in the presenter, after an
     orientation change
     */
    void setScreen(Screen screen);

    /*
     The UUID is used to save and restore
     the presenter instance during an
     orientation change
     */
    UUID getUuid();
}
