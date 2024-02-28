package com.example.proiectandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayMessage("Button Clicked!");
            }
        });
    }

    private void displayMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Button button = findViewById(R.id.button);
        button.setText("mesaj schimbat");
    }

}
