package com.example.singlediceroller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button roll;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll = findViewById(R.id.button);
        result = findViewById(R.id.textView);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int resultView = random.nextInt(6)+ 1;

                result.setText(String.valueOf(resultView));
            }
        });
    }
}