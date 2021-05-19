package com.example.facebooklinkedinlogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class splash_screen extends Activity {

    TextView designed, name, name2, app_name;
    ImageView logo;
    LinearLayout vish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        logo = findViewById(R.id.logo);
        designed = findViewById(R.id.designed);
        name = findViewById(R.id.name);
        name2 = findViewById(R.id.app_name2);
        app_name = findViewById(R.id.app_name);
        vish = findViewById(R.id.vish);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startEnterAnimation();
            }
        }, 2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();

            }
        }, 5500);
    }

    private void startEnterAnimation() {
        app_name.startAnimation(AnimationUtils.loadAnimation(splash_screen.this, R.anim.bottom));
        logo.startAnimation(AnimationUtils.loadAnimation(splash_screen.this, R.anim.p_in));
        vish.startAnimation(AnimationUtils.loadAnimation(splash_screen.this, R.anim.bottom));
        name2.startAnimation(AnimationUtils.loadAnimation(splash_screen.this, R.anim.bottom));


        logo.setVisibility(View.VISIBLE);
        designed.setVisibility(View.VISIBLE);
        name.setVisibility(View.VISIBLE);
        app_name.setVisibility(View.VISIBLE);
        name2.setVisibility(View.VISIBLE);


    }
}
