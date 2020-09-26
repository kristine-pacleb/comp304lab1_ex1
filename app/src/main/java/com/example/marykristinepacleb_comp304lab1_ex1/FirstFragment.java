package com.example.marykristinepacleb_comp304lab1_ex1;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FirstFragment extends ListFragment {

    String[] concepts = new String[]{"AIActivity","VRActivity"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.first_fragment, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, concepts);
        setListAdapter(adapter);
        return view;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getActivity(),"Select Item is: " + concepts[position],
                Toast.LENGTH_SHORT).show();

        if(position==0){
            Intent myIntent = new Intent(getActivity(),AIActivity.class);
            startActivityForResult(myIntent,0);
        }
        if(position==1){
            Intent myIntent = new Intent(getActivity(),VRActivity.class);
            startActivityForResult(myIntent,1);
        }

    }


}