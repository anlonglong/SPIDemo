package com.aillen.spidemo.drawtext

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

/**
 * @author  anlonglong on 2018/9/14.
 * Email： 940752944@qq.com
 */
class MeasureTextSizePracticeView(ctx: Context): View(ctx) {
    constructor(ctx: Context, attr: AttributeSet):this(ctx)
    constructor(ctx: Context, attr: AttributeSet, defStyleAttr: Int): this(ctx, attr)
    private val paint = Paint()

    init {

    }


    /**
     * @link(https://hencoder.com/ui-1-3/)
     * 只是点讲解
     */
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        paint.textSize = 50F
        paint.strokeWidth = 2F
        paint.color = Color.RED
        canvas.drawText("hello world 1", 100F, 150F, paint)
        canvas.drawLine(100F,150F, 400F, 150F, paint)
        canvas.drawText("hello world 2", 100F, 150F + paint.fontSpacing, paint)
        canvas.drawLine(100F,150F + paint.fontSpacing, 400F, 150F + paint.fontSpacing, paint)
        /**
         * FontMetrics 和 getFontSpacing()：
         * 从定义可以看出，上图中两行文字的 font spacing (即相邻两行的 baseline 的距离)
         * 可以通过  bottom - top + leading (top 的值为负，前面刚说过，记得吧？）来计算得出。
         * 但你真的运行一下会发现， bottom - top + leading 的结果是要大于 getFontSpacing() 的返回值的。
         * 两个方法计算得出的 font spacing 竟然不一样？
         * 这并不是 bug，而是因为 getFontSpacing() 的结果并不是通过 FontMetrics 的标准值计算出来的，
         * 而是另外计算出来的一个值，它能够做到在两行文字不显得拥挤的前提下缩短行距，以此来得到更好的显示效果。
         * 所以如果你要对文字手动换行绘制，多数时候应该选取 getFontSpacing() 来得到行距，不但使用更简单
         * ，显示效果也会更好
         */
        val space = paint.fontMetrics.bottom - paint.fontMetrics.top + paint.fontMetrics.leading
        println("calc space = $space")
        println("fontSpace = ${paint.fontSpacing}")

        //2.2.3 getTextBounds(String text, int start, int end, Rect bounds)
        val text = "我是要测量边界的文字"

        canvas.translate(100F, 300F)
        paint.style = Paint.Style.FILL
        canvas.drawText(text,10F, 10F, paint)
        val bounds =  Rect()
        paint.getTextBounds(text, 0, text.length , bounds)
        bounds.left += 10
        bounds.top += 10
        bounds.right += 10
        bounds.bottom += 10
        paint.style = Paint.Style.STROKE
        canvas.drawRect(bounds,paint)

        //2.2.4 float measureText(String text)
        canvas.translate(0F, 100F)
        paint.style = Paint.Style.FILL
        canvas.drawText("是是这文字",10F, 10F, paint)
        val textWidth = paint.measureText("是是这文字")
        paint.strokeWidth = 5F
        canvas.drawLine(10F, 10F, 10F + textWidth, 10F, paint)

        canvas.translate(0F, 100F)
        val desc = "你的历史记录是4.5公里"
        paint.color = Color.BLACK
        canvas.drawLine(-100F, 0F, 1080F, 0F, paint)

        //画笔的粗细不一样，测量出来的文字的宽也是不一样的，
        // [比如粗细是100，paint.textSize = 100F 与 粗细是50 paint.textSize = 50F 的画笔，他们测量出的宽大小是不一样的，画笔越粗，文字宽越大]
        val descWidth = paint.measureText("你的历史记录是")
        canvas.drawText("你的历史记录是",0, "你的历史记录是".length, 10F, 100F, paint)
        paint.color = Color.RED
        paint.textSize = 100F
        canvas.drawText("4.5",0, "4.5".length, 10F + descWidth, 100F, paint)
        paint.color = Color.BLACK
        //因为4.5绘制的比较大，所以要在改变画笔粗细之前测量4.5的宽，如果在改变画笔粗细之后再测的话，绘制的文字连不在一起。
        //因为 50 < 100 ，如果把下面两行代码的书序调换一下，绘制文字可能会重叠
        val numWidth = paint.measureText("4.5")
        paint.textSize = 50F
        canvas.drawText("公里",0, "公里".length, 10F + descWidth + numWidth, 100F, paint)

        test(canvas)
    }

    private fun test(canvas: Canvas) {
        val descWidth = paint.measureText("你的历史记录是")
        canvas.drawText("你的历史记录是",0, "你的历史记录是".length, 10F, 200F, paint)
        paint.color = Color.RED
        paint.textSize = 100F
        canvas.drawText("4.5",0, "4.5".length, 10F + descWidth, 200F, paint)
        paint.color = Color.BLACK
        //因为4.5绘制的比较大，所以要在改变画笔粗细之前测量4.5的宽，如果在改变画笔粗细之后再测的话，绘制的文字连不在一起。
        //因为 50 < 100 ，如果把下面两行代码的书序调换一下，绘制文字可能会重叠
        paint.textSize = 50F
        val numWidth = paint.measureText("4.5")
        canvas.drawText("公里",0, "公里".length, 10F + descWidth + numWidth, 200F, paint)

    }
}