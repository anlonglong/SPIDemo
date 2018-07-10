package com.aillen.spidemo;

/**
 * Created by anlonglong on 2018/7/10.
 * Email： 940752944@qq.com
 */
public class MyRun implements IRun {
    @Override
    public void run(String kind) {
        System.out.println("kind = [" + kind + "]");
    }
}
