package com.lonelybox.nestedviewpagerlearn;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

public class TextFragment extends Fragment {

    private int mPosition;
    private boolean mIsChild;

    public TextFragment() {
        // Required empty public constructor
    }

    public static TextFragment newInstance(int position, boolean isChild) {
        TextFragment fragment = new TextFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        args.putBoolean("ischild", isChild);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_text, container, false);
        TextView txtView = (TextView) v.findViewById(R.id.txt_view);

        if (getArguments() != null) {
            mPosition = getArguments().getInt("position");
            mIsChild = getArguments().getBoolean("ischild");
        }

        if (mIsChild) {
            txtView.setText(
                    String.format("Child Fragment : %s", mPosition)
            );
        } else {
            txtView.setText(
                    String.format("Parent Fragment : %s", mPosition)
            );
        }

        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        v.setBackgroundColor(color);

        return v;
    }
}
