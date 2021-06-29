package jp.ac.shohoku.programmer.supportapp;

import android.app.Activity;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button Button = findViewById(R.id.Button);

        Button button1 = findViewById(R.id.Button);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplication(),MainActivity2.class);
                startActivity(intent);
            }
        });
//    public void onClick(View v){
//        //インテントの作成
//        Intent intent = new Intent(this, MainActivity2.class);
//       //データをセット
//        EditText editText = (EditText)this.findViewById(R.id.Button);
//        intent.putExtra("sendText",editText.getText().toString());
//        //遷移先の画面を起動
//        startActivity(intent);
//    }
    }
}