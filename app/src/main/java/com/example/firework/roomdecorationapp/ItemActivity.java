package com.example.firework.roomdecorationapp;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ItemActivity extends AppCompatActivity {
    private ArrayList<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        //load items
        items = loadItems();

        Intent intent = getIntent();
        String cate = intent.getStringExtra("cate");
//        TextView tv = (TextView) findViewById(R.id.text);
//        tv.setText(cate);

        //get items
        ArrayList<Item> itemsByCate = getItemsByCategory(cate);
    }

    public ArrayList<Item> loadItems(){
        ArrayList<Item> its = new ArrayList<>();
        its.add(new Item("chair", "chair", "dining room"));
        its.add(new Item("sofa", "sofa", "living room"));
        its.add(new Item("bed", "bed", "bed room"));
        return its;
    }

    public ArrayList<Item> getItemsByCategory(String cate){
        ArrayList<Item> itsByCate = new ArrayList<>();
        for (Item item: items){
            if(item.getCate().equals(cate)){
                itsByCate.add(item);
            }
        }
        return itsByCate;
    }


}
