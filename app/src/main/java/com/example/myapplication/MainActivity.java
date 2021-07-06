package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import  android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConvert = (Button) findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (btnConvert.equals(view)){
            int dec = -1;
            EditText decText = (EditText) findViewById(R.id.decText);
            String decStr = decText.getText().toString();
            if (decStr.length() > 0 && decStr.length() < 9)
                dec = Integer.parseInt(decStr);
            if (dec >= 0){
                String bin = "";
                while (dec != 0){
                    if (dec % 2 == 0)
                        bin = "0" + bin;
                    else
                        bin = "1" + bin;
                    dec = dec/2;
                }
                EditText binText = (EditText) findViewById(R.id.binText);
                binText.setText(bin);
            }
        }
    }
}