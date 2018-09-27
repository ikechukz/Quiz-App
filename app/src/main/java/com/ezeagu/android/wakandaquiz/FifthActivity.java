package com.ezeagu.android.wakandaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FifthActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;
    TextView display;
    ImageView images;
    Intent intent;
    int score5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fift);

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
                Toast.makeText(FifthActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(FifthActivity.this,SixthActivity.class);

                Intent intent2 = getIntent();
                score5 = intent2.getIntExtra("score4",0);
                score5 += 0;
                intent.putExtra("score5",score5);

                startActivity(intent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FifthActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                intent = new Intent(FifthActivity.this,SixthActivity.class);

                Intent intent2 = getIntent();
                score5 = intent2.getIntExtra("score4",0);
                score5 += 1;
                intent.putExtra("score5",score5);

                startActivity(intent);
                finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FifthActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(FifthActivity.this,SixthActivity.class);

                Intent intent2 = getIntent();
                score5 = intent2.getIntExtra("score4",0);
                score5 += 0;
                intent.putExtra("score5",score5);

                startActivity(intent);
                finish();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FifthActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(FifthActivity.this,SixthActivity.class);

                Intent intent2 = getIntent();
                score5 = intent2.getIntExtra("score4",0);
                score5 += 0;
                intent.putExtra("score5",score5);

                startActivity(intent);
                finish();
            }
        });
    }


    private void Questions(){
        display.setText("Who killed T’Challa’s father, T’Chaka?");
        button1.setText("Ulysses Klaue");
        button2.setText("The Winter Soldier");
        button3.setText("Erik Killmonger");
        button4.setText("M’Baku");
    }




}