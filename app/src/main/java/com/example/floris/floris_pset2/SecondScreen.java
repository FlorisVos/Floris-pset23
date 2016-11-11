package com.example.floris.floris_pset2;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static java.security.AccessController.getContext;

/**
 * Created by Floris on 11/10/2016.
 */

public class SecondScreen extends Activity {
    public Story story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        InputStream is = null;
        try {
            is = this.getAssets().open("madlib0_simple.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        story = new Story(is);

        EditText EditTextInput = (EditText) findViewById(R.id.FirstWord);

        String Hint = story.getNextPlaceholder();

        EditTextInput.setHint(Hint);

        String FilledInWord = String.valueOf(EditTextInput.getText());

        story.fillInPlaceholder(FilledInWord);






    }


    public void FillInWord(View view) {

        String NextHint = story.getNextPlaceholder();
        
        finish();

        startActivity(getIntent(NextHint));
    }
};
