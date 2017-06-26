package com.example.juhyuck.ck_java_android_project.prices_component;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.juhyuck.ck_java_android_project.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Prices_Recent_Data extends AppCompatActivity {

    private TextView tx1, tx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prices_recent_data);


        tx1 = (TextView) findViewById(R.id.textView1);
        tx2 = (TextView) findViewById(R.id.textView2);


    }

    @Override
    public void onResume() {
        super.onResume();

        DataCrawling task = new DataCrawling();
        task.execute();
    }


    public class DataCrawling extends AsyncTask<Void, Void, Map<String, String>> {


        @Override
        public Map<String, String> doInBackground(Void... params) {
            Map<String, String> result = new HashMap<String, String>();


            try {
                Document document = Jsoup.connect("http://kosis.kr/nsportalStats/nsportalStats_0102Body.jsp?menuId=13").get();
                //title 갖고오기
                Elements elements = document.select(".tline #menu_13");
                result.put("mainTilte", elements.text());

                elements = document.select(".Subject #menuTop13");
                result.put("subTitle1", elements.text());


            } catch (IOException e) {
                e.printStackTrace();
            }

            return result;
        }

        @Override
        public void onPostExecute(Map<String, String> map) {

            tx1.setText(map.get("mainTilte") + " 최신 통계");
            tx2.setText(map.get("subTitle1"));

        }
    }
}

