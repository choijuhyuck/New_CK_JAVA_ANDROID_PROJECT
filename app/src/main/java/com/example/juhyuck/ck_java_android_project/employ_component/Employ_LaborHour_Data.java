package com.example.juhyuck.ck_java_android_project.employ_component;

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

public class Employ_LaborHour_Data extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employ_laborhour_data);

        btn1 = (Button)findViewById(R.id.button1);
        listView = (ListView)findViewById(R.id.listview1);

        adapter = new ListViewAdapter();

        adapter.addItem("2009년","194.8");adapter.addItem("2010년","192.8");adapter.addItem("2011년","189.3");
        adapter.addItem("2012년","182.3");adapter.addItem("2013년","176.3");adapter.addItem("2014년","175.9");
        adapter.addItem("2015년","184.2");

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                ListViewItem listViewItem = (ListViewItem)adapterView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(),listViewItem.getText1()+"의 근로시간은 "
                        +listViewItem.getText2()+"입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        btn1.setOnClickListener(new Button.OnClickListener(){
            @Override public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "임금근로자 : 자신의 근로에 대해 임금, 봉급, 일당 등 어떠한 형태로든 일한 대가를 지급받는 근로자로서 통상 상용, 임시, 일용근로자로 구분됨"
                        ,Toast.LENGTH_LONG).show();

            }
        });

    }




}