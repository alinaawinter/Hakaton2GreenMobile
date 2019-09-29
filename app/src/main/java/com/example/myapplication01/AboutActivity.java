package com.example.myapplication01;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class AboutActivity extends Activity {  //не забыть: Необходимо зарегистрировать новый Activity в манифесте AndroidManifest.xml
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about);
    }
}
