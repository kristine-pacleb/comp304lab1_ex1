package com.example.marykristinepacleb_comp304lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private SecondFragment fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (SecondFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
    }

//    public void sendMessage(View view)
//    {
//        //read the text from the edit text
//        EditText etMessage = (EditText)findViewById(R.id.edMessage);
//        String message = etMessage.getText().toString();
//        //and send it to the second fragment
//        fragment.display(message);
//    }

}