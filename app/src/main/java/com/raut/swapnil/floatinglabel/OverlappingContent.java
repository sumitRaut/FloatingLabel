package com.raut.swapnil.floatinglabel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class OverlappingContent extends AppCompatActivity {
Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overlapping_content);

        toolbar = (Toolbar)findViewById(R.id.overlapp_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Overlapping Content");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
