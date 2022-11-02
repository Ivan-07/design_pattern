package com.ivan;

public class mainTest {
    public static void main(String[] args) {
        AbstractDisplay display1 = new CharDisplay('M');
        display1.display();
        AbstractDisplay display2 = new StringDisplay("ivan");
        display2.display();
    }
}
