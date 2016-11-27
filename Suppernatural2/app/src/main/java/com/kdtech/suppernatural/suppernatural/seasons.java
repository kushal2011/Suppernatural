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
        //create's arraylist of seasons
        ArrayList<String>season=new ArrayList<>();
        season.add("Season 1");
        season.add("Season 2");
        season.add("Season 3");
        season.add("Season 4");
        season.add("Season 5");
        season.add("Season 6");
        season.add("Season 7");
        season.add("Season 8");
        season.add("Season 9");
        season.add("Season 10");
        season.add("Season 11");
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, season);
        seasonList=(ListView) findViewById(R.id.seasons_list);
        seasonList.setAdapter(arrayAdapter2);

        //set onClickListener on listItems
        seasonList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle seaDetail=new Bundle();
                seaDetail.putInt("pos", i);
                Intent sea = new Intent(seasons.this,seasonsDetail.class);
                sea.putExtras(seaDetail);
                startActivity(sea);
            }
        });
    }
}
