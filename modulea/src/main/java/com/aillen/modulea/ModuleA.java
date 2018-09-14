package com.aillen.modulea;

import com.aillen.aninterface.SayHello;

/**
 * Created by anlonglong on 2018/7/9.
 * Email： 940752944@qq.com
 */
public class ModuleA implements SayHello {

    @Override
    public String sayHello() {
        return "hello i'm from moduleA";
    }
}
