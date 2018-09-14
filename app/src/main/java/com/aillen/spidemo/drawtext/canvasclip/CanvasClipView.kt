package com.aillen.spidemo.drawtext.canvasclip

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import com.aillen.spidemo.R

/**
 * @author  anlonglong on 2018/9/14.
 * Email： 940752944@qq.com
 */
class CanvasClipView(ctx: Context) : View(ctx) {
    constructor(ctx: Context, attr: AttributeSet):this(ctx)
    constructor(ctx: Context, attr: AttributeSet, defStyleAttr: Int): this(ctx, attr)


    private val paint = Paint()
    val rect = RectF(100F, 200F, 300F, 500F)
    val bitmap = BitmapFactory.decodeResource(resources, R.drawable.ic_launcher)
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        paint.isAntiAlias = true

        canvas.clipRect(rect.left, rect.top, rect.right, rect.bottom, Region.Op.DIFFERENCE)
        paint.color = Color.RED
        canvas.drawBitmap(bitmap, 10F,50F,paint )


        canvas.save()
        paint.color = Color.RED
        canvas.drawBitmap(bitmap, 10F,500F,paint )
        canvas.rotate(-45F)
        canvas.drawBitmap(bitmap, 10F,500F,paint )
        canvas.restore()



        canvas.save()
        canvas.translate(100F, 1000F)
        canvas.drawBitmap(bitmap, 0F, 0F, paint)
        canvas.restore()
        canvas.drawLine(10F,10F, 100F, 10F,paint)



    }
}
