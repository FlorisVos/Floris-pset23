package com.example.floris.floris_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class madlibs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlibs);
    }

    public void ClickPlayFunction(View view) {

        Intent getNameScreenIntent = new Intent(this,
                SecondScreen.class);

        final int result = 1;

        getNameScreenIntent.putExtra("callingActivity", "MainActivity");

        startActivityForResult(getNameScreenIntent, result);


    }
}
