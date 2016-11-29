package com.zephyr.intro;

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
                .title("No more brightness sliders")
                .description("Just swipe on the statusbar, and change the screen brightness easily.")
                .layout(R.layout.intro_layout)
                .background(android.R.color.white)
                .backgroundDark(R.color.gray)
                .layout(R.layout.intro_layout)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Zephyrthug")
                .description("Zephyrthug is insane")
                .layout(R.layout.intro_layout)
                .background(android.R.color.white)
                .backgroundDark(R.color.gray)
                .layout(R.layout.intro_layout)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Zephyr")
                .description("ZephyrRox")
                .layout(R.layout.intro_layout)
                .background(android.R.color.white)
                .backgroundDark(R.color.gray)
                .layout(R.layout.intro_layout)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Zephyr")
                .description("Desc")
                .layout(R.layout.intro_layout)
                .background(android.R.color.white)
                .backgroundDark(R.color.gray)
                .build());

        //autoplay(2500, INFINITE);
    }

}
