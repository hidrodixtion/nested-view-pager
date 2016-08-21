package com.lonelybox.nestedviewpagerlearn.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lonelybox.nestedviewpagerlearn.TextFragment;
import com.lonelybox.nestedviewpagerlearn.ViewPagerFragment;

import java.util.List;

/**
 * Created by adinugroho
 */
public class ParentAdapter extends FragmentPagerAdapter {
    private final List<String> mTitles;

    public ParentAdapter(FragmentManager fm, List<String> titles) {
        super(fm);
        mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return ViewPagerFragment.newInstance();
        } else {
            return TextFragment.newInstance(position);
        }
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
