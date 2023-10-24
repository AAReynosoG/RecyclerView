package com.example.recyclerviewpersonas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CountDownTimer ct = null;
    final Context context = this;

    TextView asd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asd = findViewById(R.id.asd);
        timer();
    }

public void timer(){
ct = new CountDownTimer(5000, 1000) {
    @Override
    public void onTick(long l) {
        asd.setText("" + l / 1000);
    }

    @Override
    public void onFinish() {
        Intent i = new Intent(context, MainActivity2.class);
        startActivity(i);
    }
}.start();
}
}