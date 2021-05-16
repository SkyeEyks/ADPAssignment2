package za.ac.cput;

import java.util.ArrayList;
import java.util.Collection;

public class MyPets {
    private final Collection<String> pets;

    public MyPets() {
        pets = new ArrayList<>();
    }

    public boolean add(String name) {
        return pets.add(name);
    }

    public boolean remove(String name) {
        return pets.remove(name);
    }

    public boolean find(String name) {
        return pets.contains(name);
    }
}
