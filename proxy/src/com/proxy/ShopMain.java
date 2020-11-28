package com.proxy;

import com.proxy.shangjia.TaoBao;
import com.proxy.shangjia.WeiShang;

public class ShopMain {

    public static void main(String[] args) {
        //创建代理的商家taobao对象
//        TaoBao taoBao = new TaoBao();
//        float price = taoBao.sess(1);
//        System.out.println("通过淘宝的商家，购买U盘单价：" + price);


        WeiShang weiShang = new WeiShang();
        float price = weiShang.sess(1);
        System.out.println("通过微商的商家，购买U盘单价：" + price);
    }

}
