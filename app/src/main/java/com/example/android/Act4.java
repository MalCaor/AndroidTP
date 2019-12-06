package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;


public class Act4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
        Button fin=(Button) findViewById(R.id.btnOk);
        fin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean errorAge = false;
                String age=((EditText)findViewById(R.id.etAge)).getText().toString();
                try
                {
                    // check age
                    int iage=Integer.parseInt(age);
                }
                catch (NumberFormatException e)
                {
                    Toast.makeText(getApplicationContext(), "Age Invalide", Toast.LENGTH_SHORT).show();
                    errorAge = true;
                }
                if (!errorAge) {
                    int iage=Integer.parseInt(age);
                    String numf = ((EditText) findViewById(R.id.etNum)).getText().toString();
                    long lfetiche = Long.parseLong(numf);
                    Intent intent = new Intent();
                    intent.putExtra("string_1", ((EditText) findViewById(R.id.etNom)).getText().toString());
                    intent.putExtra("string_2", ((EditText) findViewById(R.id.etPre)).getText().toString());
                    intent.putExtra("int_1", iage);
                    intent.putExtra("long_1", lfetiche);

                    setResult(Activity.RESULT_OK, intent);
                    finish();
                }

            }
        });
    }
}
