package com.example.longnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean isSimple = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvAnswer = findViewById(R.id.tvAnswer);
        TextView tvStart = findViewById(R.id.tvStart);

        tvStart.setOnClickListener(v -> {
            for(long i = 1; i < 1000; i += 2){
                for(long j = 3; j < 1000; j++){
                    if(i == j)
                        continue;
                    if(i % j == 0) {
                        isSimple = false;
                        break;
                    }
                }
                if(isSimple)
                    tvAnswer.setText(tvAnswer.getText() + ", " + i);
                isSimple = true;
            }
            tvAnswer.setText(tvAnswer.getText() + "\n" + "Рассчет окончен");
        });
    }
}