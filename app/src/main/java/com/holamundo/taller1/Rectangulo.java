package com.holamundo.taller1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangulo extends AppCompatActivity {
    private EditText txtBase, txtAltura,txtresultado;
    private TextView txtdescripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        txtBase = findViewById(R.id.Txt_Base);
        txtAltura = findViewById(R.id.Txt_Altura);
        txtresultado = findViewById(R.id.Txt_Resultado_Rectangulo);
        txtdescripcion = findViewById(R.id.Txt_Descripcion_Rectangulo);
    }
    public void calcular(View v){
        double base, altura, resultado;
        String dato,descripcion;

        descripcion = txtdescripcion.getText().toString();
            base = Double.parseDouble(txtBase.getText().toString());
            altura = Double.parseDouble(txtAltura.getText().toString());
            resultado = Metodos.areaRectangulo(base, altura);

            dato = "Valor de la base: "+ base +" Valor de la altura: "+altura;

        Operacion o = new Operacion(descripcion,dato,resultado);
        o.guardar();

            txtresultado.setText(""+resultado);


    }

    public void limpiar(View v){
        txtresultado.setText("");
        txtBase.setText("");
        txtAltura.setText("");
    }
}
