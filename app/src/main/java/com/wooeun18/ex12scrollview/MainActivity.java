package com.wooeun18.ex12scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBtn(View v){
        ScrollView sv= findViewById(R.id.sv_k);
        sv.fullScroll(ScrollView.FOCUS_DOWN);
    }
}