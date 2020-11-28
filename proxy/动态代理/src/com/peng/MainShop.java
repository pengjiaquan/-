package com.peng;

import com.peng.factory.UsbKingFactory;
import com.peng.handler.MySellHandler;
import com.peng.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {

    public static void main(String[] args) {
        //创建代理对象，使用Proxy
        //1.创建目标对象
        //UsbKingFactory factory = new UsbKingFactory();
        UsbSell factory = new UsbKingFactory();
        //2.创建InvacationHandler对象
        InvocationHandler handler = new MySellHandler(factory);

        //3.创建代理对象
        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler);

        //通过代理执行方法
        float price = proxy.sess(1);
        System.out.println("通过动态代理对象，调用方法：" + price);


    }

}
