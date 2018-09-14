package com.aillen.spidemo.drawtext

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
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

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }
}