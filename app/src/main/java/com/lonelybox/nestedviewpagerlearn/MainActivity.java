package com.lonelybox.nestedviewpagerlearn;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lonelybox.nestedviewpagerlearn.adapter.ParentAdapter;
import com.lonelybox.nestedviewpagerlearn.custom.CustomViewPager;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomViewPager vp = (CustomViewPager) findViewById(R.id.viewpager);
        TabLayout tl = (TabLayout) findViewById(R.id.tab_layout);

        ParentAdapter adapter = new ParentAdapter(getSupportFragmentManager(), new ArrayList<>(Arrays.asList("SATU", "DUA", "TIGA")));

        vp.setPaging(false);
        vp.setAdapter(adapter);
        vp.setOffscreenPageLimit(3);
        tl.setupWithViewPager(vp);
    }
}
