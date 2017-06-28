package com.example.fahad.fragmenttest;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements FragmentListener {

    private static final String TAG = "Interface Data>>>>";
    FragmentListener fragmentListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstFragment fragment = new FirstFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentContainer, fragment)
                .commit();
    }


    @Override
    public void setName(String name) {
        if (name!=null) {
            SecondFragment secondFragment = new SecondFragment();
            secondFragment.getName(name);
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentContainer, secondFragment)
                    .commit();
        }
    }
}
