package com.btes.storage;

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
    Button bsave;
    Button bread;
    TextView tview;
    EditText editdoctor;
    String s;
    void data()
    {
        SharedPreferences sharpre = getSharedPreferences("my file", Context.MODE_PRIVATE);
        String def="sample text";
        String n=sharpre.getString("name",def);
     tview.setText(n);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bsave=(Button) findViewById(R.id.bsave);
        bread=(Button) findViewById(R.id.bead);
        tview=(TextView) findViewById(R.id.tview);
        editdoctor=(EditText) findViewById(R.id.editdoctor);

        bsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharpre = getSharedPreferences("my file", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharpre.edit();
                s=editdoctor.getText().toString();
                editor.putString("name",s);
                editor.commit();
            }

        });
        bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            data();
            }
        });





    }

}

