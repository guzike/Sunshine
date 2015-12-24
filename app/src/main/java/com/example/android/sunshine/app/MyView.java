package com.example.android.sunshine.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Eugene on 26.11.2015.
 */
public class MyView extends View {
    public MyView(Context context){
        super(context);
    }
    public MyView(Context context, AttributeSet attrs, int defaultStyle){
        super(context, attrs, defaultStyle);
    }
    @Override
    protected void onMeasure(int wMeasureSpec, int hMeasureSpec){
    }
}
