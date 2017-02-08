package com.huseyin.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListAdapter adapter;
     List dataPerson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView= (ListView) findViewById(R.id.listview);
        dataPerson=new ArrayList();

        dataPerson.add(new Person("Hüseyin", "Kuyucu", "Turkey", "Java", R.mipmap.boy));
        dataPerson.add(new Person("Ahmet", "aabbcc", "Turkey", "C", R.mipmap.boy));
        dataPerson.add(new Person("Hüseyin", "abc", "Turkey", "Android", R.mipmap.boy));
        dataPerson.add(new Person("Mehmet", "aabbcc", "Turkey", "C", R.mipmap.boy));
        dataPerson.add(new Person("Gokhan", "ccdd", "Germany", "C++", R.mipmap.boy));


        adapter=new ListAdapter(this,dataPerson);
        listView.setAdapter(adapter);




    }
}
