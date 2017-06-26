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
//지표	2007	2008	2009	2010	2011	2012	2013	2014	2015	2016
//혼인건수 (건)	343,559	327,715	309,759	 326,104	329,087	327,073	322,807	305,507	302,828	281,635

public class Population_Marryed_Data extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.population_marryed_data);

        btn1 = (Button)findViewById(R.id.button1);
        listView = (ListView)findViewById(R.id.listview1);

        adapter = new ListViewAdapter();

        adapter.addItem("2007년","343,559");adapter.addItem("2008년","327,715");
        adapter.addItem("2009년","309,759");adapter.addItem("2010년","326,104");adapter.addItem("2011년","329,087");
        adapter.addItem("2012년","327,073");adapter.addItem("2013년","322,807");adapter.addItem("2014년","305,507");
        adapter.addItem("2015년","302,828");adapter.addItem("2016년","281,635");

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                ListViewItem listViewItem = (ListViewItem)adapterView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(),listViewItem.getText1()+"의 혼인건수는 "
                        +listViewItem.getText2()+"입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        btn1.setOnClickListener(new Button.OnClickListener(){
            @Override public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "혼인건수: 당해년도 남녀 혼인한 쌍의 수"
                        ,Toast.LENGTH_LONG).show();

            }
        });

    }

}
