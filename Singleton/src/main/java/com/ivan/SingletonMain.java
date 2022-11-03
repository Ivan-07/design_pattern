package com.ivan;

/**
 * @author maohao
 */
public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1.equals(singleton2));

        Triple triple0 = Triple.getTripleById(0);
        Triple triple1 = Triple.getTripleById(1);
        Triple triple2 = Triple.getTripleById(2);
        System.out.println(triple0.equals(triple1));
        System.out.println(triple0);
    }
}
