package com.example.electronator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout); // Use o layout.xml que você criou

        // Botão para Resistores
        Button btnConferirResistores = findViewById(R.id.btnConferirResistores);
        btnConferirResistores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ResistorActivity.class);
                startActivity(intent);
            }
        });

        // Botão para Microcontroladores
        Button btnConferirMicrocontroladores = findViewById(R.id.btnConferirMicrocontroladores);
        btnConferirMicrocontroladores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MicrocontrollerActivity.class);
                startActivity(intent);
            }
        });

        // Botão para Sensores
        Button btnConferirSensores = findViewById(R.id.btnConferirSensores);
        btnConferirSensores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, SensorActivity.class);
                startActivity(intent);
            }
        });

        // Botão para Energia
        Button btnConferirEnergia = findViewById(R.id.btnConferirEnergia);
        btnConferirEnergia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, EnergyActivity.class);
                startActivity(intent);
            }
        });
    }
}