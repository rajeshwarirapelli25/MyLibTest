package com.example.statlib;

import android.content.Context;
import android.widget.Toast;

public abstract class DisplayText {

    public void displayText(Context context) {
        Toast.makeText(context, "Hello World", Toast.LENGTH_SHORT).show();
    }

    public void displayText(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public double areaCircle(int r) {
        return 3.14 * r * r;
    }
}
