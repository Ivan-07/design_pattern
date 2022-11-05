package com.ivan;

/**
 * @author maohao
 */
public class BridgeMain {
    public static void main(String[] args) {
        Display display1 = new Display(new StringDisplayImpl("ivan"));
        Display display2 = new CountDisplay(new StringDisplayImpl("ivan"));
        CountDisplay display3 = new CountDisplay(new StringDisplayImpl("ivan"));
        display1.display();
        display2.display();
        display3.display();
        display3.multiDisplay(3);
    }
}
