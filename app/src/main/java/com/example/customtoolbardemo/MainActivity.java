package com.example.customtoolbardemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolBar);

        // Step - 1
        setSupportActionBar(toolbar);


        // Step - 2
        if(getSupportActionBar()!= null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("My ToolBar");
            getSupportActionBar().setSubtitle("Sub Title");
        }

    }

    // step - 3
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // step -4
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if(itemId == R.id.opt_new)
        {
            Toast.makeText(this, "Created new File", Toast.LENGTH_LONG).show();
        }
        else if(itemId == R.id.opt_open)
        {
            Toast.makeText(this, "File Open", Toast.LENGTH_LONG).show();
        }
        else if(itemId == R.id.opt_save)
        {
            Toast.makeText(this, "File Saved", Toast.LENGTH_LONG).show();

        }
        else
        {
            super.onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}