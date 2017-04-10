package com.example.administrator.dukailin0410;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/4/10 0010.
 */

public class MyView extends View {

    private int resourceId;
    private int resourceId1;
    private int anInt;
    private Paint paint;
    private Button list;

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initattrs(attrs);
    }


    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initattrs(attrs);
    }

    @Override
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        paint = new Paint();
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        canvas.drawCircle(350,250,200, paint);
      /*  list.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                paint.setColor(Color.BLUE);
                canvas.drawCircle(350,250,200,paint);
            }
        });*/
    }




    private void initattrs(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.MyView);
        anInt = typedArray.getInt(R.styleable.MyView_btkuan, 10);
        resourceId = typedArray.getResourceId(R.styleable.MyView_btcolor, 1);
        resourceId1 = typedArray.getResourceId(R.styleable.MyView_btjincolor, 1);


    }

    public void setList(Button list) {
        this.list = list;
    }
}
