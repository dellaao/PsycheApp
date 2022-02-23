package com.dellao.skye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rekomen extends AppCompatActivity {
    //Button redirect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekomen);

        Button redirect = (Button) findViewById(R.id.btn_redirect);
        redirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://shopee.co.id/somebymi_official_store.id";
                Intent red = new Intent(Intent.ACTION_VIEW);
                red.setData(Uri.parse(url));
                startActivity(red);
            }
        });
    }
}