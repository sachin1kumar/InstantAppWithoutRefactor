package com.testing.sachin.first_feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.testing.sachin.base_feature.InitClass;

public class SecondActivity extends AppCompatActivity {

    private InitClass initClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initClass = new InitClass();
        initClass.print();
    }
}
