package com.giou.customviewtest;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Description:
 * Author:Giousa
 * Date:2016/12/9
 * Email:65489469@qq.com
 */
public class CustomView extends View {

    private int mBorderColor;
    private float mBorderWidth;
    private Paint mPaint;

    public CustomView(Context context) {
        this(context,null);
        //ssssssssssssssssssss

        //rrrrrrrrrrrrrrrrrrr
    }

    public CustomView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
        //sssssssssssssssssssssss

        //eeeeeeeeeeeeeeeeeeeeeeeee

    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0);
        mBorderColor = typedArray.getColor(R.styleable.CustomView_border_color, 0xff000000);
        mBorderWidth = typedArray.getDimension(R.styleable.CustomView_border_width, 2);
        typedArray.recycle();
        mPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rect = new RectF(0, 0, 200, 200);
        canvas.drawArc(rect,0,90,false,mPaint);
    }
}
