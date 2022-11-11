package com.ivan;

/**
 * @author maohao
 */
public class Printer implements Printable{
    private String name;

    public Printer() {
        heavyJob();
    }

    public Printer(String name) {
        this.name = name;
        heavyJob();
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String s) {
        System.out.println("===="+name+"====");
        System.out.println(s);
    }

    private void heavyJob() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print(".");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\n");
    }
}
