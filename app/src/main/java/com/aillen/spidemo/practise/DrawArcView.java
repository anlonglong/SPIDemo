package com.aillen.spidemo.practise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author anlonglong on 2018/8/14.
 * Email： 940752944@qq.com
 */
public class DrawArcView extends View {

    private Paint mPaint;

    public DrawArcView(Context context) {
        this(context,null);
    }

    public DrawArcView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStrokeWidth(4);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(100,100,500,400,-135,135,true,mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(100,600,500,1000,-135,135,false,mPaint);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(100,1200,500,1600,-135,135,false,mPaint);
    }
}
