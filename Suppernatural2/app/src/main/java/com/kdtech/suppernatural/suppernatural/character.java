package com.kdtech.suppernatural.suppernatural;

/**
 * Created by kusha_000 on 10-10-2016.
 */

public class character {
    public String nCharName;
    public int nCharImg;
//will accept and return name and image for custon listView
    public character(String vCharName,int vCharImg){
        nCharName = vCharName;
        nCharImg = vCharImg;
    }
public String getCharName(){
    return nCharName;
}
    public int getCharImg(){
        return nCharImg;
    }
}
