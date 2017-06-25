package com.example.juhyuck.ck_java_android_project.population_component;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.juhyuck.ck_java_android_project.MyAdapter;
import com.example.juhyuck.ck_java_android_project.R;

import java.util.ArrayList;

public class Fertility_Rate extends AppCompatActivity {
//listview 사용해야한다.

    ArrayList arr_c1 = new ArrayList();
    ArrayList arr_c2 = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.population_fertility__rate);


         //  ListView 커스터마이징
        //    1. 다량의 데이터 (ArrayList)
        //    2. Adapter
        //    3. AdapterView 선정 (ListView)


        arr_c1.add(" 지표 ");arr_c1.add("2007년");arr_c1.add("2008년");
        arr_c1.add("2009년");arr_c1.add("2010년");arr_c1.add("2011년");
        arr_c1.add("2012년");arr_c1.add("2013년");arr_c1.add("2014년");
        arr_c1.add("2015년");arr_c1.add("2016년");

        arr_c2.add("합계출산율");


        // adapter 만들기
        MyAdapter adapter = new MyAdapter (
                getApplicationContext(), // 현재 화면의 제어권자
                R.layout.listviewitem, // 한행을 담당할 Layout
                arr_c1); // 데이터



        ListView lv = (ListView) findViewById(R.id.listview1);
        lv.setAdapter(adapter);

    }
}


class myData{
    String year;



}
/*
class MyAdapter extends BaseAdapter {
    Context context;   // 현재 화면의 제어권자
    int layout;         // 한 행을 그려줄 레이아웃
    ArrayList al;       // 다량의 데이터
    LayoutInflater inf;     // layout xml 파일을 객체로 전환할때 필요

    public MyAdapter(Context context, int layout, ArrayList al) {// 초기화
        this.context = context;
        this.layout = layout;
        this.al = al;
        this.inf = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() { // ListView 에서 사용할 데이터의 총개수
        return al.size();
    }
    @Override
    public Object getItem(int position) { // 해당 position번째의 데이터 값
        return al.get(position);
    }
    @Override
    public long getItemId(int position){// 해당 position번째의 유니크한id 값
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //해당행 순서,   해당행 레이아웃,          리스트뷰
        // 한행의 화면을 셋팅하는 메서드 (가장 중요)
        if (convertView == null) {
            convertView = inf.inflate(layout, null);
            //xml파일로 레이아웃객체 생성
        }
        TextView tv = (TextView)convertView.findViewById(R.id.textView1);
        tv.setText(al.get(position).toString()); // 해당번째의 값을 설정

        return convertView;
    }
} // end class MyAdapter

*/
