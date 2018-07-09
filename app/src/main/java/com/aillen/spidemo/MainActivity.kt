package com.aillen.spidemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aillen.aninterface.SayHello
import java.util.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn).setOnClickListener { loadModule() }
    }

    private fun loadModule() {
        for (sayHello in ServiceLoader.load(SayHello::class.java)) {
            println(sayHello.sayHello())
        }
    }
}
