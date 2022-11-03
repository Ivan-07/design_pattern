package com.ivan;

import java.util.HashMap;

/**
 * @author maohao
 */
public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String name) {
        Product product = (Product)showcase.get(name);
        return product.createClone();
    }
}
