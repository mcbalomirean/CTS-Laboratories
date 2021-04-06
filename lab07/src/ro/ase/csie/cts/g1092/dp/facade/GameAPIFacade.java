package ro.ase.csie.cts.g1092.dp.facade;

public class GameAPIFacade {
    public static void createProfileAndConnect() {
        PlayerProfile playerProfile = new PlayerProfile();
        playerProfile.Login();
        playerProfile.getUserSettings();

        Subscription subscription = new Subscription();
        subscription.checkSubscription();
    }
}
