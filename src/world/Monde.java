package world;

import java.util.ArrayList;

/**
 * Created by abdou on 16/09/2016.
 */

public class Monde {

    //private constructor
    private Monde() {
        this.vegetaux = new ArrayList<Vegetal>();
    }

    private static Monde instance = new Monde();

    private ArrayList<Vegetal> vegetaux;

    public static Monde getInstance()
    {
        return instance;
    }

    public ArrayList<Vegetal> getVegetaux() {
        return vegetaux;
    }
}
