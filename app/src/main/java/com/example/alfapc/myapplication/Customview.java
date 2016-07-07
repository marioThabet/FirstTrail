package com.example.alfapc.myapplication;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Customview extends ArrayAdapter<String> {

    public Customview(Context context, String[] s) {

        super(context, R.layout.customitem, s);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater f = LayoutInflater.from(getContext());
        View v = f.inflate(R.layout.customitem,parent,false);
        TextView t = (TextView) v.findViewById(R.id.fuckText);
        String s = (String) getItem(position);
        t.setText(s);
        return v ;


    }
}
