package com.example.android;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import java.util.ArrayList;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Var
    private int test;
    private ArrayList<Integer> macollec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // debug message
        Log.d("Main", "test pour debug");

        // Array list
        Button act1=(Button) findViewById(R.id.act1);
        Button act2=(Button) findViewById(R.id.act2);
        Button act3=(Button) findViewById(R.id.act3);
        Button act4=(Button) findViewById(R.id.act4);
        act1.setOnClickListener(btnclick);
        act2.setOnClickListener(btnclick);
        act3.setOnClickListener(btnclick);
        act4.setOnClickListener(btnclick);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    private OnClickListener btnclick = new OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.act1:
                    Toast.makeText(getApplicationContext(),    "clic sur act1",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.act2:
                    Toast.makeText(getApplicationContext(),    "clic sur act2",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.act3:
                    Toast.makeText(getApplicationContext(),    "clic sur act3",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.act4:
                    Toast.makeText(getApplicationContext(),    "clic sur act4",Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
