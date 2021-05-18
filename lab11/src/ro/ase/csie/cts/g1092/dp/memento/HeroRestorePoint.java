package ro.ase.csie.cts.g1092.dp.memento;

import java.util.Date;

public class HeroRestorePoint {
    private String name, power;
    private int lifePoints;
    private Date timestamp;

    public HeroRestorePoint(String name, String power, int lifePoints) {
        this.name = name;
        this.power = power;
        this.lifePoints = lifePoints;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
