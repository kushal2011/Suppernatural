package com.kdtech.suppernatural.suppernatural;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class creatures extends AppCompatActivity {
ListView creatureList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creatures);
        final ArrayList<character> creatures= new ArrayList<character>();
            creatures.add(new character("SPIRITS",R.drawable.spirit));
            creatures.add(new character("VAMPIRE",R.drawable.vampires));
            creatures.add(new character("WEREWOLVES",R.drawable.werewolves));
            creatures.add(new character("DEAMONS",R.drawable.deamons));
            creatures.add(new character("ANGELS",R.drawable.angels));
            creatures.add(new character("LEVIATHAN",R.drawable.leviathan));
        characterAdapter characterAdapter = new characterAdapter(this,creatures);
        creatureList = (ListView)findViewById(R.id.creatures_list);
        creatureList.setAdapter(characterAdapter);
        creatureList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int position1 = i;
                Bundle creaDetail=new Bundle();
                creaDetail.putInt("pos",position1);
                Intent cha = new Intent(creatures.this,creatureDetail.class);
                cha.putExtras(creaDetail);
                startActivity(cha);
            }
        });
    }
}
