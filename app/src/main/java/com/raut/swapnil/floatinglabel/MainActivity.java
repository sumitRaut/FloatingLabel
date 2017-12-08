package com.raut.swapnil.floatinglabel;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    TextInputLayout layoutName,layoutMobile,layoutEmail,layoutAge;
    EditText editName,editMobile,editEmail,editAge;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        layoutName = (TextInputLayout)findViewById(R.id.layout_name);
        layoutMobile = (TextInputLayout)findViewById(R.id.layout_Mobile);
        layoutEmail = (TextInputLayout)findViewById(R.id.layout_email);
        layoutAge = (TextInputLayout)findViewById(R.id.layout_age);

        editName = (EditText)findViewById(R.id.input_name);
        editMobile = (EditText)findViewById(R.id.input_mobile);
        editEmail = (EditText)findViewById(R.id.input_email);
        editAge = (EditText)findViewById(R.id.input_age);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(1,1,1,"with Only Toolbar");
        menu.add(1,2,2,"with Tab");
        menu.add(1,3,3,"with flexible space");
        menu.add(1,4,4,"with image in flexible space");
        menu.add(1,5,5,"Overlapping content in flexible space");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i ;
        switch (item.getItemId())
        {
            case 1:
                //i = new Intent(M)
                break;
            case 2:
                break;
            case 3: i = new Intent(MainActivity.this, FlexibleSpace.class);
                startActivity(i);
                break;
            case 4:i = new Intent(MainActivity.this, Image_flexible.class);
                startActivity(i);
                break;
            case 5:i = new Intent(MainActivity.this,OverlappingContent.class);
                startActivity(i);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
