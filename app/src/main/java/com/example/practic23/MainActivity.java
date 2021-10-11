package com.example.practic23;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox CheckBoxmyChb;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = findViewById(R.id.myText);
        myTextView.setTextColor(0xcccccccc);
        Button myBtn = findViewById(R.id.myBtn);
        myBtn.setText("Mybutton");
        myBtn.setEnabled(false);
        CheckBox myChb = (CheckBox) findViewById(R.id.myChb);
        myChb.setChecked(true);

            }


        }
