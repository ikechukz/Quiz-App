package com.ezeagu.android.wakandaquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.rgb;

public class ResultActivity extends AppCompatActivity {
    TextView resultText;
    TextView remarkText;
    int result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        button = (Button)findViewById(R.id.score);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                result = intent.getIntExtra("score6", 0);

                resultText = (TextView) findViewById(R.id.resultText);
                resultText.setText("SCORE: " + result);
                String finalScore = String.valueOf(result);
                Toast.makeText(ResultActivity.this, "SCORE: "+ finalScore+ " out of 6", Toast.LENGTH_SHORT).show();


                if (result < 4) {
                    remarkText = (TextView) findViewById(R.id.remarkText);
                    remarkText.setTextColor(rgb(255, 0, 0));
                    remarkText.setText("BAD SCORE");
                } else if (result == 4 || result == 5) {
                    remarkText = (TextView) findViewById(R.id.remarkText);
                    remarkText.setTextColor(rgb(255, 255, 255));
                    remarkText.setText("NOT BAD");
                } else {
                    remarkText = (TextView) findViewById(R.id.remarkText);
                    remarkText.setTextColor(rgb(0, 255, 0));
                    remarkText.setText("VERY GOOD");
                }

                Timer();
            }
        });


    }

    private void GameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ResultActivity.this);
        alertDialogBuilder
                .setMessage("Game Over")
                .setCancelable(false)
                .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                        finish();
                    }
                });
        alertDialogBuilder.show();

    }


    private void Timer() {

        new CountDownTimer(8000, 1000) {
            @Override
            public void onTick(long l) {
                TextView textView = (TextView) findViewById(R.id.timerText);
                textView.setText(l / 1000 + "S");
            }

            @Override
            public void onFinish() {
                GameOver();

            }
        }.start();
    }
}