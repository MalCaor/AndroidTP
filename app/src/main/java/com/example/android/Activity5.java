package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import android.content.SharedPreferences;
import android.widget.Toast;
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
        
    }
}
