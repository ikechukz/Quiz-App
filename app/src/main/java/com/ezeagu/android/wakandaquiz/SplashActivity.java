package com.ezeagu.android.wakandaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.argb;

public class SplashActivity extends AppCompatActivity {
    Button button;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView imageView = (ImageView) findViewById(R.id.rotate);
        TextView textView = (TextView) findViewById(R.id.wakandatext);
        TextView textView2 = (TextView) findViewById(R.id.iktext);

        relativeLayout =(RelativeLayout) findViewById(R.id.splashlayout);
        relativeLayout.setBackgroundColor(argb(200,189,189,189));

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotateanim);
        imageView.setAnimation(animation);

        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.downanim);
        textView.setAnimation(animation2);


        button = (Button) findViewById(R.id.buttonstart);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                Toast.makeText(SplashActivity.this, "WAKANDA FOREVER", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        });
    }
}
