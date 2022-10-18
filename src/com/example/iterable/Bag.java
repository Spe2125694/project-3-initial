package com.example.iterable;

import java.util.*;

public class Bag<T> implements Container<T> {

    ArrayList<T> bag = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return bag.isEmpty();
    }

    @Override
    public int size() {
        return bag.size();
    }

    @Override
    public void add(Object item) {
        bag.add((T) item);
    }

    @Override
    public Iterator<T> iterator() {
        return bag.iterator();
    }
}