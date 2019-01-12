package com.stephensir.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mYesButton;
    private Button mNoButton;
    private String TAG = "GeoQuiz===>";

    private Question[] mQuestionBank = new Question[] {
            // Format
            new Question(getResources().getString(R.string.question_text1), true),
            new Question(getResources().getString(R.string.question_text2), true),
            new Question(getResources().getString(R.string.question_text3), false),
    };
    private TextView txtOutput;
    private int mCurrentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"onCreate");
        Log.d(TAG,"Updated");

        txtOutput = findViewById(R.id.txtOutput);

        mYesButton = findViewById(R.id.yes_button);
        mYesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(mQuestionBank[mCurrentIndex].getAnswer(),true);
            }
        });
        mNoButton = findViewById(R.id.no_button);
        mNoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(mQuestionBank[mCurrentIndex].getAnswer(),false);
            }
        });
    } //onCreate()
    private void checkAnswer(boolean _ans, boolean _user_ans){
        if (_ans == _user_ans){
            Toast.makeText(MainActivity.this, R.string.correct_toast,Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, R.string.incorrect_toast,Toast.LENGTH_SHORT).show();
        }
    }
    public void btn_previous_click(View v){
        // index reach 0
        if (mCurrentIndex==0){
            return;
        }
        mCurrentIndex = (mCurrentIndex - 1) % mQuestionBank.length;
        txtOutput = findViewById(R.id.txtOutput);
        txtOutput.setText(mQuestionBank[mCurrentIndex].getQuestion());
    }
    public void btn_next_click(View v){
        mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
        txtOutput = findViewById(R.id.txtOutput);
        txtOutput.setText(mQuestionBank[mCurrentIndex].getQuestion());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    } //onStart()

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    } //onResume()

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    } //onPause()

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    } //onStop()

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestory");
    } //onDestory()
}
