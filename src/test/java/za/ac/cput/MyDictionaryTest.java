package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyDictionaryTest {
    private MyDictionary dictionary;

    @BeforeEach
    void setUp() {
        dictionary = new MyDictionary();
        dictionary.add("yeet", "to fling with force");
        dictionary.add("phone", "the device I am addicted to");
    }

    @Test
    void testAdd() {
        assertNull(dictionary.add("hotel", "trivago"));
        assertEquals("trivago", dictionary.add("hotel", "3 stars or more"));
    }

    @Test
    void testRemove() {
        assertEquals("to fling with force", dictionary.remove("yeet"));
        assertNull(dictionary.remove("owo"));
    }

    @Test
    void testFind() {
        assertTrue(dictionary.find("phone"));
        assertFalse(dictionary.find("marbles"));
    }
}