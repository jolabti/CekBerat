package com.apps.alter.cekberat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnhasil;
    EditText edt;

    //  String tampung = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = (EditText) findViewById(R.id.angkaberat);
        btnhasil = (Button) findViewById(R.id.button);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                int jawab = Integer.parseInt(edt.getText().toString());

                if (jawab>0 && jawab <= 30) {
                    Toast.makeText(MainActivity.this, "Berat" + " " +  String.valueOf(jawab) + "  " + " Anda kurus", Toast.LENGTH_LONG).show();

                }

                else if (jawab>30 && jawab <= 60){
                    Toast.makeText(MainActivity.this, "Berat" + " " +  String.valueOf(jawab) + "  " + " Anda gemuk", Toast.LENGTH_LONG).show();


                }

            }
        });
    }
}
