package world;

/**
 * Created by abdou on 16/09/2016.
 */


public abstract class Vegetal {
    //    protected double[] position = new double[2];
    //    ou
    protected double x;
    protected double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    abstract void dessiner();
    public Vegetal () {
        x = 0;
        y = 10;
    }
}
