package com.ezeagu.android.wakandaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;
    TextView display;
    ImageView images;
    Intent intent;
    int score4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        button1 = (Button) findViewById(R.id.btn_one);
        button2 = (Button) findViewById(R.id.btn_two);
        button3 = (Button) findViewById(R.id.btn_three);
        button4 = (Button) findViewById(R.id.btn_four);

        display = (TextView) findViewById(R.id.display);
        images  = (ImageView) findViewById(R.id.images);
        Questions();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FourthActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(FourthActivity.this,SixthActivity.class);

                Intent intent2 = getIntent();
                score4 = intent2.getIntExtra("score3",0);
                score4 += 0;
                intent.putExtra("score4",score4);

                startActivity(intent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FourthActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(FourthActivity.this,FifthActivity.class);

                Intent intent2 = getIntent();
                score4 = intent2.getIntExtra("score3",0);
                score4 += 0;
                intent.putExtra("score4",score4);

                startActivity(intent);
                finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FourthActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(FourthActivity.this,FifthActivity.class);

                Intent intent2 = getIntent();
                score4 = intent2.getIntExtra("score3",0);
                score4 += 0;
                intent.putExtra("score4",score4);

                startActivity(intent);
                finish();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FourthActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                intent = new Intent(FourthActivity.this,FifthActivity.class);

                Intent intent2 = getIntent();
                score4 = intent2.getIntExtra("score3",0);
                score4 += 1;
                intent.putExtra("score4",score4);

                startActivity(intent);
                finish();
            }
        });
    }


    private void Questions(){
        display.setText("In order to gain the power of The Black Panther, T’Challa must consume an herb. What shape is it?");
        button1.setText("A Fist");
        button2.setText("A Star");
        button3.setText("A Slipper");
        button4.setText("A Heart");
    }




}