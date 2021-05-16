package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPetsTest {
    public MyPets pets;

    @BeforeEach
    void setUp() {
        pets = new MyPets();
        pets.add("Owl");
        pets.add("Ricardo");
        pets.add("Chika");
    }

    @Test
    void add() {
        assertTrue(pets.add("Henla"));
        assertTrue(pets.add("Henla"));
    }

    @Test
    void remove() {
        assertTrue(pets.remove("Chika"));
        assertFalse(pets.remove("Chika"));
    }

    @Test
    void find() {
        assertTrue(pets.find("Owl"));
        assertFalse(pets.find("Ruben"));
    }
}