package com.kdtech.suppernatural.suppernatural;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class creatureDetail extends AppCompatActivity {
    public Integer gotdetail;
    TextView CreatureName;
    ImageView CreatureImage;
    TextView CreatureDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creature_detail);

        CreatureName =  (TextView)findViewById(R.id.name_crea);
        CreatureImage = (ImageView)findViewById(R.id.crea_img) ;
        CreatureDesc = (TextView)findViewById(R.id.crea_desc) ;

        //Resources res = getResources();
        Bundle creaDetail = getIntent().getExtras();
        gotdetail = creaDetail.getInt("pos");

        int value = getIntent().getExtras().getInt("pos");

        if(value==0){
            CreatureName.setText("SPIRITS");
            CreatureImage.setImageResource(R.drawable.spirit);
            CreatureDesc.setText(R.string.spirits_desc);
        }
        else if(value==1){
            CreatureName.setText("VAMPIRE");
            CreatureImage.setImageResource(R.drawable.vampires);
            CreatureDesc.setText(R.string.vampires_desc);
        }
        else if(value==2){
            CreatureName.setText("WEREWOLVES");
            CreatureImage.setImageResource(R.drawable.werewolves);
            CreatureDesc.setText(R.string.werewolves_desc);
        }
        else if(value==3){
            CreatureName.setText("DEAMONS");
            CreatureImage.setImageResource(R.drawable.deamons);
            CreatureDesc.setText(R.string.demons_desc);
        }
        else if(value==4){
            CreatureName.setText("ANGELS");
            CreatureImage.setImageResource(R.drawable.angels);
            CreatureDesc.setText(R.string.angels_desc);
        }
        else if(value==5){
            CreatureName.setText("LEVIATHAN");
            CreatureImage.setImageResource(R.drawable.leviathan);
            CreatureDesc.setText(R.string.leviiathan_desc);
        }
    }
}
