package jp.ac.shohoku.programmer.supportapp;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Connection;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);
        Button ReturnButton = findViewById(R.id.button10);
        Button ConfirmButton = findViewById(R.id.button11);

        //Button(教員、問い合わせ)
        //activity_subレイアウトをセット
        setContentView(R.layout.activity2_main);
        //MAINからの値を取得
        Intent intent = getIntent();
        String getdata = intent.getStringExtra("category");
        //値をセット
        //TextView textView = findViewById(R.id.Button);
        //textView.setText(getdata);

        //Button(学生、問い合わせ)
        //activity_subレイアウトをセット
        setContentView(R.layout.activity2_main);
        //MAINからの値を取得
        Intent intent2 = getIntent();
        String getdata2 = intent2.getStringExtra("category");
        //値をセット
        //TextView textView2 = findViewById(R.id.button2);

        //Button(その他、問い合わせ)
        //activity_subレイアウトをセット
        setContentView(R.layout.activity2_main);
        //MAINからの値を取得
        Intent intent3 = getIntent();
        String getdata3 = intent3.getStringExtra("category");
        //値をセット
        //TextView textView3 = findViewById(R.id.button3);
        //textView3.setText(getdata3);

        //Button(学生、障害)
        //activity_subレイアウトをセット
        setContentView(R.layout.activity2_main);
        //MAINからの値を取得
        Intent intent4 = getIntent();
        String getdata4 = intent4.getStringExtra("category");
        //値をセット
        //TextView textView4 = findViewById(R.id.button4);
        //textView4.setText(getdata4);

        //Button(教職員、障害)
        //activity_subレイアウトをセット
        setContentView(R.layout.activity2_main);
        //MAINからの値を取得
        Intent intent5 = getIntent();
        String getdata5 = intent5.getStringExtra("category");
        //値をセット
        //TextView textView5 = findViewById(R.id.button5);
        //textView5.setText(getdata5);

        //Button(その他、障害)
        //activity_subレイアウトをセット
        setContentView(R.layout.activity2_main);
        //MAINからの値を取得
        Intent intent6 = getIntent();
        String getdata6 = intent6.getStringExtra("category");
        //値をセット
        //TextView textView6 = findViewById(R.id.button6);
        //textView6.setText(getdata6);

        //Button(教職員、支援)
        //activity_subレイアウトをセット
        setContentView(R.layout.activity2_main);
        //MAINからの値を取得
        Intent intent7 = getIntent();
        String getdata7 = intent7.getStringExtra("category");
        //値をセット
        //TextView textView7 = findViewById(R.id.button7);
        //textView7.setText(getdata7);

        //Button(学生、支援)
        //activity_subレイアウトをセット
        setContentView(R.layout.activity2_main);
        //MAINからの値を取得
        Intent intent8 = getIntent();
        String getdata8 = intent8.getStringExtra("category");
        //値をセット
        //TextView textView8 = findViewById(R.id.button8);
        //textView8.setText(getdata8);

        //Button(その他、支援)
        //activity_subレイアウトをセット
        setContentView(R.layout.activity2_main);
        //MAINからの値を取得
        Intent intent9 = getIntent();
        String getdata9 = intent9.getStringExtra("category");
        //値をセット
        //TextView textView9 = findViewById(R.id.button9);
        //textView9.setText(getdata9);

        //リセットボタン
        ReturnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        });
        //確定ボタン
        ConfirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
    Connection conn = null;
    String url = "jdbc:mysql://localhost/SupportApp";
    String user = "localhost";
    String password = "20010514";
}

