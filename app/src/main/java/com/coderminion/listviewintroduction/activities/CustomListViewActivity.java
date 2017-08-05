package com.coderminion.listviewintroduction.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.coderminion.listviewintroduction.R;
import com.coderminion.listviewintroduction.adapter.CustomAdapter;
import com.coderminion.listviewintroduction.datamodel.DataModelObject;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {
    ArrayList<DataModelObject> dataModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        dataModels = new ArrayList<>();
        prepareData();



        CustomAdapter adapter = new CustomAdapter(dataModels, getApplicationContext());

        ListView listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                DataModelObject dataModel= dataModels.get(position);
                Log.e("dataModel",dataModel.getName());
                Toast.makeText(getApplicationContext(),dataModel.getName(),Toast.LENGTH_SHORT).show();

            }
        });
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
            DataModelObject dataModelObject = new DataModelObject(strings[i],arrayImages[i]);
            dataModels.add(dataModelObject);
        }
    }
}
