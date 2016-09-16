package world;

/**
 * Created by abdou on 16/09/2016.
 */


public class ArbreType {
    private double[][] texture;
    private String name;

    public ArbreType() {
        texture = new double[100][100];
    }

    public ArbreType(String name) {
        texture = new double[100][100];
        this.name = name;
        System.out.println("Nouveau type " + name + " ajoute");
    }

    public double[][] getTexture() {
        return texture;
    }

    public String getName() {
        return name;
    }

}

