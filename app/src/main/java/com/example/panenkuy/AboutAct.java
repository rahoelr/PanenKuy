package com.example.panenkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }


    public void pindaiTanaman(View view){
        Intent pindaiTanaman = new Intent(this, CaptureAct.class);
        startActivity(pindaiTanaman);
    }

    public void cariPenyakit(View view){
        Intent cariPenyakit = new Intent(this, CariPenyakit.class);
        startActivity(cariPenyakit);
    }

    public void tokoTerdekat(View view){
        Intent tokoTerdekat = new Intent(this, TokoTerdekat.class);
        startActivity(tokoTerdekat);
    }
}