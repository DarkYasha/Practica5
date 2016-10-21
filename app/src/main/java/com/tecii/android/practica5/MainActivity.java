package com.tecii.android.practica5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText txtCelsius;
    public TextView txtFarenheit, txtKelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCelsius = (EditText)findViewById(R.id.txtCelsius);
        txtFarenheit = (EditText)findViewById(R.id.txtFarenheit);
        txtKelvin = (EditText)findViewById(R.id.txtKelvin);
    }
    public void convertir (View view){
        float far;
        far = (1.8f) * Float.parseFloat(txtCelsius.getText().toString()) + 32;
        float kel;
        kel = Float.parseFloat(txtCelsius.getText().toString()) + 273;
        txtFarenheit.setText("los grados farenheit son: " + far);
        txtKelvin.setText("los kelvin son: " + kel);
    }
}
