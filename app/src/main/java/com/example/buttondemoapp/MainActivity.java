package com.example.buttondemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void buttonClicked (View view){
        // declare the EditText and initialize it

        EditText myTxtField = findViewById(R.id.myTxtField);
        Log.i("User Enter", myTxtField.getText().toString());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
