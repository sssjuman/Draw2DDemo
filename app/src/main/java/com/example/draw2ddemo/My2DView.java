package com.example.draw2ddemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class My2DView extends View {
    private Paint paint = new Paint();
    private int offset = 0; //向右偏移量(像素)


    //此建構式為方便使用程式碼動態新增
    public My2DView(Context context) {
        super(context);
    }


    //以layout檔建立自行定義的My2DView元件會自動呼叫此建構式
    //在layout檔使用的屬性會傳給attrs參數
    public My2DView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }


    //系統要呈現View時會自動呼叫
    @Override
    protected void onDraw(Canvas canvas) {

        //畫線
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(10); //設定線的粗細
        canvas.drawLine(10 + offset, 10, 210 + offset, 10, paint);

        //畫圓
        paint.setColor(Color.GRAY);
        canvas.drawCircle(110 + offset, 140, 100, paint);

        //畫方
        paint.setColor(Color.BLUE);
        canvas.drawRect(10 + offset, 260, 210 + offset, 460, paint);

    }
}
