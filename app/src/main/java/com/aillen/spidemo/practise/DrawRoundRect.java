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
public class DrawRoundRect extends View {

    private Paint mPaint;

    public DrawRoundRect(Context context) {
        super(context);
        init();
    }


    public DrawRoundRect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DrawRoundRect(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(4);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(100,100,400,400,50,50,mPaint);
        canvas.drawRoundRect(500,500,800,800,100,50,mPaint);
    }
}
