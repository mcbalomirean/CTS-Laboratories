package ro.ase.csie.cts.g1092.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class NetworkModule {
    private List<NetworkEventHandlerInterface> modules = new ArrayList<>();

    public void registerModule(NetworkEventHandlerInterface module) {
        modules.add(module);
    }

    public void unregisterModule(NetworkEventHandlerInterface module) {
        modules.remove(module);
    }

    public void networkStatusChanged(NetworkStatus networkStatus) {
        switch (networkStatus) {
            case UP:
                for (NetworkEventHandlerInterface module : modules) {
                    module.notifyNetworkUp();
                }
                break;
            case DOWN:
                for (NetworkEventHandlerInterface module : modules) {
                    module.notifyNetworkDown();
                }
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
