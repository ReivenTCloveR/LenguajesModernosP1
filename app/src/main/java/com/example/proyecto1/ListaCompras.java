package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyecto1.List.ListAdapter;
import com.example.proyecto1.List.ListElement;

import java.util.ArrayList;
import java.util.List;

public class ListaCompras extends AppCompatActivity {

    //atributos globales
    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_compras);

        Toolbar toolobar_menu = findViewById(R.id.toolbar_menu);
        setSupportActionBar(toolobar_menu);

        init();
    }


    /*Metodos para lista*/

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("#000000", "tomates","4", "Comprar"));
        elements.add(new ListElement("#000000", "Lechuga","4", "Comprado"));
        elements.add(new ListElement("#000000", "Pollo","1", "Comprar"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }







    /* Todos los metodos del menu */
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

