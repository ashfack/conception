package world;

/**
 * Created by abdou on 16/09/2016.
 */
public class Test2TP1 {
    public static void main(String[] args){
        Monde m = Monde.getInstance();
        Vegetal chene = new Arbre("chene");
        Vegetal sapin = new Arbre("sapin");
        Vegetal peuplier1 = new Arbre("peuplier");
        Vegetal peuplier2 = new Arbre("peuplier");

        m.getVegetaux().add(chene);
    }
}
