package com.alphonso.finalproject;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.alphonso.finalproject.adapter.ScalePagerAdapter;

import java.util.ArrayList;

public class PorscheActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ScalePagerAdapter adapter;
    private View view1;
    private ArrayList<View> list;
    private View view2;
    private View view3;
    private View view4;
    private View view5;
    private View view6;
    private View view7;
    private View view8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porsche);
        viewPager = (ViewPager) findViewById(R.id.porsche_view_Pager);
        LayoutInflater lf  = getLayoutInflater().from(this);

        view1 = lf.inflate(R.layout.porsche_scale_center1,null);
        view2 = lf.inflate(R.layout.porsche_scale_center2,null);
        view3 = lf.inflate(R.layout.porsche_scale_center3,null);
        view4 = lf.inflate(R.layout.porsche_scale_center4,null);
        view5 = lf.inflate(R.layout.porsche_scale_center5,null);

        list = new ArrayList<>();
        list.add(view1);
        list.add(view2);
        list.add(view3);
        list.add(view4);
        list.add(view5);
        adapter = new ScalePagerAdapter(list);

        viewPager.setAdapter(adapter);

    }
}
