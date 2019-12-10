package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
public class Activity5 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        SharedPreferences myPrefs = this.getSharedPreferences("mesvariablesglobales", 0);
        String mapref = myPrefs.getString("mapref", "nothing");
        JsonElement vjson = new JsonParser().parse(mapref);
        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        eleve vmapref=gson.fromJson(vjson,eleve.class);
        Toast.makeText(getApplicationContext(),    vmapref.getNom()+" "+vmapref.getPrenom()+" "+new SimpleDateFormat("dd/MM/yyyy").format(vmapref.getDatenaiss()) ,Toast.LENGTH_LONG).show();

        // set the TextView
        final TextView etNum    = (TextView)findViewById(R.id.etNum);
        final TextView etNom    = (TextView)findViewById(R.id.etNom);
        final TextView etPrenom = (TextView)findViewById(R.id.etPrenom);
        final TextView etAge    = (TextView)findViewById(R.id.etAge);
        final TextView etAdd    = (TextView)findViewById(R.id.etAdd);
        final TextView etDate   = (TextView)findViewById(R.id.etDate);

        // set the value of textView
        etNum.setText(String.valueOf(vmapref.getNum()));
        etNom.setText(vmapref.getNom());
        etPrenom.setText(vmapref.getPrenom());
        etAge.setText(String.valueOf(vmapref.getAge()));
        etAdd.setText(vmapref.getAdresse());
        etDate.setText(String.valueOf(vmapref.getAge()));

        // get the button
        Button Ok  = (Button)findViewById(R.id.btnOk);
        Button Can = (Button)findViewById(R.id.btnCancel);

        // Cancel BTN
        Can.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();

            }
        });

        // OK btn
        Ok.setOnClickListener(new View.OnClickListener() {
            boolean BNum, BNom, BPre, BAge, BAdd, BDate;
            BNum = BNom = BPre = BAge = BAdd = BDate = false;
            public void onClick(View v) {
                try {
                    String num=((EditText)findViewById(R.id.etNum)).getText().toString();
                }

            }
        });
    }
}
