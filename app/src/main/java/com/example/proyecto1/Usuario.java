package com.example.proyecto1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);


        TextView usuarioNombre = findViewById(R.id.UsuarioNombre);
        String Nombre = getIntent().getStringExtra("nombre");
        usuarioNombre.setText(Nombre);
    }



    //Botones de navegacion
    public void IrLugaresInteres(View view) {
        Intent i = new Intent(this, LugaresInteres.class);
        startActivity(i);    }
    public void IrListaCompra(View view) {
        Intent i = new Intent(this, ListaCompras.class);
        startActivity(i);    }
    public void IrRecordatorios(View view) {
        Intent i = new Intent(this, Recordatorios.class);
        startActivity(i);    }

}