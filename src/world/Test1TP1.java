package world;

/**
 * Created by abdou on 16/09/2016.
 */
public class Test1TP1 {
    public static void main(String[] args){
        Monde m = Monde.getInstance();
        Vegetal palmier = new Arbre("chene");
        m.getVegetaux().add(palmier);
        palmier.dessiner();
    }
}
