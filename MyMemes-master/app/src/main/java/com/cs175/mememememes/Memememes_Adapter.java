package com.cs175.mememememes;

/**
 * Created by Sean Patrick T. Tan on 2/27/2015.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cs175.mymemes.R;


public class Memememes_Adapter extends ArrayAdapter<String>{

    Context context;
    int images[];
    String [] titles;
    String [] descs;

    public Memememes_Adapter(Context con, String[] name, int image[], String[] desc){
        super(con, R.layout.mememememes_layout,R.id.name,name);

        this.context = con;
        this.images = image;
        this.titles = name;
        this.descs = desc;
    }

    public class MyViewHolder{

        ImageView image;
        TextView title;
        TextView desc;

        public MyViewHolder(View v){

            image = (ImageView) v.findViewById(R.id.image);
            title = (TextView) v.findViewById(R.id.name);
            desc = (TextView) v.findViewById(R.id.desc);

        }


    }

    @Override
    public View getView(int position, View convertView , ViewGroup parent){

        View row = convertView;
        MyViewHolder hold = null;
        if(row==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.mememememes_layout, parent, false);
            hold = new MyViewHolder(row);
            row.setTag(hold);
        }
        else{
            hold = (MyViewHolder) row.getTag();
        }

        hold.image.setImageResource(images[position]);
        hold.title.setText(titles[position]);
        hold.desc.setText(descs[position]);

        return row;
    }
}
