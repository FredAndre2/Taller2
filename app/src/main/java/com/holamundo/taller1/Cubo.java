package com.holamundo.taller1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cubo extends AppCompatActivity {
    private TextView txtdescripcion;
    private EditText txtarista,txtresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        txtarista = findViewById(R.id.Txt_Valor_Arista_Cubo);
        txtresultado = findViewById(R.id.Txt_Volumen_Cubo);
        txtdescripcion = findViewById(R.id.Txt_Descripcion_Cubo);
    }
    public void guardar(View v){
        String descripcion,dato;
        double res;
        double arista;

        descripcion = txtdescripcion.getText().toString();
        arista = Double.parseDouble(txtarista.getText().toString());
        res = Metodos.volumenCubo(arista);

        txtresultado.setText(""+res);

        dato = "Valor de la arista: "+ txtarista.getText().toString();
        Operacion o = new Operacion(descripcion,dato,res);
        o.guardar();

    }

    public void limpiar(View v){
        borrar();
    }

    private void borrar(){
        txtresultado.setText("");
        txtarista.setText("");
    }
}
