package com.proxy.factory;

import com.proxy.service.UsbSell;

//目标类：金士顿厂家，不接受用户的单独购买
public class UsbKingFactory implements UsbSell {
    @Override
    public float sess(int amount) {
        //一个128G的U盘是 85元
        //后期根据amount, 可以实现不同的价格，例如买10000个，单价是80， 50000个75
        return 85.0f;
    }
}
