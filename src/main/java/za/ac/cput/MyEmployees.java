package za.ac.cput;

import java.util.HashSet;

public class MyEmployees {
    private final HashSet<String> employees;

    public MyEmployees() {
        employees = new HashSet<>();
    }

    public boolean add(String name) {
        return employees.add(name);
    }

    public boolean remove(String name) {
        return employees.remove(name);
    }

    public boolean find(String name) {
        return employees.contains(name);
    }
}
