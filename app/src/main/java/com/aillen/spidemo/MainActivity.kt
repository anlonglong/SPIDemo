package com.aillen.spidemo

import android.graphics.Bitmap
import android.graphics.Canvas
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.SparseIntArray
import android.view.View
import android.widget.Button
import com.aillen.aninterface.SayHello
import com.aillen.spidemo.customviewpage.ViewPagerDemoActivity
import com.aillen.spidemo.drawtext.DrawTextActivity
import com.aillen.spidemo.fileprovider.FileProviderActivity
import com.aillen.spidemo.paintpractise.PaintActivity
import com.aillen.spidemo.spi.IRun
import com.aillen.spidemo.spi.MyInvocationHandler
import com.aillen.spidemo.spi.MyRun
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Proxy
import java.util.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn).setOnClickListener {
            val propertyValue = getPropertyValue(this, "test.properties", "UserName")
            println("propertyValue = $propertyValue")
            FileProviderActivity.start(this)
        }
        proxy()
        val array = SparseIntArray()
        btn_viewPager_demo.setOnClickListener { ViewPagerDemoActivity.startActivity(this) }
        btn_custom.setOnClickListener { CustomActivity.startActivity(this) }
        btn_custom_paint.setOnClickListener { PaintActivity.startActivity(this) }
        btn_draw_text.setOnClickListener { DrawTextActivity.start(this) }
    }


    //动态代理
    private fun proxy() {
        val myRun = MyRun()
        val myInvocationHandler = MyInvocationHandler(myRun)
        System.getProperties()["sun.misc.ProxyGenerator.saveGeneratedFiles"] = "true"
        val newProxyInstance = Proxy.newProxyInstance(MyRun::class.java.classLoader, MyRun::class.java.interfaces, myInvocationHandler) as IRun
        newProxyInstance.run("hello world ------------------------")
    }

    private fun loadModule() {
        for (sayHello in ServiceLoader.load(SayHello::class.java)) {
            println(sayHello.sayHello())
        }
    }


    fun createScreenCapture(view: View, bgColor: Int, transparent: Boolean): Bitmap? {
        var bitmap: Bitmap? = null

        try {
            val config = if (transparent) Bitmap.Config.ARGB_4444 else Bitmap.Config.RGB_565
            bitmap = Bitmap.createBitmap(view.width, view.height, config)
            val canvas = Canvas(bitmap!!)

            if (bgColor != 0) {
                canvas.drawColor(bgColor)
            }

            view.isDrawingCacheEnabled = true
            view.draw(canvas)
            view.isDrawingCacheEnabled = false
        } catch (t: Throwable) {
            t.printStackTrace()
        }

        return bitmap
    }

}
