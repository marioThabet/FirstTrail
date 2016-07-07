package com.example.alfapc.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class TimeShow extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_show);
      String[] s = {"hey","hi","hello","goodevening","goodmorning","goodafternon","goodnight","goodLuck","goodTime","see you Later","Bye Bye","what the heck","What the fuck?!","Lets hope it is enough now :)"};
        ListAdapter ss = new Customview(this,s);
        ListView lista = (ListView) findViewById(R.id.TheListView);
        lista.setAdapter(ss);
        lista.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){


                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String s = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(TimeShow.this,s,Toast.LENGTH_LONG).show();
                    }
                });
    }


}
