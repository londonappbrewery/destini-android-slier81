package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textStory;
    private Button topButton;
    private Button bottomButton;
    private int storyIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textStory = findViewById(R.id.storyTextView);
        this.topButton = findViewById(R.id.buttonTop);
        this.bottomButton = findViewById(R.id.buttonBottom);

        this.topButton.setOnClickListener(v -> {
            int story = 0;
            int answerOne = 0;
            int answerTwo = 0;

            if (storyIndex == 1) {
                story = R.string.T3_Story;
                answerOne = R.string.T3_Ans1;
                answerTwo = R.string.T3_Ans2;
                storyIndex = 3;
            }

            if (storyIndex == 2) {
                story = R.string.T3_Story;
                answerOne = R.string.T3_Ans1;
                answerTwo = R.string.T3_Ans2;
                storyIndex = 3;
            }

            if (storyIndex == 3) {
                story = R.string.T6_End;
            }

            textStory.setText(story);

            if (answerOne != 0) {
                topButton.setText(answerOne);
            } else {
                topButton.setVisibility(View.GONE);
            }
            if (answerTwo != 0) {
                bottomButton.setText(answerTwo);
            } else {
                bottomButton.setVisibility(View.GONE);
            }
        });

        this.bottomButton.setOnClickListener(v -> {
            int story = 0;
            int answerOne = 0;
            int answerTwo = 0;

            if (storyIndex == 1) {
                story = R.string.T2_Story;
                answerOne = R.string.T2_Ans1;
                answerTwo = R.string.T2_Ans2;
                storyIndex = 2;
            }

            if (storyIndex == 2) {
                story = R.string.T4_End;
            }

            if (storyIndex == 3) {
                story = R.string.T5_End;
            }

            textStory.setText(story);

            if (answerOne != 0) {
                topButton.setText(answerOne);
            } else {
                topButton.setVisibility(View.GONE);
            }
            if (answerTwo != 0) {
                bottomButton.setText(answerTwo);
            } else {
                bottomButton.setVisibility(View.GONE);
            }
        });
    }
}
