package com.ivan.extend;

/**
 * @author maohao
 */
public class PrintBanner extends Banner implements Print{
    @Override
    public void printWeak(String s) {
        this.showWithParen(s);
    }

    @Override
    public void printStrong(String s) {
        this.showWithAster(s);
    }
}
