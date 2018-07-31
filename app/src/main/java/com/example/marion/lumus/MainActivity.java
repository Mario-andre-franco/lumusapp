package com.example.marion.lumus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private static String[] opcoes = {"Sala", "Quarto", "Banheiro", "Cozinha", "Area Externa"};
    ArrayAdapter<String> aopcoes;

    Spinner spinner;

    Button mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrar = (Button) findViewById(R.id.botaocalcular);
        aopcoes = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, opcoes);

        spinner = (Spinner) findViewById(R.id.spnOpcoes);
        spinner.setAdapter(aopcoes);

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (spinner.getSelectedItemPosition()) {

                    case 0:
                        chamasala();
                        break;

                    case 1:
                        chamaquarto();
                        break;

                    case 2:
                        chamabanheiro();
                        break;

                    case 3:
                        chamacozinha();
                        break;
                    case 4:
                        chamaexterna();
                }
            }
        });
    }

    public void chamasala() {

        Intent chamarsala = new Intent(MainActivity.this, telaSala.class);
        MainActivity.this.startActivity(chamarsala);
    }

    public void chamaquarto() {

        Intent chamaquarto = new Intent(MainActivity.this, Main2Activity.class);
        MainActivity.this.startActivity(chamaquarto);
    }

    public void chamacozinha() {

        Intent chamacozinha = new Intent(MainActivity.this, telacozinha.class);
        MainActivity.this.startActivity(chamacozinha);
    }

    public void chamabanheiro() {

        Intent chamabanheiro = new Intent(MainActivity.this, telabanheiro.class);
        MainActivity.this.startActivity(chamabanheiro);
    }

    public void chamaexterna() {

        Intent chamaexterna = new Intent(MainActivity.this, telaexterna
                .class);
        MainActivity.this.startActivity(chamaexterna);
    }
}
