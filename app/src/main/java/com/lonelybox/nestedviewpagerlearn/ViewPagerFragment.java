package com.lonelybox.nestedviewpagerlearn;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lonelybox.nestedviewpagerlearn.adapter.ChildAdapter;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewPagerFragment extends Fragment {

    public ViewPagerFragment() {
        // Required empty public constructor
    }

    public static ViewPagerFragment newInstance() {
        return new ViewPagerFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_view_pager, container, false);

        ViewPager vp = (ViewPager) v.findViewById(R.id.view_pager);
        TabLayout tl = (TabLayout) v.findViewById(R.id.tab_layout);

        ChildAdapter adapter = new ChildAdapter(getFragmentManager(), new ArrayList<>(Arrays.asList("Child Satu", "Child Dua", "Child Tiga")));

        vp.setAdapter(adapter);
        tl.setupWithViewPager(vp);

        return v;
    }

}
