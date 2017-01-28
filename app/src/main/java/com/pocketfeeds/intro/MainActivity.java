package com.pocketfeeds.intro;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setButtonBackVisible(false);
        setButtonNextVisible(false);
        setFullscreen(true);
        setPagerIndicatorVisible(true);
        setPageScrollDuration(1000);
        setPageScrollInterpolator(android.R.interpolator.fast_out_slow_in);

        addSlide(new FragmentSlide.Builder()
                .background(R.color.colorPrimary)
                .backgroundDark(R.color.gray)
                .fragment(new MainPageFragment())
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Information in your pocket")
                .description("This app gives a quick access to a forum with necessary dept. information")
                .layout(R.layout.intro_layout)
                .background(android.R.color.white)
                .backgroundDark(R.color.gray)
                .layout(R.layout.intro_layout)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Materialism")
                .description("Following the trend of material design")
                .layout(R.layout.intro_layout)
                .background(android.R.color.white)
                .backgroundDark(R.color.gray)
                .layout(R.layout.intro_layout)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Quick Access")
                .description("CSE department info in your pocket")
                .layout(R.layout.intro_layout)
                .background(android.R.color.white)
                .backgroundDark(R.color.gray)
                .layout(R.layout.intro_layout)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Vels University")
                .description("We excel in all fields")
                .layout(R.layout.intro_layout)
                .background(android.R.color.white)
                .backgroundDark(R.color.gray)
                .build());

        //autoplay(2500, INFINITE);
    }

}
