package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.content.Intent;


public class Act4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
        Button fin=(Button) findViewById(R.id.btnOk);
        fin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String age=((EditText)findViewById(R.id.etAge)).getText().toString();
                int iage=Integer.parseInt(age);
                String numf=((EditText)findViewById(R.id.etNum)).getText().toString();
                long lfetiche=Long.parseLong(numf);
                Intent intent = new Intent ();
                intent.putExtra ("string_1", ((EditText)findViewById(R.id.etNom)).getText().toString());
                intent.putExtra ("string_2", ((EditText)findViewById(R.id.etPre)).getText().toString());
                intent.putExtra ("int_1", iage);
                intent.putExtra ("long_1", lfetiche);

                setResult (Activity.RESULT_OK,intent);
                finish();

            }
        });
    }
}
