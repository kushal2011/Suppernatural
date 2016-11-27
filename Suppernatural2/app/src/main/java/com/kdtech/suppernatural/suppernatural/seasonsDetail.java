package com.kdtech.suppernatural.suppernatural;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class seasonsDetail extends AppCompatActivity {
    public Integer gotdetail;
    TextView SeasonName;
    ImageView SeasonImage;
    TextView SeasonDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons_detail);

        SeasonName =  (TextView)findViewById(R.id.name_sea);
        SeasonImage = (ImageView)findViewById(R.id.sea_img) ;
        SeasonDesc = (TextView)findViewById(R.id.sea_desc) ;

        //get position of clicked item
        Bundle charDetail = getIntent().getExtras();
        gotdetail = charDetail.getInt("pos");

        int value = getIntent().getExtras().getInt("pos");

        //checks the value of clicked listItem and opens  with changes to activity according to season selected
        //// TODO: 27-11-2016 change it to switch case  ;
       switch (value){
           case 0:
               SeasonName.setText("SEASON 1");
               SeasonImage.setImageResource(R.drawable.seasonone);
               SeasonDesc.setText(getString(R.string.season1_desc) +
                       "\n" +
                       getString(R.string.season1_desc2));
               break;
           case 1:
               SeasonName.setText("SEASON 2");
               SeasonImage.setImageResource(R.drawable.seasontwo);
               SeasonDesc.setText("\n" +
                       getString(R.string.season2_desc) +
                       getString(R.string.season2_desc2) +
                       getString(R.string.season2_desc3) +
                       getString(R.string.season2_desc4) +
                       getString(R.string.season2_desc5) +
                       getString(R.string.season2_desc6));
               break;
           case 2:
               SeasonName.setText("SEASON 3");
               SeasonImage.setImageResource(R.drawable.seasonthree);
               SeasonDesc.setText(getString(R.string.season3_desc) +
                       getString(R.string.season3_desc2));
               break;
           case 3:
               SeasonName.setText("SEASON 4");
               SeasonImage.setImageResource(R.drawable.seasonfour);
               SeasonDesc.setText("\n" +
                       getString(R.string.season4_desc));
               break;
           case 4:
               SeasonName.setText("SEASON 5");
               SeasonImage.setImageResource(R.drawable.seasonfive);
               SeasonDesc.setText("\n" +
                       getString(R.string.season5_desc));
               break;
           case 5:
               SeasonName.setText("SEASON 6");
               SeasonImage.setImageResource(R.drawable.seasonsix);
               SeasonDesc.setText(R.string.season6_desc);
               break;
           case 6:
               SeasonName.setText("SEASON 7");
               SeasonImage.setImageResource(R.drawable.seasonseven);
               SeasonDesc.setText(R.string.season7_desc);
               break;
           case 7:
               SeasonName.setText("SEASON 8");
               SeasonImage.setImageResource(R.drawable.seasoneight);
               SeasonDesc.setText(getString(R.string.season8_desc) +
                       "\n" +
                       getString(R.string.season8_desc1) +
                       "\n" +
                       getString(R.string.season8_desc2) +
                       "\n" +
                       getString(R.string.season8_desc3) +
                       "\n" +
                       getString(R.string.season8_desc4));
               break;
           case 8:
               SeasonName.setText("SEASON 9");
               SeasonImage.setImageResource(R.drawable.seasonnine);
               SeasonDesc.setText(getString(R.string.season9_desc) +
                       "\n" +
                       getString(R.string.season9_desc1) +
                       "\n" +
                       getString(R.string.season9_desc2));
               break;
           case 9:
               SeasonName.setText("SEASON 10");
               SeasonImage.setImageResource(R.drawable.seasonten);
               SeasonDesc.setText(getString(R.string.season10_desc) +
                       "\n" +
                       getString(R.string.season10_desc1) +
                       "\n" +
                       getString(R.string.season10_desc2) +
                       "\n" +
                       getString(R.string.season10_desc3) +
                       "\n" +
                       getString(R.string.season10_desc4) +
                       "\n" +
                       getString(R.string.season10_desc5) +
                       "\n" +
                       getString(R.string.season10_desc6));
               break;

           case 10:
               SeasonName.setText("SEASON 11");
               SeasonImage.setImageResource(R.drawable.seasoneleven);
               SeasonDesc.setText(getString(R.string.season11_desc) +
                       "\n" +
                       getString(R.string.season11_desc1) +
                       "\n" +
                       getString(R.string.season11_desc2) +
                       "\n" +
                       getString(R.string.season11_desc3) +
                       "\n" +
                       getString(R.string.season11_desc4));
               break;

       }
    }
}
