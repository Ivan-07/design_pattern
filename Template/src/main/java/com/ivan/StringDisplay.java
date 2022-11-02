package com.ivan;


import java.nio.charset.StandardCharsets;

/**
 * @author maohao
 */
public class StringDisplay extends AbstractDisplay{

    private String s;

    private int width;

    public StringDisplay(String s) {
        this.s = s;
        this.width = s.getBytes(StandardCharsets.UTF_8).length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("+"+s+"+");
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void close() {
        printLine();
    }
}
