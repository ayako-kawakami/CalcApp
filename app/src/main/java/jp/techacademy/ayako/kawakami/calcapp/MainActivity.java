package jp.techacademy.ayako.kawakami.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        Intent intent = new Intent(this, SecondActivity.class);

        EditText value1 = (EditText) findViewById(R.id.text1);
        EditText value2 = (EditText) findViewById(R.id.text2);

        String str1 = value1.getText().toString();
        String str2 = value2.getText().toString();

        float float1 = Float.parseFloat(str1);
        float float2 = Float.parseFloat(str2);

        float result;

        if(v.getId()==R.id.button1){
            result = float1 + float2;
            intent.putExtra("RESULT", result);

        }else if(v.getId()==R.id.button2){
            result = float1 - float2;
            intent.putExtra("RESULT", result);

        }else if(v.getId()==R.id.button3){
            result = float1 * float2;
            intent.putExtra("RESULT", result);

        }else if(v.getId()==R.id.button4){
            result = float1 / float2;
            intent.putExtra("RESULT", result);
        }

        startActivity(intent);
    }
}
