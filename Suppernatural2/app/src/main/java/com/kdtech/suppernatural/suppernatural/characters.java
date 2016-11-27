package com.kdtech.suppernatural.suppernatural;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class characters extends AppCompatActivity {
ListView charList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);
        //create's arraylist of seasons
        final ArrayList<character> characters= new ArrayList<character>();
            characters.add(new character("SAM WINCHESTER",R.drawable.samwinchester));
            characters.add(new character("DEAN WINCHESTER",R.drawable.deanwinchester));
            characters.add(new character("BOBBY",R.drawable.bobby));
            characters.add(new character("CASTIEL",R.drawable.castiel));
            characters.add(new character("CROWLEY",R.drawable.crowley));
            characters.add(new character("LUCIFER",R.drawable.lucifer));
            characters.add(new character("ROWENA",R.drawable.rovena));
            characters.add(new character("JOHN WINCHESTER",R.drawable.john));
            characters.add(new character("GOD",R.drawable.god));
            characters.add(new character("AMARA",R.drawable.amara));
            characters.add(new character("MARY WINCHESTER",R.drawable.samsmother));


        final characterAdapter characterAdapter = new characterAdapter(this,characters);
        charList = (ListView)findViewById(R.id.character_list);
        charList.setAdapter(characterAdapter);
        //set onClickListener on listItems
        charList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int position = i;
                Bundle charDetail=new Bundle();
                charDetail.putInt("pos",position);
                Intent cha = new Intent(characters.this,charactersDetail.class);
                cha.putExtras(charDetail);
                startActivity(cha);
            }
        });
    }
}
