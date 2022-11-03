package com.ivan.idcard;

import com.ivan.framework.Factory;
import com.ivan.framework.Product;

import java.util.ArrayList;

/**
 * @author maohao
 */
public class IDCardFactory extends Factory {
    private ArrayList<String> owners = new ArrayList<>();
    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}
