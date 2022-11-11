package com.ivan;

import java.util.Random;

public class RandomNumGenerator extends NumberGenerator{
    private int num;
    private Random random = new Random();
    @Override
    public int getNum() {
        return num;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            num = random.nextInt(100);
            notifyObservers();
        }
    }
}
