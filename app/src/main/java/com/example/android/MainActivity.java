package com.example.android;

import android.content.Intent;
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
import android.app.Activity;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Var
    private int test;
    private ArrayList<Integer> macollec;
    private Intent i;
    static final int CODE_RETOUR_ACTIVITY3 = 3;
    static final int CODE_RETOUR_ACTIVITY4 = 4;

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
        switch (item.getItemId()) {
            case R.id.menu_act1:
                Toast.makeText(getApplicationContext(), "clic sur act1", Toast.LENGTH_SHORT).show();
                i = new Intent(getApplicationContext(), Act1.class);
                startActivity(i);
                return true;
            case R.id.menu_act2:
                Toast.makeText(getApplicationContext(), "clic sur act2", Toast.LENGTH_SHORT).show();
                i = new Intent(getApplicationContext(), Act2.class);
                i.putExtra("param1", "Passage de la valise pour l’activity : ");
                i.putExtra("param2", 2);
                startActivity(i);
                return true;
            case R.id.menu_act3:
                Toast.makeText(getApplicationContext(), "clic sur act3", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_act4:
                Toast.makeText(getApplicationContext(), "clic sur act4", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // on regarde quelle Activity a répondu

        switch (requestCode) {
            case CODE_RETOUR_ACTIVITY3:

                switch (resultCode) {
                    case Activity.RESULT_OK:
                        Toast.makeText(getApplicationContext(),	"retour act3 ok",Toast.LENGTH_SHORT).show();
                        return;

                    case Activity.RESULT_CANCELED:
                        Toast.makeText(getApplicationContext(),	"retour act3 cancel",Toast.LENGTH_SHORT).show();
                        return;
                }

            case CODE_RETOUR_ACTIVITY4:
                switch (resultCode) {
                    case Activity.RESULT_OK:
                        Bundle b = data.getExtras();
                        String string_1 = b.getString("string_1","");
                        String string_2 = b.getString ("string_2","");
                        int int_1 = b.getInt("int_1", 0);
                        long long_1 = b.getLong ("long_1", 0);
                        Toast.makeText(getApplicationContext(),	"retour act4 ok : " + string_1+" "+string_2 +" "+Integer.toString(int_1)+" "+Long.toString(long_1),Toast.LENGTH_SHORT).show();
                        return;

                    case Activity.RESULT_CANCELED:
                        Toast.makeText(getApplicationContext(),	"retour act4 cancel",Toast.LENGTH_SHORT).show();
                        return;
                }
        }
    }
}
