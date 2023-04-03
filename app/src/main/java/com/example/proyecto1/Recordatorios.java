package com.example.proyecto1;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.proyecto1.List.ListAdapter1;
import com.example.proyecto1.List.ListElementR;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;


public class Recordatorios extends AppCompatActivity implements View.OnClickListener {

    List<ListElementR> elements;
    Button bdia,bhora;
    private  int dia,mes,ano,hora,minutos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recordatorios);

        //menu
        Toolbar toolobar_menu = findViewById(R.id.toolbar_menu);
        setSupportActionBar(toolobar_menu);

        bdia=(Button) findViewById(R.id.bdia);
        bhora=(Button) findViewById(R.id.bhora);
        bdia.setOnClickListener(this);
        bhora.setOnClickListener(this);

        init();

    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View view) {
        if(view==bdia){
            final Calendar c = Calendar.getInstance();
            dia=c.get(Calendar.DAY_OF_MONTH);
            mes=c.get(Calendar.MONTH);
            ano=c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, (view1, year, monthOfYear, dayOfMonth) -> {
               // efecha.setText(dayOfMonth+"/"+(monthOfYear)+"/"+year);
            },dia,mes,ano);
            datePickerDialog.show();
        }

            if(view==bhora){
                final Calendar c= Calendar.getInstance();
                hora=c.get(Calendar.HOUR_OF_DAY);
                minutos=c.get(Calendar.MINUTE);
                TimePickerDialog timePickerDialog = new TimePickerDialog(this, (view12, hourOfDay, minute) -> {
                    //ehora.setText(hourOfDay+":"+minute);
                },hora,minutos,false);
                timePickerDialog.show();
            }
        }



    /*Metodo para la lista de recordatorios*/
    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElementR("Compras Bebidas", "lun 03-04-2023","12:30","Desctivada"));
        elements.add(new ListElementR("Compras", "lun,vie","12:30","Activa"));
        ListAdapter1 listAdapter = new ListAdapter1(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecordatorios);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);

    }




    /*Todo lo asociado al mentu hamburguesa*/
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_navegacion, menu);
        return true;
    }
    @SuppressLint("NonConstantResourceId")
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem){
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