package ro.ase.csie.cts.g1092.dp.adapter.disney;

public interface DisneyActions {
    void changeLocation(int x, int y);
    void getWounded(int hitPoints);
    void getHealed(int hitPoints);

    String getName();
    int getHitPoints();
}
