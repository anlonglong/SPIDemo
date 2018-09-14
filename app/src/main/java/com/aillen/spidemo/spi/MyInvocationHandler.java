package com.aillen.spidemo.spi;

import com.aillen.spidemo.spi.IRun;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by anlonglong on 2018/7/10.
 * Email： 940752944@qq.com
 */
public class MyInvocationHandler implements InvocationHandler {

    private IRun mIRun;

    public MyInvocationHandler(IRun IRun) {
        mIRun = IRun;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("" +
                "==========" +
                "==========");
        return method.invoke(mIRun,args);
    }
}
