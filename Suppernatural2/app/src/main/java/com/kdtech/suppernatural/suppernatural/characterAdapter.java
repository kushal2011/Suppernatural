package com.kdtech.suppernatural.suppernatural;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kusha_000 on 10-10-2016.
 */

public class characterAdapter extends ArrayAdapter<character> {


    public characterAdapter(Activity context, ArrayList<character>character) {
        super(context,0,character);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        character character = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.char_name);
        nameTextView.setText(character.getCharName());

        listItemView.setTag(R.layout.list_item,position);
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(character.getCharImg());
        return listItemView;
    }
}
