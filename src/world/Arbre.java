package world;

import java.util.ArrayList;

/**
 * Created by abdou on 16/09/2016.
 */

// Version 2

public class Arbre extends Vegetal {
    private int taille;
    private ArbreType type;

    public Arbre() {
        super();
        taille = 100;
    }

    public Arbre(String name) {
        this.type = GestionnaireArbreType.getInstance().getArbreType(name);
        System.out.println("Creation arbre de type "+ type.getName() + " : position (" + x + ","
                + y + ")" + " taille " + taille);
    }

    public Arbre(String name, int x, int y, int taille) {
        this.x = x;
        this.y = y;
        this.taille = taille;
        this.type = GestionnaireArbreType.getInstance().getArbreType(name);
        System.out.println("Creation arbre de type "+ type.getName() + " : position (" + x + ","
                + y + ")" + " taille " + taille);
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    @Override
    void dessiner() {
        System.out.println("Dessin arbre de type " + type.getName() + " : "  + "position ("
                + x + ", " + y + ")" + " taille " + taille);
    }
}
