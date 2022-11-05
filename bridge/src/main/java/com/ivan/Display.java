package com.ivan;

/**
 * @author maohao
 */
public class Display {
    // 在这里采用委托的方式来把工作交给impl，因为继承是强关联，委托是弱关联。
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
