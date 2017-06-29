package jp.techacademy.ayako.kawakami.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    float result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        result = intent.getFloatExtra("RESULT",0);

        TextView textView = (TextView) findViewById(R.id.resultText);
        textView.setText("計算結果：" + String.valueOf(result));
    }
}
