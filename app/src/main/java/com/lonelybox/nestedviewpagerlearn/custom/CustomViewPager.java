package com.lonelybox.nestedviewpagerlearn.custom;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by adinugroho
 */
public class CustomViewPager extends ViewPager {
    private Boolean mEnabled = true;

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        Log.v("CUSTOMVP", ev + "");
        if (mEnabled) {
            return super.onInterceptTouchEvent(ev);
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (mEnabled) {
            return super.onTouchEvent(ev);
        }
        return false;
    }

    public void setPaging(Boolean isPagingEnable) {
        mEnabled = isPagingEnable;
    }
}
