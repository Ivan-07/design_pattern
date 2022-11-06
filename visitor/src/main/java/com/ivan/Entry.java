package com.ivan;

import java.util.Iterator;

/**
 * @author maohao
 */
public abstract class Entry  implements Element{
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentExecption {
        throw new FileTreatmentExecption();
    }

    public Iterator iterator() throws FileTreatmentExecption {
        throw new FileTreatmentExecption();
    }

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
