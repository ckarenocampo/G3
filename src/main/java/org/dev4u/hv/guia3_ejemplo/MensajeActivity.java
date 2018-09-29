package org.dev4u.hv.guia3_ejemplo;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MensajeActivity extends AppCompatActivity {

    private AdaptadorMensaje adaptadorMensaje;
    private Button btnEnviar;
    private ArrayList<Mensaje> mensajeArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje2);


        btnEnviar  = findViewById(R.id.btnEnviar);
        mensajeArrayList = new ArrayList<>();
        //Inicializando el adaptador
        adaptadorMensaje = new AdaptadorContacto(MensajeActivity.this,  mensajeArrayList);
        //Inicializando el listView
        ListView listView = (ListView) findViewById(R.id.lstMensaje);
        //seteando el adaptador al listview

        listView.setAdapter(adaptadorMensaje);


    }
}
