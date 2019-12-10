package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

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
        final eleve vmapref=gson.fromJson(vjson,eleve.class);
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
            public void onClick(View v) {

                // les var de test
                boolean BNum, BNom, BPre, BAge, BAdd, BDate;
                BNum = BNom = BPre = BAge = BAdd = BDate = false;


                // ### LES TESTS ###
                // LE NUM
                try {
                    int num=Integer.parseInt(((EditText)findViewById(R.id.etNum)).getText().toString());
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Num invalide", Toast.LENGTH_SHORT).show();
                    BNum = true;
                }

                // LE NOM
                try {
                    String nom=((EditText)findViewById(R.id.etNom)).getText().toString();
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Nom invalide", Toast.LENGTH_SHORT).show();
                    BNom = true;
                }

                // LE PRENOM
                try {
                    String pre=((EditText)findViewById(R.id.etPrenom)).getText().toString();
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Prenom invalide", Toast.LENGTH_SHORT).show();
                    BPre = true;
                }

                //L AGE
                try {
                    int age=Integer.parseInt(((EditText)findViewById(R.id.etAge)).getText().toString());
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Age invalide", Toast.LENGTH_SHORT).show();
                    BAge = true;
                }

                // L ADRESS
                try {
                    String Add=((EditText)findViewById(R.id.etAdd)).getText().toString();
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Adress invalide", Toast.LENGTH_SHORT).show();
                    BAdd = true;
                }

                // LA DATE
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    java.util.Date   date = dateFormat.parse(((EditText)findViewById(R.id.etDate)).getText().toString());
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Date invalide", Toast.LENGTH_SHORT).show();
                    BDate = true;
                }

                // ### On Met Les Donnes
                if (!BNum || !BNom || !BPre || !BAge || !BAdd || !BDate)
                {
                    try {
                        // set some vars
                        int num = Integer.parseInt(((EditText) findViewById(R.id.etNum)).getText().toString());
                        String nom = ((EditText) findViewById(R.id.etNom)).getText().toString();
                        String pre = ((EditText) findViewById(R.id.etPrenom)).getText().toString();
                        int age = Integer.parseInt(((EditText) findViewById(R.id.etAge)).getText().toString());
                        String add = ((EditText) findViewById(R.id.etAdd)).getText().toString();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        java.util.Date date = dateFormat.parse(((EditText) findViewById(R.id.etDate)).getText().toString());

                        // add those vars
                        vmapref.setNum(num);
                        vmapref.setNom(nom);
                        vmapref.setPrenom(pre);
                        vmapref.setAge(age);
                        vmapref.setAdresse(add);
                        vmapref.setDatenaiss(date);
                    }
                    catch (Exception e){

                    }
                }
            }
        });
    }
}
