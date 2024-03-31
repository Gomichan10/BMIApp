package com.example.bmiandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);


        TextView subTxt = (TextView)this.findViewById(R.id.subText);

        Intent intent1 = getIntent();
        Double word1 = intent1.getDoubleExtra("message1",0);
        Double word2 = intent1.getDoubleExtra("message2",0);

        word2 = word2 * 0.01;
        double bmi = word1 / word2 / word2;
        //int num = (int)bmi;
        //String word = String.valueOf(num);
        subTxt.setText("あなたのBMIは" + String.format("%.1f",bmi) + "です");

    }

    public void BackButton(View view){
        Intent intent2 = new Intent(SubActivity.this,MainActivity.class);
        startActivity(intent2);
        this.finish();
    }
}
