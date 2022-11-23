package org.moonc.function;

public class Events1Arg <T>  extends EventList<Events1Arg<T>> implements Event1Arg<T>{
    @Override
    public void invoke(T t) {
        for (Events1Arg<T> tEvents1Arg : this) {
            tEvents1Arg.invoke(t);
        }
    }
}
