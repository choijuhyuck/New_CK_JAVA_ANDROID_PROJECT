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

public class Employ_YouthJobless_Data extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employ_jobless_data);

        btn1 = (Button)findViewById(R.id.button1);
        listView = (ListView)findViewById(R.id.listview1);

        adapter = new ListViewAdapter();


        adapter.addItem("2016.08"," 9.3");adapter.addItem("2016.09"," 9.4");adapter.addItem("2016.10"," 8.5");
        adapter.addItem("2016.11"," 8.2");adapter.addItem("2016.12"," 8.4");adapter.addItem("2017.01"," 8.6");
        adapter.addItem("2017.02","12.3");adapter.addItem("2017.03","11.3");adapter.addItem("2017.04","11.2");
        adapter.addItem("2017.05"," 9.3");
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                ListViewItem listViewItem = (ListViewItem)adapterView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(),listViewItem.getText1()+"의 청년 실업률은 "
                        +listViewItem.getText2()+"입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        btn1.setOnClickListener(new Button.OnClickListener(){
            @Override public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "청년층(15~29세)실업률 : 만 15~29세 경제활동인구(취업자+실업자)에서 실업자가 차지하는 비율"
                        ,Toast.LENGTH_LONG).show();

            }
        });

    }




}