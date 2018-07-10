package com.aillen.spidemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aillen.aninterface.SayHello
import java.lang.reflect.Proxy
import java.util.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn).setOnClickListener { loadModule() }
        proxy()
    }


    //动态代理
    private fun proxy() {
        val myRun = MyRun()
        val myInvocationHandler = MyInvocationHandler(myRun)
        val newProxyInstance = Proxy.newProxyInstance(MyRun::class.java.classLoader, MyRun::class.java.interfaces, myInvocationHandler) as IRun
        newProxyInstance.run("hello world ------------------------")
    }

    private fun loadModule() {
        for (sayHello in ServiceLoader.load(SayHello::class.java)) {
            println(sayHello.sayHello())
        }
    }
}
