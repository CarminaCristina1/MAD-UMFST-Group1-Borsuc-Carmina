package com.example.lab4_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button chapter1Button, chapter2Button, chapter3Button, chapter4Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to the buttons
        chapter1Button = findViewById(R.id.chapter1Button);
        chapter2Button = findViewById(R.id.chapter2Button);
        chapter3Button = findViewById(R.id.chapter3Button);
        chapter4Button = findViewById(R.id.chapter4Button);

        // Set click listeners for the buttons
        chapter1Button.setOnClickListener(this);
        chapter2Button.setOnClickListener(this);
        chapter3Button.setOnClickListener(this);
        chapter4Button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Start the appropriate chapter activity based on the button clicked
        switch (v.getId()) {
            case R.id.chapter1Button:
                Intent chapter1Intent = new Intent(MainActivity.this, Chapter1Activity.class);
                startActivity(chapter1Intent);
                break;
            case R.id.chapter2Button:
                Intent chapter2Intent = new Intent(MainActivity.this, Chapter2Activity.class);
                startActivity(chapter2Intent);
                break;
            case R.id.chapter3Button:
                Intent chapter3Intent = new Intent(MainActivity.this, Chapter3Activity.class);
                startActivity(chapter3Intent);
                break;
            case R.id.chapter4Button:
                Intent chapter4Intent = new Intent(MainActivity.this, Chapter4Activity.class);
                startActivity(chapter4Intent);
                break;
        }
    }
}