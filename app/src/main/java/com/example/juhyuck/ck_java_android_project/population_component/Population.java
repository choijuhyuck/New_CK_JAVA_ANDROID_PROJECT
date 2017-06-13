package com.example.juhyuck.ck_java_android_project.population_component;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.juhyuck.ck_java_android_project.R;

// 합계 출산율
// 혼인건수
// 고령인구 비율

public class Population extends AppCompatActivity {
    private Button bt1, bt2, bt3;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.population);

        bt1= (Button) findViewById(R.id.button1);
        bt2= (Button) findViewById(R.id.button1);
        bt3= (Button) findViewById(R.id.button1);


        bt1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),Fertility_Rate.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

                startActivityForResult(intent, 1000);
            }

        });






    }

}
