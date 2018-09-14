package com.aillen.spidemo.gradient;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.aillen.spidemo.R;

/**
 * @author anlonglong on 2018/8/16.
 * Email： 940752944@qq.com
 */
public class XfermodView extends View {

    private Paint mPaint;
    private Bitmap mBitmap;

    public XfermodView(Context context) {
        super(context);
    }

    public XfermodView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mBitmap = Bitmap.createBitmap(200, 200, Bitmap.Config.RGB_565);
        mBitmap.eraseColor(Color.BLUE);
    }

    public XfermodView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(mBitmap,200,200,mPaint);
        mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.malin);
        //canvas.drawCircle(200,200,mPaint);
    }
}
