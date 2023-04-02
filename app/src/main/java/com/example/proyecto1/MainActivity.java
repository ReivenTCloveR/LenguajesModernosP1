package com.example.proyecto1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity  extends AppCompatActivity {

    private EditText Usuario_log;
    //private KeyStore.PasswordProtection Pass_Log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Usuario_log =findViewById(R.id.Usuario_log);
        //Pass_Log = () findViewById(R.id.Pass_Log);


    }
    //Metodo para Boton de LOGIN
    public void IrUsuario(View view) {
            Intent i = new Intent(this, Usuario.class);
            i.putExtra("nombre", Usuario_log.getText().toString());
            startActivity(i);    }

     public void IrRegistro(View view){
         Intent i = new Intent(this, Registrarse.class);
         startActivity(i);

     }



    //ciclo de vida de las activity
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("start","start");
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
    protected void onDestroy() {
        super.onDestroy();
    }
}