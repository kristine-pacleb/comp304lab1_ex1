package com.example.marykristinepacleb_comp304lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    String tag = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, R.string.onCreate, Toast.LENGTH_LONG).show();
    }

        public void onStart()
        {
            super.onStart();
            Toast.makeText(this, R.string.onStart, Toast.LENGTH_LONG).show();
        }

        public void onRestart()
        {
            super.onRestart();
            Toast.makeText(this, R.string.onRestart, Toast.LENGTH_LONG).show();
        }

        public void onResume()
        {
            super.onResume();
            Toast.makeText(this, R.string.onResume, Toast.LENGTH_LONG).show();
        }
        public void onPause()
        {
            super.onPause();
            Toast.makeText(this, R.string.onPause, Toast.LENGTH_LONG).show();
        }
        //
        public void onStop()
        {
            super.onStop();
            Toast.makeText(this, R.string.onStop, Toast.LENGTH_LONG).show();
        }
        public void onDestroy()
        {
            super.onDestroy();
            Toast.makeText(this, R.string.onDestroy, Toast.LENGTH_LONG).show();
        }
}