package com.example.madhan.wicc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentDisplayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_displayer);

        TextView content = (TextView) findViewById(R.id.content);

        String value = getIntent().getExtras().getString("value");
        String actionBarName = getIntent().getExtras().getString("name");
        setTitle(actionBarName);

        content.setText(value);
    }
}
