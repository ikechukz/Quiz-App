package com.ezeagu.android.wakandaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static int score = 0;
    RadioGroup group;
    RadioButton button1, button2, button3, button4,check;
    Button submit;
    TextView display;
    ImageView images;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group = (RadioGroup) findViewById(R.id.radiogroup);
        button1 = (RadioButton) findViewById(R.id.btn_one);
        button2 = (RadioButton) findViewById(R.id.btn_two);
        button3 = (RadioButton) findViewById(R.id.btn_three);
        button4 = (RadioButton) findViewById(R.id.btn_four);

        display = (TextView) findViewById(R.id.display);
        images  = (ImageView) findViewById(R.id.images);
        Questions();
        addListenerOnButton();

    }
    public void addListenerOnButton(){
        group = (RadioGroup)findViewById(R.id.radiogroup);
        submit = (Button) findViewById(R.id.submitbutton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = group.getCheckedRadioButtonId();
                check = (RadioButton)findViewById(selectedId);

                if(check.getText() == "Wakanda"){
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    score += 1;
                    intent = new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("scoreValue",score);
                    startActivity(intent);
                    finish();
                }

                else {
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    intent = new Intent(MainActivity.this,SecondActivity.class);
                    score += 0;
                    intent = new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("scoreValue",score);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    private void Questions(){
    display.setText("What is the name of the country that The Black Panther rules? ");
    button1.setText("Wakanda");
    button2.setText("Hakara");
    button3.setText("Ocarina");
    button4.setText("Nigeria");
    }




}


