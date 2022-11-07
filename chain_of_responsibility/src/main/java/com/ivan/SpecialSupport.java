package com.ivan;

/**
 * @author maohao
 */
public class SpecialSupport extends Support{
    private int num;

    public SpecialSupport(String name, int num) {
        super(name);
        this.num = num;
    }

    public SpecialSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == num;
    }
}
