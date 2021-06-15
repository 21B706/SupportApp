package jp.ac.shohoku.programmer.supportapp;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextButton = findViewById(R.id.button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                startActivity(intent);
            }
        });

    }

    //ボタンが押された時の処理
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity2.class);  //インテントの作成
        startActivity(intent);                                 //画面遷移
    }
}