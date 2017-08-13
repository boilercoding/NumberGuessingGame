package com.boilercoding.numberguessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guess(View view) {
        EditText guessedNumberEditText = (EditText) findViewById(R.id.guessedNumberEditText);

        Toast.makeText(MainActivity.this, guessedNumberEditText.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
