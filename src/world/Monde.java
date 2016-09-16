package world;

import java.util.ArrayList;

/**
 * Created by abdou on 16/09/2016.
 */

public class Monde {

    //private constructor
    private Monde() {

    }

    private static Monde instance = new Monde();

    private ArrayList<Vegetal> vegetaux = new ArrayList<Vegetal>();

    public static Monde getInstance()
    {
        return instance;
    }

    public ArrayList<Vegetal> getVegetaux() {
        return vegetaux;
    }

    public void setVegetaux(ArrayList<Vegetal> vegetaux) {
        this.vegetaux = vegetaux;
    }

    public static void main(String[] args){
        Monde m = Monde.getInstance();
        Arbre palmier = new Arbre("palmier");
        m.getVegetaux().add(palmier);
        palmier.dessiner();
    }
}
