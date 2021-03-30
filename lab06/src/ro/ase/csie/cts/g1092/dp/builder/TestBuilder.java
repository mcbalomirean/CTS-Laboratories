package ro.ase.csie.cts.g1092.dp.builder;

public class TestBuilder {
    // 1. create
    //Superhero superhero = new Superhero();
    // 2. init
    // TODO: Don't forget to initialize

    Weapon pistol = new Weapon("Pistol");
    Superhero superhero = new Superhero("Superman", 100, false, false, null, pistol, "flying", "");
    Superhero superhero2 = new Superhero("Batman", 100, false, false, null, null, "", "");

    // builder
    Superhero superman = new Superhero.SuperheroBuilder("Superman", 100)
            .setRightWeapon(pistol)
            .setSuperPower("flying")
            .setSuperSuperPower("laser eyes")
            .build();

    Superhero joker = new Superhero.SuperheroBuilder("Joker", 200)
            .isVillain()
            .setRightWeapon(pistol)
            .build();

    Superhero dummyHero = new Superhero.SuperheroBuilder("Dummy", 50).build();
}
