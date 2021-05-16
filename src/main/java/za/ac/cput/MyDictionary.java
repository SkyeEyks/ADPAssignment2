package za.ac.cput;

import java.util.*;

public class MyDictionary{
    private final HashMap<String, String> dictionary;

    public MyDictionary()
    {
        dictionary = new HashMap<>();
    }

    public String add(String word, String definition)
    {
        return dictionary.put(word, definition);
    }

    public String remove(String word) {
        return dictionary.remove(word);
    }

    public boolean find(String word)
    {
        return dictionary.containsKey(word);
    }
}
