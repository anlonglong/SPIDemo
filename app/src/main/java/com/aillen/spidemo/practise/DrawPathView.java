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
 * @author anlonglong on 2018/8/14.
 * Email： 940752944@qq.com
 */
public class DrawPathView extends View {

    private Path mPath;
    private Paint mPaint;
    private Paint mPaint1;

    public DrawPathView(Context context) {
        this(context,null);
    }

    public DrawPathView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPath = new Path();
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.STROKE);
        mPath.addArc(200, 200, 400, 400, -225, 225);
        mPath.arcTo(400, 200, 600, 400, -180, 225, false);
        mPath.lineTo(400, 542);
        mPath.close();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(mPath,mPaint);
        mPath.moveTo(200,800);
        mPath.arcTo(200,800,400,1000,-225,225,true);
        //mPath.lineTo(500,900);
        mPath.arcTo(400,800,600,1000,-180, 225,false);
        mPath.lineTo(400,1200);
        mPaint1.setStyle(Paint.Style.FILL);
        mPaint1.setColor(Color.RED);
        canvas.drawPath(mPath,mPaint1);

    }
}
