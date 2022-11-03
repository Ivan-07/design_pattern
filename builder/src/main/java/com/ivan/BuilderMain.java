package com.ivan;

/**
 * @author maohao
 */
public class BuilderMain {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        System.out.println(textBuilder.getResult());
    }
}
