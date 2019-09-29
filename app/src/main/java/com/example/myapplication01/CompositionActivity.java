package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CompositionActivity extends AppCompatActivity {

    private EditText mETextDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composition);

        int MestoH = 0;
        mETextDetails = findViewById(R.id.editTextDetails);

        //test
        //mETextDetails.setText("det1 cnt1 det cnt det cnt det cnt det cnt det cnt");
        MestoH = getIntent().getExtras().getInt("Место хранения (цех)"); //потом явную строку из ключа убрать
        if (MestoH == 1) {
            mETextDetails.setText("det1 cnt1 det cnt det cnt det cnt det cnt det cnt");//потом будет разбор из общего списка маршрута
        } //else {};
    }

    public void onClickPrint(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Печать",
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
