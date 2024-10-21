package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUsuario = findViewById<EditText>(R.id.editTextText);
        val editTextPassword = findViewById<EditText>(R.id.editTextTextPassword)
        val botonIniciarSesion = findViewById<Button>(R.id.button)
        editTextUsuario.setOnClickListener {
            editTextUsuario.setText("");
        }

        //editTextUsuario.

        botonIniciarSesion.setOnClickListener {
            val username = editTextUsuario.text.toString();
            val userPassword = editTextPassword.text.toString();

            Log.d("TAG", "Username: " + username +", Password: " + userPassword);
            Toast.makeText(applicationContext,"Username: " + username + ", Password: " + userPassword, Toast.LENGTH_LONG).show();
        }
    }
}