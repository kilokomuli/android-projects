package com.example.projectprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Toastmsg(View view){
        Toast.makeText(this.getApplicationContext(), "welcome to register.", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this.getApplicationContext(),signin.class);
        startActivity(i);
    }
}