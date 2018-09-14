package com.aillen.spidemo.practise;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.aillen.spidemo.R;

/**
 * @author anlonglong on 2018/8/14.
 * Email： 940752944@qq.com
 */
public class ColorView extends View {

    private int mDrawColor;

    public ColorView(Context context) {
        this(context,null);
    }

    public ColorView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public ColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.ColorView);
        mDrawColor = typedArray.getColor(R.styleable.ColorView_draw_color, Color.YELLOW);
        typedArray.recycle();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(mDrawColor);
    }

}
