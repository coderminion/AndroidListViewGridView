package com.coderminion.listviewintroduction.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.coderminion.listviewintroduction.R;

import java.util.ArrayList;

public class ListViewactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_viewactivity);


        final String [] array = getResources().getStringArray(R.array.singers);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.list_item,R.id.textView,array);


        ListView listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(),array[i],Toast.LENGTH_SHORT).show();
            }
        });

    }
}
