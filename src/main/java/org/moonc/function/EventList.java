package org.moonc.function;

import java.util.ArrayList;
import java.util.Iterator;


public class EventList<T> implements Iterable<T>{


    private final ArrayList<T> arrayList = new ArrayList<>();

    protected void add(T t){
        arrayList.add(t);
    }

    protected void remove(T t){
        arrayList.remove(t);
    }

    protected boolean contain(T t){
        return arrayList.contains(t);
    }


    @Override
    public Iterator<T> iterator() {
        return arrayList.iterator();
    }
}
