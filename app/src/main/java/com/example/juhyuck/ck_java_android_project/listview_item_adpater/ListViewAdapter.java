package com.example.juhyuck.ck_java_android_project.listview_item_adpater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.juhyuck.ck_java_android_project.R;

import java.util.ArrayList;

/**
 * Created by juhyuck on 2017-06-25.
 */

public class ListViewAdapter extends BaseAdapter {

    private ArrayList<ListViewItem> arraylist = new ArrayList<ListViewItem>();

    public ListViewAdapter(){

    }

    @Override
    public int getCount(){
        return arraylist.size();
    }

    @Override
    public Object getItem(int i){
        return arraylist.get(i);
    }

    @Override
    public long getItemId(int i){
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        Context context = viewGroup.getContext();

        if(view==null){
            LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listviewitem,viewGroup,false);
        }

        TextView text1 = (TextView)view.findViewById(R.id.year_tv);
        TextView text2 = (TextView)view.findViewById(R.id.data_tv);

        ListViewItem listViewItem = arraylist.get(i);

        text1.setText(listViewItem.getText1());
        text2.setText(listViewItem.getText2());

        return view;
    }
    public void addItem(String text1, String text2){
        ListViewItem listViewItem = new ListViewItem();
        listViewItem.setText1(text1);
        listViewItem.setText2(text2);

        arraylist.add(listViewItem);
    }






}
