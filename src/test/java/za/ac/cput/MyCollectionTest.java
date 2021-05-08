package za.ac.cput;

import org.junit.jupiter.api.*;

import java.util.Collection;

class MyCollectionTest {
    Collection<String> collection;

    @BeforeEach
    void setUp() {
        collection = new MyCollection<>();
    }

    @Test
    void testAdd() {
        collection.clear();
        System.out.println(collection.size());
        collection.add("A string");
        System.out.println(collection.size());
    }

    @Test
    void testRemove() {
        collection.remove("A string");
    }
}