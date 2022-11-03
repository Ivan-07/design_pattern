package com.ivan;

/**
 * @author maohao
 */
public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1.equals(singleton2));
    }
}
