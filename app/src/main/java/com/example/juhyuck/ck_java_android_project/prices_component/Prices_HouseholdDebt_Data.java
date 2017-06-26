package com.example.juhyuck.ck_java_android_project.prices_component;

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

public class Prices_HouseholdDebt_Data extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prices_householddebt_data);

        btn1 = (Button)findViewById(R.id.button1);
        listView = (ListView)findViewById(R.id.listview1);


        adapter = new ListViewAdapter();

        adapter.addItem("2012년","5,450");adapter.addItem("2013년","5,858");adapter.addItem("2014년","6,051");
        adapter.addItem("2015년","6,256");adapter.addItem("2016년","6,655");

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                ListViewItem listViewItem = (ListViewItem)adapterView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(),listViewItem.getText1()+"의 가구부채는 "
                        +listViewItem.getText2()+"입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        btn1.setOnClickListener(new Button.OnClickListener(){
            @Override public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "대한민국 한 가구당 부채 (만원)"
                        ,Toast.LENGTH_LONG).show();

            }
        });

    }




}