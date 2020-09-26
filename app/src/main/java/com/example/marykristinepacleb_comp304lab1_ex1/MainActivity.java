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
    FragmentSecond fragmentSecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
    }

        public void onStart()
        {
            super.onStart();
            Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
      }

        public void onRestart()
        {
            super.onRestart();
            Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
        }

        public void onResume()
        {
            super.onResume();
            Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
        }
        public void onPause()
        {
            super.onPause();
            Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
        }
        //
        public void onStop()
        {
            super.onStop();
            Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
        }
        public void onDestroy()
        {
            super.onDestroy();
            Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
        }



}