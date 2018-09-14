package com.aillen.spidemo.paintpractise.demo;

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
public class Practice01LinearGradientView extends View {

    private Paint mPaint;
    private LinearGradient mRlinearGradient;
    private LinearGradient mMilinearGradient;
    private LinearGradient mLinearGradient;

    public Practice01LinearGradientView(Context context) {
        super(context);
    }

    public Practice01LinearGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mPaint = new Paint();
        // Shader.TileMode.CLAMP模式下，x0,y0和x1,y1之间的差值越大效果越明显
        mLinearGradient = new LinearGradient(100, 100, 700, 700, 0xffff0000, 0xff0000ff, Shader.TileMode.CLAMP);
        // Shader.TileMode.REPEAT模式下，x0,y0和x1,y1之间的差值越小效果越明显
        mRlinearGradient = new LinearGradient(100, 100, 150, 150, 0xffff0000, 0xff0000ff, Shader.TileMode.REPEAT);
        //
        mMilinearGradient = new LinearGradient(100, 100, 200, 200, 0xffff0000, 0xff0000ff, Shader.TileMode.MIRROR);

    }

    public Practice01LinearGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setShader(mLinearGradient);
        canvas.drawCircle(400,400,200,mPaint);
        mPaint.setShader(mRlinearGradient);
        canvas.drawCircle(400,800,200,mPaint);
        mPaint.setShader(mMilinearGradient);
        canvas.drawCircle(400,1200,200,mPaint);

    }

}
