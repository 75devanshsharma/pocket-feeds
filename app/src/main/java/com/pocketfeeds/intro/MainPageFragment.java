package com.pocketfeeds.intro;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanks.htextview.HTextView;

/**
 * Created by Js on 10/21/2016.
 */

public class MainPageFragment extends Fragment {
    View rootView;
    HTextView hTextView;
    String [] sentences = {"Quick Access", "Material Design", "CSE Department", "in your pocket", "Pocket Feeds", "Made in Vels"};
    final long DELAY = 1000;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.intro_main_page, container, false);
        hTextView = (HTextView) rootView.findViewById(R.id.pocketfeeds_text);
        int i;

        for(i = 0; i < sentences.length - 1; i++ ) {
            final String sentence = sentences[i];
            hTextView.postDelayed(new Runnable() {
                @Override
                public void run() {
                        hTextView.animateText(sentence);
                }
            }, i * DELAY);
        }

        hTextView.setTextSize(hTextView.getTextSize() - 5);
        final String sentence = sentences[i];
        hTextView.postDelayed(new Runnable() {
            @Override
            public void run() {
                hTextView.animateText(sentence);
            }
        }, i * DELAY + 500);
        return rootView;
    }
}
