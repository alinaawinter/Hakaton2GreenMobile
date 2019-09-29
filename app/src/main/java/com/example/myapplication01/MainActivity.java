package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextView;
    private EditText mNameEditText;

    private Button mCrowsCounterButton;
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //сначала нужно вывести шаблон (R.layout.activity_main), а только потом кнопки, текстовые поля, переключатели и т.д.
        //Метод setContentView(int) подключает содержимое из файла разметки. В качестве аргумента мы указываем имя файла без расширения из папки res/layout.
        // По умолчанию проект создаёт в нём файл activity_main.xml. Вы можете переименовать файл или создать свой файл с именем cat.xml и подключить его
        // к своей активности. Тогда код будет выглядеть
        // setContentView(R.layout.cat);

        //Например, разметка для второй активности может иметь имя activity_second.xml

        mHelloTextView = findViewById(R.id.textView2); //найти компонент по идентификатору ресурса
        mNameEditText = findViewById(R.id.editText);

        // считаем ворон (др.пример обработки щелчка по кнопке)
        //mCrowsCounterButton = findViewById(R.id.ButtonCounter);
        //mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        mCount = mCount+1;
        //        mHelloTextView.setText("Я насчитал "+mCount+" ворон!");
        //    }
        //}
    }


    public void onClick(View view) {
        //mHelloTextView.setText("Hello Cat!"); //обращаемся к элементу mHelloTextView и через его метод setText() программно меняем текст на нужные слова.
        if (mNameEditText.getText().length() == 0) {
            mHelloTextView.setText("Привет!");
        } else {
            mHelloTextView.setText("Привет, " + mNameEditText.getText());
        }
    }

    //public void onButtonClick(View view) {
    //    // если не объявляли бы переменную выше на уровне класса, то можно было ее объявить тут прямо в методе
    //    //TextView helloTextView = findViewById(R.id.textView);
    //    //helloTextView.setText("Hello Kitty!");
    //    mHelloTextView.setText("Hello Kitty!");
    //}

    public void OnClickButtonAbout(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class); //Для запуска нового экрана необходимо создать экземпляр класса Intent и указать в первом параметре текущий класс, а во втором - класс для перехода
        startActivity(intent); //запускает новый экран
    }

    public void OnClickTask(View view) {
        Intent intentTask = new Intent(MainActivity.this, TaskActivity.class);
        startActivity(intentTask);
    }
}


