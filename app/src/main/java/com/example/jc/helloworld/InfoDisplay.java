package com.example.jc.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class InfoDisplay extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.jc.helloworld";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_display);
setTitle("Sensores");
        int bpm = 0;
        float temp = 0;

        final TextView textoBPM = findViewById(R.id.textoBPM);
        final TextView textoTemp = findViewById(R.id.textoTemp);
        ImageButton bEstadoPaciente = findViewById(R.id.botonEstadoPaciente);
        ImageButton bTempPaciente = findViewById(R.id.botonTempPaciente);
        ImageButton bMapa = findViewById(R.id.botonMapa);
        ImageButton bBPM = findViewById(R.id.botonBPM);
        Button bllamarDron = findViewById(R.id.botonLlamaDron);

        textoBPM.setText(bpm + "BPM");
        textoTemp.setText(temp + "°C");

        bBPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoDisplay.this, Paciente.class);
                startActivity(intent);
            }
        });

        bTempPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoDisplay.this, Paciente.class);
                startActivity(intent);
            }
        });

        bEstadoPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoDisplay.this, Paciente.class);
                startActivity(intent);
            }
        });

        bllamarDron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent change = new Intent(InfoDisplay.this, ConfirmacionDron.class);
                startActivity(change);
            }
        });
}


}
