package com.example.juhyuck.ck_java_android_project.employ_component;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.juhyuck.ck_java_android_project.R;

/**
 * Created by juhyuck on 2017-06-07.
 */

public class Employ extends AppCompatActivity {
    protected Button bt0, bt1, bt2;
    protected TextView tx1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employ);

        bt0 = (Button) findViewById(R.id.button0);
        bt1 = (Button) findViewById(R.id.button1);
        bt2 = (Button) findViewById(R.id.button2);

        tx1 = (TextView) findViewById(R.id.textView1);

        bt0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Employ_Recent_Data.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

                startActivityForResult(intent, 100);
            }

        });

        bt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Employ_LaborHour_Data.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

                startActivityForResult(intent, 100);
            }

        });

        bt2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Employ_YouthJobless_Data.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

                startActivityForResult(intent, 100);
            }

        });


    }







}