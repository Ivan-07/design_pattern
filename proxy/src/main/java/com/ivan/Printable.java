package com.ivan;

/**
 * @author maohao
 */
public interface Printable {
    public abstract void setPrinterName(String name);

    public abstract String getPrinterName();

    public abstract void print(String s);
}
