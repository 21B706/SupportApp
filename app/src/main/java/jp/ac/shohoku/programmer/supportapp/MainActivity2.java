package jp.ac.shohoku.programmer.supportapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle saveInstanseState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);
        
        Intent intent = this.getIntent();
        String text = intent.getStringExtra("sendText");
        TextView textView = (TextView)this.findViewById(R.id.Button);
        textView.setText(text);
    }
}