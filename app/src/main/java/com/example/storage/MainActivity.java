package com.example.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonSave,buttonLoad;
    EditText editTextName,editTextPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName=findViewById(R.id.name);
        editTextPass=findViewById(R.id.pass);
        buttonSave=findViewById(R.id.save);
        buttonLoad=findViewById(R.id.load);


        final SharedRef sharedRef=new SharedRef(MainActivity.this);
        buttonSave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               sharedRef.Save(editTextName.getText().toString(),editTextPass.getText().toString());


            }
        });

        buttonLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=sharedRef.Load();
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
