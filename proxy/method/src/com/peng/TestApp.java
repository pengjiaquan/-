package com.peng;

import com.peng.service.HelloService;
import com.peng.service.serviceimpl.HelloServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestApp {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        HelloServiceImpl service = new HelloServiceImpl();
//        service.sayHello("张三");

        //使用反射机制执行sayHello方法。 核心Method(类中的方法)
        HelloService target = new HelloServiceImpl();
        //获取sayHello名称对于的Method类对象
        Method method = HelloService.class.getMethod("sayHello", String.class);
        //通过Method可以执行sayhHello方法调用
        /*
            invoke是Method类中的一个方法。表示执行方法的调用
            参数：
                1.Object, 表示对象的，要执行这个对象的方法
                2.Object... args, 方法执行时的参数值
                返回值：
                    Object:方法执行后的返回值
         */
        //表达的意思就是 执行target对象的sayHello, 参数是李四
        Object ret = method.invoke(target, "李四");

    }

}
