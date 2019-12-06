package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.app.Activity;

public class Act3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
        Button fin = (Button) findViewById(R.id.Button);
        fin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setResult(Activity.RESULT_OK);
                finish();

            }
        });
    }
}
