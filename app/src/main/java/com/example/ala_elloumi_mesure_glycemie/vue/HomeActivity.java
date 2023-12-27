package com.example.ala_elloumi_mesure_glycemie.vue;

// Les importation necessaires
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ala_elloumi_mesure_glycemie.R;

public class HomeActivity extends AppCompatActivity {
    private Button btnConsutation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        // Action sur bouton consultaion
        btnConsutation.setOnClickListener(this::consultation);
    }

    public void consultation(View view) {
        // Créer une Intent pour lancer l'activité MainActivity
        Intent intent;
        intent = new Intent(HomeActivity.this, MainActivity.class);

        // Lancer l'activité MainActivity
        startActivity(intent);

        // Terminer l'activité courante HomeActivity
        finish();
    }

    private void init(){
        // Récupération du bouton "Consultation"
        btnConsutation = findViewById(R.id.btnConsultation);
        
    }
}
