package com.example.udacity.cricketquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.attr.checked;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score=0;
    public void submitQuiz(View view) {
        if (score==0) {
            RadioButton checked = (RadioButton) findViewById(R.id.option1);
            if (checked.isChecked() == true) {
                score = score + 1;
            }
            RadioButton checked2 = (RadioButton) findViewById(R.id.answer2);
            if (checked2.isChecked() == true) {
                score = score + 1;
            }
            CheckBox checkBox = (CheckBox) findViewById(R.id.answer3_1);
            CheckBox checkBox1 = (CheckBox) findViewById(R.id.answer3_2);
            CheckBox checkBox2 = (CheckBox) findViewById(R.id.answer3_3);
            if ((checkBox.isChecked()) && (checkBox1.isChecked()) && (checkBox2).isChecked()) {
                score = score + 1;
            }

            EditText text = (EditText) findViewById(R.id.edittext);
            if (text.getText().toString().equals("Brain Lara")) {
                score = score + 1;
            }
            CheckBox checkBox3 = (CheckBox) findViewById(R.id.answer5);
            CheckBox checkBox4 = (CheckBox) findViewById(R.id.answer5_1);
            if ((checkBox3.isChecked()) && (checkBox4.isChecked())) {
                score = score + 1;
            }
            Toast.makeText(this, "You have scored " + score + " out of 5", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this,"You have scored " + score + " out of 5",Toast.LENGTH_SHORT).show();
        }
    }
}
