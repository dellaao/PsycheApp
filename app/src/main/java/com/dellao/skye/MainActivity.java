package com.dellao.skye;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button page_analisa;

    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alertDialogBuilder = new AlertDialog.Builder(this);

        page_analisa = findViewById(R.id.btn_mulai_analisa);

        page_analisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent analisa = new Intent(MainActivity.this, AnalisaGejala.class);
                startActivity(analisa);
            }
        });

    }

    @Override
    public void onBackPressed() {
        alertDialogBuilder.setTitle("Tutup Aplikasi");
        alertDialogBuilder
                .setMessage("Anda yakin mau keluar aplikasi?")
                .setCancelable(false)
                .setPositiveButton("YA",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(MainActivity.this, "Sampai Jumpa!", Toast.LENGTH_SHORT).show();
                                MainActivity.super.onBackPressed();
                            }
                        })
                .setNegativeButton("TIDAK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        }).create().show();
    }
}