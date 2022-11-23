package org.moonc.function;

public class Events extends EventList<Event> implements Event{

    @Override
    public void invoke() {
        for (Event e:this){
            e.invoke();
        }
    }
}
