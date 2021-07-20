package jp.ac.shohoku.programmer.supportapp;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextButton = findViewById(R.id.Button);
        Button nextButton2 = findViewById(R.id.button2);
        Button nextButton3 = findViewById(R.id.button3);
        Button nextButton4 = findViewById(R.id.button4);
        Button nextButton5 = findViewById(R.id.button5);
        Button nextButton6 = findViewById(R.id.button6);
        Button nextButton7 = findViewById(R.id.button7);
        Button nextButton8 = findViewById(R.id.button8);
        Button nextButton9 = findViewById(R.id.button9);

        //教職員からの問い合わせ
       nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                EditText editText = findViewById(R.id.editText);
                intent.putExtra("category","teacher,inquiry");
                startActivity(intent);
            }
        });
        //学生からの問い合わせ
        nextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                EditText editText = findViewById(R.id.editText);
                intent.putExtra("category","student,inquiry");
                startActivity(intent);
            }
        });
        //その他からの問い合わせ
        nextButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                EditText editText = findViewById(R.id.editText);
                intent.putExtra("category","other,inquiry");
                startActivity(intent);
            }
        });
        //学生からの障害
        nextButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                EditText editText = findViewById(R.id.editText);
                intent.putExtra("category","student,Disability");
                startActivity(intent);
            }
        });
        //教職員からの障害
        nextButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                EditText editText = findViewById(R.id.editText);
                intent.putExtra("category","teacher,Disability");
                startActivity(intent);
            }
        });
        //その他からの障害
        nextButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                EditText editText = findViewById(R.id.editText);
                intent.putExtra("category","other,Disability");
                startActivity(intent);
            }
        });
        //教職員ーサポート
        nextButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                EditText editText = findViewById(R.id.editText);
                intent.putExtra("category","teacher,support");
                startActivity(intent);
            }
        });
        //学生ーサポート
        nextButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                EditText editText = findViewById(R.id.editText);
                intent.putExtra("category","student,support");
                startActivity(intent);
            }
        });
        //その他ーサポート
        nextButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                EditText editText = findViewById(R.id.editText);
                intent.putExtra("category","other,support");
                startActivity(intent);
            }
        });


    }

}