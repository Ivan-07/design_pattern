package com.ivan.appoint;

import com.ivan.extend.Banner;

public class mainTest2 {
    public static void main(String[] args) {
        Print print =  new PrintBanner(new Banner());
        print.printStrong("ivan");
        print.printWeak("ivan");
    }
}
