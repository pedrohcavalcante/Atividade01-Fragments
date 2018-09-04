package com.example.androidbti.atividade01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ButtonsFragment.ChangeColorListener{

    private ColorsFragment colorsFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorsFragment = (ColorsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentColors);
    }

    @Override
    public void changeColor(int color) {
        colorsFragment.setColor(color);
    }
}
