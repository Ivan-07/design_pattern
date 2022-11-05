package com.ivan;

/**
 * @author maohao
 */
public class Decorator {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("hello, ivan");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
    }
}
