package ro.ovidiuconeac.presentationlayer.cache;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import ro.ovidiuconeac.presentationlayer.features.Presenter;

/**
 * Created by ovidiu on 2/2/17.
 *
 * The purpose of this class is to provide a caching
 * mechanism to persist presenters during activity
 * orientation change.
 *
 * A disadvantage of the caching class is that it
 * never deletes the unused presenters.
 *
 * A solution, e.g. a daemon, must be implemented
 * to remove the unused presenters.
 */
public class Cache implements Serializable {

    private static Cache ourInstance;
    private Map<UUID, Presenter> cache;

    public static Cache getInstance() {
        if (ourInstance == null) {
            ourInstance = new Cache();
        }
        return ourInstance;
    }

    private Cache() {
        cache = new HashMap<>();
    }

    public void cachePresenterFor(UUID uuid, Presenter presenter) {
        cache.put(uuid, presenter);
    }

    public Presenter restorePresenterFor(UUID uuid) {
        Presenter presenter = cache.get(uuid);
        cache.remove(presenter);
        return presenter;
    }
}
