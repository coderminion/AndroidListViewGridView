package com.coderminion.listviewintroduction.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.coderminion.listviewintroduction.R;
import com.coderminion.listviewintroduction.datamodel.DataModelObject;

import java.util.ArrayList;
import java.util.HashMap;

public class SimpleAdapterActivity extends AppCompatActivity {

    ArrayList<HashMap<String,Object>> hashMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);

        hashMaps = new ArrayList<>();

        prepareData();

        ListView listView = (ListView)findViewById(R.id.listview);
        ListAdapter adapter = new SimpleAdapter(getApplicationContext(),hashMaps,R.layout.row_item, new String[]{"image","name"},new int[]{R.id.photo,R.id.name});
        listView.setAdapter(adapter);


    }



    private void prepareData() {
        int arrayImages [] = {
                R.drawable.adele,
                R.drawable.ariana,
                R.drawable.rihanna,
                R.drawable.selena,
                R.drawable.taylor,
        };

        String [] strings = {
                "Adele",
                "Ariana Grande",
                "Rihanna",
                "Selena Gomez",
                "Taylor Swift"
        };

        for (int i = 0 ; i < strings.length;i++)
        {
            HashMap<String,Object> hashMap = new HashMap<>();
            hashMap.put("image",arrayImages[i]);
            hashMap.put("name",strings[i]);
            hashMaps.add(hashMap);
        }
    }
}
