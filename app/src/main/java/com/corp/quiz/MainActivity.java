package com.corp.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button yes, no;
    TextView question;

    private String[] Questions = {"Python is Programming Language ?", "Elon Musk is The CEO of Tesla ?",
            "Java Developed by James Gosling ?", "Java Owned by TATA ?", ".py is Extension of JAVA ?"};

    boolean[] answer = {true, true, true, false, false};
    private int index = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        yes = findViewById(R.id.YES);
        no = findViewById(R.id.NO);
        question = findViewById(R.id.QUESTION);
        question.setText(Questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= Questions.length - 1) {
                    if (answer[index]) {
                        score++;

                    }
                    index++;
                    if (index <= Questions.length - 1) {
                        question.setText(Questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "your score is: " + score, Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Restart Your App for start Quiz", Toast.LENGTH_SHORT).show();
                }
            }
        });


        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= Questions.length - 1) {
                    if (!answer[index]) {
                        score++;

                    }
                    index++;
                    if (index <= Questions.length - 1) {
                        question.setText(Questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "your score is: " + score, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Restart Your App for start Quiz", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

}