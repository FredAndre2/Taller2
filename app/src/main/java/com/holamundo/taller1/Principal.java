package com.holamundo.taller1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.content.res.Resources;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    private ListView lv;
    private String [] opc;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lv = findViewById(R.id.List_Opciones_Principal);
        opc = getResources().getStringArray(R.array.opciones_principal);



        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, opc);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(Principal.this, Areas.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Principal.this, Volumenes.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(Principal.this, Listar.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }

}