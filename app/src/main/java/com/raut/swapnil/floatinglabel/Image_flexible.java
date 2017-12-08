package com.raut.swapnil.floatinglabel;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;

public class Image_flexible extends AppCompatActivity {
Toolbar toolbar;
    CollapsingToolbarLayout  collapse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_flexible);

        toolbar = (Toolbar)findViewById(R.id.image_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setTitle("Image");
        collapse = (CollapsingToolbarLayout)findViewById(R.id.collapsing_toolbar);
        collapse.setTitle("Image");

        final int defaultcolor = 0x000000;
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
                R.drawable.material);
        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                collapse.setContentScrimColor(defaultcolor);
            }
        });
    }
}
