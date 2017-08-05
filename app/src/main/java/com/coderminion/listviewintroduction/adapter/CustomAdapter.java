package com.coderminion.listviewintroduction.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.coderminion.listviewintroduction.R;
import com.coderminion.listviewintroduction.datamodel.DataModelObject;

import java.util.ArrayList;

/**
 * Created by phoenix on 5/8/17.
 */
public class CustomAdapter extends ArrayAdapter<DataModelObject> implements View.OnClickListener{

    private ArrayList<DataModelObject> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView txtName;
        ImageView photo;
    }

    public CustomAdapter(ArrayList<DataModelObject> data, Context context) {
        super(context, R.layout.row_item, data);
        this.dataSet = data;
        this.mContext=context;

    }


    //TODO you can use block below too. for handling events
    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);
        DataModelObject dataModel=(DataModelObject)object;

        switch (v.getId())
        {
            case R.id.photo:


                break;
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        DataModelObject dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_item, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.name);
            viewHolder.photo = (ImageView) convertView.findViewById(R.id.photo);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        viewHolder.txtName.setText(dataModel.getName());

        //GLide have made everything smooth as it is light weight library
        Glide.with(mContext).load(dataModel.getResource()).into(viewHolder.photo);
        convertView.setTag(viewHolder);

        // Return the completed view to render on screen
        return convertView;
    }
}