package com.ivan;

import com.ivan.framework.Factory;
import com.ivan.framework.Product;
import com.ivan.idcard.IDCardFactory;

/**
 * @author maohao
 */
public class mainTest {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("ivan");
        card1.use();
    }
}
