package com.aillen.spidemo.drawtext

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint


/**
 * @author  anlonglong on 2018/9/13.
 * Email： 940752944@qq.com
 */
class CustomeDrawText(ctx: Context): View(ctx) {

    private val paint = Paint()
    private val path = Path()
    private val textPaint = TextPaint()
    private var text1 = "Lorem Ipsum is simply dummy\n" +
            "text of the printing and\n " +
            "typesetting industry."
    private var staticLayout1 = StaticLayout(text1, textPaint, 300,
            Layout.Alignment.ALIGN_NORMAL, 3f, 0f, true)
    private var text2 = "a\nbc\ndefghi\njklm\nnopqrst\nuvwx\nyz"
    private var staticLayout2 = StaticLayout(text2, textPaint, 300,
            Layout.Alignment.ALIGN_NORMAL, 3f, 0f, true)

    init {
        paint.isAntiAlias = true
        paint.style = Paint.Style.STROKE
        paint.textSize = 50F
        println("font space = ${textPaint.fontSpacing} ")
    }

    constructor(ctx: Context, attr: AttributeSet):this(ctx)
    constructor(ctx: Context, attr: AttributeSet, defStyleAttr: Int): this(ctx, attr)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        paint.strokeWidth = 5F
        paint.color = Color.RED
        canvas.drawText("Hello world gg f", 200F, 100F, paint)
        paint.color = Color.BLACK
        canvas.drawLine(200F, 100F, 600F, 100F, paint)
        paint.color = Color.DKGRAY
        canvas.drawLine(200F, 100F, 200F, 50F, paint)

        path.moveTo(200F, 300F)
        path.lineTo(400F, 500F)
        path.lineTo(700F, 300F)
        canvas.drawPath(path, paint)
        paint.strokeCap = Paint.Cap.ROUND
        canvas.drawTextOnPath("Hello world gg f", path, 0f, 0f, paint)

         canvas.save()
        textPaint.color = Color.RED
        textPaint.textSize = 50F
        textPaint.fontFeatureSettings = "PKRN"
        canvas.translate(100F, 800F)
        staticLayout1.draw(canvas)
        canvas.translate(10F, 200F)
        staticLayout2.draw(canvas)
        canvas.restore()
    }
}