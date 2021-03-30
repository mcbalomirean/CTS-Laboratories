package ro.ase.csie.cts.g1092.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Tree3DModel implements Cloneable {
    String color;
    int height;
    ArrayList<Integer> points = null;

    private Tree3DModel() {

    }

    public Tree3DModel(String color, int height) {
        System.out.println("Loading the 3D model...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.points = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            this.points.add(random.nextInt(1000));
        }

        System.out.println("Applying color...");
        this.color = color;
        this.height = height;

        System.out.println("Rendering final 3D model.");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        this is a mistake
//        Tree3DModel copy = new Tree3DModel(this.color, this.height);
//        return copy;

        Tree3DModel copy = new Tree3DModel();
        copy.color = this.color;
        copy.height = this.height;
        copy.points = (ArrayList<Integer>) this.points.clone();

        return copy;
    }
}
