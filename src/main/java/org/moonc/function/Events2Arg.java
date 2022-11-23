package org.moonc.function;

import java.util.ArrayList;

public class Events2Arg<T1, T2> extends ArrayList<Events2Arg<T1,T2>> implements Event2Arg<T1,T2> {
    @Override
    public void invoke(T1 o, T2 o2) {
        for (Events2Arg<T1,T2> events2Arg : this) {
            events2Arg.invoke(o,o2);
        }
    }
}
