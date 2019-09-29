package com.example.myapplication01;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Пройден", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    public void onClickBtnExit1(View view) { //пока делаем в лоб, потом один метод на все кнопки - переопределяем listner
        Toast toast = Toast.makeText(getApplicationContext(),
                "Описание Выхода 1...",
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickBtnMh1(View view) {//пока делаем в лоб, потом один метод на все кнопки - переопределяем listner
        // раскладка по деталям и изделиям для данного цеха в маршруте
        // получаемый маршрут храним в приложении в ообъекте-списке, или массиве, или еще какой структуре (деталь или изделие, место хранения(цех),кол-во)

        // показать, как это будет на экране:
        Intent intentComposition = new Intent(TaskActivity.this, CompositionActivity.class);
        intentComposition.putExtra("Место хранения (цех)", 1); //явную строчку потом убрать
        startActivity(intentComposition);
    }
}
