package com.example.marion.lumus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class telaSala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sala);

        Switch switch1 = (Switch)findViewById(R.id.switch1);



        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    Toast.makeText(getApplicationContext(), "LUZ ACESA", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "LUZ APAGADA", Toast.LENGTH_LONG).show();
                }

            }
        });
}}
