package world;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by abdou on 16/09/2016.
 */

// Singleton Pattern

public class GestionnaireArbreType {
    private Map<String, ArbreType> listArbreType;

    private GestionnaireArbreType() {
        listArbreType = new HashMap<>();
        System.out.println("je suis là");
    }

    private static GestionnaireArbreType instance = new GestionnaireArbreType();

    public static GestionnaireArbreType getInstance()
    {
        return instance;
    }

    public ArbreType getArbreType(String nomType)
    {
        ArbreType type =  listArbreType.get(nomType);
        if (type != null) {
            return type;
        }
        ArbreType tmp = new ArbreType(nomType);
        listArbreType.put(nomType, tmp);
        return tmp;
    }
}
