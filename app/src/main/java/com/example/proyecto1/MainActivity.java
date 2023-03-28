package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import javax.security.auth.callback.PasswordCallback;

public class MainActivity  extends AppCompatActivity {

    private EditText editUsuarioText;
    private PasswordCallback edittextPassword ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
    public void IrUsuario(View view){
        Intent i = new Intent(this, Usuario.class);
        startActivity(i);
     }

     public void IrRegistro(View view){
         Intent i = new Intent(this, Registrarse.class);
         startActivity(i);

     }



    //ciclo de vida de las activity
    @Override
    protected void onStart() {
        super.onStart();
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