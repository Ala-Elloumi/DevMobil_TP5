package com.example.ala_elloumi_mesure_glycemie.vue;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.ala_elloumi_mesure_glycemie.R;

public class ConsultActivity extends AppCompatActivity {

    // Déclaration des attributs necessaires
    private Button btnReturn;
    private TextView tvResult;
    private String reponse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);

        // Initialiser les attributs
        init();

        // Obtenez l'intent de l'activité qui a lancé cette activité
        Intent intent = getIntent();

        // Obtenez la chaîne "reponse" de l'intent
        reponse = intent.getStringExtra("reponse");

        // Assurer que reponse n'est pas null avant de l'afficher
        if (reponse != null) {
            tvResult.setText(reponse);
        }

        // Action sur le bouton RETOUR
        btnReturn.setOnClickListener(this::retour);
    }
    public void retour(View view) {
        // Créer une Intent pour lancer à nouveau l'Activité MainActivity
        Intent intent = new Intent(ConsultActivity.this, MainActivity.class);

        if (reponse != null)
            setResult(RESULT_OK);
        else
            setResult(RESULT_CANCELED);

        // Effacer toutes les activités de la pile avant de démarrer l'activité MainActivity
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        // Lancer à nouveau l'activité  MainActivity
        startActivity(intent);
    }
    private void init(){
        btnReturn=findViewById(R.id.btnReturn);
        tvResult=findViewById(R.id.tvResult);
    }
}