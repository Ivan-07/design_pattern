package com.ivan.appoint;

import com.ivan.extend.Banner;

/**
 * @author maohao
 */
public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printWeak(String s) {
        banner.showWithParen(s);
    }

    @Override
    public void printStrong(String s) {
        banner.showWithAster(s);
    }
}
