package com.example.checkboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb_Belleza, cb_LibrosYLiteratura,
            cb_Carreras, cb_Educacion, cb_Eventos,
            cb_Familia, cb_ComidaYBebida, cb_Videojuegos,
            cb_Deportes, cb_Arte;

    private TextView tvResult;

    private Button load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb_Belleza = (CheckBox) findViewById(R.id.cb_Belleza);
        cb_LibrosYLiteratura = (CheckBox) findViewById(R.id.cb_LibrosYLiteratura);
        cb_Carreras = (CheckBox) findViewById(R.id.cb_Carreras);
        cb_Educacion = (CheckBox) findViewById(R.id.cb_Educacion);
        cb_Eventos = (CheckBox) findViewById(R.id.cb_Eventos);
        cb_Familia = (CheckBox) findViewById(R.id.cb_Familia);
        cb_ComidaYBebida = (CheckBox) findViewById(R.id.cb_ComidaYBebida);
        cb_Videojuegos = (CheckBox) findViewById(R.id.cb_Videojuegos);
        cb_Deportes = (CheckBox) findViewById(R.id.cb_Deportes);
        cb_Arte = (CheckBox) findViewById(R.id.cb_Arte);
        tvResult = (TextView) findViewById(R.id.tvResult);
        load = (Button) findViewById(R.id.btnLoad);

    }


    public void showInterests(View v) {
        List<String> interests = new ArrayList<>();

        if (cb_Belleza.isChecked()) {
            interests.add(cb_Belleza.getText().toString());
        }
        if (cb_LibrosYLiteratura.isChecked()) {
            interests.add(cb_LibrosYLiteratura.getText().toString());
        }
        if (cb_Carreras.isChecked()) {
            interests.add(cb_Carreras.getText().toString());
        }
        if (cb_Educacion.isChecked()) {
            interests.add(cb_Educacion.getText().toString());
        }
        if (cb_Eventos.isChecked()) {
            interests.add(cb_Eventos.getText().toString());
        }
        if (cb_Familia.isChecked()) {
            interests.add(cb_Familia.getText().toString());
        }
        if (cb_ComidaYBebida.isChecked()) {
            interests.add(cb_ComidaYBebida.getText().toString());
        }
        if (cb_Videojuegos.isChecked()) {
            interests.add(cb_Videojuegos.getText().toString());
        }
        if (cb_Deportes.isChecked()) {
            interests.add(cb_Deportes.getText().toString());
        }
        if (cb_Arte.isChecked()) {
            interests.add(cb_Arte.getText().toString());
        }

        tvResult.setText("Tus intereses son: " + interests.toString());

    }
}