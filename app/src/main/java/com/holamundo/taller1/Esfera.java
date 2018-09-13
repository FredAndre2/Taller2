package com.holamundo.taller1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Esfera extends AppCompatActivity {
    private TextView txtdescripcion;
    private EditText txtradio,txtresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        txtradio = findViewById(R.id.Txt_Radio_Esfera);
        txtresultado = findViewById(R.id.Txt_Volumen_Esfera);
        txtdescripcion = findViewById(R.id.Txt_Descripcion_Esfera);

    }
    public void guardar(View v){
        String descripcion,dato;
        double res;
        double radio;

        descripcion = txtdescripcion.getText().toString();
        radio = Double.parseDouble(txtradio.getText().toString());
        res = Metodos.volumenEsfera(radio);

        txtresultado.setText(""+res);

        dato = "Valor del radio: "+ txtradio.getText().toString();
        Operacion o = new Operacion(descripcion,dato,res);
        o.guardar();

    }

    public void limpiar(View v){
        borrar();
    }

    private void borrar(){
        txtresultado.setText("");
        txtradio.setText("");
    }
}
