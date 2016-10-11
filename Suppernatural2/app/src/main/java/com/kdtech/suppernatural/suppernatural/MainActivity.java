package com.kdtech.suppernatural.suppernatural;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button play;
    Button restart;
    Button read;
    MediaPlayer mMediaPlayer;
    ListView listview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        read=(Button)findViewById(R.id.read_me);
        read.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,readMe.class);
                startActivity(intent);

            }
        });
        play=(Button)findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            mMediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.carryon);
                mMediaPlayer.start();
            }
        });

        restart=(Button)findViewById(R.id.restart) ;
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaPlayer.reset();
            }
        });

        listview1=(ListView)findViewById(R.id.firstlist);
        final ArrayList<String> list1 = new ArrayList<String>();
        list1.add(new String("CHARACTER"));
        list1.add(new String("CREATURES"));
        list1.add(new String("SEASONS"));
        final ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, list1);
        listview1.setAdapter(arrayAdapter1);
        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent1;
                String name = (String) arrayAdapter1.getItem(i);
                if (name.equals("CHARACTER"))
                {
                    intent1 = new Intent(MainActivity.this, characters.class);
                    startActivity(intent1);
                }
                else if (name.equals("CREATURES"))
                {
                    intent1 = new Intent(MainActivity.this, creatures.class);
                    startActivity(intent1);
                }
                else if (name.equals("SEASONS"))
                {
                    intent1 = new Intent(MainActivity.this, seasons.class);
                    startActivity(intent1);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
