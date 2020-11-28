package com.proxy.shangjia;

import com.proxy.factory.UsbKingFactory;
import com.proxy.service.UsbSell;

//淘宝是一个商家，代理金士顿U盘的销售
public class TaoBao implements UsbSell {

    //声明 商家代理的厂家具体是谁
    private UsbKingFactory factory = new UsbKingFactory();

    @Override
    //实现销售U盘功能
    public float sess(int amount) {

        //向厂家发送订单，告诉厂家，我买了U盘，厂家发货
        float price = factory.sess(amount);//厂家的价格
        //商家需要加价， 也就是代理要增加价格。
        price = price + 25;//增强功能，代理类在完成目标类方法调用后，增强了功能
        //在目标类的方法调用后，你做的其他功能，都是增强的意思


        //增加的价格
        return price;
    }
}
