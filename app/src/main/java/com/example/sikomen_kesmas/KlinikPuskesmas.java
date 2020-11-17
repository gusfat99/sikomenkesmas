package com.example.sikomen_kesmas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KlinikPuskesmas extends AppCompatActivity implements View.OnClickListener {

    private CardView CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klinik_puskesmas);
        CardView klinik1 = findViewById(R.id.card_list1);
        klinik1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.card_list1 :
                Intent inten = new Intent(KlinikPuskesmas.this, DetailKlinik.class);
                startActivity(inten);
            break;

        }
    }

}