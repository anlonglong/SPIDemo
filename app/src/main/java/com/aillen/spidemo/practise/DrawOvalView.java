package com.aillen.spidemo.practise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author anlonglong on 2018/8/14.
 * Email： 940752944@qq.com
 */
public class DrawOvalView extends View {

    private Paint mPaint;

    public DrawOvalView(Context context) {
        this(context,null);
    }

    public DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(5);
        mPaint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(100,100,500,300,mPaint);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawOval(100,700,500,900,mPaint);
    }
}
