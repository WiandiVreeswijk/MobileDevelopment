package com.example.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

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
        mScore = findViewById(R.id.textViewScore);
        mHighScore = findViewById(R.id.textViewHighScore);
        mLastThrow = findViewById(R.id.textViewLastThrow);
        mDice = findViewById(R.id.imageView2);
        mLower = findViewById(R.id.buttonLower);
        mHigher = findViewById(R.id.buttonHigher);
        mRestart = findViewById(R.id.buttonReset);

        mLower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
        mHigher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
        mRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    private void rollDice() {
        valuePrevious = valueCurrent;
        valueCurrent = new Random().nextInt(6) + 1;

        switch (valueCurrent) {
            case 1:
                mDice.setImageDrawable(getDrawable(R.drawable.dice1));
                break;
            case 2:
                mDice.setImageDrawable(getDrawable(R.drawable.dice2));
                break;
            case 3:
                mDice.setImageDrawable(getDrawable(R.drawable.dice3));
                break;
            case 4:
                mDice.setImageDrawable(getDrawable(R.drawable.dice4));
                break;
            case 5:
                mDice.setImageDrawable(getDrawable(R.drawable.dice5));
                break;
            case 6:
                mDice.setImageDrawable(getDrawable(R.drawable.dice6));
                break;
        }
    }
}
