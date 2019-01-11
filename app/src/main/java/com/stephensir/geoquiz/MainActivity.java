package com.stephensir.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mYesButton;
    private Button mNoButton;
    private String TAG = "GeoQuiz===>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"onCreate");

        mYesButton = findViewById(R.id.yes_button);
        mYesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.correct_toast,Toast.LENGTH_SHORT).show();
            }
        });
        mNoButton = findViewById(R.id.no_button);
        mNoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.incorrect_toast,Toast.LENGTH_SHORT).show();
            }
        });
    } //onCreate()

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
