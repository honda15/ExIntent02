package com.example.exintent02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        Button btnHome = findViewById(R.id.btnHome);
        btnHome.setOnClickListener(btnHomeListener);
    }

    private Button.OnClickListener btnHomeListener =
            new Button.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            };



}
