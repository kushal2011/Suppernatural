package com.kdtech.suppernatural.suppernatural;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class charactersDetail extends AppCompatActivity {
    public Integer gotdetail;
    TextView CharacterName;
    ImageView CharacterImage;
    TextView CharacterDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters_detail);
        CharacterName =  (TextView)findViewById(R.id.name_char);
        CharacterImage = (ImageView)findViewById(R.id.char_img) ;
        CharacterDesc = (TextView)findViewById(R.id.char_desc) ;

        //get position of clicked item
        Bundle charDetail = getIntent().getExtras();
        gotdetail = charDetail.getInt("pos");

        int value = getIntent().getExtras().getInt("pos");
        //checks the value of clicked listItem and opens with changes to activity according to character selected
        switch (value){
            case 0:
                CharacterName.setText("SAM WINCHESTER");
                CharacterImage.setImageResource(R.drawable.samwinchester);
                CharacterDesc.setText(getString(R.string.sams_desc) +
                        "\n" +
                        getString(R.string.sams_desc1) +
                        "\n" +
                        getString(R.string.sams_desc2) +
                        "\n" +
                        getString(R.string.sams_desc3));
                break;
            case 1:
                CharacterName.setText("DEAN WINCHESTER");
                CharacterImage.setImageResource(R.drawable.deanwinchester);
                CharacterDesc.setText(R.string.dean_desc);
                break;
            case 2:
                CharacterName.setText("BOBBY SINGER");
                CharacterImage.setImageResource(R.drawable.bobby);
                CharacterDesc.setText(getString(R.string.bobby_desc) +
                        getString(R.string.bobby_desc1) +
                        getString(R.string.bobby_desc2) +
                        getString(R.string.bobby_desc3));
                break;
            case 3:
                CharacterName.setText("CASTIEL");
                CharacterImage.setImageResource(R.drawable.castiel);
                CharacterDesc.setText(getString(R.string.castiel_desc) +
                        "\n" +
                        getString(R.string.castiel_desc1) +
                        "\n" +
                        getString(R.string.castiel_desc2) +
                        "\n" +
                        getString(R.string.castiel_desc3) +
                        "\n" +
                        getString(R.string.castiel_desc4) +
                        "\n" +
                        getString(R.string.castiel_desc5));
                break;
            case 4:
                CharacterName.setText("CROWLEY");
                CharacterImage.setImageResource(R.drawable.crowley);
                CharacterDesc.setText(getString(R.string.crowley_desc) +
                        "\n" +
                        getString(R.string.crowley_desc1) +
                        "\n" +
                        getString(R.string.crowley_desc2) +
                        "\n" +
                        getString(R.string.crowley_desc3));
                break;
            case 5:
                CharacterName.setText("LUCIFER");
                CharacterImage.setImageResource(R.drawable.lucifer);
                CharacterDesc.setText(getString(R.string.lucifer_desc) +
                        "\n" +
                        getString(R.string.lucifer_desc1) +
                        "\n" +
                        getString(R.string.lucifer_desc2) +
                        "\n" +
                        getString(R.string.lucifer_desc3) +
                        "\n" +
                        getString(R.string.lucifer_desc4) +
                        "\n" +
                        getString(R.string.lucifer_desc5));
                break;
            case 6:
                CharacterName.setText("ROWENA");
                CharacterImage.setImageResource(R.drawable.rovena);
                CharacterDesc.setText(R.string.rowena_desc);
                break;
            case 7:
                CharacterName.setText("JOHN WINCHESTER");
                CharacterImage.setImageResource(R.drawable.john);
                CharacterDesc.setText(getString(R.string.john_desc) +
                    "\n" +
                    getString(R.string.john_desc1));
                break;
            case 8:
                CharacterName.setText("GOD");
                CharacterImage.setImageResource(R.drawable.god);
                CharacterDesc.setText(getString(R.string.god_desc) +
                        "\n" +
                        getString(R.string.god_desc1) +
                        "\n" +
                        getString(R.string.god_desc2));
                break;
            case 9:
                CharacterName.setText("AMARA");
                CharacterImage.setImageResource(R.drawable.amara);
                CharacterDesc.setText(getString(R.string.amara_desc) +
                        "\n" +
                        getString(R.string.amara_desc1) +
                        "\n" +
                        getString(R.string.amara_desc2));
                break;
            case 10:
                CharacterName.setText("MARY WINCHESTER");
                CharacterImage.setImageResource(R.drawable.samsmother);
                CharacterDesc.setText(R.string.mary_desc);
                break;
        }

    }
}
