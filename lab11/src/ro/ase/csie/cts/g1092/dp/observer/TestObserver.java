package ro.ase.csie.cts.g1092.dp.observer;

public class TestObserver {
    public static void main(String[] args) {
        NetworkModule networkModule = new NetworkModule();

        NetworkEventHandlerInterface autoSaveModule = new AutoSaveModule();
        NetworkEventHandlerInterface notificationsModule = new UINotificationsModule();

        networkModule.networkStatusChanged(NetworkStatus.UP);

        networkModule.registerModule(autoSaveModule);
        networkModule.registerModule(notificationsModule);

        networkModule.networkStatusChanged(NetworkStatus.UP);

        networkModule.unregisterModule(autoSaveModule);

        networkModule.networkStatusChanged(NetworkStatus.DOWN);
    }
}
