package com.lonelybox.nestedviewpagerlearn.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.lonelybox.nestedviewpagerlearn.TextFragment;

import java.util.List;

/**
 * Created by adinugroho
 */
public class ChildAdapter extends FragmentPagerAdapter {
    private final List<String> mTitles;

    public ChildAdapter(FragmentManager fm, List<String> titles) {
        super(fm);
        mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        TextFragment fragment = TextFragment.newInstance(position, true);
        Log.v("ChildAdapter", fragment + "");
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
