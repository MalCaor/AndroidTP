package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        Button fin=(Button) findViewById(R.id.button2);
        fin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();

            }
        });
        Bundle b = getIntent().getExtras();
        String param1 = b.getString("param1");
        int param2=b.getInt("param2");
        Toast.makeText(getApplicationContext(),	param1+ Integer.toString(param2),Toast.LENGTH_SHORT).show();
    }
}
