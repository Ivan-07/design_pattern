package com.ivan;

/**
 * @author maohao
 */
public class ProxyMain {
    public static void main(String[] args) {
        PrinterProxy proxy = new PrinterProxy("Ivan");
        System.out.println(proxy.getPrinterName());
        proxy.setPrinterName("Yumi");
        System.out.println(proxy.getPrinterName());
        proxy.print("Mahone");
    }
}
