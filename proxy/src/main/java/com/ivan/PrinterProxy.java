package com.ivan;

/**
 * @author maohao
 */
public class PrinterProxy implements Printable{
    private String name;
    private Printable real;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String s) {
        realize();
        real.print(s);
    }

    public synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
