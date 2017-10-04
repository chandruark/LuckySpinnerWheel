package com.example.chandru.spinnerwheel;

import java.util.Random;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button b;
    TextView t;
    ImageView im;
    Random r;
    public static final float FACTOR=18.0f;
    int degree=0,degree_old=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.spin);

        im=(ImageView)findViewById(R.id.wheel);
        r=new Random();
        b.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                degree_old=degree%360;
                degree=r.nextInt(3600)+720;
                RotateAnimation rotate = new RotateAnimation(degree_old,degree,
                        RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotate.setDuration(3600);
                rotate.setFillAfter(true);
                rotate.setInterpolator(new DecelerateInterpolator());
                rotate.setAnimationListener(new AnimationListener() {

                    @Override
                    public void onAnimationStart(Animation arg0) {
                        // TODO Auto-generated method stub

                        //t.setText(currentNumber(360-(degree % 360)));
                    }

                    @Override
                    public void onAnimationRepeat(Animation arg0) {
                        // TODO Auto-generated method stub


                    }

                    @Override
                    public void onAnimationEnd(Animation arg0) {
                        // TODO Auto-generated method stub
                        currentNumber(360-(degree % 360));

                    }
                });
                im.startAnimation(rotate);
            }
        });
    }

    private void currentNumber(int degree)
    {
        String text="";

        if(degree >=(FACTOR * 1) &&  degree <  (FACTOR * 2))
            text="10 you won";
        if(degree >=(FACTOR * 2) &&  degree <  (FACTOR * 3))
            text="15 you won";
        if(degree >=(FACTOR * 3) &&  degree <  (FACTOR * 4))
            text="5 you won";
        if(degree >=(FACTOR * 4) &&  degree <  (FACTOR * 5))
            text="25 you won";
        if(degree >=(FACTOR * 5) &&  degree <  (FACTOR * 6))
            text="5 you won";
        if(degree >=(FACTOR * 6) &&  degree <  (FACTOR * 7))
            text="10 you won";
        if(degree >=(FACTOR * 7) &&  degree <  (FACTOR * 8))
            text="5 you won";
        if(degree >=(FACTOR * 8) &&  degree <  (FACTOR * 9))
            text="15 you won";
//        if(degree >=(FACTOR * 17) &&  degree <  (FACTOR * 19))
//            text="34 red";
//        if(degree >=(FACTOR * 19) &&  degree <  (FACTOR * 21))
//            text="6 black";
//        if(degree >=(FACTOR * 21) &&  degree <  (FACTOR * 23))
//            text="27 red";
//        if(degree>=(FACTOR * 23) &&  degree <  (FACTOR * 25))
//            text="13 black";
//        if(degree>=(FACTOR * 25) &&  degree <  (FACTOR * 27))
//            text="36 red";
//        if(degree>=(FACTOR * 27) &&  degree <  (FACTOR * 29))
//            text="11 black";
//        if(degree>=(FACTOR * 29) &&  degree <  (FACTOR * 31))
//            text="30 red";
//        if(degree>=(FACTOR * 31) &&  degree <  (FACTOR * 33))
//            text="8 black";
//        if(degree>=(FACTOR * 33) &&  degree <  (FACTOR * 35))
//            text="32 red";
//        if(degree>=(FACTOR * 35) &&  degree <  (FACTOR * 37))
//            text="10 black";
//        if(degree>=(FACTOR * 37) &&  degree <  (FACTOR * 39))
//            text="5 red";
//        if(degree>=(FACTOR * 39) &&  degree <  (FACTOR * 41))
//            text="24 black";
//        if(degree>=(FACTOR * 41) &&  degree <  (FACTOR * 43))
//            text="16 red";
//        if(degree>=(FACTOR * 43) &&  degree <  (FACTOR * 45))
//            text="33 black";
//        if(degree>=(FACTOR * 45) &&  degree <  (FACTOR * 47))
//            text="1 red";
//        if(degree>=(FACTOR * 47) &&  degree <  (FACTOR * 49))
//            text="20 black";
//        if(degree>=(FACTOR * 49) &&  degree <  (FACTOR * 51))
//            text="14 red";
//        if(degree>=(FACTOR * 51) &&  degree <  (FACTOR * 53))
//            text="31 black";
//        if(degree>=(FACTOR * 53) &&  degree <  (FACTOR * 55))
//            text="9 red";
//        if(degree>=(FACTOR * 55) &&  degree <  (FACTOR * 57))
//            text="22 black";
//        if(degree>=(FACTOR * 57) &&  degree <  (FACTOR * 59))
//            text="18 red";
//        if(degree>=(FACTOR * 59) &&  degree <  (FACTOR * 61))
//            text="29 black";
//        if(degree>=(FACTOR * 61) &&  degree <  (FACTOR * 63))
//            text="7 red";
//        if(degree>=(FACTOR * 63) &&  degree <  (FACTOR * 65))
//            text="28 black";
//        if(degree>=(FACTOR * 65) &&  degree <  (FACTOR * 67))
//            text="12 red";
//        if(degree>=(FACTOR * 67) &&  degree <  (FACTOR * 69))
//            text="35 black";
//        if(degree>=(FACTOR * 69) &&  degree <  (FACTOR * 71))
//            text="3 red";
//        if(degree>=(FACTOR * 71) &&  degree <  (FACTOR * 73))
//            text="26 black";
        if((degree>=(FACTOR * 10) &&  degree < 360) || (degree >=0  && degree < (FACTOR * 1)))
            text="10 you won ten dollars";

        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
        //return text;

    }





}