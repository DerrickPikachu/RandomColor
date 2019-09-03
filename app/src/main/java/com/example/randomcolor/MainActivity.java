package com.example.randomcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView red;
    private TextView green;
    private TextView blue;
    private Button changeBtn;
    View colorBlock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = findViewById(R.id.txvR);
        green = findViewById(R.id.txvG);
        blue = findViewById(R.id.txvB);
        colorBlock = findViewById(R.id.colorBlock);
        changeBtn = findViewById(R.id.changeBtn);
    }

    public void colorChange(View v) {
        Random rand = new  Random();

        int redValue = rand.nextInt(256);
        red.setText("RED : " + redValue);
        red.setTextColor(Color.rgb(redValue, 0, 0));

        int greenValue = rand.nextInt(256);
        green.setText("GREEN : " + greenValue);
        green.setTextColor(Color.rgb(0, greenValue, 0));

        int blueValue = rand.nextInt(256);
        blue.setText("BLUE : " + blueValue);
        blue.setTextColor(Color.rgb(0, 0, blueValue));

        colorBlock.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
        changeBtn.setTextColor(Color.rgb(redValue, greenValue, blueValue));
    }
}
