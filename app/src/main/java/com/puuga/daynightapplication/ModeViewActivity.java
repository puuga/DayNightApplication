package com.puuga.daynightapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.widget.TextView;

public class ModeViewActivity extends AppCompatActivity {

    private TextView textModeType;
    private int modeType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_view);

        initInstances();
    }

    private void initInstances() {
        textModeType = (TextView) findViewById(R.id.textModeType);

        modeType = AppCompatDelegate.getDefaultNightMode();

        if (modeType == AppCompatDelegate.MODE_NIGHT_AUTO) {
            assert textModeType != null;
            textModeType.setText(getString(R.string.text_auto_mode));
        } else if (modeType == AppCompatDelegate.MODE_NIGHT_NO) {
            assert textModeType != null;
            textModeType.setText(getString(R.string.text_day_mode));
        } else if (modeType == AppCompatDelegate.MODE_NIGHT_YES) {
            assert textModeType != null;
            textModeType.setText(getString(R.string.text_night_mode));
        }
    }
}
