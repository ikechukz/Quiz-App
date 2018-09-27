package com.ezeagu.android.wakandaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    CheckBox chk1, chk2, chk3, chk4;
    Button button;
    TextView display;
    ImageView images;
    Intent intent;
    int score3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        chk1 = (CheckBox) findViewById(R.id.chkbtn_one);
        chk2 = (CheckBox) findViewById(R.id.chkbtn_two);
        chk3 = (CheckBox) findViewById(R.id.chkbtn_three);
        chk4 = (CheckBox) findViewById(R.id.chkbtn_four);

        display = (TextView) findViewById(R.id.display);
        images = (ImageView) findViewById(R.id.images);
        Questions();

        getSelected();
    }


    private void Questions() {
        display.setText("Select The Correct Answers From The Following");
        chk1.setText("Erik Killmonger is the son of King T'Chaka");
        chk2.setText("The Black Panther was released in 2018");
        chk3.setText("King T'Challa has a PHD in Astronomy");
        chk4.setText("Wakanda is hidden in the mountains");
    }

    private void getSelected() {
        button = (Button) findViewById(R.id.chksubmit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (chk2.isChecked() && chk4.isChecked()) {
                    Toast.makeText(ThirdActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    intent = new Intent(ThirdActivity.this, FourthActivity.class);

                    Intent intent2 = getIntent();
                    score3 = intent2.getIntExtra("score2", 0);
                    score3 += 1;
                    intent.putExtra("score3", score3);

                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(ThirdActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    intent = new Intent(ThirdActivity.this, FourthActivity.class);

                    Intent intent2 = getIntent();
                    score3 = intent2.getIntExtra("score2", 0);
                    score3 += 0;
                    intent.putExtra("score3", score3);

                    startActivity(intent);
                    finish();
                }
            }
        });

    }

}
