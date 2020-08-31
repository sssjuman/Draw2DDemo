package com.example.draw2ddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private My2DView my2DView;
    private int offset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my2DView = (My2DView) findViewById(R.id.my2dView);

    }

    public void onOffset(View v) {
        if (my2DView != null) {
            offset += 10;
            my2DView.setOffset(offset);
            my2DView.invalidate();   //呼叫View.invalidate()重繪元件
        }
    }
}