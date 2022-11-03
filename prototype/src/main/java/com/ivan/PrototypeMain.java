package com.ivan;

/**
 * @author maohao
 */
public class PrototypeMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        MessageBox messageBox = new MessageBox('*');
        manager.register("messageBox", messageBox);
        Product messageBoxClone = manager.create("messageBox");
        messageBoxClone.use("hello, ivan");
    }
}
