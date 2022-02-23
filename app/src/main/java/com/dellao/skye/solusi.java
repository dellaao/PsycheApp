package com.dellao.skye;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class solusi extends AppCompatActivity {
    private Button rekomendasi;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solusi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        alertDialogBuilder = new AlertDialog.Builder(this);

        TextView tvOutputHead = findViewById(R.id.txtDiagnosaHead);
        TextView tvOutputHasil = findViewById(R.id.txtDiagnosaHasil);

        if (getIntent().getExtras() != null){
            tvOutputHead.setText(getIntent().getStringExtra("txtDiagnosaHead"));
            tvOutputHasil.setText(getIntent().getStringExtra("txtDiagnosaHasil"));
        }

        rekomendasi= findViewById(R.id.btn_rekomendasi);

        rekomendasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rekomendasi = new Intent(solusi.this, rekomen.class);
                startActivity(rekomendasi);
            }
        });

    }


}