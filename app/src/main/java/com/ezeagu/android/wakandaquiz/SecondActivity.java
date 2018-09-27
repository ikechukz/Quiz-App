package com.ezeagu.android.wakandaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView display;
    Intent intent;
    int score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        display = (TextView) findViewById(R.id.display);
        display.setText("Each king of Wakanda has some amazing female warriors that protects him. What are they called?");
        editText = (EditText)findViewById(R.id.textedit);

        getAnswer();

    }



    public void getAnswer(){
        button = (Button)findViewById(R.id.submitbutton2);
        editText = (EditText)findViewById(R.id.textedit);


        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                if (text.equals("dora milaje") || text.equals("DORA MILAJE" ) || text.equals("Dora Milaje")) {
                    Toast.makeText(SecondActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    intent = new Intent(SecondActivity.this, ThirdActivity.class);

                    Intent intent2 = getIntent();
                    score2 = intent2.getIntExtra("scoreValue", 0);
                    score2 += 1;
                    intent.putExtra("score2", score2);

                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(SecondActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    intent = new Intent(SecondActivity.this, ThirdActivity.class);

                    Intent intent2 = getIntent();
                    score2 = intent2.getIntExtra("scoreValue", 0);
                    score2 += 0;
                    intent.putExtra("score2", score2);

                    startActivity(intent);
                    finish();
                }


            }
        });





}
}


