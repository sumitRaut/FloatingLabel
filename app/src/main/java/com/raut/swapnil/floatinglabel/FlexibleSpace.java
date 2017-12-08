package com.raut.swapnil.floatinglabel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class FlexibleSpace extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexible_space);

        toolbar = (Toolbar)findViewById(R.id.flexible_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Flexible Space");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
