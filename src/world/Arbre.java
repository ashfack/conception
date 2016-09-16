package world;

/**
 * Created by abdou on 16/09/2016.
 */

public class Arbre extends Vegetal {
    private String type;
    private int taille;
    private double[][] texture;

    public Arbre() {
        super();
        this.texture = new double[100][100];
        type = "sans type";
        taille = 100;
    }

    public Arbre(String type) {
        this.type = type;
    }

    public Arbre(String type, int taille, double[][] texture) {
        this.type = type;
        this.taille = taille;
        this.texture = texture;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public double[][] getTexture() {
        return texture;
    }

    public void setTexture(double[][] texture) {
        this.texture = texture;
    }

    @Override
    void dessiner() {
        System.out.println("Dessin arbre de type " + type + " : "  + "position ("
                + position[0] + ", " + position[1] + ")" + " taille " + taille);
    }
}
