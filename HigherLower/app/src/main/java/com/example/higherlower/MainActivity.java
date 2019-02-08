package com.example.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int score = 0;
    private int highScore = 0;

    private int valueCurrent = 0;
    private int valuePrevious = 0;

    private TextView mScore;
    private TextView mHighScore;
    private TextView mLastThrow;
    private ImageView mDice;
    private Button mLower;
    private Button mRestart;
    private Button mHigher;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = findViewById(R.id.textViewScore);
    }
}
