package com.ivan;

public class ObserverMain {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumGenerator();
        Observer observer = new DigitObserver();
        generator.addObserver(observer);
        generator.execute();
    }
}
