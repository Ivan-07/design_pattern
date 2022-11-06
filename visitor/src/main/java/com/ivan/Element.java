package com.ivan;

/**
 * @author maohao
 */
public interface Element {
    public abstract void accept(Visitor visitor);
}
