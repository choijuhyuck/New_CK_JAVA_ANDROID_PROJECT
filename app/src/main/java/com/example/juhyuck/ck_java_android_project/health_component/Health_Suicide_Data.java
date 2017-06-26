package com.example.juhyuck.ck_java_android_project.health_component;

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

public class Health_Suicide_Data extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_suicide_data);

        btn1 = (Button)findViewById(R.id.button1);
        listView = (ListView)findViewById(R.id.listview1);
//지표	2006	2007	2008	2009	2010	2011	2012	2013	2014	2015
 //       자살률 (십만명당)	21.8	24.8	26.0	31.0	31.2	31.7	28.1	28.5	27.3	26.5
        adapter = new ListViewAdapter();

        adapter.addItem("2006년","21.8");
        adapter.addItem("2007년","24.8");adapter.addItem("2008년","26.0");
        adapter.addItem("2009년","31.0");adapter.addItem("2010년","31.2");adapter.addItem("2011년","31.7");
        adapter.addItem("2012년","28.1");adapter.addItem("2013년","28.5");adapter.addItem("2014년","27.3");
        adapter.addItem("2015년","26.5");

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                ListViewItem listViewItem = (ListViewItem)adapterView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(),listViewItem.getText1()+"의 자살률은 "
                        +listViewItem.getText2()+"입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        btn1.setOnClickListener(new Button.OnClickListener(){
            @Override public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "십만명당 자살률을 표시"
                        ,Toast.LENGTH_LONG).show();

            }
        });

    }




}