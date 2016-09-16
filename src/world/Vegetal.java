package world;

/**
 * Created by abdou on 16/09/2016.
 */


public abstract class Vegetal {
    protected double[] position = new double[2];

    abstract void dessiner();
    public Vegetal () {
        position[0] = 0;
        position[1] = 10;
    }
}
