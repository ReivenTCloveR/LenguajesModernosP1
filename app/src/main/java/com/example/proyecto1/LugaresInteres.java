package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

public class LugaresInteres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares_interes);


        Toolbar toolobar_menu = findViewById(R.id.toolbar_menu);
        setSupportActionBar(toolobar_menu);
    }



    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_navegacion, menu);
        return true;
    }


    @SuppressLint("NonConstantResourceId")
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.item1:
                Toast.makeText(this, "Usuario", Toast.LENGTH_SHORT).show();
                Intent ir1 = new Intent(this, Usuario.class);
                startActivity(ir1);
                break;
            case R.id.item2:
                Toast.makeText(this, "Lugares de Interes", Toast.LENGTH_SHORT).show();
                Intent ir2 = new Intent(this, LugaresInteres.class);
                startActivity(ir2);
                break;
            case R.id.item3:
                Toast.makeText(this, "Lista de Compras", Toast.LENGTH_SHORT).show();
                Intent ir3 = new Intent(this, ListaCompras.class);
                startActivity(ir3);
                break;
            case R.id.item4:
                Toast.makeText(this, "Recordatorios", Toast.LENGTH_SHORT).show();
                Intent ir4 = new Intent(this, Recordatorios.class);
                startActivity(ir4);
                break;
            default:
                return super.onOptionsItemSelected(menuItem);}
        return super.onOptionsItemSelected(menuItem);
    }



}