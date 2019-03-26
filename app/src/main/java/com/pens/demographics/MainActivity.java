package com.pens.demographics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ourView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        draw();

        setContentView(ourView);

    }

    private void draw() {
        // Declare an object of type Bitmap
        Bitmap blankBitmap;
        // Make it 600 x 600 pixels in size and an appropriate format
        blankBitmap = Bitmap.createBitmap(600,600,Bitmap.Config.ARGB_8888);
        // Declare an object of type canvas
        Canvas canvas;
        // Initialize it by making its surface our previously created blank bitmap
        canvas = new Canvas(blankBitmap);

        // Initialize our previously declared member object of type ImageView
        ourView = new ImageView(this);
        // Put our blank bitmap on ourView
        ourView.setImageBitmap(blankBitmap);

        // We now have a surface ready to draw on
        // But we need something to draw with

        // Declare an object of type Paint
        Paint paint;
        // Initialize it ready for painting our canvas
        paint = new Paint();

        // Make the canvas white

        canvas.drawColor(Color.argb(255, 255, 255, 255));

        // Make the brush blue
        paint.setColor(Color.argb(255,  26, 128, 182));
        // We can change this around as well

        // Declare an object of type Bitmap
        Bitmap bitmapBob;
        // Initialize it using the bob.png file
        bitmapBob = BitmapFactory.decodeResource(this.getResources(), R.drawable.bob);
        // Now draw bob to our canvas
        canvas.drawBitmap(bitmapBob, 500, 50, paint);

// Draw a line
        canvas.drawLine(50,50,250,250,paint);

        // Draw some text
        canvas.drawText("Game Code School", 50, 50, paint);

        // Draw a pixel
        canvas.drawPoint(40,50,paint);

        // Draw a circle
        canvas.drawCircle(350,250,100,paint);

        // Change the brush color
        paint.setColor(Color.argb(255,  249, 129, 0));

        // Draw a rectangle
        canvas.drawRect(50,450,500,550,paint);

    }
}
