package com.example.jc.bottomtabfragmentdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    public static Fragment[] mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragments = new Fragment[2];
        mFragments[0] = getSupportFragmentManager().findFragmentById(R.id.fragmentHome);
        mFragments[1] = getSupportFragmentManager().findFragmentById(R.id.fragmentSummary);

        getSupportFragmentManager().beginTransaction().hide(mFragments[0]).show(mFragments[1]).commit();

    }
}
