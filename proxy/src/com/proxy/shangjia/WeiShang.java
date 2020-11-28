package com.proxy.shangjia;

import com.proxy.factory.UsbKingFactory;
import com.proxy.service.UsbSell;

public class WeiShang implements UsbSell {

    //代理的是金士顿， 定义目标厂家类
    private UsbKingFactory factory = new UsbKingFactory();

    @Override
    public float sess(int amount) {
        //调用目标方法
        float price = factory.sess(amount);
        //只增加1元
        price = price + 1;

        return price;
    }
}
