package com.holamundo.taller1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cuadrado extends AppCompatActivity {
    private TextView txtdescripcion;
    private EditText txtlado,txtresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        txtlado = findViewById(R.id.Txt_Valor_Lado);
        txtresultado = findViewById(R.id.Txt_Resultado);
        txtdescripcion = findViewById(R.id.Txt_Descripcion);
    }
    public void guardar(View v){
        String descripcion,dato;
        double res;
        double lado;

        descripcion = txtdescripcion.getText().toString();
        lado = Double.parseDouble(txtlado.getText().toString());
        res = Metodos.areaCuadrado(lado);

        txtresultado.setText(""+res);

        dato = "Valor del lado: "+ txtlado.getText().toString();
        Operacion o = new Operacion(descripcion,dato,res);
        o.guardar();

    }

    public void limpiar(View v){
        borrar();
    }

    private void borrar(){
        txtresultado.setText("");
        txtlado.setText("");
    }
}
