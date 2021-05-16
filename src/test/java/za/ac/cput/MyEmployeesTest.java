package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyEmployeesTest {
    public MyEmployees employees;

    @BeforeEach
    void setUp() {
        employees = new MyEmployees();
        employees.add("Abby Zinc");
        employees.add("Bill Yawn");
        employees.add("Clair Xavier");
    }

    @Test
    void testAdd() {
        assertTrue(employees.add("Dave Warner"));
        assertFalse(employees.add("Dave Warner"));
    }

    @Test
    void testRemove() {
        assertTrue(employees.remove("Clair Xavier"));
        assertFalse(employees.remove("Clair Xavier"));
    }

    @Test
    void testFind() {
        assertTrue(employees.find("Abby Zinc"));
        assertFalse(employees.find("Jim Lue"));
    }
}