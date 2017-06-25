package com.example.juhyuck.ck_java_android_project.population_component;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.juhyuck.ck_java_android_project.R;
import com.example.juhyuck.ck_java_android_project.listview_item_adpater.ListViewAdapter;
import com.example.juhyuck.ck_java_android_project.listview_item_adpater.ListViewItem;

public class Fertility_Rate extends AppCompatActivity {
//listview 사용해야한다.

    ListView listView;
    ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.population_fertility__rate);

        listView = (ListView)findViewById(R.id.listview1);
        adapter = new ListViewAdapter();

        adapter.addItem("2007년","data7");adapter.addItem("2008년","data8");
        adapter.addItem("2009년","data9");adapter.addItem("2010년","data10");adapter.addItem("2011년","data11");
        adapter.addItem("2012년","data12");adapter.addItem("2013년","data13");adapter.addItem("2014년","data14");
        adapter.addItem("2015년","data15");adapter.addItem("2016년","data16");

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                ListViewItem listViewItem = (ListViewItem)adapterView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(),listViewItem.getText1()+"의 합계출산율은 "
                        +listViewItem.getText2()+"입니다.",Toast.LENGTH_SHORT).show();
            }


        });

    }

}