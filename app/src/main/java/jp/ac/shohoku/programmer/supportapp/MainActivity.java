package jp.ac.shohoku.programmer.supportapp;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

       nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                startActivity(intent);
            }
        });
        nextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                startActivity(intent);
            }
        });
        nextButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                startActivity(intent);
            }
        });
        nextButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                startActivity(intent);
            }
        });
        nextButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                startActivity(intent);
            }
        });
        nextButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                startActivity(intent);
            }
        });
        nextButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                startActivity(intent);
            }
        });
        nextButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                startActivity(intent);
            }
        });
        nextButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                startActivity(intent);
            }
        });


    }

}