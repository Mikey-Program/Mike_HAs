package src.exercise8.A2;

import java.util.HashMap;

public class Zoo {

    private HashMap<Mammal, Integer> zooInhabitants;

    public void addAnimal(Mammal animal) {
        if(zooInhabitants.containsKey(animal)){
            zooInhabitants.put(animal, zooInhabitants.get(animal) + 1);
        } else {
            zooInhabitants.put(animal, 1);
        }

    }
    // man muss eqauls und hascode überschreiben in Mammals wenn man Hashmap mit eigenen Klassen verwendet

}
