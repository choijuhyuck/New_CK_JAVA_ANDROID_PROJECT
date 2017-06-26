package com.example.juhyuck.ck_java_android_project.population_component;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.juhyuck.ck_java_android_project.R;
import com.example.juhyuck.ck_java_android_project.listview_item_adpater.ListViewAdapter;
import com.example.juhyuck.ck_java_android_project.listview_item_adpater.ListViewItem;

public class Fertility_Rate extends AppCompatActivity {
//listview 사용해야한다.

    ListView listView;
    ListViewAdapter adapter;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.population_fertility__rate);

        btn1 = (Button)findViewById(R.id.button1);
        listView = (ListView)findViewById(R.id.listview1);

        adapter = new ListViewAdapter();

        adapter.addItem("2007년","1.250");adapter.addItem("2008년","1.192");
        adapter.addItem("2009년","1.149");adapter.addItem("2010년","1.226");adapter.addItem("2011년","1.244");
        adapter.addItem("2012년","1.297");adapter.addItem("2013년","1.187");adapter.addItem("2014년","1.205");
        adapter.addItem("2015년","1.239");adapter.addItem("2016년","1.170");

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                ListViewItem listViewItem = (ListViewItem)adapterView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(),listViewItem.getText1()+"의 합계출산율은 "
                        +listViewItem.getText2()+"입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        btn1.setOnClickListener(new Button.OnClickListener(){
            @Override public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "합계출산율 : 한 여자가 가임기간(15세~49세) 동안 낳을 것으로 예상되는 평균 출생아 수"
                        ,Toast.LENGTH_LONG).show();

            }
        });

    }




}