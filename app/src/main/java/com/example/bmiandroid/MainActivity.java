package com.example.bmiandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private EditText txt1;
    private EditText txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = this.findViewById(R.id.kg_java);
        txt2 = this.findViewById(R.id.m_java);
    }

    public void endButton(View view){
        this.finish();
    }

    public void subButton(View view) {
        Intent intent1 = new Intent(MainActivity.this, SubActivity.class);
        intent1.putExtra("message1",Double.parseDouble(txt1.getText().toString()));
        intent1.putExtra("message2",Double.parseDouble(txt2.getText().toString()));
        startActivity(intent1);
        this.finish();
    }

}