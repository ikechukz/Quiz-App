package com.ezeagu.android.wakandaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SixthActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;
    TextView display;
    ImageView images;
    Intent intent;
    int score6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

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
                Toast.makeText(SixthActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(SixthActivity.this,ResultActivity.class);

                Intent intent2 = getIntent();
                score6 = intent2.getIntExtra("score5",0);
                score6 += 0;
                intent.putExtra("score6",score6);

                startActivity(intent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SixthActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                intent = new Intent(SixthActivity.this,ResultActivity.class);

                Intent intent2 = getIntent();
                score6 = intent2.getIntExtra("score5",0);
                score6 += 1;
                intent.putExtra("score6",score6);

                startActivity(intent);
                finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SixthActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(SixthActivity.this,ResultActivity.class);

                Intent intent2 = getIntent();
                score6 = intent2.getIntExtra("score5",0);
                score6 += 0;
                intent.putExtra("score6",score6);

                startActivity(intent);
                finish();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SixthActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                intent = new Intent(SixthActivity.this,ResultActivity.class);

                Intent intent2 = getIntent();
                score6 = intent2.getIntExtra("score5",0);
                score6 += 0;
                intent.putExtra("score6",score6);

                startActivity(intent);
                finish();
            }
        });
    }


    private void Questions(){
        display.setText("What relationship does T’Challa’s enemy, Erik Killmonger, have with him?");
        button1.setText("Uncle");
        button2.setText("Cousin");
        button3.setText("Brother");
        button4.setText("Nephew");
    }




}