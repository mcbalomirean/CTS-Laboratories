package ro.ase.csie.cts.g1092.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class RestorePointsManager {
    private List<HeroRestorePoint> restorePoints = new ArrayList<>();

    public void addRestorePoints(HeroRestorePoint point) {
        restorePoints.add(point);
    }

    public HeroRestorePoint getRestorePoint(int index) {
        if (index < 0 || index >= restorePoints.size()) {
            throw new UnsupportedOperationException();
        }

        HeroRestorePoint point = restorePoints.get(index);
        restorePoints.remove(point);
        return point;
    }
}
