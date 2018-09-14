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
public class DrawLine extends View {

    private Paint mPaint;

    public DrawLine(Context context) {
        super(context);
    }

    public DrawLine(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DrawLine(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(10);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(100,100,500,100,mPaint);
        float[] lines = {100,200,400,200,100,500,400,500};
        canvas.drawLines(lines,0,lines.length,mPaint);
        canvas.drawLine(400,200,100,500,mPaint);
    }
}
