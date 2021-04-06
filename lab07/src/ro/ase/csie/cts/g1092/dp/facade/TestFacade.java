package ro.ase.csie.cts.g1092.dp.facade;

public class TestFacade {
    public static void main(String[] args) {
//        // in order to connect to the game from an external app you need to
//        // 1. create player profile and login
//
//        PlayerProfile playerProfile = new PlayerProfile();
//        playerProfile.Login();
//        playerProfile.getUserSettings();
//
//        // 2. cehck subiscimrepton
//        Subscription subscription = new Subscription();
//        subscription.checkSubscription();

        // using the facade
        GameAPIFacade.createProfileAndConnect();

        // 3. get main character
        SuperHero superHero = new SuperHero("Superman", null, null);
    }
}
