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
public class DrawPointView extends View {

    private Paint mPaint;

    public DrawPointView(Context context) {
        this(context,null);
    }

    public DrawPointView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
        canvas.drawPoint(100,200,mPaint);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(200,300,mPaint);
        mPaint.setStrokeWidth(20);
        float[] points = {100,400,200,400,100,500,200,500};
        canvas.drawPoints(points,0,8,mPaint);
    }
}
