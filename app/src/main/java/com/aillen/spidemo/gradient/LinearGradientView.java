package com.aillen.spidemo.gradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author anlonglong on 2018/8/16.
 * Email： 940752944@qq.com
 */
public class LinearGradientView extends View {

    private Paint mPaint;
    private LinearGradient mMirrirlLinearGradient;
    private LinearGradient mRepeatLinearGradient;

    public LinearGradientView(Context context) {
        super(context);
    }

    public LinearGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        LinearGradient linearGradient = new LinearGradient(100, 100, 600, 800, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);
        mPaint.setShader(linearGradient);
        mMirrirlLinearGradient = new LinearGradient(100, 100, 600, 800, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.MIRROR);

        mRepeatLinearGradient = new LinearGradient(100, 100, 600, 800, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.REPEAT);
    }

    public LinearGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(400,400,200,mPaint);

        mPaint.setShader(mMirrirlLinearGradient);

        canvas.drawCircle(400,900,200,mPaint);

        mPaint.setShader(mRepeatLinearGradient);

        canvas.drawCircle(400,1400,200,mPaint);
    }
}
