package com.example.firework.roomdecorationapp;

/**
 * Created by Firework on 13/3/18.
 */

public class Item {
    private String name;
    private String img_url;
    private String cate;

    public Item(String name, String img_url, String cate){
        this.name = name;
        this.img_url = img_url;
        this.cate = cate;
    }

    public String getName(){
        return name;
    }

    public String getImg_url(){
        return img_url;
    }

    public String getCate(){
        return cate;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setImg_url(String url){
        this.img_url = img_url;
    }

    public void setCate(String cate){
        this.cate = cate;
    }
}
