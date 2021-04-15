package com.example.getorientation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class AzimuthView extends View {
    public int azimuth;
    Bitmap bitmap;

    public AzimuthView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.compass);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int cx = getWidth()/2;
        int cy = getHeight()/2;

        int x0 = cx - bitmap.getWidth()/2;
        int y0 = cy - bitmap.getHeight()/2;

        canvas.rotate(-azimuth, getWidth()/2, getHeight()/2);

        canvas.drawBitmap(bitmap, x0, y0, null);
    }
}
