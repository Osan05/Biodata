package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inpNama = (EditText) findViewById(R.id.inpNama);
        EditText inpAlamat = (EditText) findViewById(R.id.inpAlamat);
        EditText inpNoHp = (EditText) findViewById(R.id.inpNoHp);

        Button btnCLEAR = (Button) findViewById(R.id.btnCLEAR);

        btnCLEAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inpNama.setText("");
                inpAlamat.setText("");
                inpNoHp.setText("");
            }
        });

        Button btnexit = (Button) findViewById(R.id.btnEXIT);

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}