package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private int getFirst() {
        EditText myTextField = (EditText) findViewById(R.id.editTextNumber);
        String str = myTextField.getText().toString();
        int num = Integer.parseInt(str);
        return num;
    }

    private int getSecond() {
        EditText myTextField = (EditText) findViewById(R.id.editTextNumber2);
        String str = myTextField.getText().toString();
        int num = Integer.parseInt(str);
        return num;
    }

    public void plus(View view) {
        int first = getFirst();
        int second = getSecond();
        int result = first + second;
        goToActivity2(String.format("%d",result));
    }

    public void minus(View view) {
        int first = getFirst();
        int second = getSecond();
        int result = first - second;
        goToActivity2(String.format("%d",result));
    }

    public void times(View view) {
        int first = getFirst();
        int second = getSecond();
        int result = first * second;
        goToActivity2(String.format("%d",result));
    }

    public void div(View view) {
        int first = getFirst();
        int second = getSecond();
        int result = first / second;
        goToActivity2(String.format("%d",result));
    }


    public void goToActivity2(String s) {
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}