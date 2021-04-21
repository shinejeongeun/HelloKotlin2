package com.example.copassappwbtn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CompassView extends View {
    public int azimuth;
    Bitmap bitmp;

    public CompassView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        bitmp = BitmapFactory.decodeResource(getResources(), R.drawable.compass);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int cx = getWidth()/2;
        int cy = getHeight()/2;

        int x0 = cx - bitmp.getWidth()/2;
        int y0 = cy - bitmp.getHeight()/2;

        canvas.rotate(-azimuth, cx, cy);
        canvas.drawBitmap(bitmp, x0, y0, null );

    }
}