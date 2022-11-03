package com.ivan.idcard;

import com.ivan.framework.Product;

/**
 * @author maohao
 */
public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println(owner+"的卡制作成功");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner+"正在使用");
    }

    public String getOwner() {
        return owner;
    }
}
