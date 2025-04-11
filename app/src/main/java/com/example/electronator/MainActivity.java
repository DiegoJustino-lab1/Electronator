package com.example.electronator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inflate the layout.xml
                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                View layoutView = inflater.inflate(R.layout.layout, null);

                // Set the inflated view as the content view
                setContentView(layoutView);
            }
        });
    }
}