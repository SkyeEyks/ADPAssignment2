package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyBooksTest {
    public MyBooks books;

    @BeforeEach
    void setUp() {
        books = new MyBooks();
        books.add("Artemis Fowl");
        books.add("Cherub");
        books.add("Skulduggery");
    }

    @Test
    void testAdd() {
        assertTrue(books.add("Diary of a wimpy kid"));
        assertTrue(books.add("Diary of a wimpy kid"));
    }

    @Test
    void testRemove() {
        assertTrue(books.remove("Skulduggery"));
        assertFalse(books.remove("Skulduggery"));
    }

    @Test
    void testFind() {
        assertEquals(0, books.find("Artemis Fowl"));
        assertEquals(-1, books.find("The Gruffalo"));
    }
}