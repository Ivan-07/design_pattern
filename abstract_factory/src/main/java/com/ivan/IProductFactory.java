package com.ivan;

/**
 * @author maohao
 */
public interface IProductFactory {
    IPhoneProduct phoneProduct();

    IRouterProduct routerProduct();
}
