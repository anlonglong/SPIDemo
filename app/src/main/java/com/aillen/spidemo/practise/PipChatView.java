package com.aillen.spidemo.practise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author anlonglong on 2018/8/15.
 * Email： 940752944@qq.com
 */
public class PipChatView extends View {

    private Paint mPaint;
    private Path mPath;

    public PipChatView(Context context) {
        this(context,null);
    }

    public PipChatView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public PipChatView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(5);
        mPath = new Path();
        mPath.moveTo(100,100);
        mPath.lineTo(100,700);
        mPath.lineTo(1000,700);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(mPath,mPaint);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(2);
        canvas.drawRect(200,300,300,700,mPaint);
        mPaint.setColor(Color.YELLOW);
        canvas.drawRect(400,400,500,700,mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(600,200,700,700,mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(800,500,900,700,mPaint);
    }
}
