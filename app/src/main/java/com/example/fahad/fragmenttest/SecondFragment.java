package com.example.fahad.fragmenttest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
    TextView tv;
    View view;
    String tv_Name;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_second, container, false);
        tv = (TextView) view.findViewById(R.id.textView);
        tv.setText(tv_Name);
        return view;
    }


    public void getName(String name) {
        Log.e("Name>>>>>", name);
        tv_Name = name;
    }
}
