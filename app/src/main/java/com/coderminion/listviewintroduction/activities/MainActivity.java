package com.coderminion.listviewintroduction.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.coderminion.listviewintroduction.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewsAndClicks();


    }

    private void initViewsAndClicks() {
        Button gridviewbtn,listview_simplebtn,listview_simpleadapterbtn,custombtn;

        gridviewbtn = (Button)findViewById(R.id.gridviewbtn);
        listview_simplebtn = (Button)findViewById(R.id.listview_simplebtn);
        listview_simpleadapterbtn = (Button)findViewById(R.id.listview_simpleadapterbtn);
        custombtn = (Button)findViewById(R.id.custombtn);

        gridviewbtn.setOnClickListener(this);
        listview_simpleadapterbtn.setOnClickListener(this);
        custombtn.setOnClickListener(this);
        listview_simplebtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        Intent intent;
        int id = view.getId();
        switch (id)
        {
            case R.id.gridviewbtn:
                intent = new Intent(getApplicationContext(),GridViewActivity.class);
                startActivity(intent);
                break;
             case R.id.listview_simplebtn:
                 intent = new Intent(getApplicationContext(),ListViewactivity.class);
                 startActivity(intent);
                break;

             case R.id.listview_simpleadapterbtn:
                 //You can load anthing without problem in this adapter
                 intent = new Intent(getApplicationContext(),SimpleAdapterActivity.class);
                 startActivity(intent);
                break;

             case R.id.custombtn:
                 intent = new Intent(getApplicationContext(),CustomListViewActivity.class);
                 startActivity(intent);
                break;

        }
    }
}
