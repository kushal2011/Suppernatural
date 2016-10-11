package com.kdtech.suppernatural.suppernatural;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class seasons extends AppCompatActivity {
ListView seasonList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons);
        ArrayList<String>season=new ArrayList<String>();
        season.add(new String("Season 1"));
        season.add(new String("Season 2"));
        season.add(new String("Season 3"));
        season.add(new String("Season 4"));
        season.add(new String("Season 5"));
        season.add(new String("Season 6"));
        season.add(new String("Season 7"));
        season.add(new String("Season 8"));
        season.add(new String("Season 9"));
        season.add(new String("Season 10"));
        season.add(new String("Season 11"));
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, season);
        seasonList=(ListView) findViewById(R.id.seasons_list);
        seasonList.setAdapter(arrayAdapter2);

        seasonList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int position2 = i;
                Bundle seaDetail=new Bundle();
                seaDetail.putInt("pos",position2);
                Intent sea = new Intent(seasons.this,seasonsDetail.class);
                sea.putExtras(seaDetail);
                startActivity(sea);
            }
        });
    }
}
