package com.example;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.inject.Inject;
import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.main)
public class MyActivity extends RoboActivity implements View.OnClickListener {
    @InjectView(R.id.text) TextView text;
    @InjectView(R.id.button) Button button;
    @Inject Application application;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        text.setText(String.valueOf("something"));
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        NotActivity na = new NotActivity();
        text.setText(na.getStringFromResource());
    }
}
