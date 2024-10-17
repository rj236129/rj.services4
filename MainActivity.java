package com.example.rjservicesapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button accountingButton = findViewById(R.id.accountingButton);
        Button gstButton = findViewById(R.id.gstButton);
        Button itrButton = findViewById(R.id.itrButton);
        Button panButton = findViewById(R.id.panButton);
        Button govJobButton = findViewById(R.id.govJobButton);

        accountingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://example.com/accounting-services");
            }
        });

        gstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://example.com/gst-services");
            }
        });

        itrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://example.com/itr-services");
            }
        });

        panButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://example.com/pan-card-services");
            }
        });

        govJobButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://example.com/government-jobs");
            }
        });
    }

    private void openLink(String url) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
}
